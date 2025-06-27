package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUSamplerDescriptor} and {@link WGPUSamplerDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUSamplerDescriptor
    extends IPointer
    permits WGPUSamplerDescriptor, WGPUSamplerDescriptor.Ptr
{}
