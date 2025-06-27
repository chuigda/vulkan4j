package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUInstanceDescriptor} and {@link WGPUInstanceDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUInstanceDescriptor
    extends IPointer
    permits WGPUInstanceDescriptor, WGPUInstanceDescriptor.Ptr
{}
