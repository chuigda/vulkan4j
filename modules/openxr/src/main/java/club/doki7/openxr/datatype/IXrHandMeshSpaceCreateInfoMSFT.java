package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHandMeshSpaceCreateInfoMSFT} and {@link XrHandMeshSpaceCreateInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHandMeshSpaceCreateInfoMSFT
    extends IPointer
    permits XrHandMeshSpaceCreateInfoMSFT, XrHandMeshSpaceCreateInfoMSFT.Ptr
{}
