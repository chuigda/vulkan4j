package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrWorldMeshBufferRecommendedSizeInfoML} and {@link XrWorldMeshBufferRecommendedSizeInfoML.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrWorldMeshBufferRecommendedSizeInfoML
    extends IPointer
    permits XrWorldMeshBufferRecommendedSizeInfoML, XrWorldMeshBufferRecommendedSizeInfoML.Ptr
{}
