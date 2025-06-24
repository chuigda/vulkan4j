package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemProperties} and {@link XrSystemProperties.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemProperties
    extends IPointer
    permits XrSystemProperties, XrSystemProperties.Ptr
{}
