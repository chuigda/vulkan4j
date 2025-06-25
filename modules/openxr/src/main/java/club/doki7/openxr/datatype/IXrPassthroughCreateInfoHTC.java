package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPassthroughCreateInfoHTC} and {@link XrPassthroughCreateInfoHTC.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPassthroughCreateInfoHTC
    extends IPointer
    permits XrPassthroughCreateInfoHTC, XrPassthroughCreateInfoHTC.Ptr
{}
