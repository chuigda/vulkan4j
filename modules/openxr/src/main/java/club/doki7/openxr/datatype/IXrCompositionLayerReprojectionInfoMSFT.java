package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrCompositionLayerReprojectionInfoMSFT} and {@link XrCompositionLayerReprojectionInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrCompositionLayerReprojectionInfoMSFT
    extends IPointer
    permits XrCompositionLayerReprojectionInfoMSFT, XrCompositionLayerReprojectionInfoMSFT.Ptr
{}
