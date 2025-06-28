package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUTextureDescriptor} and {@link WGPUTextureDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUTextureDescriptor
    extends IPointer
    permits WGPUTextureDescriptor, WGPUTextureDescriptor.Ptr
{}
