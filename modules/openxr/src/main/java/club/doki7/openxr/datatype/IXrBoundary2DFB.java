package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBoundary2DFB} and {@link XrBoundary2DFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBoundary2DFB
    extends IPointer
    permits XrBoundary2DFB, XrBoundary2DFB.Ptr
{}
