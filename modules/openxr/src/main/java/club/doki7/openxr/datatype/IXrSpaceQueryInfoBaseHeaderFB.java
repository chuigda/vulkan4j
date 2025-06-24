package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceQueryInfoBaseHeaderFB} and {@link XrSpaceQueryInfoBaseHeaderFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceQueryInfoBaseHeaderFB
    extends IPointer
    permits XrSpaceQueryInfoBaseHeaderFB, XrSpaceQueryInfoBaseHeaderFB.Ptr
{}
