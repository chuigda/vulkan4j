package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemPassthroughProperties2FB} and {@link XrSystemPassthroughProperties2FB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemPassthroughProperties2FB
    extends IPointer
    permits XrSystemPassthroughProperties2FB, XrSystemPassthroughProperties2FB.Ptr
{}
