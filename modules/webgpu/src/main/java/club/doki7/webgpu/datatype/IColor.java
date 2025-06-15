package club.doki7.webgpu.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link Color} and {@link Color.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IColor
    extends IPointer
    permits Color, Color.Ptr
{}
