package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBodyJointLocationBD} and {@link XrBodyJointLocationBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBodyJointLocationBD
    extends IPointer
    permits XrBodyJointLocationBD, XrBodyJointLocationBD.Ptr
{}
