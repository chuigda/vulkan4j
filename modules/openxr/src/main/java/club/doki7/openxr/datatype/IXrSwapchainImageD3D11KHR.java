package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSwapchainImageD3D11KHR} and {@link XrSwapchainImageD3D11KHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSwapchainImageD3D11KHR
    extends IPointer
    permits XrSwapchainImageD3D11KHR, XrSwapchainImageD3D11KHR.Ptr
{}
