package club.doki7.stb.truetype.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link STBTT_Bakedchar} and {@link STBTT_Bakedchar.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISTBTT_Bakedchar
    extends IPointer
    permits STBTT_Bakedchar, STBTT_Bakedchar.Ptr
{}
