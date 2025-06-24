package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHapticPcmVibrationFB} and {@link XrHapticPcmVibrationFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHapticPcmVibrationFB
    extends IPointer
    permits XrHapticPcmVibrationFB, XrHapticPcmVibrationFB.Ptr
{}
