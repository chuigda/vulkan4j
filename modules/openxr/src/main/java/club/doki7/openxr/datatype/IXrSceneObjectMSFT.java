package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneObjectMSFT} and {@link XrSceneObjectMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneObjectMSFT
    extends IPointer
    permits XrSceneObjectMSFT, XrSceneObjectMSFT.Ptr
{}
