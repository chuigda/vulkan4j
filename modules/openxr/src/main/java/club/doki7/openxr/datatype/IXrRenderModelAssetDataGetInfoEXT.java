package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRenderModelAssetDataGetInfoEXT} and {@link XrRenderModelAssetDataGetInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRenderModelAssetDataGetInfoEXT
    extends IPointer
    permits XrRenderModelAssetDataGetInfoEXT, XrRenderModelAssetDataGetInfoEXT.Ptr
{}
