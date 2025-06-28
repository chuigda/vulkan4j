package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUStorageTextureBindingLayout} and {@link WGPUStorageTextureBindingLayout.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUStorageTextureBindingLayout
    extends IPointer
    permits WGPUStorageTextureBindingLayout, WGPUStorageTextureBindingLayout.Ptr
{}
