package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSwapchainSubImage} and {@link XrSwapchainSubImage.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSwapchainSubImage
    extends IPointer
    permits XrSwapchainSubImage, XrSwapchainSubImage.Ptr
{}
