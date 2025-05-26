package club.doki7.glfw.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link GLFWvidmode} and {@link GLFWvidmode.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IGLFWvidmode
    extends IPointer
    permits GLFWvidmode, GLFWvidmode.Ptr
{}
