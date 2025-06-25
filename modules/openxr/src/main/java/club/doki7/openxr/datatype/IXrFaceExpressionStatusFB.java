package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFaceExpressionStatusFB} and {@link XrFaceExpressionStatusFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFaceExpressionStatusFB
    extends IPointer
    permits XrFaceExpressionStatusFB, XrFaceExpressionStatusFB.Ptr
{}
