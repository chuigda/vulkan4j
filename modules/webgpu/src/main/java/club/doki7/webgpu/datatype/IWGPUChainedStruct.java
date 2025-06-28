package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUChainedStruct} and {@link WGPUChainedStruct.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUChainedStruct
    extends IPointer
    permits WGPUChainedStruct, WGPUChainedStruct.Ptr
{}
