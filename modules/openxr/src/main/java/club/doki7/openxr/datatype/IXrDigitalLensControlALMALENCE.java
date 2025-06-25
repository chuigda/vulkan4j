package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrDigitalLensControlALMALENCE} and {@link XrDigitalLensControlALMALENCE.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrDigitalLensControlALMALENCE
    extends IPointer
    permits XrDigitalLensControlALMALENCE, XrDigitalLensControlALMALENCE.Ptr
{}
