package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrControllerModelKeyStateMSFT} and {@link XrControllerModelKeyStateMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrControllerModelKeyStateMSFT
    extends IPointer
    permits XrControllerModelKeyStateMSFT, XrControllerModelKeyStateMSFT.Ptr
{}
