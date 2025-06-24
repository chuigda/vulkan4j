package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrLoaderInitInfoBaseHeaderKHR} and {@link XrLoaderInitInfoBaseHeaderKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrLoaderInitInfoBaseHeaderKHR
    extends IPointer
    permits XrLoaderInitInfoBaseHeaderKHR, XrLoaderInitInfoBaseHeaderKHR.Ptr
{}
