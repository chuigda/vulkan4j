package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceVelocities} and {@link XrSpaceVelocities.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceVelocities
    extends IPointer
    permits XrSpaceVelocities, XrSpaceVelocities.Ptr
{}
