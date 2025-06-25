package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrViewConfigurationDepthRangeEXT} and {@link XrViewConfigurationDepthRangeEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrViewConfigurationDepthRangeEXT
    extends IPointer
    permits XrViewConfigurationDepthRangeEXT, XrViewConfigurationDepthRangeEXT.Ptr
{}
