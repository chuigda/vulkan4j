package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkRenderPassFragmentDensityMapCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkAttachmentReference.LAYOUT.withName("fragmentDensityMapAttachment")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$fragmentDensityMapAttachment = PathElement.groupElement("fragmentDensityMapAttachment");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$fragmentDensityMapAttachment = (StructLayout) LAYOUT.select(PATH$fragmentDensityMapAttachment);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentDensityMapAttachment = LAYOUT.byteOffset(PATH$fragmentDensityMapAttachment);

    public VkRenderPassFragmentDensityMapCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public VkAttachmentReference fragmentDensityMapAttachment() {
        return new VkAttachmentReference(segment.asSlice(OFFSET$fragmentDensityMapAttachment, LAYOUT$fragmentDensityMapAttachment));
    }

    public void fragmentDensityMapAttachment(VkAttachmentReference value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$fragmentDensityMapAttachment, LAYOUT$fragmentDensityMapAttachment.byteSize());
    }

    public static VkRenderPassFragmentDensityMapCreateInfoEXT allocate(Arena arena) {
        return new VkRenderPassFragmentDensityMapCreateInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkRenderPassFragmentDensityMapCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassFragmentDensityMapCreateInfoEXT[] ret = new VkRenderPassFragmentDensityMapCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRenderPassFragmentDensityMapCreateInfoEXT(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
