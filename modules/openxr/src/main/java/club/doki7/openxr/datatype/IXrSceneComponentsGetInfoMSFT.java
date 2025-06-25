package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneComponentsGetInfoMSFT} and {@link XrSceneComponentsGetInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneComponentsGetInfoMSFT
    extends IPointer
    permits XrSceneComponentsGetInfoMSFT, XrSceneComponentsGetInfoMSFT.Ptr
{}
