package club.doki7.babel.extract.shaderc

interface Key<E : Any> {
    val key: String
}

abstract class AbstractKey<E : Any>(override val key: String) : Key<E>

@Suppress("UNCHECKED_CAST")
operator fun <E : Any> MutableMap<String, Any>.get(key: Key<E>): E? {
    return this[key.key]?.let { it as E }
}

operator fun <E : Any> MutableMap<String, Any>.set(key: Key<E>, value: E) {
    val exists = this.putIfAbsent(key.key, value)
    assert(exists == null)
}

fun <E : Any> MutableMap<String, Any>.steal(key: Key<E>) : E? {
    val value = get(key)
    if (value != null) {
        remove(key.key)
    }

    return value
}

fun <E : Any> MutableMap<String, Any>.rob(key: Key<E>) : E {
    val value = get(key)!!
    remove(key.key)
    return value
}