package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceTriangleMeshMETA} and {@link XrSpaceTriangleMeshMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceTriangleMeshMETA
    extends IPointer
    permits XrSpaceTriangleMeshMETA, XrSpaceTriangleMeshMETA.Ptr
{}
