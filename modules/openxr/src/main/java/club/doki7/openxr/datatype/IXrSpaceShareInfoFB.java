package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceShareInfoFB} and {@link XrSpaceShareInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceShareInfoFB
    extends IPointer
    permits XrSpaceShareInfoFB, XrSpaceShareInfoFB.Ptr
{}
