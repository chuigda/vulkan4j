package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneDeserializeInfoMSFT} and {@link XrSceneDeserializeInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneDeserializeInfoMSFT
    extends IPointer
    permits XrSceneDeserializeInfoMSFT, XrSceneDeserializeInfoMSFT.Ptr
{}
