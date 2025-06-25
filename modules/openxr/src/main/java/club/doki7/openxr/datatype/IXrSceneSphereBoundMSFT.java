package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneSphereBoundMSFT} and {@link XrSceneSphereBoundMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneSphereBoundMSFT
    extends IPointer
    permits XrSceneSphereBoundMSFT, XrSceneSphereBoundMSFT.Ptr
{}
