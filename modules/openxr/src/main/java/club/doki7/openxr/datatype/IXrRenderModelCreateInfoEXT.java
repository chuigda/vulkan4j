package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRenderModelCreateInfoEXT} and {@link XrRenderModelCreateInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRenderModelCreateInfoEXT
    extends IPointer
    permits XrRenderModelCreateInfoEXT, XrRenderModelCreateInfoEXT.Ptr
{}
