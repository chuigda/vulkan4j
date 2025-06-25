package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEnvironmentDepthImageViewMETA} and {@link XrEnvironmentDepthImageViewMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEnvironmentDepthImageViewMETA
    extends IPointer
    permits XrEnvironmentDepthImageViewMETA, XrEnvironmentDepthImageViewMETA.Ptr
{}
