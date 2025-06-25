package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPassthroughColorMapLutMETA} and {@link XrPassthroughColorMapLutMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPassthroughColorMapLutMETA
    extends IPointer
    permits XrPassthroughColorMapLutMETA, XrPassthroughColorMapLutMETA.Ptr
{}
