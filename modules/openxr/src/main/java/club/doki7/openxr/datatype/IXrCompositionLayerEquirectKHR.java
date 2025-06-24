package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrCompositionLayerEquirectKHR} and {@link XrCompositionLayerEquirectKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrCompositionLayerEquirectKHR
    extends IPointer
    permits XrCompositionLayerEquirectKHR, XrCompositionLayerEquirectKHR.Ptr
{}
