package club.doki7.babel.extract.glfw3

import club.doki7.babel.cdecl.parseBlockDoxygen
import club.doki7.babel.cdecl.parseStructFieldDecl
import club.doki7.babel.cdecl.parseTriSlashDoxygen
import club.doki7.babel.cdecl.toType
import club.doki7.babel.extract.TypedefKind
import club.doki7.babel.extract.isBlockCommentIndicator
import club.doki7.babel.extract.isLineCommentIndicator
import club.doki7.babel.extract.isTriSlashIndicator
import club.doki7.babel.extract.isTypedef
import club.doki7.babel.extract.vma.log
import club.doki7.babel.registry.EmptyMergeable
import club.doki7.babel.registry.Identifier
import club.doki7.babel.registry.Member
import club.doki7.babel.registry.OpaqueTypedef
import club.doki7.babel.registry.Registry
import club.doki7.babel.registry.Structure

abstract class HeaderParser<T>(val lines: List<String>) {
    var previousIndex = -1

    /**
     * Line iterator, the value indicates the next line index, or how many lines are consumed.
     */
    var lineIndex = 0
        set(value) {
            previousIndex = field
            field = value
        }

    protected fun nextLine(): String? {
        val line = lines.getOrNull(lineIndex)
        if (line != null) {
            lineIndex += 1
            return line.trim()
        }

        return null
    }

    protected fun peekLine(): String? {
        return lines.getOrNull(lineIndex)
    }

    open fun parse(): HeaderParser<T> {
        // the order is important
        lineIndex = 0
        previousIndex = -1

        while (true) {
            if (previousIndex == lineIndex) {
                log.warning("vma.h: infinite loop detected at line $lineIndex: ${lines[lineIndex]}, forcing process")
                lineIndex += 1
            }

            if (! parseOne()) break
        }

        return this
    }

    abstract fun collect(): T

    /**
     * @return if continue
     */
    protected abstract fun parseOne(): Boolean
}

/**
 * After [parse]: [lineIndex] is the line below the last comment, or `lineIndex == 0` if no comment is met.
 */
class Glfw3CommentParser<T, P: HeaderParser<T>>(delegate: P)
    : HeaderParser<List<String>?>(delegate.lines.subList(delegate.lineIndex, delegate.lines.size)) {
    private var savedDoc: List<String>? = null

    override fun collect(): List<String>? {
        return savedDoc
    }

    override fun parseOne(): Boolean {
        val line = peekLine() ?: return false

        when {
            isBlockCommentIndicator(line) -> {
                val (doc, newIdx) = parseBlockDoxygen(lines, lineIndex)     // not yet consume, so lineIndex is correct
                savedDoc = doc
                lineIndex = newIdx      // do consume
            }

            isTriSlashIndicator(line) -> {
                val (doc, newIdx) = parseTriSlashDoxygen(lines, lineIndex)
                savedDoc = doc
                lineIndex = newIdx
            }

            isLineCommentIndicator(line) -> {
                nextLine()      // ignore and consume
            }

            else -> return false
        }

        // now, we already consume at least one line
        return true
    }
}


/**
 * Assumption: `delegate.lineIndex` is the line below `{`
 * After [parse]: [lineIndex] is the line below `} STRUCT_NAME;`
 */
class Glfw3StructParser<P : HeaderParser<*>>(delegate: P)
    : HeaderParser<Glfw3StructParser.ParsedStruct>(delegate.lines.subList(delegate.lineIndex, delegate.lines.size)) {
    private var name: String? = null
    private val members: MutableList<Member> = mutableListOf()
    private var savedDoc: List<String>? = null

    fun getDocument(): List<String>? {
        val savedDoc = savedDoc
        this.savedDoc = null
        return savedDoc
    }

    class ParsedStruct(val name: String, val members: List<Member>)

    override fun collect(): ParsedStruct {
        assert(name != null)
        return ParsedStruct(name!!, members)
    }

    override fun parseOne(): Boolean {
        val commentParser = Glfw3CommentParser(this)
            .parse()
        val savedDoc  = commentParser.collect()
        if (savedDoc != null) this.savedDoc = savedDoc
        lineIndex = lineIndex + commentParser.lineIndex

        val currentLine = peekLine() ?: return false

        when {
            currentLine.startsWith('}') -> {
                assert(currentLine.endsWith(';'))
                val structName = currentLine.substring(1, currentLine.length - 1).trim()
                this.name = structName
                nextLine()      // consume
                return false
            }

            currentLine.endsWith(';') -> {
                val (decl, newIdx) = parseStructFieldDecl(lines, previousIndex)
                lineIndex = newIdx

                val member = Member(
                    decl.name, decl.type.toType(),
                    null, null, null, false, null)
                member.doc = getDocument()
                members.add(member)
            }

            else -> {
                // TODO: unknown line!
                nextLine()      // consume
            }
        }

        return true
    }
}

class Glfw3HeaderParser(lines: List<String>)
    : HeaderParser<Registry<EmptyMergeable>>(lines) {
    companion object {
        // `typedef struct `
        const val OFFSET_TYPEDEF_STRUCT = 8 + 7
    }

    private val structures: MutableMap<Identifier, Structure> = mutableMapOf()
    private val opaqueTypedefs: MutableMap<Identifier, OpaqueTypedef> = mutableMapOf()
    private var savedDoc: List<String>? = null

    fun getDocument(): List<String>? {
        val savedDoc = savedDoc
        this.savedDoc = null
        return savedDoc
    }

    override fun collect(): Registry<EmptyMergeable> {
        TODO("Not yet implemented")
    }

    override fun parseOne(): Boolean {
        var currentLine = peekLine() ?: return false            // fuck intellij idea

        val commentParser = Glfw3CommentParser(this)
            .parse()
        val doc = commentParser
            .collect()
        if (doc != null) savedDoc = doc
        lineIndex = lineIndex + commentParser.lineIndex

        currentLine = nextLine() ?: return false

        val typedefKind = isTypedef(currentLine)
        when (typedefKind) {
            TypedefKind.Normal -> TODO()
            TypedefKind.Enum -> TODO()
            TypedefKind.Struct -> parseStruct(currentLine)
            null -> TODO()
        }

        return true
    }

    /**
     * Assumption: [lineIndex] is the line below `typedef struct` (which is [typedefLine])
     * After call: [lineIndex] is the line below the whole `typedef struct`
     */
    fun parseStruct(typedefLine: String) {
        // we have two kinds of typedef struct:
        // * `typedef struct SOME_NAME ANOTHER_NAME;`
        // * ```
        //   typedef struct SOME_NAME
        //   {
        //   ...
        //   } ANOTHER_NAME;
        //   ```

        if (typedefLine.endsWith(';')) {
            // first kind
            // `SOME_NAME ANOTHER_NAME`
            val headless = typedefLine.substring(OFFSET_TYPEDEF_STRUCT, typedefLine.length - 1).trim()
            val names = headless.split(' ')
            assert(names.size == 2)

            val name = names[1]
            val typedef = OpaqueTypedef(name)
            opaqueTypedefs[typedef.name] = typedef

            // no need to consume due to the call assumption
            // after call holes
            return
        }

        // second kind
        val nextLine = nextLine()           // consume the `{` line, now [lineIndex] is the line below `{`
        assert(nextLine != null && nextLine.startsWith('{'))
        val structParser = Glfw3StructParser(this)
            .parse()
        val parsedStruct = structParser.collect()
        lineIndex = lineIndex + structParser.lineIndex
        // now, [lineIndex] is the line below `} STRUCT_NAME;`
        val struct = Structure(parsedStruct.name, parsedStruct.members)
        struct.doc = getDocument()
        structures[struct.name] = struct
        // after call holes
    }

    fun parseTypedef(kind: TypedefKind) {

    }
}

private fun parseGlfw3Header(fileContent: String): Registry<EmptyMergeable> {
    TODO()
}