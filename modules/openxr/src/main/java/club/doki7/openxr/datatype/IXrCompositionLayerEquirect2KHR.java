package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrCompositionLayerEquirect2KHR} and {@link XrCompositionLayerEquirect2KHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrCompositionLayerEquirect2KHR
    extends IPointer
    permits XrCompositionLayerEquirect2KHR, XrCompositionLayerEquirect2KHR.Ptr
{}
