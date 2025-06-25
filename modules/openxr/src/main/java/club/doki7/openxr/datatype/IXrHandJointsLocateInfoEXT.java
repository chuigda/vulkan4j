package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHandJointsLocateInfoEXT} and {@link XrHandJointsLocateInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHandJointsLocateInfoEXT
    extends IPointer
    permits XrHandJointsLocateInfoEXT, XrHandJointsLocateInfoEXT.Ptr
{}
