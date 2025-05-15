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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoFormatPropertiesKHR.html">VkVideoFormatPropertiesKHR</a>
@ValueBasedCandidate
public record VkVideoFormatPropertiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$format = ValueLayout.JAVA_INT.withName("format");
    public static final StructLayout LAYOUT$componentMapping = VkComponentMapping.LAYOUT.withName("componentMapping");
    public static final OfInt LAYOUT$imageCreateFlags = ValueLayout.JAVA_INT.withName("imageCreateFlags");
    public static final OfInt LAYOUT$imageType = ValueLayout.JAVA_INT.withName("imageType");
    public static final OfInt LAYOUT$imageTiling = ValueLayout.JAVA_INT.withName("imageTiling");
    public static final OfInt LAYOUT$imageUsageFlags = ValueLayout.JAVA_INT.withName("imageUsageFlags");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$format, LAYOUT$componentMapping, LAYOUT$imageCreateFlags, LAYOUT$imageType, LAYOUT$imageTiling, LAYOUT$imageUsageFlags);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoFormatPropertiesKHR allocate(Arena arena) {
        return new VkVideoFormatPropertiesKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoFormatPropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoFormatPropertiesKHR[] ret = new VkVideoFormatPropertiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoFormatPropertiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoFormatPropertiesKHR clone(Arena arena, VkVideoFormatPropertiesKHR src) {
        VkVideoFormatPropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoFormatPropertiesKHR[] clone(Arena arena, VkVideoFormatPropertiesKHR[] src) {
        VkVideoFormatPropertiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$format = PathElement.groupElement("PATH$format");
    public static final PathElement PATH$componentMapping = PathElement.groupElement("PATH$componentMapping");
    public static final PathElement PATH$imageCreateFlags = PathElement.groupElement("PATH$imageCreateFlags");
    public static final PathElement PATH$imageType = PathElement.groupElement("PATH$imageType");
    public static final PathElement PATH$imageTiling = PathElement.groupElement("PATH$imageTiling");
    public static final PathElement PATH$imageUsageFlags = PathElement.groupElement("PATH$imageUsageFlags");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$componentMapping = LAYOUT$componentMapping.byteSize();
    public static final long SIZE$imageCreateFlags = LAYOUT$imageCreateFlags.byteSize();
    public static final long SIZE$imageType = LAYOUT$imageType.byteSize();
    public static final long SIZE$imageTiling = LAYOUT$imageTiling.byteSize();
    public static final long SIZE$imageUsageFlags = LAYOUT$imageUsageFlags.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$componentMapping = LAYOUT.byteOffset(PATH$componentMapping);
    public static final long OFFSET$imageCreateFlags = LAYOUT.byteOffset(PATH$imageCreateFlags);
    public static final long OFFSET$imageType = LAYOUT.byteOffset(PATH$imageType);
    public static final long OFFSET$imageTiling = LAYOUT.byteOffset(PATH$imageTiling);
    public static final long OFFSET$imageUsageFlags = LAYOUT.byteOffset(PATH$imageUsageFlags);

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

    public VkComponentMapping componentMapping() {
        return new VkComponentMapping(segment.asSlice(OFFSET$componentMapping, LAYOUT$componentMapping));
    }

    public void componentMapping(VkComponentMapping value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$componentMapping, SIZE$componentMapping);
    }

    public @enumtype(VkImageCreateFlags.class) int imageCreateFlags() {
        return segment.get(LAYOUT$imageCreateFlags, OFFSET$imageCreateFlags);
    }

    public void imageCreateFlags(@enumtype(VkImageCreateFlags.class) int value) {
        segment.set(LAYOUT$imageCreateFlags, OFFSET$imageCreateFlags, value);
    }

    public @enumtype(VkImageType.class) int imageType() {
        return segment.get(LAYOUT$imageType, OFFSET$imageType);
    }

    public void imageType(@enumtype(VkImageType.class) int value) {
        segment.set(LAYOUT$imageType, OFFSET$imageType, value);
    }

    public @enumtype(VkImageTiling.class) int imageTiling() {
        return segment.get(LAYOUT$imageTiling, OFFSET$imageTiling);
    }

    public void imageTiling(@enumtype(VkImageTiling.class) int value) {
        segment.set(LAYOUT$imageTiling, OFFSET$imageTiling, value);
    }

    public @enumtype(VkImageUsageFlags.class) int imageUsageFlags() {
        return segment.get(LAYOUT$imageUsageFlags, OFFSET$imageUsageFlags);
    }

    public void imageUsageFlags(@enumtype(VkImageUsageFlags.class) int value) {
        segment.set(LAYOUT$imageUsageFlags, OFFSET$imageUsageFlags, value);
    }

}
