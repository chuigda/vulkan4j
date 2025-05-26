package club.doki7.glfw.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link GLFWallocator} and {@link GLFWallocator.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IGLFWallocator
    extends IPointer
    permits GLFWallocator, GLFWallocator.Ptr
{}
