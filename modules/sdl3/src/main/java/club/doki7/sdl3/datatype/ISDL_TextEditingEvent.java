package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_TextEditingEvent} and {@link SDL_TextEditingEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_TextEditingEvent
    extends IPointer
    permits SDL_TextEditingEvent, SDL_TextEditingEvent.Ptr
{}
