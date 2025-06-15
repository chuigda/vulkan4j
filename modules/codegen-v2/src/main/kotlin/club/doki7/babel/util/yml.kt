package club.doki7.babel.util

import org.yaml.snakeyaml.DumperOptions
import org.yaml.snakeyaml.Yaml
import org.yaml.snakeyaml.constructor.Constructor
import java.io.StringReader
import kotlin.collections.Map

fun String.parseYML(): Map<String, Any> {
    val yaml = Yaml()
    return yaml.load(StringReader(this)) as Map<String, Any>
}

fun Map<String, Any>.getAttributeText(name: String): String? =
    this[name]?.toString()

fun Map<String, Any>.getFirstElement(tag: String): Map<String, Any>? =
    this[tag] as? Map<String, Any>

fun Map<String, Any>.getElementSeq(tag: String): Sequence<Map<String, Any>> =
    (this[tag] as? List<*>)?.filterIsInstance<Map<String, Any>>()?.asSequence() ?: emptySequence()

// XPath 查询（类似功能） - 针对 YAML 结构树
fun Map<String, Any>.query(xpath: String): Sequence<Map<String, Any>> {
    val parts = xpath.split("/")
    var currentNode: Any? = this
    for (part in parts) {
        currentNode = (currentNode as? Map<String, Any>)?.get(part)
    }
    return if (currentNode is List<*>) {
        currentNode.filterIsInstance<Map<String, Any>>().asSequence()
    } else {
        emptySequence()
    }
}

fun <T> Map<String, Any>.toList(): List<Map<String, Any>> =
    this.values.filterIsInstance<Map<String, Any>>()

operator fun Map<String, Any>.iterator(): Iterator<Map.Entry<String, Any>> = this.entries.iterator()

fun Map<String, Any>.asSequence(): Sequence<Map.Entry<String, Any>> = this.iterator().asSequence()

// 使用示例
fun main() {
    val ymlString = """
        person:
          name: John Doe
          age: 30
          address:
            street: 123 Main St
            city: New York
    """
    val parsedYML = ymlString.parseYML()
    val personName = parsedYML.getFirstElement("person")?.getAttributeText("name")
    println(personName)  // Output: John Doe

    val address = parsedYML.query("person/address")
    address.forEach {
        println(it)
    }
}
