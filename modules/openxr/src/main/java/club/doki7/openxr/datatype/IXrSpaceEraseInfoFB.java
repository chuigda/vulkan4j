package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceEraseInfoFB} and {@link XrSpaceEraseInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceEraseInfoFB
    extends IPointer
    permits XrSpaceEraseInfoFB, XrSpaceEraseInfoFB.Ptr
{}
