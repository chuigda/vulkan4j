package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrViewConfigurationView} and {@link XrViewConfigurationView.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrViewConfigurationView
    extends IPointer
    permits XrViewConfigurationView, XrViewConfigurationView.Ptr
{}
