package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHandJointVelocitiesEXT} and {@link XrHandJointVelocitiesEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHandJointVelocitiesEXT
    extends IPointer
    permits XrHandJointVelocitiesEXT, XrHandJointVelocitiesEXT.Ptr
{}
