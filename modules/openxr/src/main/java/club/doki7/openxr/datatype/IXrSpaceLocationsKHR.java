package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceLocationsKHR} and {@link XrSpaceLocationsKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceLocationsKHR
    extends IPointer
    permits XrSpaceLocationsKHR, XrSpaceLocationsKHR.Ptr
{}
