package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHandMeshVertexMSFT} and {@link XrHandMeshVertexMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHandMeshVertexMSFT
    extends IPointer
    permits XrHandMeshVertexMSFT, XrHandMeshVertexMSFT.Ptr
{}
