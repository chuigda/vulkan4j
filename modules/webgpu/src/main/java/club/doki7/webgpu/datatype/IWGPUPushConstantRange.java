package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUPushConstantRange} and {@link WGPUPushConstantRange.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUPushConstantRange
    extends IPointer
    permits WGPUPushConstantRange, WGPUPushConstantRange.Ptr
{}
