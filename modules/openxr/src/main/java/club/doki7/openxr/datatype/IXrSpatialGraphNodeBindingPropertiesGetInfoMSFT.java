package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialGraphNodeBindingPropertiesGetInfoMSFT} and {@link XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialGraphNodeBindingPropertiesGetInfoMSFT
    extends IPointer
    permits XrSpatialGraphNodeBindingPropertiesGetInfoMSFT, XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.Ptr
{}
