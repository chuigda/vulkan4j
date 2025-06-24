package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPassthroughLayerCreateInfoFB} and {@link XrPassthroughLayerCreateInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPassthroughLayerCreateInfoFB
    extends IPointer
    permits XrPassthroughLayerCreateInfoFB, XrPassthroughLayerCreateInfoFB.Ptr
{}
