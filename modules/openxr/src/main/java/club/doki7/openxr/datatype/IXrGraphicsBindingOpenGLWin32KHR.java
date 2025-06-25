package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrGraphicsBindingOpenGLWin32KHR} and {@link XrGraphicsBindingOpenGLWin32KHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrGraphicsBindingOpenGLWin32KHR
    extends IPointer
    permits XrGraphicsBindingOpenGLWin32KHR, XrGraphicsBindingOpenGLWin32KHR.Ptr
{}
