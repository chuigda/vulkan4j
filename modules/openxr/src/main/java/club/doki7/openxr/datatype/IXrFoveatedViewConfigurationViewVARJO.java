package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrFoveatedViewConfigurationViewVARJO} and {@link XrFoveatedViewConfigurationViewVARJO.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrFoveatedViewConfigurationViewVARJO
    extends IPointer
    permits XrFoveatedViewConfigurationViewVARJO, XrFoveatedViewConfigurationViewVARJO.Ptr
{}
