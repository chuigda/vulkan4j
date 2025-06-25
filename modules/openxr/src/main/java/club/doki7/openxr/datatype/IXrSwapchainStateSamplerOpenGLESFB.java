package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSwapchainStateSamplerOpenGLESFB} and {@link XrSwapchainStateSamplerOpenGLESFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSwapchainStateSamplerOpenGLESFB
    extends IPointer
    permits XrSwapchainStateSamplerOpenGLESFB, XrSwapchainStateSamplerOpenGLESFB.Ptr
{}
