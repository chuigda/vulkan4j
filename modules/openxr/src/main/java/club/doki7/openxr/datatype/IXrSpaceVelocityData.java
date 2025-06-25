package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceVelocityData} and {@link XrSpaceVelocityData.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceVelocityData
    extends IPointer
    permits XrSpaceVelocityData, XrSpaceVelocityData.Ptr
{}
