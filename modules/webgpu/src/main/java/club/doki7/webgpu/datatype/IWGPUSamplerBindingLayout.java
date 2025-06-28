package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link WGPUSamplerBindingLayout} and {@link WGPUSamplerBindingLayout.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IWGPUSamplerBindingLayout
    extends IPointer
    permits WGPUSamplerBindingLayout, WGPUSamplerBindingLayout.Ptr
{}
