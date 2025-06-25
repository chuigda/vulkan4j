package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrVector4sFB} and {@link XrVector4sFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrVector4sFB
    extends IPointer
    permits XrVector4sFB, XrVector4sFB.Ptr
{}
