package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemSpaceWarpPropertiesFB} and {@link XrSystemSpaceWarpPropertiesFB.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemSpaceWarpPropertiesFB
    extends IPointer
    permits XrSystemSpaceWarpPropertiesFB, XrSystemSpaceWarpPropertiesFB.Ptr
{}
