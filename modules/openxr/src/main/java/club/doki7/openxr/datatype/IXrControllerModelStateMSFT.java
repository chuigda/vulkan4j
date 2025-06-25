package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrControllerModelStateMSFT} and {@link XrControllerModelStateMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrControllerModelStateMSFT
    extends IPointer
    permits XrControllerModelStateMSFT, XrControllerModelStateMSFT.Ptr
{}
