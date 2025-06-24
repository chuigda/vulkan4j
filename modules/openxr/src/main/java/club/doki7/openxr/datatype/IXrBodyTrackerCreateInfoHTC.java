package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBodyTrackerCreateInfoHTC} and {@link XrBodyTrackerCreateInfoHTC.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBodyTrackerCreateInfoHTC
    extends IPointer
    permits XrBodyTrackerCreateInfoHTC, XrBodyTrackerCreateInfoHTC.Ptr
{}
