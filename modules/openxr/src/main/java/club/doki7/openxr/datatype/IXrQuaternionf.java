package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrQuaternionf} and {@link XrQuaternionf.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrQuaternionf
    extends IPointer
    permits XrQuaternionf, XrQuaternionf.Ptr
{}
