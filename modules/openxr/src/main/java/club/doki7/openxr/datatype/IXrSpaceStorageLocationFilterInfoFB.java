package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpaceStorageLocationFilterInfoFB} and {@link XrSpaceStorageLocationFilterInfoFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpaceStorageLocationFilterInfoFB
    extends IPointer
    permits XrSpaceStorageLocationFilterInfoFB, XrSpaceStorageLocationFilterInfoFB.Ptr
{}
