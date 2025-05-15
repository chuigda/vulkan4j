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

public record VkDescriptorPoolCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$maxSets = ValueLayout.JAVA_INT.withName("maxSets");
    public static final OfInt LAYOUT$poolSizeCount = ValueLayout.JAVA_INT.withName("poolSizeCount");
    public static final AddressLayout LAYOUT$pPoolSizes = ValueLayout.ADDRESS.withTargetLayout(VkDescriptorPoolSize.LAYOUT).withName("pPoolSizes");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$maxSets, LAYOUT$poolSizeCount, LAYOUT$pPoolSizes);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDescriptorPoolCreateInfo allocate(Arena arena) {
        return new VkDescriptorPoolCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkDescriptorPoolCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorPoolCreateInfo[] ret = new VkDescriptorPoolCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDescriptorPoolCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDescriptorPoolCreateInfo clone(Arena arena, VkDescriptorPoolCreateInfo src) {
        VkDescriptorPoolCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorPoolCreateInfo[] clone(Arena arena, VkDescriptorPoolCreateInfo[] src) {
        VkDescriptorPoolCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$maxSets = PathElement.groupElement("PATH$maxSets");
    public static final PathElement PATH$poolSizeCount = PathElement.groupElement("PATH$poolSizeCount");
    public static final PathElement PATH$pPoolSizes = PathElement.groupElement("PATH$pPoolSizes");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$maxSets = LAYOUT$maxSets.byteSize();
    public static final long SIZE$poolSizeCount = LAYOUT$poolSizeCount.byteSize();
    public static final long SIZE$pPoolSizes = LAYOUT$pPoolSizes.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$maxSets = LAYOUT.byteOffset(PATH$maxSets);
    public static final long OFFSET$poolSizeCount = LAYOUT.byteOffset(PATH$poolSizeCount);
    public static final long OFFSET$pPoolSizes = LAYOUT.byteOffset(PATH$pPoolSizes);

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

    public @enumtype(VkDescriptorPoolCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDescriptorPoolCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int maxSets() {
        return segment.get(LAYOUT$maxSets, OFFSET$maxSets);
    }

    public void maxSets(@unsigned int value) {
        segment.set(LAYOUT$maxSets, OFFSET$maxSets, value);
    }

    public @unsigned int poolSizeCount() {
        return segment.get(LAYOUT$poolSizeCount, OFFSET$poolSizeCount);
    }

    public void poolSizeCount(@unsigned int value) {
        segment.set(LAYOUT$poolSizeCount, OFFSET$poolSizeCount, value);
    }

    public @pointer(comment="VkDescriptorPoolSize*") MemorySegment pPoolSizesRaw() {
        return segment.get(LAYOUT$pPoolSizes, OFFSET$pPoolSizes);
    }

    public void pPoolSizesRaw(@pointer(comment="VkDescriptorPoolSize*") MemorySegment value) {
        segment.set(LAYOUT$pPoolSizes, OFFSET$pPoolSizes, value);
    }

    public @Nullable VkDescriptorPoolSize pPoolSizes() {
        MemorySegment s = pPoolSizesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorPoolSize(s);
    }

    public void pPoolSizes(@Nullable VkDescriptorPoolSize value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPoolSizesRaw(s);
    }

    @unsafe public @Nullable VkDescriptorPoolSize[] pPoolSizes(int assumedCount) {
        MemorySegment s = pPoolSizesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDescriptorPoolSize.SIZE);
        VkDescriptorPoolSize[] ret = new VkDescriptorPoolSize[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorPoolSize(s.asSlice(i * VkDescriptorPoolSize.SIZE, VkDescriptorPoolSize.SIZE));
        }
        return ret;
    }

}
/// dummy, not implemented yet
