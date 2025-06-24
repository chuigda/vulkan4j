package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRenderModelAssetDataEXT} and {@link XrRenderModelAssetDataEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRenderModelAssetDataEXT
    extends IPointer
    permits XrRenderModelAssetDataEXT, XrRenderModelAssetDataEXT.Ptr
{}
