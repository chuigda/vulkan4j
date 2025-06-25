package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBindingModificationsKHR} and {@link XrBindingModificationsKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBindingModificationsKHR
    extends IPointer
    permits XrBindingModificationsKHR, XrBindingModificationsKHR.Ptr
{}
