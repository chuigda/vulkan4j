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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorUpdateTemplateCreateInfo.html">VkDescriptorUpdateTemplateCreateInfo</a>
@ValueBasedCandidate
public record VkDescriptorUpdateTemplateCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$descriptorUpdateEntryCount = ValueLayout.JAVA_INT.withName("descriptorUpdateEntryCount");
    public static final AddressLayout LAYOUT$pDescriptorUpdateEntries = ValueLayout.ADDRESS.withTargetLayout(VkDescriptorUpdateTemplateEntry.LAYOUT).withName("pDescriptorUpdateEntries");
    public static final OfInt LAYOUT$templateType = ValueLayout.JAVA_INT.withName("templateType");
    public static final AddressLayout LAYOUT$descriptorSetLayout = ValueLayout.ADDRESS.withName("descriptorSetLayout");
    public static final OfInt LAYOUT$pipelineBindPoint = ValueLayout.JAVA_INT.withName("pipelineBindPoint");
    public static final AddressLayout LAYOUT$pipelineLayout = ValueLayout.ADDRESS.withName("pipelineLayout");
    public static final OfInt LAYOUT$set = ValueLayout.JAVA_INT.withName("set");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$descriptorUpdateEntryCount, LAYOUT$pDescriptorUpdateEntries, LAYOUT$templateType, LAYOUT$descriptorSetLayout, LAYOUT$pipelineBindPoint, LAYOUT$pipelineLayout, LAYOUT$set);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDescriptorUpdateTemplateCreateInfo allocate(Arena arena) {
        return new VkDescriptorUpdateTemplateCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkDescriptorUpdateTemplateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorUpdateTemplateCreateInfo[] ret = new VkDescriptorUpdateTemplateCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDescriptorUpdateTemplateCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDescriptorUpdateTemplateCreateInfo clone(Arena arena, VkDescriptorUpdateTemplateCreateInfo src) {
        VkDescriptorUpdateTemplateCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorUpdateTemplateCreateInfo[] clone(Arena arena, VkDescriptorUpdateTemplateCreateInfo[] src) {
        VkDescriptorUpdateTemplateCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$descriptorUpdateEntryCount = PathElement.groupElement("PATH$descriptorUpdateEntryCount");
    public static final PathElement PATH$pDescriptorUpdateEntries = PathElement.groupElement("PATH$pDescriptorUpdateEntries");
    public static final PathElement PATH$templateType = PathElement.groupElement("PATH$templateType");
    public static final PathElement PATH$descriptorSetLayout = PathElement.groupElement("PATH$descriptorSetLayout");
    public static final PathElement PATH$pipelineBindPoint = PathElement.groupElement("PATH$pipelineBindPoint");
    public static final PathElement PATH$pipelineLayout = PathElement.groupElement("PATH$pipelineLayout");
    public static final PathElement PATH$set = PathElement.groupElement("PATH$set");

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

    public @Nullable VkDescriptorUpdateTemplateEntry pDescriptorUpdateEntries() {
        MemorySegment s = pDescriptorUpdateEntriesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorUpdateTemplateEntry(s);
    }

    public void pDescriptorUpdateEntries(@Nullable VkDescriptorUpdateTemplateEntry value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDescriptorUpdateEntriesRaw(s);
    }

    @unsafe public @Nullable VkDescriptorUpdateTemplateEntry[] pDescriptorUpdateEntries(int assumedCount) {
        MemorySegment s = pDescriptorUpdateEntriesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDescriptorUpdateTemplateEntry.SIZE);
        VkDescriptorUpdateTemplateEntry[] ret = new VkDescriptorUpdateTemplateEntry[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorUpdateTemplateEntry(s.asSlice(i * VkDescriptorUpdateTemplateEntry.SIZE, VkDescriptorUpdateTemplateEntry.SIZE));
        }
        return ret;
    }

    public @enumtype(VkDescriptorUpdateTemplateType.class) int templateType() {
        return segment.get(LAYOUT$templateType, OFFSET$templateType);
    }

    public void templateType(@enumtype(VkDescriptorUpdateTemplateType.class) int value) {
        segment.set(LAYOUT$templateType, OFFSET$templateType, value);
    }

    public @Nullable VkDescriptorSetLayout descriptorSetLayout() {
        MemorySegment s = segment.asSlice(OFFSET$descriptorSetLayout, SIZE$descriptorSetLayout);
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorSetLayout(s);
    }

    public void descriptorSetLayout(@Nullable VkDescriptorSetLayout value) {
        segment.set(LAYOUT$descriptorSetLayout, OFFSET$descriptorSetLayout, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint() {
        return segment.get(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint);
    }

    public void pipelineBindPoint(@enumtype(VkPipelineBindPoint.class) int value) {
        segment.set(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint, value);
    }

    public @Nullable VkPipelineLayout pipelineLayout() {
        MemorySegment s = segment.asSlice(OFFSET$pipelineLayout, SIZE$pipelineLayout);
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineLayout(s);
    }

    public void pipelineLayout(@Nullable VkPipelineLayout value) {
        segment.set(LAYOUT$pipelineLayout, OFFSET$pipelineLayout, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int set() {
        return segment.get(LAYOUT$set, OFFSET$set);
    }

    public void set(@unsigned int value) {
        segment.set(LAYOUT$set, OFFSET$set, value);
    }

}
