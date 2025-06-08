package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_CameraSpec} and {@link SDL_CameraSpec.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_CameraSpec
    extends IPointer
    permits SDL_CameraSpec, SDL_CameraSpec.Ptr
{}
