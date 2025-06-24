package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFaceExpressionWeightsFB} and {@link XrFaceExpressionWeightsFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFaceExpressionWeightsFB
    extends IPointer
    permits XrFaceExpressionWeightsFB, XrFaceExpressionWeightsFB.Ptr
{}
