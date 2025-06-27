package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUDeviceDescriptor} and {@link WGPUDeviceDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUDeviceDescriptor
    extends IPointer
    permits WGPUDeviceDescriptor, WGPUDeviceDescriptor.Ptr
{}
