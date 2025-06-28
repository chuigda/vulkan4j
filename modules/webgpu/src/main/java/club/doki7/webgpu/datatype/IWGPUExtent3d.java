package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUExtent3d} and {@link WGPUExtent3d.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUExtent3d
    extends IPointer
    permits WGPUExtent3d, WGPUExtent3d.Ptr
{}
