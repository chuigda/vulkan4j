package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrColocationDiscoveryStartInfoMETA} and {@link XrColocationDiscoveryStartInfoMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrColocationDiscoveryStartInfoMETA
    extends IPointer
    permits XrColocationDiscoveryStartInfoMETA, XrColocationDiscoveryStartInfoMETA.Ptr
{}
