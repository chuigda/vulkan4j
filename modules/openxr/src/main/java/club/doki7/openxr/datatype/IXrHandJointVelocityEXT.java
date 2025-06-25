package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHandJointVelocityEXT} and {@link XrHandJointVelocityEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHandJointVelocityEXT
    extends IPointer
    permits XrHandJointVelocityEXT, XrHandJointVelocityEXT.Ptr
{}
