package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrLoaderInitInfoAndroidKHR} and {@link XrLoaderInitInfoAndroidKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrLoaderInitInfoAndroidKHR
    extends IPointer
    permits XrLoaderInitInfoAndroidKHR, XrLoaderInitInfoAndroidKHR.Ptr
{}
