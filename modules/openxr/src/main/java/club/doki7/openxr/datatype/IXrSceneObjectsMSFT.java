package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneObjectsMSFT} and {@link XrSceneObjectsMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneObjectsMSFT
    extends IPointer
    permits XrSceneObjectsMSFT, XrSceneObjectsMSFT.Ptr
{}
