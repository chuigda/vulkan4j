package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrVisualMeshComputeLodInfoMSFT} and {@link XrVisualMeshComputeLodInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrVisualMeshComputeLodInfoMSFT
    extends IPointer
    permits XrVisualMeshComputeLodInfoMSFT, XrVisualMeshComputeLodInfoMSFT.Ptr
{}
