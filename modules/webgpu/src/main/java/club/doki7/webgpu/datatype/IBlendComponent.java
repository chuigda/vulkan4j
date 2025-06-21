package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link BlendComponent} and {@link BlendComponent.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IBlendComponent
    extends IPointer
    permits BlendComponent, BlendComponent.Ptr
{}
