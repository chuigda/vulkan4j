package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrCompositionLayerSecureContentFB} and {@link XrCompositionLayerSecureContentFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrCompositionLayerSecureContentFB
    extends IPointer
    permits XrCompositionLayerSecureContentFB, XrCompositionLayerSecureContentFB.Ptr
{}
