package club.doki7.stb.truetype.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link STBTT_Bitmap} and {@link STBTT_Bitmap.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISTBTT_Bitmap
    extends IPointer
    permits STBTT_Bitmap, STBTT_Bitmap.Ptr
{}
