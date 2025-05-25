package club.doki7.vma.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VmaDeviceMemoryCallbacks} and {@link VmaDeviceMemoryCallbacks.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVmaDeviceMemoryCallbacks
    extends IPointer
    permits VmaDeviceMemoryCallbacks, VmaDeviceMemoryCallbacks.Ptr
{}
