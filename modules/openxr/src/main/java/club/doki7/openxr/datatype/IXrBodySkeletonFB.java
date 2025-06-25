package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBodySkeletonFB} and {@link XrBodySkeletonFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBodySkeletonFB
    extends IPointer
    permits XrBodySkeletonFB, XrBodySkeletonFB.Ptr
{}
