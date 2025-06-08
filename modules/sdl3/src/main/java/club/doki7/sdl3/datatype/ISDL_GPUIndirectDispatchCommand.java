package club.doki7.sdl3.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SDL_GPUIndirectDispatchCommand} and {@link SDL_GPUIndirectDispatchCommand.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISDL_GPUIndirectDispatchCommand
    extends IPointer
    permits SDL_GPUIndirectDispatchCommand, SDL_GPUIndirectDispatchCommand.Ptr
{}
