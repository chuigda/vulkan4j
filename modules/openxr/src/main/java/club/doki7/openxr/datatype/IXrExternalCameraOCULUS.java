package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrExternalCameraOCULUS} and {@link XrExternalCameraOCULUS.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrExternalCameraOCULUS
    extends IPointer
    permits XrExternalCameraOCULUS, XrExternalCameraOCULUS.Ptr
{}
