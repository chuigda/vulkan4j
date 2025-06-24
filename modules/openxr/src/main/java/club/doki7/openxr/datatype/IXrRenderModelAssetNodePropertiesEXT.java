package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRenderModelAssetNodePropertiesEXT} and {@link XrRenderModelAssetNodePropertiesEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRenderModelAssetNodePropertiesEXT
    extends IPointer
    permits XrRenderModelAssetNodePropertiesEXT, XrRenderModelAssetNodePropertiesEXT.Ptr
{}
