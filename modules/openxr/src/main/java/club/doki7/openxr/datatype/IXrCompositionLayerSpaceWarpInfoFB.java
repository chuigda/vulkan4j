package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrCompositionLayerSpaceWarpInfoFB} and {@link XrCompositionLayerSpaceWarpInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrCompositionLayerSpaceWarpInfoFB
    extends IPointer
    permits XrCompositionLayerSpaceWarpInfoFB, XrCompositionLayerSpaceWarpInfoFB.Ptr
{}
