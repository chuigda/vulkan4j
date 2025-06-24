package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPassthroughColorLutUpdateInfoMETA} and {@link XrPassthroughColorLutUpdateInfoMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPassthroughColorLutUpdateInfoMETA
    extends IPointer
    permits XrPassthroughColorLutUpdateInfoMETA, XrPassthroughColorLutUpdateInfoMETA.Ptr
{}
