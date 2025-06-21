package club.doki7.stb.truetype.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link STBTT_AlignedQuad} and {@link STBTT_AlignedQuad.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISTBTT_AlignedQuad
    extends IPointer
    permits STBTT_AlignedQuad, STBTT_AlignedQuad.Ptr
{}
