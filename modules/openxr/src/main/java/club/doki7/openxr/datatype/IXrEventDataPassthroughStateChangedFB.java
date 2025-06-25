package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataPassthroughStateChangedFB} and {@link XrEventDataPassthroughStateChangedFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataPassthroughStateChangedFB
    extends IPointer
    permits XrEventDataPassthroughStateChangedFB, XrEventDataPassthroughStateChangedFB.Ptr
{}
