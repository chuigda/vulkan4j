package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrApiLayerProperties} and {@link XrApiLayerProperties.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrApiLayerProperties
    extends IPointer
    permits XrApiLayerProperties, XrApiLayerProperties.Ptr
{}
