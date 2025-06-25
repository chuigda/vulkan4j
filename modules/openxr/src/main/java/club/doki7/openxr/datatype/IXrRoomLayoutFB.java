package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRoomLayoutFB} and {@link XrRoomLayoutFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRoomLayoutFB
    extends IPointer
    permits XrRoomLayoutFB, XrRoomLayoutFB.Ptr
{}
