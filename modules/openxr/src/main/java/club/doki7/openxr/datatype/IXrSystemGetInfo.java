package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemGetInfo} and {@link XrSystemGetInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemGetInfo
    extends IPointer
    permits XrSystemGetInfo, XrSystemGetInfo.Ptr
{}
