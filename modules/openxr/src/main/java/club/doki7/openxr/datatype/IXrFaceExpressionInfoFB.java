package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFaceExpressionInfoFB} and {@link XrFaceExpressionInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFaceExpressionInfoFB
    extends IPointer
    permits XrFaceExpressionInfoFB, XrFaceExpressionInfoFB.Ptr
{}
