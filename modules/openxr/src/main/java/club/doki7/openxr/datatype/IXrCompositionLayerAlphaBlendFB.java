package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrCompositionLayerAlphaBlendFB} and {@link XrCompositionLayerAlphaBlendFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrCompositionLayerAlphaBlendFB
    extends IPointer
    permits XrCompositionLayerAlphaBlendFB, XrCompositionLayerAlphaBlendFB.Ptr
{}
