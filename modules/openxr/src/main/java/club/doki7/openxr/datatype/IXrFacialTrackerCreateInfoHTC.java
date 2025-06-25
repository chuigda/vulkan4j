package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFacialTrackerCreateInfoHTC} and {@link XrFacialTrackerCreateInfoHTC.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFacialTrackerCreateInfoHTC
    extends IPointer
    permits XrFacialTrackerCreateInfoHTC, XrFacialTrackerCreateInfoHTC.Ptr
{}
