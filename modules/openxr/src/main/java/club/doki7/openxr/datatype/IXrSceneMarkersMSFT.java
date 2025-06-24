package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneMarkersMSFT} and {@link XrSceneMarkersMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneMarkersMSFT
    extends IPointer
    permits XrSceneMarkersMSFT, XrSceneMarkersMSFT.Ptr
{}
