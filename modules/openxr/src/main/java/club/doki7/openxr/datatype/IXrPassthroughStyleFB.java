package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPassthroughStyleFB} and {@link XrPassthroughStyleFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPassthroughStyleFB
    extends IPointer
    permits XrPassthroughStyleFB, XrPassthroughStyleFB.Ptr
{}
