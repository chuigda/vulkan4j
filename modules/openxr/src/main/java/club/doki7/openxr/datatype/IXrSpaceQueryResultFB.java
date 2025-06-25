package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceQueryResultFB} and {@link XrSpaceQueryResultFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceQueryResultFB
    extends IPointer
    permits XrSpaceQueryResultFB, XrSpaceQueryResultFB.Ptr
{}
