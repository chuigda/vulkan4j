package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrControllerModelNodePropertiesMSFT} and {@link XrControllerModelNodePropertiesMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrControllerModelNodePropertiesMSFT
    extends IPointer
    permits XrControllerModelNodePropertiesMSFT, XrControllerModelNodePropertiesMSFT.Ptr
{}
