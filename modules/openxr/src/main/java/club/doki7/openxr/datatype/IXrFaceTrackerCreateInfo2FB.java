package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFaceTrackerCreateInfo2FB} and {@link XrFaceTrackerCreateInfo2FB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFaceTrackerCreateInfo2FB
    extends IPointer
    permits XrFaceTrackerCreateInfo2FB, XrFaceTrackerCreateInfo2FB.Ptr
{}
