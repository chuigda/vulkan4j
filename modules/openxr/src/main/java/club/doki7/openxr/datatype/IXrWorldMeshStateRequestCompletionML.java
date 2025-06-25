package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrWorldMeshStateRequestCompletionML} and {@link XrWorldMeshStateRequestCompletionML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrWorldMeshStateRequestCompletionML
    extends IPointer
    permits XrWorldMeshStateRequestCompletionML, XrWorldMeshStateRequestCompletionML.Ptr
{}
