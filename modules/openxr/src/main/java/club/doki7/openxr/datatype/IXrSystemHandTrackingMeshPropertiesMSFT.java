package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemHandTrackingMeshPropertiesMSFT} and {@link XrSystemHandTrackingMeshPropertiesMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemHandTrackingMeshPropertiesMSFT
    extends IPointer
    permits XrSystemHandTrackingMeshPropertiesMSFT, XrSystemHandTrackingMeshPropertiesMSFT.Ptr
{}
