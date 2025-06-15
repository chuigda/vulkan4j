package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link StorageTextureBindingLayout} and {@link StorageTextureBindingLayout.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IStorageTextureBindingLayout
    extends IPointer
    permits StorageTextureBindingLayout, StorageTextureBindingLayout.Ptr
{}
