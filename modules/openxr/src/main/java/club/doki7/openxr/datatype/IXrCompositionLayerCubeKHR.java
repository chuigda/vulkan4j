package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrCompositionLayerCubeKHR} and {@link XrCompositionLayerCubeKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrCompositionLayerCubeKHR
    extends IPointer
    permits XrCompositionLayerCubeKHR, XrCompositionLayerCubeKHR.Ptr
{}
