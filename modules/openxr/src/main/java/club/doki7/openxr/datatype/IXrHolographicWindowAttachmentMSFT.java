package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHolographicWindowAttachmentMSFT} and {@link XrHolographicWindowAttachmentMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHolographicWindowAttachmentMSFT
    extends IPointer
    permits XrHolographicWindowAttachmentMSFT, XrHolographicWindowAttachmentMSFT.Ptr
{}
