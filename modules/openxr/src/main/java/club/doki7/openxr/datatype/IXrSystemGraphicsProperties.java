package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrSystemGraphicsProperties} and {@link XrSystemGraphicsProperties.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrSystemGraphicsProperties
    extends IPointer
    permits XrSystemGraphicsProperties, XrSystemGraphicsProperties.Ptr
{}
