package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFacialExpressionBlendShapePropertiesML} and {@link XrFacialExpressionBlendShapePropertiesML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFacialExpressionBlendShapePropertiesML
    extends IPointer
    permits XrFacialExpressionBlendShapePropertiesML, XrFacialExpressionBlendShapePropertiesML.Ptr
{}
