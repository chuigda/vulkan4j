package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkSubpassFragmentDensityMapOffsetEndInfoQCOM {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t fragmentDensityOffsetCount;
///     const VkOffset2D* pFragmentDensityOffsets;
/// } VkSubpassFragmentDensityMapOffsetEndInfoQCOM;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSubpassFragmentDensityMapOffsetEndInfoQCOM.html">VkSubpassFragmentDensityMapOffsetEndInfoQCOM</a>
public record VkSubpassFragmentDensityMapOffsetEndInfoQCOM(MemorySegment segment) implements IPointer {
    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SUBPASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_QCOM);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int fragmentDensityOffsetCount() {
        return segment.get(LAYOUT$fragmentDensityOffsetCount, OFFSET$fragmentDensityOffsetCount);
    }

    public void fragmentDensityOffsetCount(@unsigned int value) {
        segment.set(LAYOUT$fragmentDensityOffsetCount, OFFSET$fragmentDensityOffsetCount, value);
    }

    public @pointer(comment="VkOffset2D*") MemorySegment pFragmentDensityOffsetsRaw() {
        return segment.get(LAYOUT$pFragmentDensityOffsets, OFFSET$pFragmentDensityOffsets);
    }

    public void pFragmentDensityOffsetsRaw(@pointer(comment="VkOffset2D*") MemorySegment value) {
        segment.set(LAYOUT$pFragmentDensityOffsets, OFFSET$pFragmentDensityOffsets, value);
    }

    public @nullable VkOffset2D pFragmentDensityOffsets() {
        MemorySegment s = pFragmentDensityOffsetsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkOffset2D(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkOffset2D[] pFragmentDensityOffsets(int assumedCount) {
        MemorySegment s = pFragmentDensityOffsetsRaw().reinterpret(assumedCount * VkOffset2D.SIZE);
        VkOffset2D[] arr = new VkOffset2D[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkOffset2D(s.asSlice(i * VkOffset2D.SIZE, VkOffset2D.SIZE));
        }
        return arr;
    }

    public void pFragmentDensityOffsets(@nullable VkOffset2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pFragmentDensityOffsetsRaw(s);
    }

    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM allocate(Arena arena) {
        return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(arena.allocate(LAYOUT));
    }
    
    public static VkSubpassFragmentDensityMapOffsetEndInfoQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSubpassFragmentDensityMapOffsetEndInfoQCOM[] ret = new VkSubpassFragmentDensityMapOffsetEndInfoQCOM[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentDensityOffsetCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkOffset2D.LAYOUT).withName("pFragmentDensityOffsets")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$fragmentDensityOffsetCount = PathElement.groupElement("fragmentDensityOffsetCount");
    public static final PathElement PATH$pFragmentDensityOffsets = PathElement.groupElement("pFragmentDensityOffsets");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$fragmentDensityOffsetCount = (OfInt) LAYOUT.select(PATH$fragmentDensityOffsetCount);
    public static final AddressLayout LAYOUT$pFragmentDensityOffsets = (AddressLayout) LAYOUT.select(PATH$pFragmentDensityOffsets);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentDensityOffsetCount = LAYOUT.byteOffset(PATH$fragmentDensityOffsetCount);
    public static final long OFFSET$pFragmentDensityOffsets = LAYOUT.byteOffset(PATH$pFragmentDensityOffsets);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$fragmentDensityOffsetCount = LAYOUT$fragmentDensityOffsetCount.byteSize();
    public static final long SIZE$pFragmentDensityOffsets = LAYOUT$pFragmentDensityOffsets.byteSize();

}
