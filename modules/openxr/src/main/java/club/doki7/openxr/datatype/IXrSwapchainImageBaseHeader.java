package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSwapchainImageBaseHeader} and {@link XrSwapchainImageBaseHeader.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSwapchainImageBaseHeader
    extends IPointer
    permits XrSwapchainImageBaseHeader, XrSwapchainImageBaseHeader.Ptr
{}
