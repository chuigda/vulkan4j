package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUIndirectDrawCommand} and {@link SDL_GPUIndirectDrawCommand.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUIndirectDrawCommand
    extends IPointer
    permits SDL_GPUIndirectDrawCommand, SDL_GPUIndirectDrawCommand.Ptr
{}
