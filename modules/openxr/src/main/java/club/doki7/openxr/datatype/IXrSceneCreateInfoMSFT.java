package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneCreateInfoMSFT} and {@link XrSceneCreateInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneCreateInfoMSFT
    extends IPointer
    permits XrSceneCreateInfoMSFT, XrSceneCreateInfoMSFT.Ptr
{}
