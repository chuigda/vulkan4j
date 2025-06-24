package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSerializedSceneFragmentDataGetInfoMSFT} and {@link XrSerializedSceneFragmentDataGetInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSerializedSceneFragmentDataGetInfoMSFT
    extends IPointer
    permits XrSerializedSceneFragmentDataGetInfoMSFT, XrSerializedSceneFragmentDataGetInfoMSFT.Ptr
{}
