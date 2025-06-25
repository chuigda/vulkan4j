package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceLocationDataKHR} and {@link XrSpaceLocationDataKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceLocationDataKHR
    extends IPointer
    permits XrSpaceLocationDataKHR, XrSpaceLocationDataKHR.Ptr
{}
