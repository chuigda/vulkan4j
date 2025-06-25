package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneMarkerTypeFilterMSFT} and {@link XrSceneMarkerTypeFilterMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneMarkerTypeFilterMSFT
    extends IPointer
    permits XrSceneMarkerTypeFilterMSFT, XrSceneMarkerTypeFilterMSFT.Ptr
{}
