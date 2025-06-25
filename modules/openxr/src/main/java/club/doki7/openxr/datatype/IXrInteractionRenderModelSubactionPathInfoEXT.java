package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrInteractionRenderModelSubactionPathInfoEXT} and {@link XrInteractionRenderModelSubactionPathInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrInteractionRenderModelSubactionPathInfoEXT
    extends IPointer
    permits XrInteractionRenderModelSubactionPathInfoEXT, XrInteractionRenderModelSubactionPathInfoEXT.Ptr
{}
