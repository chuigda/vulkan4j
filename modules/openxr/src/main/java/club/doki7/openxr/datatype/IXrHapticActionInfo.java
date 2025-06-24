package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHapticActionInfo} and {@link XrHapticActionInfo.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHapticActionInfo
    extends IPointer
    permits XrHapticActionInfo, XrHapticActionInfo.Ptr
{}
