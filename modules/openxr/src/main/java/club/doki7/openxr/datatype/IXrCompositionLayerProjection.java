package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrCompositionLayerProjection} and {@link XrCompositionLayerProjection.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrCompositionLayerProjection
    extends IPointer
    permits XrCompositionLayerProjection, XrCompositionLayerProjection.Ptr
{}
