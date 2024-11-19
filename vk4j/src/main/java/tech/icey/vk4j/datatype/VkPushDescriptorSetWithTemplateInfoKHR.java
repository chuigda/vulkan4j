package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPushDescriptorSetWithTemplateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkDescriptorUpdateTemplate descriptorUpdateTemplate;
///     VkPipelineLayout layout;
///     uint32_t set;
///     const void* pData;
/// } VkPushDescriptorSetWithTemplateInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPushDescriptorSetWithTemplateInfoKHR.html">VkPushDescriptorSetWithTemplateInfoKHR</a>
public record VkPushDescriptorSetWithTemplateInfoKHR(MemorySegment segment) implements IPointer {
    public VkPushDescriptorSetWithTemplateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PUSH_DESCRIPTOR_SET_WITH_TEMPLATE_INFO_KHR);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @Nullable VkDescriptorUpdateTemplate descriptorUpdateTemplate() {
        MemorySegment s = segment.get(LAYOUT$descriptorUpdateTemplate, OFFSET$descriptorUpdateTemplate);
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorUpdateTemplate(s);
    }

    public void descriptorUpdateTemplate(@Nullable VkDescriptorUpdateTemplate value) {
        segment.set(
            LAYOUT$descriptorUpdateTemplate,
            OFFSET$descriptorUpdateTemplate,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @Nullable VkPipelineLayout layout() {
        MemorySegment s = segment.get(LAYOUT$layout, OFFSET$layout);
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineLayout(s);
    }

    public void layout(@Nullable VkPipelineLayout value) {
        segment.set(
            LAYOUT$layout,
            OFFSET$layout,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned int set() {
        return segment.get(LAYOUT$set, OFFSET$set);
    }

    public void set(@unsigned int value) {
        segment.set(LAYOUT$set, OFFSET$set, value);
    }

    public @pointer(comment="void*") MemorySegment pData() {
        return segment.get(LAYOUT$pData, OFFSET$pData);
    }

    public void pData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pData, OFFSET$pData, value);
    }

    public void pData(@Nullable IPointer pointer) {
        pData(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public static VkPushDescriptorSetWithTemplateInfoKHR allocate(Arena arena) {
        return new VkPushDescriptorSetWithTemplateInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkPushDescriptorSetWithTemplateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPushDescriptorSetWithTemplateInfoKHR[] ret = new VkPushDescriptorSetWithTemplateInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPushDescriptorSetWithTemplateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPushDescriptorSetWithTemplateInfoKHR clone(Arena arena, VkPushDescriptorSetWithTemplateInfoKHR src) {
        VkPushDescriptorSetWithTemplateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPushDescriptorSetWithTemplateInfoKHR[] clone(Arena arena, VkPushDescriptorSetWithTemplateInfoKHR[] src) {
        VkPushDescriptorSetWithTemplateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("descriptorUpdateTemplate"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.JAVA_INT.withName("set"),
        ValueLayout.ADDRESS.withName("pData")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$descriptorUpdateTemplate = PathElement.groupElement("descriptorUpdateTemplate");
    public static final PathElement PATH$layout = PathElement.groupElement("layout");
    public static final PathElement PATH$set = PathElement.groupElement("set");
    public static final PathElement PATH$pData = PathElement.groupElement("pData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$descriptorUpdateTemplate = (AddressLayout) LAYOUT.select(PATH$descriptorUpdateTemplate);
    public static final AddressLayout LAYOUT$layout = (AddressLayout) LAYOUT.select(PATH$layout);
    public static final OfInt LAYOUT$set = (OfInt) LAYOUT.select(PATH$set);
    public static final AddressLayout LAYOUT$pData = (AddressLayout) LAYOUT.select(PATH$pData);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorUpdateTemplate = LAYOUT.byteOffset(PATH$descriptorUpdateTemplate);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
    public static final long OFFSET$set = LAYOUT.byteOffset(PATH$set);
    public static final long OFFSET$pData = LAYOUT.byteOffset(PATH$pData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$descriptorUpdateTemplate = LAYOUT$descriptorUpdateTemplate.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();
    public static final long SIZE$set = LAYOUT$set.byteSize();
    public static final long SIZE$pData = LAYOUT$pData.byteSize();
}
