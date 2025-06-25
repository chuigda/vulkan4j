package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceQueryInfoFB} and {@link XrSpaceQueryInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceQueryInfoFB
    extends IPointer
    permits XrSpaceQueryInfoFB, XrSpaceQueryInfoFB.Ptr
{}
