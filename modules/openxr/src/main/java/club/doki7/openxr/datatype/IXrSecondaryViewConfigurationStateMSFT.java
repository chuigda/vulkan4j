package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSecondaryViewConfigurationStateMSFT} and {@link XrSecondaryViewConfigurationStateMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSecondaryViewConfigurationStateMSFT
    extends IPointer
    permits XrSecondaryViewConfigurationStateMSFT, XrSecondaryViewConfigurationStateMSFT.Ptr
{}
