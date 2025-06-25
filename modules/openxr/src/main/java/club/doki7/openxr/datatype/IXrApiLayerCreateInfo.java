package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrApiLayerCreateInfo} and {@link XrApiLayerCreateInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrApiLayerCreateInfo
    extends IPointer
    permits XrApiLayerCreateInfo, XrApiLayerCreateInfo.Ptr
{}
