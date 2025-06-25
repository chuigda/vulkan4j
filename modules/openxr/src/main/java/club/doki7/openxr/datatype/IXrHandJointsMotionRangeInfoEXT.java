package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHandJointsMotionRangeInfoEXT} and {@link XrHandJointsMotionRangeInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHandJointsMotionRangeInfoEXT
    extends IPointer
    permits XrHandJointsMotionRangeInfoEXT, XrHandJointsMotionRangeInfoEXT.Ptr
{}
