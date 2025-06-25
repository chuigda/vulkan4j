package club.doki7.openxr.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link XrGraphicsRequirementsD3D12KHR} and {@link XrGraphicsRequirementsD3D12KHR.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IXrGraphicsRequirementsD3D12KHR
    extends IPointer
    permits XrGraphicsRequirementsD3D12KHR, XrGraphicsRequirementsD3D12KHR.Ptr
{}
