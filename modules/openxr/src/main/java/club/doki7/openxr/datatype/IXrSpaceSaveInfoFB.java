package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceSaveInfoFB} and {@link XrSpaceSaveInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceSaveInfoFB
    extends IPointer
    permits XrSpaceSaveInfoFB, XrSpaceSaveInfoFB.Ptr
{}
