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
/// typedef struct VkWriteDescriptorSetInlineUniformBlock {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t dataSize;
///     const void* pData;
/// } VkWriteDescriptorSetInlineUniformBlock;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkWriteDescriptorSetInlineUniformBlock.html">VkWriteDescriptorSetInlineUniformBlock</a>
public record VkWriteDescriptorSetInlineUniformBlock(MemorySegment segment) implements IPointer {
    public VkWriteDescriptorSetInlineUniformBlock(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK);
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

    public @unsigned int dataSize() {
        return segment.get(LAYOUT$dataSize, OFFSET$dataSize);
    }

    public void dataSize(@unsigned int value) {
        segment.set(LAYOUT$dataSize, OFFSET$dataSize, value);
    }

    public @pointer(comment="void*") MemorySegment pData() {
        return segment.get(LAYOUT$pData, OFFSET$pData);
    }

    public void pData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pData, OFFSET$pData, value);
    }

    public void pData(@Nullable IPointer pointer) {
        pData(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public static VkWriteDescriptorSetInlineUniformBlock allocate(Arena arena) {
        return new VkWriteDescriptorSetInlineUniformBlock(arena.allocate(LAYOUT));
    }

    public static VkWriteDescriptorSetInlineUniformBlock[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkWriteDescriptorSetInlineUniformBlock[] ret = new VkWriteDescriptorSetInlineUniformBlock[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkWriteDescriptorSetInlineUniformBlock(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkWriteDescriptorSetInlineUniformBlock clone(Arena arena, VkWriteDescriptorSetInlineUniformBlock src) {
        VkWriteDescriptorSetInlineUniformBlock ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkWriteDescriptorSetInlineUniformBlock[] clone(Arena arena, VkWriteDescriptorSetInlineUniformBlock[] src) {
        VkWriteDescriptorSetInlineUniformBlock[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$dataSize = PathElement.groupElement("dataSize");
    public static final PathElement PATH$pData = PathElement.groupElement("pData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$dataSize = (OfInt) LAYOUT.select(PATH$dataSize);
    public static final AddressLayout LAYOUT$pData = (AddressLayout) LAYOUT.select(PATH$pData);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$dataSize = LAYOUT.byteOffset(PATH$dataSize);
    public static final long OFFSET$pData = LAYOUT.byteOffset(PATH$pData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$dataSize = LAYOUT$dataSize.byteSize();
    public static final long SIZE$pData = LAYOUT$pData.byteSize();
}
