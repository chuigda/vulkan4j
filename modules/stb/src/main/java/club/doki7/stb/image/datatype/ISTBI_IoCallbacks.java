package club.doki7.stb.image.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link STBI_IoCallbacks} and {@link STBI_IoCallbacks.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISTBI_IoCallbacks
    extends IPointer
    permits STBI_IoCallbacks, STBI_IoCallbacks.Ptr
{}
