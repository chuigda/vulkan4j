package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFaceExpressionInfo2FB} and {@link XrFaceExpressionInfo2FB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFaceExpressionInfo2FB
    extends IPointer
    permits XrFaceExpressionInfo2FB, XrFaceExpressionInfo2FB.Ptr
{}
