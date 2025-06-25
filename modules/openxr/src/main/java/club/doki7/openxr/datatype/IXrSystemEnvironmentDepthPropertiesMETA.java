package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemEnvironmentDepthPropertiesMETA} and {@link XrSystemEnvironmentDepthPropertiesMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemEnvironmentDepthPropertiesMETA
    extends IPointer
    permits XrSystemEnvironmentDepthPropertiesMETA, XrSystemEnvironmentDepthPropertiesMETA.Ptr
{}
