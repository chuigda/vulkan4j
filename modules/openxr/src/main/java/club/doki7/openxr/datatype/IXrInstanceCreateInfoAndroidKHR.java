package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrInstanceCreateInfoAndroidKHR} and {@link XrInstanceCreateInfoAndroidKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrInstanceCreateInfoAndroidKHR
    extends IPointer
    permits XrInstanceCreateInfoAndroidKHR, XrInstanceCreateInfoAndroidKHR.Ptr
{}
