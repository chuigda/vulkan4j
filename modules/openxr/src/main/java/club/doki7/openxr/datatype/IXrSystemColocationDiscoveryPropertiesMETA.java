package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemColocationDiscoveryPropertiesMETA} and {@link XrSystemColocationDiscoveryPropertiesMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemColocationDiscoveryPropertiesMETA
    extends IPointer
    permits XrSystemColocationDiscoveryPropertiesMETA, XrSystemColocationDiscoveryPropertiesMETA.Ptr
{}
