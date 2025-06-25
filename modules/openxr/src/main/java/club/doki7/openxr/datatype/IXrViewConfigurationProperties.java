package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrViewConfigurationProperties} and {@link XrViewConfigurationProperties.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrViewConfigurationProperties
    extends IPointer
    permits XrViewConfigurationProperties, XrViewConfigurationProperties.Ptr
{}
