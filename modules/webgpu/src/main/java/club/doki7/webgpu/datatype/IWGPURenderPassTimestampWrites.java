package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPURenderPassTimestampWrites} and {@link WGPURenderPassTimestampWrites.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPURenderPassTimestampWrites
    extends IPointer
    permits WGPURenderPassTimestampWrites, WGPURenderPassTimestampWrites.Ptr
{}
