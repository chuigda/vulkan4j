package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrCompositionLayerBaseHeader} and {@link XrCompositionLayerBaseHeader.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrCompositionLayerBaseHeader
    extends IPointer
    permits XrCompositionLayerBaseHeader, XrCompositionLayerBaseHeader.Ptr
{}
