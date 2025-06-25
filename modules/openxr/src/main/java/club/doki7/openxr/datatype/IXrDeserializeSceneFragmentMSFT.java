package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrDeserializeSceneFragmentMSFT} and {@link XrDeserializeSceneFragmentMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrDeserializeSceneFragmentMSFT
    extends IPointer
    permits XrDeserializeSceneFragmentMSFT, XrDeserializeSceneFragmentMSFT.Ptr
{}
