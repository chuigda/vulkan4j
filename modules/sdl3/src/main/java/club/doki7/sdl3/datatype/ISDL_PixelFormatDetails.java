package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_PixelFormatDetails} and {@link SDL_PixelFormatDetails.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_PixelFormatDetails
    extends IPointer
    permits SDL_PixelFormatDetails, SDL_PixelFormatDetails.Ptr
{}
