package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrMarkerDetectorSnapshotInfoML} and {@link XrMarkerDetectorSnapshotInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrMarkerDetectorSnapshotInfoML
    extends IPointer
    permits XrMarkerDetectorSnapshotInfoML, XrMarkerDetectorSnapshotInfoML.Ptr
{}
