package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrWorldMeshGetInfoML} and {@link XrWorldMeshGetInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrWorldMeshGetInfoML
    extends IPointer
    permits XrWorldMeshGetInfoML, XrWorldMeshGetInfoML.Ptr
{}
