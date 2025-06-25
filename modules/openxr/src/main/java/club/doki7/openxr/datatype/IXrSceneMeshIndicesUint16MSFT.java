package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneMeshIndicesUint16MSFT} and {@link XrSceneMeshIndicesUint16MSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneMeshIndicesUint16MSFT
    extends IPointer
    permits XrSceneMeshIndicesUint16MSFT, XrSceneMeshIndicesUint16MSFT.Ptr
{}
