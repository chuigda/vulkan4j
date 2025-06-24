package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceComponentFilterInfoFB} and {@link XrSpaceComponentFilterInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceComponentFilterInfoFB
    extends IPointer
    permits XrSpaceComponentFilterInfoFB, XrSpaceComponentFilterInfoFB.Ptr
{}
