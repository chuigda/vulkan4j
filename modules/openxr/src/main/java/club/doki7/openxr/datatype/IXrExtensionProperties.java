package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrExtensionProperties} and {@link XrExtensionProperties.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrExtensionProperties
    extends IPointer
    permits XrExtensionProperties, XrExtensionProperties.Ptr
{}
