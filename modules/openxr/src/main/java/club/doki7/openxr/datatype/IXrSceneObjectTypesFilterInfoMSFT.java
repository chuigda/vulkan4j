package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSceneObjectTypesFilterInfoMSFT} and {@link XrSceneObjectTypesFilterInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSceneObjectTypesFilterInfoMSFT
    extends IPointer
    permits XrSceneObjectTypesFilterInfoMSFT, XrSceneObjectTypesFilterInfoMSFT.Ptr
{}
