package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPULimits} and {@link WGPULimits.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPULimits
    extends IPointer
    permits WGPULimits, WGPULimits.Ptr
{}
