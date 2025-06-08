package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_Vertex} and {@link SDL_Vertex.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_Vertex
    extends IPointer
    permits SDL_Vertex, SDL_Vertex.Ptr
{}
