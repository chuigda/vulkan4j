package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUColor} and {@link WGPUColor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUColor
    extends IPointer
    permits WGPUColor, WGPUColor.Ptr
{}
