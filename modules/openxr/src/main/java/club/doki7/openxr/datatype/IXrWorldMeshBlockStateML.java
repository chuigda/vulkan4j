package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrWorldMeshBlockStateML} and {@link XrWorldMeshBlockStateML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrWorldMeshBlockStateML
    extends IPointer
    permits XrWorldMeshBlockStateML, XrWorldMeshBlockStateML.Ptr
{}
