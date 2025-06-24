package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrGeometryInstanceTransformFB} and {@link XrGeometryInstanceTransformFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrGeometryInstanceTransformFB
    extends IPointer
    permits XrGeometryInstanceTransformFB, XrGeometryInstanceTransformFB.Ptr
{}
