package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrCompositionLayerDepthTestFB} and {@link XrCompositionLayerDepthTestFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrCompositionLayerDepthTestFB
    extends IPointer
    permits XrCompositionLayerDepthTestFB, XrCompositionLayerDepthTestFB.Ptr
{}
