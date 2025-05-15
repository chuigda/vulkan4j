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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineCacheCreateInfo.html">VkPipelineCacheCreateInfo</a>
@ValueBasedCandidate
public record VkPipelineCacheCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final ValueLayout LAYOUT$initialDataSize = NativeLayout.C_SIZE_T.withName("initialDataSize");
    public static final AddressLayout LAYOUT$pInitialData = ValueLayout.ADDRESS.withName("pInitialData");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$initialDataSize, LAYOUT$pInitialData);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineCacheCreateInfo allocate(Arena arena) {
        return new VkPipelineCacheCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkPipelineCacheCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineCacheCreateInfo[] ret = new VkPipelineCacheCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineCacheCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineCacheCreateInfo clone(Arena arena, VkPipelineCacheCreateInfo src) {
        VkPipelineCacheCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineCacheCreateInfo[] clone(Arena arena, VkPipelineCacheCreateInfo[] src) {
        VkPipelineCacheCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$initialDataSize = PathElement.groupElement("PATH$initialDataSize");
    public static final PathElement PATH$pInitialData = PathElement.groupElement("PATH$pInitialData");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$initialDataSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$pInitialData = LAYOUT$pInitialData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$initialDataSize = LAYOUT.byteOffset(PATH$initialDataSize);
    public static final long OFFSET$pInitialData = LAYOUT.byteOffset(PATH$pInitialData);

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

    public @enumtype(VkPipelineCacheCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineCacheCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned long initialDataSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$initialDataSize);
    }

    public void initialDataSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$initialDataSize, value);
    }

    public @pointer(comment="void*") MemorySegment pInitialData() {
        return segment.get(LAYOUT$pInitialData, OFFSET$pInitialData);
    }

    public void pInitialData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pInitialData, OFFSET$pInitialData, value);
    }

    public void pInitialData(IPointer pointer) {
        pInitialData(pointer.segment());
    }

}
