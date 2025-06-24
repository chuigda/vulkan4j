package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrExternalCameraExtrinsicsOCULUS} and {@link XrExternalCameraExtrinsicsOCULUS.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrExternalCameraExtrinsicsOCULUS
    extends IPointer
    permits XrExternalCameraExtrinsicsOCULUS, XrExternalCameraExtrinsicsOCULUS.Ptr
{}
