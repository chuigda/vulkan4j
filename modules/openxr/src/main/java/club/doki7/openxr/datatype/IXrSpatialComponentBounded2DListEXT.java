package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialComponentBounded2DListEXT} and {@link XrSpatialComponentBounded2DListEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialComponentBounded2DListEXT
    extends IPointer
    permits XrSpatialComponentBounded2DListEXT, XrSpatialComponentBounded2DListEXT.Ptr
{}
