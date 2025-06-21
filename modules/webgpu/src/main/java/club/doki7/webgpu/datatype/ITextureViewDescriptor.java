package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link TextureViewDescriptor} and {@link TextureViewDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ITextureViewDescriptor
    extends IPointer
    permits TextureViewDescriptor, TextureViewDescriptor.Ptr
{}
