package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrBindingModificationBaseHeaderKHR} and {@link XrBindingModificationBaseHeaderKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrBindingModificationBaseHeaderKHR
    extends IPointer
    permits XrBindingModificationBaseHeaderKHR, XrBindingModificationBaseHeaderKHR.Ptr
{}
