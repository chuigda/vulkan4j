package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRenderModelPropertiesGetInfoEXT} and {@link XrRenderModelPropertiesGetInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRenderModelPropertiesGetInfoEXT
    extends IPointer
    permits XrRenderModelPropertiesGetInfoEXT, XrRenderModelPropertiesGetInfoEXT.Ptr
{}
