package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFacialExpressionsHTC} and {@link XrFacialExpressionsHTC.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFacialExpressionsHTC
    extends IPointer
    permits XrFacialExpressionsHTC, XrFacialExpressionsHTC.Ptr
{}
