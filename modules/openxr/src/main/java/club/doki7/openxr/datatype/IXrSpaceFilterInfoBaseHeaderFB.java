package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceFilterInfoBaseHeaderFB} and {@link XrSpaceFilterInfoBaseHeaderFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceFilterInfoBaseHeaderFB
    extends IPointer
    permits XrSpaceFilterInfoBaseHeaderFB, XrSpaceFilterInfoBaseHeaderFB.Ptr
{}
