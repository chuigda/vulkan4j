package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPassthroughColorHTC} and {@link XrPassthroughColorHTC.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPassthroughColorHTC
    extends IPointer
    permits XrPassthroughColorHTC, XrPassthroughColorHTC.Ptr
{}
