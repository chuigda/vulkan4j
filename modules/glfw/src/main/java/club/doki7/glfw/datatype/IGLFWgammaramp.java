package club.doki7.glfw.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link GLFWgammaramp} and {@link GLFWgammaramp.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IGLFWgammaramp
    extends IPointer
    permits GLFWgammaramp, GLFWgammaramp.Ptr
{}
