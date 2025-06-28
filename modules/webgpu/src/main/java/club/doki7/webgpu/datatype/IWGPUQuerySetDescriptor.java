package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUQuerySetDescriptor} and {@link WGPUQuerySetDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUQuerySetDescriptor
    extends IPointer
    permits WGPUQuerySetDescriptor, WGPUQuerySetDescriptor.Ptr
{}
