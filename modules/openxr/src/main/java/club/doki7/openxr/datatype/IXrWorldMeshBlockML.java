package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrWorldMeshBlockML} and {@link XrWorldMeshBlockML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrWorldMeshBlockML
    extends IPointer
    permits XrWorldMeshBlockML, XrWorldMeshBlockML.Ptr
{}
