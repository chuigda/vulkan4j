package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemFacialExpressionPropertiesML} and {@link XrSystemFacialExpressionPropertiesML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemFacialExpressionPropertiesML
    extends IPointer
    permits XrSystemFacialExpressionPropertiesML, XrSystemFacialExpressionPropertiesML.Ptr
{}
