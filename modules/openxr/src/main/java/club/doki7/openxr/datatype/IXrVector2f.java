package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrVector2f} and {@link XrVector2f.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrVector2f
    extends IPointer
    permits XrVector2f, XrVector2f.Ptr
{}
