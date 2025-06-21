package club.doki7.stb.truetype.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link STBTT_Fontinfo} and {@link STBTT_Fontinfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISTBTT_Fontinfo
    extends IPointer
    permits STBTT_Fontinfo, STBTT_Fontinfo.Ptr
{}
