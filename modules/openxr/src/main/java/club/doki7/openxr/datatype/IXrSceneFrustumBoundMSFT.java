package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneFrustumBoundMSFT} and {@link XrSceneFrustumBoundMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneFrustumBoundMSFT
    extends IPointer
    permits XrSceneFrustumBoundMSFT, XrSceneFrustumBoundMSFT.Ptr
{}
