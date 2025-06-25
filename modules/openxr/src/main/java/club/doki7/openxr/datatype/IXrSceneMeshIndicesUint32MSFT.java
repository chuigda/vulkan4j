package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneMeshIndicesUint32MSFT} and {@link XrSceneMeshIndicesUint32MSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneMeshIndicesUint32MSFT
    extends IPointer
    permits XrSceneMeshIndicesUint32MSFT, XrSceneMeshIndicesUint32MSFT.Ptr
{}
