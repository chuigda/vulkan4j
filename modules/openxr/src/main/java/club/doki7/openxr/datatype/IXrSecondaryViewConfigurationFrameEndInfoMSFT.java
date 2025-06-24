package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSecondaryViewConfigurationFrameEndInfoMSFT} and {@link XrSecondaryViewConfigurationFrameEndInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSecondaryViewConfigurationFrameEndInfoMSFT
    extends IPointer
    permits XrSecondaryViewConfigurationFrameEndInfoMSFT, XrSecondaryViewConfigurationFrameEndInfoMSFT.Ptr
{}
