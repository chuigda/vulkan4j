package club.doki7.stb.imageresize.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link STBIR_RESIZE} and {@link STBIR_RESIZE.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISTBIR_RESIZE
    extends IPointer
    permits STBIR_RESIZE, STBIR_RESIZE.Ptr
{}
