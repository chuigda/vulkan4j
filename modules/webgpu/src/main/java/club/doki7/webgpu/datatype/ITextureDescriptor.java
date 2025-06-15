package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link TextureDescriptor} and {@link TextureDescriptor.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface ITextureDescriptor
    extends IPointer
    permits TextureDescriptor, TextureDescriptor.Ptr
{}
