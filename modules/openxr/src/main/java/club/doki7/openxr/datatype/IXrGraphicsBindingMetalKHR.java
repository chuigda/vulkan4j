package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrGraphicsBindingMetalKHR} and {@link XrGraphicsBindingMetalKHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrGraphicsBindingMetalKHR
    extends IPointer
    permits XrGraphicsBindingMetalKHR, XrGraphicsBindingMetalKHR.Ptr
{}
