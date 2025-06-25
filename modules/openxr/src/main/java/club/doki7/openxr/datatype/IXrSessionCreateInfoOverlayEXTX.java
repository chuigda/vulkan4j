package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSessionCreateInfoOverlayEXTX} and {@link XrSessionCreateInfoOverlayEXTX.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSessionCreateInfoOverlayEXTX
    extends IPointer
    permits XrSessionCreateInfoOverlayEXTX, XrSessionCreateInfoOverlayEXTX.Ptr
{}
