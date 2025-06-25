package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrWorldMeshStateRequestInfoML} and {@link XrWorldMeshStateRequestInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrWorldMeshStateRequestInfoML
    extends IPointer
    permits XrWorldMeshStateRequestInfoML, XrWorldMeshStateRequestInfoML.Ptr
{}
