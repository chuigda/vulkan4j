package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUTextureSamplerBinding} and {@link SDL_GPUTextureSamplerBinding.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUTextureSamplerBinding
    extends IPointer
    permits SDL_GPUTextureSamplerBinding, SDL_GPUTextureSamplerBinding.Ptr
{}
