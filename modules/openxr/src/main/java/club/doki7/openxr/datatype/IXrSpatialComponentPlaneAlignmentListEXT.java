package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialComponentPlaneAlignmentListEXT} and {@link XrSpatialComponentPlaneAlignmentListEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialComponentPlaneAlignmentListEXT
    extends IPointer
    permits XrSpatialComponentPlaneAlignmentListEXT, XrSpatialComponentPlaneAlignmentListEXT.Ptr
{}
