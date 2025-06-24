package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBodyJointsLocateInfoBD} and {@link XrBodyJointsLocateInfoBD.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBodyJointsLocateInfoBD
    extends IPointer
    permits XrBodyJointsLocateInfoBD, XrBodyJointsLocateInfoBD.Ptr
{}
