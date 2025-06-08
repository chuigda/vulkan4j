package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_Locale} and {@link SDL_Locale.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_Locale
    extends IPointer
    permits SDL_Locale, SDL_Locale.Ptr
{}
