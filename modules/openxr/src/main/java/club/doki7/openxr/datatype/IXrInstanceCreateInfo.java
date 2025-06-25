package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrInstanceCreateInfo} and {@link XrInstanceCreateInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrInstanceCreateInfo
    extends IPointer
    permits XrInstanceCreateInfo, XrInstanceCreateInfo.Ptr
{}
