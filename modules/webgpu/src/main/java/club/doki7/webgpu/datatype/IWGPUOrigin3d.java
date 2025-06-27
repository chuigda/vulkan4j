package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUOrigin3d} and {@link WGPUOrigin3d.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUOrigin3d
    extends IPointer
    permits WGPUOrigin3d, WGPUOrigin3d.Ptr
{}
