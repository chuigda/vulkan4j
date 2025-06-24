package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialComponentDataQueryConditionEXT} and {@link XrSpatialComponentDataQueryConditionEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialComponentDataQueryConditionEXT
    extends IPointer
    permits XrSpatialComponentDataQueryConditionEXT, XrSpatialComponentDataQueryConditionEXT.Ptr
{}
