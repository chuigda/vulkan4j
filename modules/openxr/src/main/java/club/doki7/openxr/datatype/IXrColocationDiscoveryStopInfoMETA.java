package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrColocationDiscoveryStopInfoMETA} and {@link XrColocationDiscoveryStopInfoMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrColocationDiscoveryStopInfoMETA
    extends IPointer
    permits XrColocationDiscoveryStopInfoMETA, XrColocationDiscoveryStopInfoMETA.Ptr
{}
