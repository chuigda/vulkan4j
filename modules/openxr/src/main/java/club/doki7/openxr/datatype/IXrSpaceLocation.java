package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceLocation} and {@link XrSpaceLocation.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceLocation
    extends IPointer
    permits XrSpaceLocation, XrSpaceLocation.Ptr
{}
