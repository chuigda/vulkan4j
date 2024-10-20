package extract

import Constant
import Function
import Param
import Registry
import org.w3c.dom.Element

fun extractGLES2Registry(fileContent: String): Registry {
    val xml = parseXML(fileContent)

    val childCount = xml.childNodes.length

    val allConstants = mutableMapOf<String, Constant>()
    val allCommands = mutableMapOf<String, Function>()
    for (i in 0 until childCount) {
        val child = xml.childNodes.item(i)
        if (child is Element) {
            if (child.tagName == "enums") {
                extractEnumConstants(child, allConstants)
            }
            else if (child.tagName == "commands") {
                extractCommands(child, allCommands)
            }
        }
    }

    val requiredConstants = mutableMapOf<String, Constant>()
    val requiredCommands = mutableMapOf<String, Function>()

    val gles2Feature = findGLES2Feature(xml)
    val requires = gles2Feature.getElementsByTagName("require")
    val requireCount = requires.length
    for (i in 0 until requireCount) {
        val require = requires.item(i) as Element
        val commands = require.getElementsByTagName("command")
        val commandCount = commands.length
        for (j in 0 until commandCount) {
            val command = commands.item(j) as Element
            val name = command.getAttribute("name")

            val function = allCommands[name] ?: throw RuntimeException("command $name not found")
            requiredCommands[name] = function
        }

        val enums = require.getElementsByTagName("enum")
        val enumCount = enums.length
        for (j in 0 until enumCount) {
            val enum = enums.item(j) as Element
            val name = enum.getAttribute("name")

            val constant = allConstants[name] ?: throw RuntimeException("enum $name not found")
            requiredConstants[name] = constant
        }
    }

    return Registry(
        constants=requiredConstants,
        functions=requiredCommands,
        opaqueTypedefs=emptyMap(),
        handles=emptyMap(),
        structs=emptyMap(),
        functionTypedefs=emptyMap(),
        bitmasks=emptyMap(),
        enums=emptyMap(),

        constantClassName = "GLES2Constants"
    )
}

private fun extractEnumConstants(enums: Element, allConstants: MutableMap<String, Constant>) {
    val childCount = enums.childNodes.length
    for (i in 0 until childCount) {
        val enum = enums.childNodes.item(i)
        if (enum is Element) {
            if (enum.tagName == "enum") {
                val name = enum.getAttribute("name")
                val value = enum.getAttribute("value")

                allConstants[name] = Constant(name, expr=value)
            }
        }
    }
}

private fun extractCommands(commands: Element, allCommands: MutableMap<String, Function>) {
    val childCount = commands.childNodes.length
    for (i in 0 until childCount) {
        val command = commands.childNodes.item(i)
        if (command is Element) {
            if (command.tagName == "command") {
                val proto = command.getElementsByTagName("proto").item(0) as Element
                val name = proto.getElementsByTagName("name").item(0).textContent.trim()

                val retTypeString = getElementTextWithoutName(proto)
                val retType = parseType(tokenize(retTypeString), 0).first

                val params = mutableListOf<Param>()
                for (j in 0 until command.childNodes.length) {
                    val child = command.childNodes.item(j)
                    if (child is Element && child.tagName == "param") {
                        val paramName = child.getElementsByTagName("name").item(0).textContent.trim()

                        val paramTypeString = getElementTextWithoutName(child)
                        val (paramType, _) = parseType(tokenize(paramTypeString), 0)
                        params.add(Param(paramName, type=paramType, optional=true))
                    }
                }

                allCommands[name] = Function(name, params=params, result=retType)
            }
        }
    }
}

private fun getElementTextWithoutName(element: Element) = buildString {
    val childCount = element.childNodes.length
    for (i in 0 until childCount) {
        val child = element.childNodes.item(i)
        if (child is Element) {
            if (child.tagName != "name") {
                append(child.textContent.trim())
                if (i != childCount - 1) {
                    append(' ')
                }
            }
        }
        else {
            append(child.textContent.trim())
            if (i != childCount - 1) {
                append(' ')
            }
        }
    }
}

private fun findGLES2Feature(xml: Element): Element {
    val features = xml.getElementsByTagName("feature")
    val featureCount = features.length
    for (i in 0 until featureCount) {
        val feature = features.item(i) as Element
        if (feature.getAttribute("api") == "gles2") {
            return feature
        }
    }

    throw RuntimeException("GLES2 feature not found")
}
