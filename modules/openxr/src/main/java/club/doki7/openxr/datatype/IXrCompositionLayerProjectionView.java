package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrCompositionLayerProjectionView} and {@link XrCompositionLayerProjectionView.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrCompositionLayerProjectionView
    extends IPointer
    permits XrCompositionLayerProjectionView, XrCompositionLayerProjectionView.Ptr
{}
