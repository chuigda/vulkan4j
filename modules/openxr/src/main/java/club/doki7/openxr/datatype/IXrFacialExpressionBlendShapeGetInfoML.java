package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFacialExpressionBlendShapeGetInfoML} and {@link XrFacialExpressionBlendShapeGetInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFacialExpressionBlendShapeGetInfoML
    extends IPointer
    permits XrFacialExpressionBlendShapeGetInfoML, XrFacialExpressionBlendShapeGetInfoML.Ptr
{}
