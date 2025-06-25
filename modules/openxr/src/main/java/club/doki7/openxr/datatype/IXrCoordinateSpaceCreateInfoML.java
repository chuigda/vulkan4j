package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrCoordinateSpaceCreateInfoML} and {@link XrCoordinateSpaceCreateInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrCoordinateSpaceCreateInfoML
    extends IPointer
    permits XrCoordinateSpaceCreateInfoML, XrCoordinateSpaceCreateInfoML.Ptr
{}
