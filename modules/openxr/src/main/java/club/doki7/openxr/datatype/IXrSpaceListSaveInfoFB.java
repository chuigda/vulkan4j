package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceListSaveInfoFB} and {@link XrSpaceListSaveInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceListSaveInfoFB
    extends IPointer
    permits XrSpaceListSaveInfoFB, XrSpaceListSaveInfoFB.Ptr
{}
