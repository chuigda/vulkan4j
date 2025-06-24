package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceComponentStatusSetInfoFB} and {@link XrSpaceComponentStatusSetInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceComponentStatusSetInfoFB
    extends IPointer
    permits XrSpaceComponentStatusSetInfoFB, XrSpaceComponentStatusSetInfoFB.Ptr
{}
