package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE} and {@link WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE
    extends IPointer
    permits WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE, WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE.Ptr
{}
