package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrGraphicsBindingOpenGLWaylandKHR} and {@link XrGraphicsBindingOpenGLWaylandKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrGraphicsBindingOpenGLWaylandKHR
    extends IPointer
    permits XrGraphicsBindingOpenGLWaylandKHR, XrGraphicsBindingOpenGLWaylandKHR.Ptr
{}
