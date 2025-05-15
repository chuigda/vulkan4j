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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceImageSubresourceInfo.html">VkDeviceImageSubresourceInfo</a>
@ValueBasedCandidate
public record VkDeviceImageSubresourceInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$pCreateInfo = ValueLayout.ADDRESS.withTargetLayout(VkImageCreateInfo.LAYOUT).withName("pCreateInfo");
    public static final AddressLayout LAYOUT$pSubresource = ValueLayout.ADDRESS.withTargetLayout(VkImageSubresource2.LAYOUT).withName("pSubresource");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$pCreateInfo, LAYOUT$pSubresource);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDeviceImageSubresourceInfo allocate(Arena arena) {
        return new VkDeviceImageSubresourceInfo(arena.allocate(LAYOUT));
    }

    public static VkDeviceImageSubresourceInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceImageSubresourceInfo[] ret = new VkDeviceImageSubresourceInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceImageSubresourceInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceImageSubresourceInfo clone(Arena arena, VkDeviceImageSubresourceInfo src) {
        VkDeviceImageSubresourceInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceImageSubresourceInfo[] clone(Arena arena, VkDeviceImageSubresourceInfo[] src) {
        VkDeviceImageSubresourceInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pCreateInfo = PathElement.groupElement("PATH$pCreateInfo");
    public static final PathElement PATH$pSubresource = PathElement.groupElement("PATH$pSubresource");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pCreateInfo = LAYOUT$pCreateInfo.byteSize();
    public static final long SIZE$pSubresource = LAYOUT$pSubresource.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pCreateInfo = LAYOUT.byteOffset(PATH$pCreateInfo);
    public static final long OFFSET$pSubresource = LAYOUT.byteOffset(PATH$pSubresource);

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

    public @pointer(comment="VkImageCreateInfo*") MemorySegment pCreateInfoRaw() {
        return segment.get(LAYOUT$pCreateInfo, OFFSET$pCreateInfo);
    }

    public void pCreateInfoRaw(@pointer(comment="VkImageCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pCreateInfo, OFFSET$pCreateInfo, value);
    }

    public @Nullable VkImageCreateInfo pCreateInfo() {
        MemorySegment s = pCreateInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkImageCreateInfo(s);
    }

    public void pCreateInfo(@Nullable VkImageCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCreateInfoRaw(s);
    }

    @unsafe public @Nullable VkImageCreateInfo[] pCreateInfo(int assumedCount) {
        MemorySegment s = pCreateInfoRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkImageCreateInfo.SIZE);
        VkImageCreateInfo[] ret = new VkImageCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkImageCreateInfo(s.asSlice(i * VkImageCreateInfo.SIZE, VkImageCreateInfo.SIZE));
        }
        return ret;
    }

    public @pointer(comment="VkImageSubresource2*") MemorySegment pSubresourceRaw() {
        return segment.get(LAYOUT$pSubresource, OFFSET$pSubresource);
    }

    public void pSubresourceRaw(@pointer(comment="VkImageSubresource2*") MemorySegment value) {
        segment.set(LAYOUT$pSubresource, OFFSET$pSubresource, value);
    }

    public @Nullable VkImageSubresource2 pSubresource() {
        MemorySegment s = pSubresourceRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkImageSubresource2(s);
    }

    public void pSubresource(@Nullable VkImageSubresource2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSubresourceRaw(s);
    }

    @unsafe public @Nullable VkImageSubresource2[] pSubresource(int assumedCount) {
        MemorySegment s = pSubresourceRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkImageSubresource2.SIZE);
        VkImageSubresource2[] ret = new VkImageSubresource2[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkImageSubresource2(s.asSlice(i * VkImageSubresource2.SIZE, VkImageSubresource2.SIZE));
        }
        return ret;
    }

}
