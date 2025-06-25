package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBodySkeletonJointFB} and {@link XrBodySkeletonJointFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBodySkeletonJointFB
    extends IPointer
    permits XrBodySkeletonJointFB, XrBodySkeletonJointFB.Ptr
{}
