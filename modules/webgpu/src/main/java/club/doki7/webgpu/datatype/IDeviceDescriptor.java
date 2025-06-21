package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link DeviceDescriptor} and {@link DeviceDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IDeviceDescriptor
    extends IPointer
    permits DeviceDescriptor, DeviceDescriptor.Ptr
{}
