package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrGraphicsBindingD3D11KHR} and {@link XrGraphicsBindingD3D11KHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrGraphicsBindingD3D11KHR
    extends IPointer
    permits XrGraphicsBindingD3D11KHR, XrGraphicsBindingD3D11KHR.Ptr
{}
