package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialUpdateSnapshotCreateInfoEXT} and {@link XrSpatialUpdateSnapshotCreateInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialUpdateSnapshotCreateInfoEXT
    extends IPointer
    permits XrSpatialUpdateSnapshotCreateInfoEXT, XrSpatialUpdateSnapshotCreateInfoEXT.Ptr
{}
