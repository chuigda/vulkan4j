package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFaceExpressionWeights2FB} and {@link XrFaceExpressionWeights2FB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFaceExpressionWeights2FB
    extends IPointer
    permits XrFaceExpressionWeights2FB, XrFaceExpressionWeights2FB.Ptr
{}
