package club.doki7.vulkan.datatype;

import club.doki7.ffm.IPointer;

/// Auxiliary interface for unifying {@link VkRenderingEndInfoEXT} and {@link VkRenderingEndInfoEXT.Ptr} operations.
///
/// See package level documentation for more details.
public sealed interface IVkRenderingEndInfoEXT
    extends IPointer
    permits VkRenderingEndInfoEXT, VkRenderingEndInfoEXT.Ptr
{}
