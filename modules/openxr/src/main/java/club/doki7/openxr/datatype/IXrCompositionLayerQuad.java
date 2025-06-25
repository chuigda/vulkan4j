package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrCompositionLayerQuad} and {@link XrCompositionLayerQuad.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrCompositionLayerQuad
    extends IPointer
    permits XrCompositionLayerQuad, XrCompositionLayerQuad.Ptr
{}
