package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBodyJointsLocateInfoHTC} and {@link XrBodyJointsLocateInfoHTC.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBodyJointsLocateInfoHTC
    extends IPointer
    permits XrBodyJointsLocateInfoHTC, XrBodyJointsLocateInfoHTC.Ptr
{}
