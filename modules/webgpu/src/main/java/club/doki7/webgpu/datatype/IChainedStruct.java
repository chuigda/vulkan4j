package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link ChainedStruct} and {@link ChainedStruct.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IChainedStruct
    extends IPointer
    permits ChainedStruct, ChainedStruct.Ptr
{}
