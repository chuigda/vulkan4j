package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneMeshVertexBufferMSFT} and {@link XrSceneMeshVertexBufferMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneMeshVertexBufferMSFT
    extends IPointer
    permits XrSceneMeshVertexBufferMSFT, XrSceneMeshVertexBufferMSFT.Ptr
{}
