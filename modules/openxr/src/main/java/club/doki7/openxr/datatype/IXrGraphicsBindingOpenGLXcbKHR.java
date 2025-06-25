package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrGraphicsBindingOpenGLXcbKHR} and {@link XrGraphicsBindingOpenGLXcbKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrGraphicsBindingOpenGLXcbKHR
    extends IPointer
    permits XrGraphicsBindingOpenGLXcbKHR, XrGraphicsBindingOpenGLXcbKHR.Ptr
{}
