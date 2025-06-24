package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialComponentBounded3DListEXT} and {@link XrSpatialComponentBounded3DListEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialComponentBounded3DListEXT
    extends IPointer
    permits XrSpatialComponentBounded3DListEXT, XrSpatialComponentBounded3DListEXT.Ptr
{}
