package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRect3DfFB} and {@link XrRect3DfFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRect3DfFB
    extends IPointer
    permits XrRect3DfFB, XrRect3DfFB.Ptr
{}
