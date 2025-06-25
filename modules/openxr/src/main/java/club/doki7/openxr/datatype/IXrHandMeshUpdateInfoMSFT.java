package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHandMeshUpdateInfoMSFT} and {@link XrHandMeshUpdateInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHandMeshUpdateInfoMSFT
    extends IPointer
    permits XrHandMeshUpdateInfoMSFT, XrHandMeshUpdateInfoMSFT.Ptr
{}
