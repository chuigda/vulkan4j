package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialAnchorPersistenceInfoMSFT} and {@link XrSpatialAnchorPersistenceInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialAnchorPersistenceInfoMSFT
    extends IPointer
    permits XrSpatialAnchorPersistenceInfoMSFT, XrSpatialAnchorPersistenceInfoMSFT.Ptr
{}
