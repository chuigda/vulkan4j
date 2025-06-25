package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPerformanceMetricsStateMETA} and {@link XrPerformanceMetricsStateMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPerformanceMetricsStateMETA
    extends IPointer
    permits XrPerformanceMetricsStateMETA, XrPerformanceMetricsStateMETA.Ptr
{}
