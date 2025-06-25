package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataInteractionRenderModelsChangedEXT} and {@link XrEventDataInteractionRenderModelsChangedEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataInteractionRenderModelsChangedEXT
    extends IPointer
    permits XrEventDataInteractionRenderModelsChangedEXT, XrEventDataInteractionRenderModelsChangedEXT.Ptr
{}
