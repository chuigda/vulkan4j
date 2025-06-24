package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrControllerModelPropertiesMSFT} and {@link XrControllerModelPropertiesMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrControllerModelPropertiesMSFT
    extends IPointer
    permits XrControllerModelPropertiesMSFT, XrControllerModelPropertiesMSFT.Ptr
{}
