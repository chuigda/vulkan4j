package club.doki7.stb.imageresize.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link STBIR_PROFILEINFO} and {@link STBIR_PROFILEINFO.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISTBIR_PROFILEINFO
    extends IPointer
    permits STBIR_PROFILEINFO, STBIR_PROFILEINFO.Ptr
{}
