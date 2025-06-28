package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUDeviceExtras} and {@link WGPUDeviceExtras.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUDeviceExtras
    extends IPointer
    permits WGPUDeviceExtras, WGPUDeviceExtras.Ptr
{}
