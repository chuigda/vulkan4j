package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceVelocity} and {@link XrSpaceVelocity.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceVelocity
    extends IPointer
    permits XrSpaceVelocity, XrSpaceVelocity.Ptr
{}
