package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link MLCoordinateFrameUID} and {@link MLCoordinateFrameUID.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IMLCoordinateFrameUID
    extends IPointer
    permits MLCoordinateFrameUID, MLCoordinateFrameUID.Ptr
{}
