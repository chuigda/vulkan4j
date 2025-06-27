package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUBindGroupEntryExtras} and {@link WGPUBindGroupEntryExtras.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUBindGroupEntryExtras
    extends IPointer
    permits WGPUBindGroupEntryExtras, WGPUBindGroupEntryExtras.Ptr
{}
