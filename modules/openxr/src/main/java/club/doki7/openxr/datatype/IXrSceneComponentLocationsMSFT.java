package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneComponentLocationsMSFT} and {@link XrSceneComponentLocationsMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneComponentLocationsMSFT
    extends IPointer
    permits XrSceneComponentLocationsMSFT, XrSceneComponentLocationsMSFT.Ptr
{}
