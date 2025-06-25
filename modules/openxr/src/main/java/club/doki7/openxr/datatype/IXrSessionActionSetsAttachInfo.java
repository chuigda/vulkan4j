package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSessionActionSetsAttachInfo} and {@link XrSessionActionSetsAttachInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSessionActionSetsAttachInfo
    extends IPointer
    permits XrSessionActionSetsAttachInfo, XrSessionActionSetsAttachInfo.Ptr
{}
