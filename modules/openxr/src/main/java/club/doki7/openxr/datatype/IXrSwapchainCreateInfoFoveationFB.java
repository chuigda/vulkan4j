package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSwapchainCreateInfoFoveationFB} and {@link XrSwapchainCreateInfoFoveationFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSwapchainCreateInfoFoveationFB
    extends IPointer
    permits XrSwapchainCreateInfoFoveationFB, XrSwapchainCreateInfoFoveationFB.Ptr
{}
