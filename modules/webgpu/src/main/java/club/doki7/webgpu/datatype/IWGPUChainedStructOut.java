package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUChainedStructOut} and {@link WGPUChainedStructOut.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUChainedStructOut
    extends IPointer
    permits WGPUChainedStructOut, WGPUChainedStructOut.Ptr
{}
