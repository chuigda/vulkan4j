package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialComponentParentListEXT} and {@link XrSpatialComponentParentListEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialComponentParentListEXT
    extends IPointer
    permits XrSpatialComponentParentListEXT, XrSpatialComponentParentListEXT.Ptr
{}
