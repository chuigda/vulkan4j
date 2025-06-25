package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSwapchainImageOpenGLESKHR} and {@link XrSwapchainImageOpenGLESKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSwapchainImageOpenGLESKHR
    extends IPointer
    permits XrSwapchainImageOpenGLESKHR, XrSwapchainImageOpenGLESKHR.Ptr
{}
