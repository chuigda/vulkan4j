package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataBuffer} and {@link XrEventDataBuffer.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataBuffer
    extends IPointer
    permits XrEventDataBuffer, XrEventDataBuffer.Ptr
{}
