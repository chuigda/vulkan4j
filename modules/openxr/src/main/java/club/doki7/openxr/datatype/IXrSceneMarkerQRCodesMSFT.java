package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneMarkerQRCodesMSFT} and {@link XrSceneMarkerQRCodesMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneMarkerQRCodesMSFT
    extends IPointer
    permits XrSceneMarkerQRCodesMSFT, XrSceneMarkerQRCodesMSFT.Ptr
{}
