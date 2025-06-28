package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUTextureBindingLayout} and {@link WGPUTextureBindingLayout.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUTextureBindingLayout
    extends IPointer
    permits WGPUTextureBindingLayout, WGPUTextureBindingLayout.Ptr
{}
