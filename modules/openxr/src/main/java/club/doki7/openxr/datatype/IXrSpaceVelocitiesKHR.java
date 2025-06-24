package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceVelocitiesKHR} and {@link XrSpaceVelocitiesKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceVelocitiesKHR
    extends IPointer
    permits XrSpaceVelocitiesKHR, XrSpaceVelocitiesKHR.Ptr
{}
