package club.doki7.babel.extract.openxr

sealed interface XrMetadata

data class XrParamMetadata(val externsync: String?) : XrMetadata

data class XrStructMetadata(
    val structextends: String?,
    val parentstruct: String?,
    val protect: String?,
    val returnonly: Boolean,
    val mayalias: Boolean,
) : XrMetadata