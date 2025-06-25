package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialComponentMesh3DListEXT} and {@link XrSpatialComponentMesh3DListEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialComponentMesh3DListEXT
    extends IPointer
    permits XrSpatialComponentMesh3DListEXT, XrSpatialComponentMesh3DListEXT.Ptr
{}
