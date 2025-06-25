package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFacialExpressionClientCreateInfoML} and {@link XrFacialExpressionClientCreateInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFacialExpressionClientCreateInfoML
    extends IPointer
    permits XrFacialExpressionClientCreateInfoML, XrFacialExpressionClientCreateInfoML.Ptr
{}
