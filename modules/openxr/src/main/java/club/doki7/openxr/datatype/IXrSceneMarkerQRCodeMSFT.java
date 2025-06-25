package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneMarkerQRCodeMSFT} and {@link XrSceneMarkerQRCodeMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneMarkerQRCodeMSFT
    extends IPointer
    permits XrSceneMarkerQRCodeMSFT, XrSceneMarkerQRCodeMSFT.Ptr
{}
