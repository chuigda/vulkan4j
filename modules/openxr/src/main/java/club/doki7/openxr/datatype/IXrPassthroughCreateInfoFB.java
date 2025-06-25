package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPassthroughCreateInfoFB} and {@link XrPassthroughCreateInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPassthroughCreateInfoFB
    extends IPointer
    permits XrPassthroughCreateInfoFB, XrPassthroughCreateInfoFB.Ptr
{}
