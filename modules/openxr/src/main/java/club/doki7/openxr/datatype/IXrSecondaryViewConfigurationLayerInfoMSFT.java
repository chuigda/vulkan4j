package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSecondaryViewConfigurationLayerInfoMSFT} and {@link XrSecondaryViewConfigurationLayerInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSecondaryViewConfigurationLayerInfoMSFT
    extends IPointer
    permits XrSecondaryViewConfigurationLayerInfoMSFT, XrSecondaryViewConfigurationLayerInfoMSFT.Ptr
{}
