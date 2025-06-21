package club.doki7.stb.truetype.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link STBTT_Packedchar} and {@link STBTT_Packedchar.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISTBTT_Packedchar
    extends IPointer
    permits STBTT_Packedchar, STBTT_Packedchar.Ptr
{}
