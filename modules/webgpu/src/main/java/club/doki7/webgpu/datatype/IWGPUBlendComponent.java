package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUBlendComponent} and {@link WGPUBlendComponent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUBlendComponent
    extends IPointer
    permits WGPUBlendComponent, WGPUBlendComponent.Ptr
{}
