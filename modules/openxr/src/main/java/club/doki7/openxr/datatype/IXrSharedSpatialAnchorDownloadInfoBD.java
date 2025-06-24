package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSharedSpatialAnchorDownloadInfoBD} and {@link XrSharedSpatialAnchorDownloadInfoBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSharedSpatialAnchorDownloadInfoBD
    extends IPointer
    permits XrSharedSpatialAnchorDownloadInfoBD, XrSharedSpatialAnchorDownloadInfoBD.Ptr
{}
