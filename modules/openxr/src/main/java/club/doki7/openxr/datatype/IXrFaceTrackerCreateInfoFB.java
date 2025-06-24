package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFaceTrackerCreateInfoFB} and {@link XrFaceTrackerCreateInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFaceTrackerCreateInfoFB
    extends IPointer
    permits XrFaceTrackerCreateInfoFB, XrFaceTrackerCreateInfoFB.Ptr
{}
