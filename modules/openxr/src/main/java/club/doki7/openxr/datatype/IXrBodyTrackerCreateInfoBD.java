package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBodyTrackerCreateInfoBD} and {@link XrBodyTrackerCreateInfoBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBodyTrackerCreateInfoBD
    extends IPointer
    permits XrBodyTrackerCreateInfoBD, XrBodyTrackerCreateInfoBD.Ptr
{}
