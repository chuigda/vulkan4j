package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneObserverCreateInfoMSFT} and {@link XrSceneObserverCreateInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneObserverCreateInfoMSFT
    extends IPointer
    permits XrSceneObserverCreateInfoMSFT, XrSceneObserverCreateInfoMSFT.Ptr
{}
