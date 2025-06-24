package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrGraphicsBindingD3D12KHR} and {@link XrGraphicsBindingD3D12KHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrGraphicsBindingD3D12KHR
    extends IPointer
    permits XrGraphicsBindingD3D12KHR, XrGraphicsBindingD3D12KHR.Ptr
{}
