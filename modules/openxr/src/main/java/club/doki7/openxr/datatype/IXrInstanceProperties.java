package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrInstanceProperties} and {@link XrInstanceProperties.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrInstanceProperties
    extends IPointer
    permits XrInstanceProperties, XrInstanceProperties.Ptr
{}
