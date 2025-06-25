package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrActionSpaceCreateInfo} and {@link XrActionSpaceCreateInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrActionSpaceCreateInfo
    extends IPointer
    permits XrActionSpaceCreateInfo, XrActionSpaceCreateInfo.Ptr
{}
