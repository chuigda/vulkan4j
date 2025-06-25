package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrColocationAdvertisementStartInfoMETA} and {@link XrColocationAdvertisementStartInfoMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrColocationAdvertisementStartInfoMETA
    extends IPointer
    permits XrColocationAdvertisementStartInfoMETA, XrColocationAdvertisementStartInfoMETA.Ptr
{}
