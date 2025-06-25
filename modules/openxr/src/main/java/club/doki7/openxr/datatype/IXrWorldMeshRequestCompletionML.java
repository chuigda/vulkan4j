package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrWorldMeshRequestCompletionML} and {@link XrWorldMeshRequestCompletionML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrWorldMeshRequestCompletionML
    extends IPointer
    permits XrWorldMeshRequestCompletionML, XrWorldMeshRequestCompletionML.Ptr
{}
