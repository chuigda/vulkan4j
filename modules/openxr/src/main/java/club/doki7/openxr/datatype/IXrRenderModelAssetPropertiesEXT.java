package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRenderModelAssetPropertiesEXT} and {@link XrRenderModelAssetPropertiesEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRenderModelAssetPropertiesEXT
    extends IPointer
    permits XrRenderModelAssetPropertiesEXT, XrRenderModelAssetPropertiesEXT.Ptr
{}
