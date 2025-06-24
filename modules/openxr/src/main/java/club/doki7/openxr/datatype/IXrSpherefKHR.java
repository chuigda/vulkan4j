package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpherefKHR} and {@link XrSpherefKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpherefKHR
    extends IPointer
    permits XrSpherefKHR, XrSpherefKHR.Ptr
{}
