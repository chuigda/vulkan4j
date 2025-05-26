package club.doki7.glfw.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link GLFWgamepadstate} and {@link GLFWgamepadstate.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IGLFWgamepadstate
    extends IPointer
    permits GLFWgamepadstate, GLFWgamepadstate.Ptr
{}
