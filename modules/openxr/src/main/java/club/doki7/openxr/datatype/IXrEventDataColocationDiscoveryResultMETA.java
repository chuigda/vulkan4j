package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrEventDataColocationDiscoveryResultMETA} and {@link XrEventDataColocationDiscoveryResultMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrEventDataColocationDiscoveryResultMETA
    extends IPointer
    permits XrEventDataColocationDiscoveryResultMETA, XrEventDataColocationDiscoveryResultMETA.Ptr
{}
