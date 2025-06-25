package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrVector4f} and {@link XrVector4f.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrVector4f
    extends IPointer
    permits XrVector4f, XrVector4f.Ptr
{}
