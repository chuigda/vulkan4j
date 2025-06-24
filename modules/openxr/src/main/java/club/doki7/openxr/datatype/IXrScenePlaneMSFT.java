package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrScenePlaneMSFT} and {@link XrScenePlaneMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrScenePlaneMSFT
    extends IPointer
    permits XrScenePlaneMSFT, XrScenePlaneMSFT.Ptr
{}
