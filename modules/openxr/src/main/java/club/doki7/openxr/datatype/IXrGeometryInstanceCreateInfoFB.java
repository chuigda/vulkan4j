package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrGeometryInstanceCreateInfoFB} and {@link XrGeometryInstanceCreateInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrGeometryInstanceCreateInfoFB
    extends IPointer
    permits XrGeometryInstanceCreateInfoFB, XrGeometryInstanceCreateInfoFB.Ptr
{}
