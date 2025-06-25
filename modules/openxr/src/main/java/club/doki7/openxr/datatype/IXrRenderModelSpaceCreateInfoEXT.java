package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRenderModelSpaceCreateInfoEXT} and {@link XrRenderModelSpaceCreateInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRenderModelSpaceCreateInfoEXT
    extends IPointer
    permits XrRenderModelSpaceCreateInfoEXT, XrRenderModelSpaceCreateInfoEXT.Ptr
{}
