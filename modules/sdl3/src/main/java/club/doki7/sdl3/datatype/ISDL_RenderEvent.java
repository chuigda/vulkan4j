package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_RenderEvent} and {@link SDL_RenderEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_RenderEvent
    extends IPointer
    permits SDL_RenderEvent, SDL_RenderEvent.Ptr
{}
