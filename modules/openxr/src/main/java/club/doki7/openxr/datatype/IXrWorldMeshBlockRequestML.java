package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrWorldMeshBlockRequestML} and {@link XrWorldMeshBlockRequestML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrWorldMeshBlockRequestML
    extends IPointer
    permits XrWorldMeshBlockRequestML, XrWorldMeshBlockRequestML.Ptr
{}
