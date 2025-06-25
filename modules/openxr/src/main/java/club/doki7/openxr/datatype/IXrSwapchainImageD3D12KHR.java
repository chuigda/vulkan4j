package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSwapchainImageD3D12KHR} and {@link XrSwapchainImageD3D12KHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSwapchainImageD3D12KHR
    extends IPointer
    permits XrSwapchainImageD3D12KHR, XrSwapchainImageD3D12KHR.Ptr
{}
