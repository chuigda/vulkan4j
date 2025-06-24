package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBodyJointLocationsHTC} and {@link XrBodyJointLocationsHTC.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBodyJointLocationsHTC
    extends IPointer
    permits XrBodyJointLocationsHTC, XrBodyJointLocationsHTC.Ptr
{}
