package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBodySkeletonJointHTC} and {@link XrBodySkeletonJointHTC.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBodySkeletonJointHTC
    extends IPointer
    permits XrBodySkeletonJointHTC, XrBodySkeletonJointHTC.Ptr
{}
