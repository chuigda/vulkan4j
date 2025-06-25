package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneMeshBuffersMSFT} and {@link XrSceneMeshBuffersMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneMeshBuffersMSFT
    extends IPointer
    permits XrSceneMeshBuffersMSFT, XrSceneMeshBuffersMSFT.Ptr
{}
