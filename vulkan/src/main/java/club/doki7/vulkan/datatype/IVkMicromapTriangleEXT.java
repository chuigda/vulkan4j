package club.doki7.vulkan.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VkMicromapTriangleEXT} and {@link VkMicromapTriangleEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVkMicromapTriangleEXT
    extends IPointer
    permits VkMicromapTriangleEXT, VkMicromapTriangleEXT.Ptr
{}
