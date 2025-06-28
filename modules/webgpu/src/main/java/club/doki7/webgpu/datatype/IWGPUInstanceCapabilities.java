package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUInstanceCapabilities} and {@link WGPUInstanceCapabilities.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUInstanceCapabilities
    extends IPointer
    permits WGPUInstanceCapabilities, WGPUInstanceCapabilities.Ptr
{}
