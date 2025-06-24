package club.doki7.stb.truetype.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link STBTT_Vertex} and {@link STBTT_Vertex.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISTBTT_Vertex
    extends IPointer
    permits STBTT_Vertex, STBTT_Vertex.Ptr
{}
