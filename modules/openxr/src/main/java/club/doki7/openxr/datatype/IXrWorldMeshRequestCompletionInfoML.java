package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrWorldMeshRequestCompletionInfoML} and {@link XrWorldMeshRequestCompletionInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrWorldMeshRequestCompletionInfoML
    extends IPointer
    permits XrWorldMeshRequestCompletionInfoML, XrWorldMeshRequestCompletionInfoML.Ptr
{}
