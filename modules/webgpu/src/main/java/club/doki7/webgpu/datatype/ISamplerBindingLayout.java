package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SamplerBindingLayout} and {@link SamplerBindingLayout.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISamplerBindingLayout
    extends IPointer
    permits SamplerBindingLayout, SamplerBindingLayout.Ptr
{}
