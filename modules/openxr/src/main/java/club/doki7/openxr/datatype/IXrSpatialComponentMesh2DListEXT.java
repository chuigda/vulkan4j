package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialComponentMesh2DListEXT} and {@link XrSpatialComponentMesh2DListEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialComponentMesh2DListEXT
    extends IPointer
    permits XrSpatialComponentMesh2DListEXT, XrSpatialComponentMesh2DListEXT.Ptr
{}
