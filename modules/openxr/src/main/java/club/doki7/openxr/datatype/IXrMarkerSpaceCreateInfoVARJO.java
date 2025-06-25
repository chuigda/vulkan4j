package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrMarkerSpaceCreateInfoVARJO} and {@link XrMarkerSpaceCreateInfoVARJO.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrMarkerSpaceCreateInfoVARJO
    extends IPointer
    permits XrMarkerSpaceCreateInfoVARJO, XrMarkerSpaceCreateInfoVARJO.Ptr
{}
