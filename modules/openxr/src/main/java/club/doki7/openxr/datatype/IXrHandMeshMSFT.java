package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHandMeshMSFT} and {@link XrHandMeshMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHandMeshMSFT
    extends IPointer
    permits XrHandMeshMSFT, XrHandMeshMSFT.Ptr
{}
