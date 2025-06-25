package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBodyJointsLocateInfoFB} and {@link XrBodyJointsLocateInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBodyJointsLocateInfoFB
    extends IPointer
    permits XrBodyJointsLocateInfoFB, XrBodyJointsLocateInfoFB.Ptr
{}
