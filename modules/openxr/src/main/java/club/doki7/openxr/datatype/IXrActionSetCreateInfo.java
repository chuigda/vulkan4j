package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrActionSetCreateInfo} and {@link XrActionSetCreateInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrActionSetCreateInfo
    extends IPointer
    permits XrActionSetCreateInfo, XrActionSetCreateInfo.Ptr
{}
