package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrCompositionLayerPassthroughFB} and {@link XrCompositionLayerPassthroughFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrCompositionLayerPassthroughFB
    extends IPointer
    permits XrCompositionLayerPassthroughFB, XrCompositionLayerPassthroughFB.Ptr
{}
