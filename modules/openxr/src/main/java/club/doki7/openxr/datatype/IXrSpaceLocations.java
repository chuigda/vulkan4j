package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceLocations} and {@link XrSpaceLocations.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceLocations
    extends IPointer
    permits XrSpaceLocations, XrSpaceLocations.Ptr
{}
