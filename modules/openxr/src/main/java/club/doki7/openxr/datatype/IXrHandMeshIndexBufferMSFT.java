package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrHandMeshIndexBufferMSFT} and {@link XrHandMeshIndexBufferMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrHandMeshIndexBufferMSFT
    extends IPointer
    permits XrHandMeshIndexBufferMSFT, XrHandMeshIndexBufferMSFT.Ptr
{}
