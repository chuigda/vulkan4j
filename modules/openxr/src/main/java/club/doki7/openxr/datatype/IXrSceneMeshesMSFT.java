package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneMeshesMSFT} and {@link XrSceneMeshesMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneMeshesMSFT
    extends IPointer
    permits XrSceneMeshesMSFT, XrSceneMeshesMSFT.Ptr
{}
