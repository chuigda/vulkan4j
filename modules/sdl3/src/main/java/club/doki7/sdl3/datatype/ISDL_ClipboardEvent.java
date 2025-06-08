package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_ClipboardEvent} and {@link SDL_ClipboardEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_ClipboardEvent
    extends IPointer
    permits SDL_ClipboardEvent, SDL_ClipboardEvent.Ptr
{}
