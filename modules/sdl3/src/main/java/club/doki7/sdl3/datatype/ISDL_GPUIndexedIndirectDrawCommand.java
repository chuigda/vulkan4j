package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUIndexedIndirectDrawCommand} and {@link SDL_GPUIndexedIndirectDrawCommand.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUIndexedIndirectDrawCommand
    extends IPointer
    permits SDL_GPUIndexedIndirectDrawCommand, SDL_GPUIndexedIndirectDrawCommand.Ptr
{}
