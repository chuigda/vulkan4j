package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPushConstantsInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineLayout layout;
///     VkShaderStageFlags stageFlags;
///     uint32_t offset;
///     uint32_t size;
///     const void* pValues;
/// } VkPushConstantsInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPushConstantsInfoKHR.html">VkPushConstantsInfoKHR</a>
public record VkPushConstantsInfoKHR(MemorySegment segment) implements IPointer {
    public VkPushConstantsInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PUSH_CONSTANTS_INFO_KHR);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @Nullable VkPipelineLayout layout() {
        MemorySegment s = segment.get(LAYOUT$layout, OFFSET$layout);
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineLayout(s);
    }

    public void layout(@Nullable VkPipelineLayout value) {
        segment.set(
            LAYOUT$layout,
            OFFSET$layout,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @enumtype(VkShaderStageFlags.class) int stageFlags() {
        return segment.get(LAYOUT$stageFlags, OFFSET$stageFlags);
    }

    public void stageFlags(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$stageFlags, OFFSET$stageFlags, value);
    }

    public @unsigned int offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@unsigned int value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }

    public @unsigned int size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned int value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @pointer(comment="void*") MemorySegment pValues() {
        return segment.get(LAYOUT$pValues, OFFSET$pValues);
    }

    public void pValues(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pValues, OFFSET$pValues, value);
    }

    public void pValues(@Nullable IPointer pointer) {
        pValues(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public static VkPushConstantsInfoKHR allocate(Arena arena) {
        return new VkPushConstantsInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkPushConstantsInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPushConstantsInfoKHR[] ret = new VkPushConstantsInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPushConstantsInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPushConstantsInfoKHR clone(Arena arena, VkPushConstantsInfoKHR src) {
        VkPushConstantsInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPushConstantsInfoKHR[] clone(Arena arena, VkPushConstantsInfoKHR[] src) {
        VkPushConstantsInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.JAVA_INT.withName("offset"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.ADDRESS.withName("pValues")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$layout = PathElement.groupElement("layout");
    public static final PathElement PATH$stageFlags = PathElement.groupElement("stageFlags");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$pValues = PathElement.groupElement("pValues");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$layout = (AddressLayout) LAYOUT.select(PATH$layout);
    public static final OfInt LAYOUT$stageFlags = (OfInt) LAYOUT.select(PATH$stageFlags);
    public static final OfInt LAYOUT$offset = (OfInt) LAYOUT.select(PATH$offset);
    public static final OfInt LAYOUT$size = (OfInt) LAYOUT.select(PATH$size);
    public static final AddressLayout LAYOUT$pValues = (AddressLayout) LAYOUT.select(PATH$pValues);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
    public static final long OFFSET$stageFlags = LAYOUT.byteOffset(PATH$stageFlags);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$pValues = LAYOUT.byteOffset(PATH$pValues);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$layout = LAYOUT$layout.byteSize();
    public static final long SIZE$stageFlags = LAYOUT$stageFlags.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$pValues = LAYOUT$pValues.byteSize();
}
