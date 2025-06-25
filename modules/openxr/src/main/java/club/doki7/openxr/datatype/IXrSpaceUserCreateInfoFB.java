package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceUserCreateInfoFB} and {@link XrSpaceUserCreateInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceUserCreateInfoFB
    extends IPointer
    permits XrSpaceUserCreateInfoFB, XrSpaceUserCreateInfoFB.Ptr
{}
