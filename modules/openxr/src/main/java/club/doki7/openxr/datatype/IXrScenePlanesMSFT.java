package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrScenePlanesMSFT} and {@link XrScenePlanesMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrScenePlanesMSFT
    extends IPointer
    permits XrScenePlanesMSFT, XrScenePlanesMSFT.Ptr
{}
