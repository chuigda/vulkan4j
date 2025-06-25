package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrNewSceneComputeInfoMSFT} and {@link XrNewSceneComputeInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrNewSceneComputeInfoMSFT
    extends IPointer
    permits XrNewSceneComputeInfoMSFT, XrNewSceneComputeInfoMSFT.Ptr
{}
