package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrGraphicsRequirementsD3D11KHR} and {@link XrGraphicsRequirementsD3D11KHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrGraphicsRequirementsD3D11KHR
    extends IPointer
    permits XrGraphicsRequirementsD3D11KHR, XrGraphicsRequirementsD3D11KHR.Ptr
{}
