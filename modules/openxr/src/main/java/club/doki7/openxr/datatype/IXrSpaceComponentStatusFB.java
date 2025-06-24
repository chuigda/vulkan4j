package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceComponentStatusFB} and {@link XrSpaceComponentStatusFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceComponentStatusFB
    extends IPointer
    permits XrSpaceComponentStatusFB, XrSpaceComponentStatusFB.Ptr
{}
