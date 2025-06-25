package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrGraphicsRequirementsOpenGLESKHR} and {@link XrGraphicsRequirementsOpenGLESKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrGraphicsRequirementsOpenGLESKHR
    extends IPointer
    permits XrGraphicsRequirementsOpenGLESKHR, XrGraphicsRequirementsOpenGLESKHR.Ptr
{}
