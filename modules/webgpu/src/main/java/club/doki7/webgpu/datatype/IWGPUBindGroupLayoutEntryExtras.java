package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUBindGroupLayoutEntryExtras} and {@link WGPUBindGroupLayoutEntryExtras.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUBindGroupLayoutEntryExtras
    extends IPointer
    permits WGPUBindGroupLayoutEntryExtras, WGPUBindGroupLayoutEntryExtras.Ptr
{}
