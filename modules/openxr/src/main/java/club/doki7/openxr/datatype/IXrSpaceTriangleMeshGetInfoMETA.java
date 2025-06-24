package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceTriangleMeshGetInfoMETA} and {@link XrSpaceTriangleMeshGetInfoMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceTriangleMeshGetInfoMETA
    extends IPointer
    permits XrSpaceTriangleMeshGetInfoMETA, XrSpaceTriangleMeshGetInfoMETA.Ptr
{}
