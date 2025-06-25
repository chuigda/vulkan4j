package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEnvironmentDepthSwapchainStateMETA} and {@link XrEnvironmentDepthSwapchainStateMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEnvironmentDepthSwapchainStateMETA
    extends IPointer
    permits XrEnvironmentDepthSwapchainStateMETA, XrEnvironmentDepthSwapchainStateMETA.Ptr
{}
