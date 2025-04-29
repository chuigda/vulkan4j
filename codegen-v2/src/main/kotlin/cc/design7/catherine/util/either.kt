package cc.design7.catherine.util

sealed class Either<T1, T2> {
    class Left<T1, T2>(val value: T1) : Either<T1, T2>()
    class Right<T1, T2>(val value: T2) : Either<T1, T2>()

    override fun toString(): String {
        return when (this) {
            is Left -> "$value"
            is Right -> "$value"
        }
    }
}
