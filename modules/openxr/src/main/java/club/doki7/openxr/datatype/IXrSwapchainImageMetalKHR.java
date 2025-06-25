package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSwapchainImageMetalKHR} and {@link XrSwapchainImageMetalKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSwapchainImageMetalKHR
    extends IPointer
    permits XrSwapchainImageMetalKHR, XrSwapchainImageMetalKHR.Ptr
{}
