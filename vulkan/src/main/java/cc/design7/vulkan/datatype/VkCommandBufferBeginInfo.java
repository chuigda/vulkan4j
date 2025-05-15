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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCommandBufferBeginInfo.html">VkCommandBufferBeginInfo</a>
@ValueBasedCandidate
public record VkCommandBufferBeginInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final AddressLayout LAYOUT$pInheritanceInfo = ValueLayout.ADDRESS.withTargetLayout(VkCommandBufferInheritanceInfo.LAYOUT).withName("pInheritanceInfo");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$pInheritanceInfo);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkCommandBufferBeginInfo allocate(Arena arena) {
        return new VkCommandBufferBeginInfo(arena.allocate(LAYOUT));
    }

    public static VkCommandBufferBeginInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCommandBufferBeginInfo[] ret = new VkCommandBufferBeginInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCommandBufferBeginInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkCommandBufferBeginInfo clone(Arena arena, VkCommandBufferBeginInfo src) {
        VkCommandBufferBeginInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCommandBufferBeginInfo[] clone(Arena arena, VkCommandBufferBeginInfo[] src) {
        VkCommandBufferBeginInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$pInheritanceInfo = PathElement.groupElement("PATH$pInheritanceInfo");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pInheritanceInfo = LAYOUT$pInheritanceInfo.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pInheritanceInfo = LAYOUT.byteOffset(PATH$pInheritanceInfo);

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

    public @enumtype(VkCommandBufferUsageFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkCommandBufferUsageFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="VkCommandBufferInheritanceInfo*") MemorySegment pInheritanceInfoRaw() {
        return segment.get(LAYOUT$pInheritanceInfo, OFFSET$pInheritanceInfo);
    }

    public void pInheritanceInfoRaw(@pointer(comment="VkCommandBufferInheritanceInfo*") MemorySegment value) {
        segment.set(LAYOUT$pInheritanceInfo, OFFSET$pInheritanceInfo, value);
    }

    public @Nullable VkCommandBufferInheritanceInfo pInheritanceInfo() {
        MemorySegment s = pInheritanceInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkCommandBufferInheritanceInfo(s);
    }

    public void pInheritanceInfo(@Nullable VkCommandBufferInheritanceInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pInheritanceInfoRaw(s);
    }

    @unsafe public @Nullable VkCommandBufferInheritanceInfo[] pInheritanceInfo(int assumedCount) {
        MemorySegment s = pInheritanceInfoRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkCommandBufferInheritanceInfo.SIZE);
        VkCommandBufferInheritanceInfo[] ret = new VkCommandBufferInheritanceInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkCommandBufferInheritanceInfo(s.asSlice(i * VkCommandBufferInheritanceInfo.SIZE, VkCommandBufferInheritanceInfo.SIZE));
        }
        return ret;
    }

}
