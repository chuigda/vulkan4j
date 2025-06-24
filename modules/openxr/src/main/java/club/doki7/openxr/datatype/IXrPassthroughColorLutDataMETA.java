package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPassthroughColorLutDataMETA} and {@link XrPassthroughColorLutDataMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPassthroughColorLutDataMETA
    extends IPointer
    permits XrPassthroughColorLutDataMETA, XrPassthroughColorLutDataMETA.Ptr
{}
