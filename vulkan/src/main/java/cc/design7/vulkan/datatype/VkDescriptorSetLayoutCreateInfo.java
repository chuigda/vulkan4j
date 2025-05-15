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

public record VkDescriptorSetLayoutCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$bindingCount = ValueLayout.JAVA_INT.withName("bindingCount");
    public static final AddressLayout LAYOUT$pBindings = ValueLayout.ADDRESS.withTargetLayout(VkDescriptorSetLayoutBinding.LAYOUT).withName("pBindings");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$bindingCount, LAYOUT$pBindings);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDescriptorSetLayoutCreateInfo allocate(Arena arena) {
        return new VkDescriptorSetLayoutCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkDescriptorSetLayoutCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorSetLayoutCreateInfo[] ret = new VkDescriptorSetLayoutCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDescriptorSetLayoutCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDescriptorSetLayoutCreateInfo clone(Arena arena, VkDescriptorSetLayoutCreateInfo src) {
        VkDescriptorSetLayoutCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorSetLayoutCreateInfo[] clone(Arena arena, VkDescriptorSetLayoutCreateInfo[] src) {
        VkDescriptorSetLayoutCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$bindingCount = PathElement.groupElement("PATH$bindingCount");
    public static final PathElement PATH$pBindings = PathElement.groupElement("PATH$pBindings");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$bindingCount = LAYOUT$bindingCount.byteSize();
    public static final long SIZE$pBindings = LAYOUT$pBindings.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$bindingCount = LAYOUT.byteOffset(PATH$bindingCount);
    public static final long OFFSET$pBindings = LAYOUT.byteOffset(PATH$pBindings);

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

    public @enumtype(VkDescriptorSetLayoutCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDescriptorSetLayoutCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int bindingCount() {
        return segment.get(LAYOUT$bindingCount, OFFSET$bindingCount);
    }

    public void bindingCount(@unsigned int value) {
        segment.set(LAYOUT$bindingCount, OFFSET$bindingCount, value);
    }

    public @pointer(comment="VkDescriptorSetLayoutBinding*") MemorySegment pBindingsRaw() {
        return segment.get(LAYOUT$pBindings, OFFSET$pBindings);
    }

    public void pBindingsRaw(@pointer(comment="VkDescriptorSetLayoutBinding*") MemorySegment value) {
        segment.set(LAYOUT$pBindings, OFFSET$pBindings, value);
    }

    public @Nullable VkDescriptorSetLayoutBinding pBindings() {
        MemorySegment s = pBindingsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorSetLayoutBinding(s);
    }

    public void pBindings(@Nullable VkDescriptorSetLayoutBinding value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBindingsRaw(s);
    }

    @unsafe public @Nullable VkDescriptorSetLayoutBinding[] pBindings(int assumedCount) {
        MemorySegment s = pBindingsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDescriptorSetLayoutBinding.SIZE);
        VkDescriptorSetLayoutBinding[] ret = new VkDescriptorSetLayoutBinding[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorSetLayoutBinding(s.asSlice(i * VkDescriptorSetLayoutBinding.SIZE, VkDescriptorSetLayoutBinding.SIZE));
        }
        return ret;
    }

}
/// dummy, not implemented yet
