package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPassthroughColorMapInterpolatedLutMETA} and {@link XrPassthroughColorMapInterpolatedLutMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPassthroughColorMapInterpolatedLutMETA
    extends IPointer
    permits XrPassthroughColorMapInterpolatedLutMETA, XrPassthroughColorMapInterpolatedLutMETA.Ptr
{}
