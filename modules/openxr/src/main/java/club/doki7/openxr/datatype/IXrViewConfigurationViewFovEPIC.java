package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrViewConfigurationViewFovEPIC} and {@link XrViewConfigurationViewFovEPIC.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrViewConfigurationViewFovEPIC
    extends IPointer
    permits XrViewConfigurationViewFovEPIC, XrViewConfigurationViewFovEPIC.Ptr
{}
