package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneMarkerMSFT} and {@link XrSceneMarkerMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneMarkerMSFT
    extends IPointer
    permits XrSceneMarkerMSFT, XrSceneMarkerMSFT.Ptr
{}
