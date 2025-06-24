package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSessionCreateInfo} and {@link XrSessionCreateInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSessionCreateInfo
    extends IPointer
    permits XrSessionCreateInfo, XrSessionCreateInfo.Ptr
{}
