package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBodySkeletonHTC} and {@link XrBodySkeletonHTC.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBodySkeletonHTC
    extends IPointer
    permits XrBodySkeletonHTC, XrBodySkeletonHTC.Ptr
{}
