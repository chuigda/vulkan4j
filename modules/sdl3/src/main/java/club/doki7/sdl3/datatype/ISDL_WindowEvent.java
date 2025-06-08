package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_WindowEvent} and {@link SDL_WindowEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_WindowEvent
    extends IPointer
    permits SDL_WindowEvent, SDL_WindowEvent.Ptr
{}
