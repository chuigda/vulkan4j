package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrGraphicsBindingOpenGLESAndroidKHR} and {@link XrGraphicsBindingOpenGLESAndroidKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrGraphicsBindingOpenGLESAndroidKHR
    extends IPointer
    permits XrGraphicsBindingOpenGLESAndroidKHR, XrGraphicsBindingOpenGLESAndroidKHR.Ptr
{}
