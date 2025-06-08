package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUSamplerCreateInfo} and {@link SDL_GPUSamplerCreateInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUSamplerCreateInfo
    extends IPointer
    permits SDL_GPUSamplerCreateInfo, SDL_GPUSamplerCreateInfo.Ptr
{}
