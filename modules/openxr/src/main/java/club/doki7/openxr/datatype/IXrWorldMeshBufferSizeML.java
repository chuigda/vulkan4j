package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrWorldMeshBufferSizeML} and {@link XrWorldMeshBufferSizeML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrWorldMeshBufferSizeML
    extends IPointer
    permits XrWorldMeshBufferSizeML, XrWorldMeshBufferSizeML.Ptr
{}
