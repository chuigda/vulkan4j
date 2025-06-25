package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrRecommendedLayerResolutionMETA} and {@link XrRecommendedLayerResolutionMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrRecommendedLayerResolutionMETA
    extends IPointer
    permits XrRecommendedLayerResolutionMETA, XrRecommendedLayerResolutionMETA.Ptr
{}
