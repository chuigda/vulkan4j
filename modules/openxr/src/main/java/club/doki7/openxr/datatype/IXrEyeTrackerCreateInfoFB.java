package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEyeTrackerCreateInfoFB} and {@link XrEyeTrackerCreateInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEyeTrackerCreateInfoFB
    extends IPointer
    permits XrEyeTrackerCreateInfoFB, XrEyeTrackerCreateInfoFB.Ptr
{}
