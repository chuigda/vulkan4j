package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemHeadsetIdPropertiesMETA} and {@link XrSystemHeadsetIdPropertiesMETA.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemHeadsetIdPropertiesMETA
    extends IPointer
    permits XrSystemHeadsetIdPropertiesMETA, XrSystemHeadsetIdPropertiesMETA.Ptr
{}
