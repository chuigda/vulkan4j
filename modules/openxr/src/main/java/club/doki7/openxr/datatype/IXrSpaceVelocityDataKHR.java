package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceVelocityDataKHR} and {@link XrSpaceVelocityDataKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceVelocityDataKHR
    extends IPointer
    permits XrSpaceVelocityDataKHR, XrSpaceVelocityDataKHR.Ptr
{}
