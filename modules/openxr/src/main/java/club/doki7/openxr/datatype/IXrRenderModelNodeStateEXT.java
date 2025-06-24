package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRenderModelNodeStateEXT} and {@link XrRenderModelNodeStateEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRenderModelNodeStateEXT
    extends IPointer
    permits XrRenderModelNodeStateEXT, XrRenderModelNodeStateEXT.Ptr
{}
