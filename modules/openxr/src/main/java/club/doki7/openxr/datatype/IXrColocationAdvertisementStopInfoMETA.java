package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrColocationAdvertisementStopInfoMETA} and {@link XrColocationAdvertisementStopInfoMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrColocationAdvertisementStopInfoMETA
    extends IPointer
    permits XrColocationAdvertisementStopInfoMETA, XrColocationAdvertisementStopInfoMETA.Ptr
{}
