package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_TextEditingCandidatesEvent} and {@link SDL_TextEditingCandidatesEvent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_TextEditingCandidatesEvent
    extends IPointer
    permits SDL_TextEditingCandidatesEvent, SDL_TextEditingCandidatesEvent.Ptr
{}
