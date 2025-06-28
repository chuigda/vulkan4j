package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUNativeLimits} and {@link WGPUNativeLimits.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUNativeLimits
    extends IPointer
    permits WGPUNativeLimits, WGPUNativeLimits.Ptr
{}
