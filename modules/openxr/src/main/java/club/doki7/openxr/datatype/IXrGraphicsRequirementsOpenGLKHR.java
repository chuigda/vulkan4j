package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrGraphicsRequirementsOpenGLKHR} and {@link XrGraphicsRequirementsOpenGLKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrGraphicsRequirementsOpenGLKHR
    extends IPointer
    permits XrGraphicsRequirementsOpenGLKHR, XrGraphicsRequirementsOpenGLKHR.Ptr
{}
