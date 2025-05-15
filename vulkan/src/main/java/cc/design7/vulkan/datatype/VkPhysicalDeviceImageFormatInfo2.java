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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceImageFormatInfo2.html">VkPhysicalDeviceImageFormatInfo2</a>
@ValueBasedCandidate
public record VkPhysicalDeviceImageFormatInfo2(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$format = ValueLayout.JAVA_INT.withName("format");
    public static final OfInt LAYOUT$type = ValueLayout.JAVA_INT.withName("type");
    public static final OfInt LAYOUT$tiling = ValueLayout.JAVA_INT.withName("tiling");
    public static final OfInt LAYOUT$usage = ValueLayout.JAVA_INT.withName("usage");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$format, LAYOUT$type, LAYOUT$tiling, LAYOUT$usage, LAYOUT$flags);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceImageFormatInfo2 allocate(Arena arena) {
        return new VkPhysicalDeviceImageFormatInfo2(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceImageFormatInfo2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceImageFormatInfo2[] ret = new VkPhysicalDeviceImageFormatInfo2[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceImageFormatInfo2(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceImageFormatInfo2 clone(Arena arena, VkPhysicalDeviceImageFormatInfo2 src) {
        VkPhysicalDeviceImageFormatInfo2 ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceImageFormatInfo2[] clone(Arena arena, VkPhysicalDeviceImageFormatInfo2[] src) {
        VkPhysicalDeviceImageFormatInfo2[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$format = PathElement.groupElement("PATH$format");
    public static final PathElement PATH$type = PathElement.groupElement("PATH$type");
    public static final PathElement PATH$tiling = PathElement.groupElement("PATH$tiling");
    public static final PathElement PATH$usage = PathElement.groupElement("PATH$usage");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$tiling = LAYOUT$tiling.byteSize();
    public static final long SIZE$usage = LAYOUT$usage.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$tiling = LAYOUT.byteOffset(PATH$tiling);
    public static final long OFFSET$usage = LAYOUT.byteOffset(PATH$usage);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);

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

    public @enumtype(VkFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }

    public @enumtype(VkImageType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkImageType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @enumtype(VkImageTiling.class) int tiling() {
        return segment.get(LAYOUT$tiling, OFFSET$tiling);
    }

    public void tiling(@enumtype(VkImageTiling.class) int value) {
        segment.set(LAYOUT$tiling, OFFSET$tiling, value);
    }

    public @enumtype(VkImageUsageFlags.class) int usage() {
        return segment.get(LAYOUT$usage, OFFSET$usage);
    }

    public void usage(@enumtype(VkImageUsageFlags.class) int value) {
        segment.set(LAYOUT$usage, OFFSET$usage, value);
    }

    public @enumtype(VkImageCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkImageCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

}
