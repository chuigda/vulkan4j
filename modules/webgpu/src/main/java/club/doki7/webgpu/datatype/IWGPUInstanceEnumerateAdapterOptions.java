package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUInstanceEnumerateAdapterOptions} and {@link WGPUInstanceEnumerateAdapterOptions.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUInstanceEnumerateAdapterOptions
    extends IPointer
    permits WGPUInstanceEnumerateAdapterOptions, WGPUInstanceEnumerateAdapterOptions.Ptr
{}
