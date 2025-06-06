package club.doki7.babel.extract.opengl

sealed interface GLMetadata {
    var isExtension: Boolean?
}

data class GLBaseMetadata(override var isExtension: Boolean?): GLMetadata

data class GLCommandMetadata(
    var isCompatibility: Boolean,
    override var isExtension: Boolean?
): GLMetadata
