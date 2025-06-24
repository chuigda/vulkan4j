package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrOffset3DfFB} and {@link XrOffset3DfFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrOffset3DfFB
    extends IPointer
    permits XrOffset3DfFB, XrOffset3DfFB.Ptr
{}
