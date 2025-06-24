package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSpatialGraphNodeBindingPropertiesMSFT} and {@link XrSpatialGraphNodeBindingPropertiesMSFT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSpatialGraphNodeBindingPropertiesMSFT
    extends IPointer
    permits XrSpatialGraphNodeBindingPropertiesMSFT, XrSpatialGraphNodeBindingPropertiesMSFT.Ptr
{}
