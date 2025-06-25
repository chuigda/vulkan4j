package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrPerformanceMetricsCounterMETA} and {@link XrPerformanceMetricsCounterMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrPerformanceMetricsCounterMETA
    extends IPointer
    permits XrPerformanceMetricsCounterMETA, XrPerformanceMetricsCounterMETA.Ptr
{}
