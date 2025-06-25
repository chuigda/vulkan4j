package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBodyJointLocationsBD} and {@link XrBodyJointLocationsBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBodyJointLocationsBD
    extends IPointer
    permits XrBodyJointLocationsBD, XrBodyJointLocationsBD.Ptr
{}
