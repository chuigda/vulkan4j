package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPURenderPassDescriptor} and {@link WGPURenderPassDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPURenderPassDescriptor
    extends IPointer
    permits WGPURenderPassDescriptor, WGPURenderPassDescriptor.Ptr
{}
