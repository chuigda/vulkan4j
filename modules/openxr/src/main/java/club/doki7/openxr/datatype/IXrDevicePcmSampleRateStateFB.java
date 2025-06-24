package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrDevicePcmSampleRateStateFB} and {@link XrDevicePcmSampleRateStateFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrDevicePcmSampleRateStateFB
    extends IPointer
    permits XrDevicePcmSampleRateStateFB, XrDevicePcmSampleRateStateFB.Ptr
{}
