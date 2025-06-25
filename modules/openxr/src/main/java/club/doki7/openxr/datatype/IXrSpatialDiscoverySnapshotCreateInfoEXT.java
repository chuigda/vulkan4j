package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialDiscoverySnapshotCreateInfoEXT} and {@link XrSpatialDiscoverySnapshotCreateInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialDiscoverySnapshotCreateInfoEXT
    extends IPointer
    permits XrSpatialDiscoverySnapshotCreateInfoEXT, XrSpatialDiscoverySnapshotCreateInfoEXT.Ptr
{}
