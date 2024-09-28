package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkDescriptorUpdateTemplateCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkDescriptorUpdateTemplateCreateFlags flags;
///     uint32_t descriptorUpdateEntryCount;
///     const VkDescriptorUpdateTemplateEntry* pDescriptorUpdateEntries;
///     VkDescriptorUpdateTemplateType templateType;
///     VkDescriptorSetLayout descriptorSetLayout;
///     VkPipelineBindPoint pipelineBindPoint;
///     VkPipelineLayout pipelineLayout;
///     uint32_t set;
/// } VkDescriptorUpdateTemplateCreateInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDescriptorUpdateTemplateCreateInfo.html">VkDescriptorUpdateTemplateCreateInfo</a>
public record VkDescriptorUpdateTemplateCreateInfo(MemorySegment segment) implements IPointer {
    public VkDescriptorUpdateTemplateCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @enumtype(VkDescriptorUpdateTemplateCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDescriptorUpdateTemplateCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int descriptorUpdateEntryCount() {
        return segment.get(LAYOUT$descriptorUpdateEntryCount, OFFSET$descriptorUpdateEntryCount);
    }

    public void descriptorUpdateEntryCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorUpdateEntryCount, OFFSET$descriptorUpdateEntryCount, value);
    }

    public @pointer(comment="VkDescriptorUpdateTemplateEntry*") MemorySegment pDescriptorUpdateEntriesRaw() {
        return segment.get(LAYOUT$pDescriptorUpdateEntries, OFFSET$pDescriptorUpdateEntries);
    }

    public void pDescriptorUpdateEntriesRaw(@pointer(comment="VkDescriptorUpdateTemplateEntry*") MemorySegment value) {
        segment.set(LAYOUT$pDescriptorUpdateEntries, OFFSET$pDescriptorUpdateEntries, value);
    }
    
    public @nullable VkDescriptorUpdateTemplateEntry pDescriptorUpdateEntries() {
        MemorySegment s = pDescriptorUpdateEntriesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorUpdateTemplateEntry(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkDescriptorUpdateTemplateEntry[] pDescriptorUpdateEntries(int assumedCount) {
        MemorySegment s = pDescriptorUpdateEntriesRaw().reinterpret(assumedCount * VkDescriptorUpdateTemplateEntry.SIZE);
        VkDescriptorUpdateTemplateEntry[] arr = new VkDescriptorUpdateTemplateEntry[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkDescriptorUpdateTemplateEntry(s.asSlice(i * VkDescriptorUpdateTemplateEntry.SIZE, VkDescriptorUpdateTemplateEntry.SIZE));
        }
        return arr;
    }

    public void pDescriptorUpdateEntries(@nullable VkDescriptorUpdateTemplateEntry value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDescriptorUpdateEntriesRaw(s);
    }

    public @enumtype(VkDescriptorUpdateTemplateType.class) int templateType() {
        return segment.get(LAYOUT$templateType, OFFSET$templateType);
    }

    public void templateType(@enumtype(VkDescriptorUpdateTemplateType.class) int value) {
        segment.set(LAYOUT$templateType, OFFSET$templateType, value);
    }

    public VkDescriptorSetLayout descriptorSetLayout() {
        return new VkDescriptorSetLayout(segment.get(LAYOUT$descriptorSetLayout, OFFSET$descriptorSetLayout));
    }

    public void descriptorSetLayout(VkDescriptorSetLayout value) {
        segment.set(LAYOUT$descriptorSetLayout, OFFSET$descriptorSetLayout, value.segment());
    }

    public @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint() {
        return segment.get(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint);
    }

    public void pipelineBindPoint(@enumtype(VkPipelineBindPoint.class) int value) {
        segment.set(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint, value);
    }

    public VkPipelineLayout pipelineLayout() {
        return new VkPipelineLayout(segment.get(LAYOUT$pipelineLayout, OFFSET$pipelineLayout));
    }

    public void pipelineLayout(VkPipelineLayout value) {
        segment.set(LAYOUT$pipelineLayout, OFFSET$pipelineLayout, value.segment());
    }

    public @unsigned int set() {
        return segment.get(LAYOUT$set, OFFSET$set);
    }

    public void set(@unsigned int value) {
        segment.set(LAYOUT$set, OFFSET$set, value);
    }

    public static VkDescriptorUpdateTemplateCreateInfo allocate(Arena arena) {
        return new VkDescriptorUpdateTemplateCreateInfo(arena.allocate(LAYOUT));
    }
    
    public static VkDescriptorUpdateTemplateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorUpdateTemplateCreateInfo[] ret = new VkDescriptorUpdateTemplateCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDescriptorUpdateTemplateCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("descriptorUpdateEntryCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorUpdateTemplateEntry.LAYOUT).withName("pDescriptorUpdateEntries"),
        ValueLayout.JAVA_INT.withName("templateType"),
        ValueLayout.ADDRESS.withName("descriptorSetLayout"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.ADDRESS.withName("pipelineLayout"),
        ValueLayout.JAVA_INT.withName("set")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$descriptorUpdateEntryCount = PathElement.groupElement("descriptorUpdateEntryCount");
    public static final PathElement PATH$pDescriptorUpdateEntries = PathElement.groupElement("pDescriptorUpdateEntries");
    public static final PathElement PATH$templateType = PathElement.groupElement("templateType");
    public static final PathElement PATH$descriptorSetLayout = PathElement.groupElement("descriptorSetLayout");
    public static final PathElement PATH$pipelineBindPoint = PathElement.groupElement("pipelineBindPoint");
    public static final PathElement PATH$pipelineLayout = PathElement.groupElement("pipelineLayout");
    public static final PathElement PATH$set = PathElement.groupElement("set");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$descriptorUpdateEntryCount = (OfInt) LAYOUT.select(PATH$descriptorUpdateEntryCount);
    public static final AddressLayout LAYOUT$pDescriptorUpdateEntries = (AddressLayout) LAYOUT.select(PATH$pDescriptorUpdateEntries);
    public static final OfInt LAYOUT$templateType = (OfInt) LAYOUT.select(PATH$templateType);
    public static final AddressLayout LAYOUT$descriptorSetLayout = (AddressLayout) LAYOUT.select(PATH$descriptorSetLayout);
    public static final OfInt LAYOUT$pipelineBindPoint = (OfInt) LAYOUT.select(PATH$pipelineBindPoint);
    public static final AddressLayout LAYOUT$pipelineLayout = (AddressLayout) LAYOUT.select(PATH$pipelineLayout);
    public static final OfInt LAYOUT$set = (OfInt) LAYOUT.select(PATH$set);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$descriptorUpdateEntryCount = LAYOUT.byteOffset(PATH$descriptorUpdateEntryCount);
    public static final long OFFSET$pDescriptorUpdateEntries = LAYOUT.byteOffset(PATH$pDescriptorUpdateEntries);
    public static final long OFFSET$templateType = LAYOUT.byteOffset(PATH$templateType);
    public static final long OFFSET$descriptorSetLayout = LAYOUT.byteOffset(PATH$descriptorSetLayout);
    public static final long OFFSET$pipelineBindPoint = LAYOUT.byteOffset(PATH$pipelineBindPoint);
    public static final long OFFSET$pipelineLayout = LAYOUT.byteOffset(PATH$pipelineLayout);
    public static final long OFFSET$set = LAYOUT.byteOffset(PATH$set);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$descriptorUpdateEntryCount = LAYOUT$descriptorUpdateEntryCount.byteSize();
    public static final long SIZE$pDescriptorUpdateEntries = LAYOUT$pDescriptorUpdateEntries.byteSize();
    public static final long SIZE$templateType = LAYOUT$templateType.byteSize();
    public static final long SIZE$descriptorSetLayout = LAYOUT$descriptorSetLayout.byteSize();
    public static final long SIZE$pipelineBindPoint = LAYOUT$pipelineBindPoint.byteSize();
    public static final long SIZE$pipelineLayout = LAYOUT$pipelineLayout.byteSize();
    public static final long SIZE$set = LAYOUT$set.byteSize();

}
