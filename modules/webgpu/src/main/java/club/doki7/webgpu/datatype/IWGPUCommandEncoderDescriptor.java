package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUCommandEncoderDescriptor} and {@link WGPUCommandEncoderDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUCommandEncoderDescriptor
    extends IPointer
    permits WGPUCommandEncoderDescriptor, WGPUCommandEncoderDescriptor.Ptr
{}
