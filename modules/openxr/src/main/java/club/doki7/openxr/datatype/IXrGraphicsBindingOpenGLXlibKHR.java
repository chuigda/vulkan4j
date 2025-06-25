package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrGraphicsBindingOpenGLXlibKHR} and {@link XrGraphicsBindingOpenGLXlibKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrGraphicsBindingOpenGLXlibKHR
    extends IPointer
    permits XrGraphicsBindingOpenGLXlibKHR, XrGraphicsBindingOpenGLXlibKHR.Ptr
{}
