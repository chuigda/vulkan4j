package club.doki7.glfw.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link GLFWimage} and {@link GLFWimage.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IGLFWimage
    extends IPointer
    permits GLFWimage, GLFWimage.Ptr
{}
