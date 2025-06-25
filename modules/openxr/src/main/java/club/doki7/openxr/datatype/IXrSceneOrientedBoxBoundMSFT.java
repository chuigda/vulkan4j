package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneOrientedBoxBoundMSFT} and {@link XrSceneOrientedBoxBoundMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneOrientedBoxBoundMSFT
    extends IPointer
    permits XrSceneOrientedBoxBoundMSFT, XrSceneOrientedBoxBoundMSFT.Ptr
{}
