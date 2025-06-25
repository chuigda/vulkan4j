package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrAnchorSpaceCreateInfoBD} and {@link XrAnchorSpaceCreateInfoBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrAnchorSpaceCreateInfoBD
    extends IPointer
    permits XrAnchorSpaceCreateInfoBD, XrAnchorSpaceCreateInfoBD.Ptr
{}
