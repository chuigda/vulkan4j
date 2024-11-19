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
/// typedef struct VkOpticalFlowSessionCreatePrivateDataInfoNV {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t id;
///     uint32_t size;
///     const void* pPrivateData;
/// } VkOpticalFlowSessionCreatePrivateDataInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkOpticalFlowSessionCreatePrivateDataInfoNV.html">VkOpticalFlowSessionCreatePrivateDataInfoNV</a>
public record VkOpticalFlowSessionCreatePrivateDataInfoNV(MemorySegment segment) implements IPointer {
    public VkOpticalFlowSessionCreatePrivateDataInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV);
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

    public @unsigned int id() {
        return segment.get(LAYOUT$id, OFFSET$id);
    }

    public void id(@unsigned int value) {
        segment.set(LAYOUT$id, OFFSET$id, value);
    }

    public @unsigned int size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned int value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @pointer(comment="void*") MemorySegment pPrivateData() {
        return segment.get(LAYOUT$pPrivateData, OFFSET$pPrivateData);
    }

    public void pPrivateData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pPrivateData, OFFSET$pPrivateData, value);
    }

    public void pPrivateData(@Nullable IPointer pointer) {
        pPrivateData(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public static VkOpticalFlowSessionCreatePrivateDataInfoNV allocate(Arena arena) {
        return new VkOpticalFlowSessionCreatePrivateDataInfoNV(arena.allocate(LAYOUT));
    }

    public static VkOpticalFlowSessionCreatePrivateDataInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkOpticalFlowSessionCreatePrivateDataInfoNV[] ret = new VkOpticalFlowSessionCreatePrivateDataInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkOpticalFlowSessionCreatePrivateDataInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkOpticalFlowSessionCreatePrivateDataInfoNV clone(Arena arena, VkOpticalFlowSessionCreatePrivateDataInfoNV src) {
        VkOpticalFlowSessionCreatePrivateDataInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkOpticalFlowSessionCreatePrivateDataInfoNV[] clone(Arena arena, VkOpticalFlowSessionCreatePrivateDataInfoNV[] src) {
        VkOpticalFlowSessionCreatePrivateDataInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("id"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.ADDRESS.withName("pPrivateData")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$id = PathElement.groupElement("id");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$pPrivateData = PathElement.groupElement("pPrivateData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$id = (OfInt) LAYOUT.select(PATH$id);
    public static final OfInt LAYOUT$size = (OfInt) LAYOUT.select(PATH$size);
    public static final AddressLayout LAYOUT$pPrivateData = (AddressLayout) LAYOUT.select(PATH$pPrivateData);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$id = LAYOUT.byteOffset(PATH$id);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$pPrivateData = LAYOUT.byteOffset(PATH$pPrivateData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$id = LAYOUT$id.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$pPrivateData = LAYOUT$pPrivateData.byteSize();
}
