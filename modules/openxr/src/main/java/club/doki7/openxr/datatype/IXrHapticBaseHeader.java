package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHapticBaseHeader} and {@link XrHapticBaseHeader.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHapticBaseHeader
    extends IPointer
    permits XrHapticBaseHeader, XrHapticBaseHeader.Ptr
{}
