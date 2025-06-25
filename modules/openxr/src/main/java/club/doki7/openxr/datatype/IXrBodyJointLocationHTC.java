package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBodyJointLocationHTC} and {@link XrBodyJointLocationHTC.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBodyJointLocationHTC
    extends IPointer
    permits XrBodyJointLocationHTC, XrBodyJointLocationHTC.Ptr
{}
