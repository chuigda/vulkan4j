package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrDevicePcmSampleRateGetInfoFB} and {@link XrDevicePcmSampleRateGetInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrDevicePcmSampleRateGetInfoFB
    extends IPointer
    permits XrDevicePcmSampleRateGetInfoFB, XrDevicePcmSampleRateGetInfoFB.Ptr
{}
