package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneMeshMSFT} and {@link XrSceneMeshMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneMeshMSFT
    extends IPointer
    permits XrSceneMeshMSFT, XrSceneMeshMSFT.Ptr
{}
