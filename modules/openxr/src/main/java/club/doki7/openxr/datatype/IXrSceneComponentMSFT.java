package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneComponentMSFT} and {@link XrSceneComponentMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneComponentMSFT
    extends IPointer
    permits XrSceneComponentMSFT, XrSceneComponentMSFT.Ptr
{}
