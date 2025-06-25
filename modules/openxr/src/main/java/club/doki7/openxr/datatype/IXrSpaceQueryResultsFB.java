package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceQueryResultsFB} and {@link XrSpaceQueryResultsFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceQueryResultsFB
    extends IPointer
    permits XrSpaceQueryResultsFB, XrSpaceQueryResultsFB.Ptr
{}
