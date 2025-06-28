package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUBindGroupEntry} and {@link WGPUBindGroupEntry.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUBindGroupEntry
    extends IPointer
    permits WGPUBindGroupEntry, WGPUBindGroupEntry.Ptr
{}
