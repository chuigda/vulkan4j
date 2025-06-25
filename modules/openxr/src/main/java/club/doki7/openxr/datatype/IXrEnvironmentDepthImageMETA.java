package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEnvironmentDepthImageMETA} and {@link XrEnvironmentDepthImageMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEnvironmentDepthImageMETA
    extends IPointer
    permits XrEnvironmentDepthImageMETA, XrEnvironmentDepthImageMETA.Ptr
{}
