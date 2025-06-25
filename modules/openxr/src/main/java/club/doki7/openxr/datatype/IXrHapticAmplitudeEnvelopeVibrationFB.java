package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHapticAmplitudeEnvelopeVibrationFB} and {@link XrHapticAmplitudeEnvelopeVibrationFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHapticAmplitudeEnvelopeVibrationFB
    extends IPointer
    permits XrHapticAmplitudeEnvelopeVibrationFB, XrHapticAmplitudeEnvelopeVibrationFB.Ptr
{}
