package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceUuidFilterInfoFB} and {@link XrSpaceUuidFilterInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceUuidFilterInfoFB
    extends IPointer
    permits XrSpaceUuidFilterInfoFB, XrSpaceUuidFilterInfoFB.Ptr
{}
