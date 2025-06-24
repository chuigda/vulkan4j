package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemAnchorPropertiesHTC} and {@link XrSystemAnchorPropertiesHTC.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemAnchorPropertiesHTC
    extends IPointer
    permits XrSystemAnchorPropertiesHTC, XrSystemAnchorPropertiesHTC.Ptr
{}
