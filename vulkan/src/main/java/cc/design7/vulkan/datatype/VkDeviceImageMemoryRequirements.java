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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceImageMemoryRequirements.html">VkDeviceImageMemoryRequirements</a>
@ValueBasedCandidate
public record VkDeviceImageMemoryRequirements(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$pCreateInfo = ValueLayout.ADDRESS.withTargetLayout(VkImageCreateInfo.LAYOUT).withName("pCreateInfo");
    public static final OfInt LAYOUT$planeAspect = ValueLayout.JAVA_INT.withName("planeAspect");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$pCreateInfo, LAYOUT$planeAspect);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDeviceImageMemoryRequirements allocate(Arena arena) {
        return new VkDeviceImageMemoryRequirements(arena.allocate(LAYOUT));
    }

    public static VkDeviceImageMemoryRequirements[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceImageMemoryRequirements[] ret = new VkDeviceImageMemoryRequirements[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceImageMemoryRequirements(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceImageMemoryRequirements clone(Arena arena, VkDeviceImageMemoryRequirements src) {
        VkDeviceImageMemoryRequirements ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceImageMemoryRequirements[] clone(Arena arena, VkDeviceImageMemoryRequirements[] src) {
        VkDeviceImageMemoryRequirements[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pCreateInfo = PathElement.groupElement("PATH$pCreateInfo");
    public static final PathElement PATH$planeAspect = PathElement.groupElement("PATH$planeAspect");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pCreateInfo = LAYOUT$pCreateInfo.byteSize();
    public static final long SIZE$planeAspect = LAYOUT$planeAspect.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pCreateInfo = LAYOUT.byteOffset(PATH$pCreateInfo);
    public static final long OFFSET$planeAspect = LAYOUT.byteOffset(PATH$planeAspect);

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

    public @enumtype(VkImageAspectFlags.class) int planeAspect() {
        return segment.get(LAYOUT$planeAspect, OFFSET$planeAspect);
    }

    public void planeAspect(@enumtype(VkImageAspectFlags.class) int value) {
        segment.set(LAYOUT$planeAspect, OFFSET$planeAspect, value);
    }

}
