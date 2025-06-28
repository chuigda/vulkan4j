package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUComputePassTimestampWrites} and {@link WGPUComputePassTimestampWrites.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUComputePassTimestampWrites
    extends IPointer
    permits WGPUComputePassTimestampWrites, WGPUComputePassTimestampWrites.Ptr
{}
