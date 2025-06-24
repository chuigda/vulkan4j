package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrControllerModelNodeStateMSFT} and {@link XrControllerModelNodeStateMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrControllerModelNodeStateMSFT
    extends IPointer
    permits XrControllerModelNodeStateMSFT, XrControllerModelNodeStateMSFT.Ptr
{}
