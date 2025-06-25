package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrMarkerSpaceCreateInfoML} and {@link XrMarkerSpaceCreateInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrMarkerSpaceCreateInfoML
    extends IPointer
    permits XrMarkerSpaceCreateInfoML, XrMarkerSpaceCreateInfoML.Ptr
{}
