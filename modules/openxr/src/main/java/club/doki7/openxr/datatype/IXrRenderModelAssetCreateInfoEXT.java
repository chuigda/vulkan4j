package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRenderModelAssetCreateInfoEXT} and {@link XrRenderModelAssetCreateInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRenderModelAssetCreateInfoEXT
    extends IPointer
    permits XrRenderModelAssetCreateInfoEXT, XrRenderModelAssetCreateInfoEXT.Ptr
{}
