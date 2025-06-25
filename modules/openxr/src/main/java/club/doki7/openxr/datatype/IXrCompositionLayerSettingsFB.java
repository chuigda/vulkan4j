package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrCompositionLayerSettingsFB} and {@link XrCompositionLayerSettingsFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrCompositionLayerSettingsFB
    extends IPointer
    permits XrCompositionLayerSettingsFB, XrCompositionLayerSettingsFB.Ptr
{}
