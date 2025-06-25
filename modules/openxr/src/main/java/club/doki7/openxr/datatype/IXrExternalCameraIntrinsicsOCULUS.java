package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrExternalCameraIntrinsicsOCULUS} and {@link XrExternalCameraIntrinsicsOCULUS.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrExternalCameraIntrinsicsOCULUS
    extends IPointer
    permits XrExternalCameraIntrinsicsOCULUS, XrExternalCameraIntrinsicsOCULUS.Ptr
{}
