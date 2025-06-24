package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSwapchainImageOpenGLKHR} and {@link XrSwapchainImageOpenGLKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSwapchainImageOpenGLKHR
    extends IPointer
    permits XrSwapchainImageOpenGLKHR, XrSwapchainImageOpenGLKHR.Ptr
{}
