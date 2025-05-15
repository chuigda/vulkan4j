package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPushDescriptorSetWithTemplateInfo.html">VkPushDescriptorSetWithTemplateInfo</a>
@ValueBasedCandidate
public record VkPushDescriptorSetWithTemplateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$descriptorUpdateTemplate = ValueLayout.ADDRESS.withName("descriptorUpdateTemplate");
    public static final AddressLayout LAYOUT$layout = ValueLayout.ADDRESS.withName("layout");
    public static final OfInt LAYOUT$set = ValueLayout.JAVA_INT.withName("set");
    public static final AddressLayout LAYOUT$pData = ValueLayout.ADDRESS.withName("pData");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$descriptorUpdateTemplate, LAYOUT$layout, LAYOUT$set, LAYOUT$pData);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPushDescriptorSetWithTemplateInfo allocate(Arena arena) {
        return new VkPushDescriptorSetWithTemplateInfo(arena.allocate(LAYOUT));
    }

    public static VkPushDescriptorSetWithTemplateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPushDescriptorSetWithTemplateInfo[] ret = new VkPushDescriptorSetWithTemplateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPushDescriptorSetWithTemplateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPushDescriptorSetWithTemplateInfo clone(Arena arena, VkPushDescriptorSetWithTemplateInfo src) {
        VkPushDescriptorSetWithTemplateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPushDescriptorSetWithTemplateInfo[] clone(Arena arena, VkPushDescriptorSetWithTemplateInfo[] src) {
        VkPushDescriptorSetWithTemplateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$descriptorUpdateTemplate = PathElement.groupElement("PATH$descriptorUpdateTemplate");
    public static final PathElement PATH$layout = PathElement.groupElement("PATH$layout");
    public static final PathElement PATH$set = PathElement.groupElement("PATH$set");
    public static final PathElement PATH$pData = PathElement.groupElement("PATH$pData");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$descriptorUpdateTemplate = LAYOUT$descriptorUpdateTemplate.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();
    public static final long SIZE$set = LAYOUT$set.byteSize();
    public static final long SIZE$pData = LAYOUT$pData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorUpdateTemplate = LAYOUT.byteOffset(PATH$descriptorUpdateTemplate);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
    public static final long OFFSET$set = LAYOUT.byteOffset(PATH$set);
    public static final long OFFSET$pData = LAYOUT.byteOffset(PATH$pData);

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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @Nullable VkDescriptorUpdateTemplate descriptorUpdateTemplate() {
        MemorySegment s = segment.asSlice(OFFSET$descriptorUpdateTemplate, SIZE$descriptorUpdateTemplate);
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorUpdateTemplate(s);
    }

    public void descriptorUpdateTemplate(@Nullable VkDescriptorUpdateTemplate value) {
        segment.set(LAYOUT$descriptorUpdateTemplate, OFFSET$descriptorUpdateTemplate, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkPipelineLayout layout() {
        MemorySegment s = segment.asSlice(OFFSET$layout, SIZE$layout);
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineLayout(s);
    }

    public void layout(@Nullable VkPipelineLayout value) {
        segment.set(LAYOUT$layout, OFFSET$layout, value != null ? value.segment() : MemorySegment.NULL);
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

    public void pData(IPointer pointer) {
        pData(pointer.segment());
    }

}
