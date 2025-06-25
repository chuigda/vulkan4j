package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRenderModelAssetPropertiesGetInfoEXT} and {@link XrRenderModelAssetPropertiesGetInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRenderModelAssetPropertiesGetInfoEXT
    extends IPointer
    permits XrRenderModelAssetPropertiesGetInfoEXT, XrRenderModelAssetPropertiesGetInfoEXT.Ptr
{}
