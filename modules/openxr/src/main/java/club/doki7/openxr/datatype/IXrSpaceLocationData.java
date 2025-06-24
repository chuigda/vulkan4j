package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceLocationData} and {@link XrSpaceLocationData.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceLocationData
    extends IPointer
    permits XrSpaceLocationData, XrSpaceLocationData.Ptr
{}
