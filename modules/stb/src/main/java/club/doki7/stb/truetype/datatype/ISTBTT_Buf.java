package club.doki7.stb.truetype.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link STBTT_Buf} and {@link STBTT_Buf.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISTBTT_Buf
    extends IPointer
    permits STBTT_Buf, STBTT_Buf.Ptr
{}
