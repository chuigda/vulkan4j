package club.doki7.stb.truetype.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link STBTT_PackContext} and {@link STBTT_PackContext.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISTBTT_PackContext
    extends IPointer
    permits STBTT_PackContext, STBTT_PackContext.Ptr
{}
