package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneMeshBuffersGetInfoMSFT} and {@link XrSceneMeshBuffersGetInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneMeshBuffersGetInfoMSFT
    extends IPointer
    permits XrSceneMeshBuffersGetInfoMSFT, XrSceneMeshBuffersGetInfoMSFT.Ptr
{}
