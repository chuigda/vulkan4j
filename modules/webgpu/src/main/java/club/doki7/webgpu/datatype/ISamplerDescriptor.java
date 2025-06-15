package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link SamplerDescriptor} and {@link SamplerDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ISamplerDescriptor
    extends IPointer
    permits SamplerDescriptor, SamplerDescriptor.Ptr
{}
