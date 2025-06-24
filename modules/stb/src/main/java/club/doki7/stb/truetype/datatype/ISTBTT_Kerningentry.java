package club.doki7.stb.truetype.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link STBTT_Kerningentry} and {@link STBTT_Kerningentry.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISTBTT_Kerningentry
    extends IPointer
    permits STBTT_Kerningentry, STBTT_Kerningentry.Ptr
{}
