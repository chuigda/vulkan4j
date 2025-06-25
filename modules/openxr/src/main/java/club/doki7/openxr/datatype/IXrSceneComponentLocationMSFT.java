package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneComponentLocationMSFT} and {@link XrSceneComponentLocationMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneComponentLocationMSFT
    extends IPointer
    permits XrSceneComponentLocationMSFT, XrSceneComponentLocationMSFT.Ptr
{}
