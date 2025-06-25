package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRenderModelStateGetInfoEXT} and {@link XrRenderModelStateGetInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRenderModelStateGetInfoEXT
    extends IPointer
    permits XrRenderModelStateGetInfoEXT, XrRenderModelStateGetInfoEXT.Ptr
{}
