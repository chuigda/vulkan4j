package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSessionBeginInfo} and {@link XrSessionBeginInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSessionBeginInfo
    extends IPointer
    permits XrSessionBeginInfo, XrSessionBeginInfo.Ptr
{}
