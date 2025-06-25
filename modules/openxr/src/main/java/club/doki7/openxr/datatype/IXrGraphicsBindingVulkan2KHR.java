package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrGraphicsBindingVulkan2KHR} and {@link XrGraphicsBindingVulkan2KHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrGraphicsBindingVulkan2KHR
    extends IPointer
    permits XrGraphicsBindingVulkan2KHR, XrGraphicsBindingVulkan2KHR.Ptr
{}
