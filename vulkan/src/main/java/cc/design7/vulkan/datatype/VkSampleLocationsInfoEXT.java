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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSampleLocationsInfoEXT.html">VkSampleLocationsInfoEXT</a>
@ValueBasedCandidate
public record VkSampleLocationsInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$sampleLocationsPerPixel = ValueLayout.JAVA_INT.withName("sampleLocationsPerPixel");
    public static final StructLayout LAYOUT$sampleLocationGridSize = VkExtent2D.LAYOUT.withName("sampleLocationGridSize");
    public static final OfInt LAYOUT$sampleLocationsCount = ValueLayout.JAVA_INT.withName("sampleLocationsCount");
    public static final AddressLayout LAYOUT$pSampleLocations = ValueLayout.ADDRESS.withTargetLayout(VkSampleLocationEXT.LAYOUT).withName("pSampleLocations");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$sampleLocationsPerPixel, LAYOUT$sampleLocationGridSize, LAYOUT$sampleLocationsCount, LAYOUT$pSampleLocations);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSampleLocationsInfoEXT allocate(Arena arena) {
        return new VkSampleLocationsInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkSampleLocationsInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSampleLocationsInfoEXT[] ret = new VkSampleLocationsInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSampleLocationsInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSampleLocationsInfoEXT clone(Arena arena, VkSampleLocationsInfoEXT src) {
        VkSampleLocationsInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSampleLocationsInfoEXT[] clone(Arena arena, VkSampleLocationsInfoEXT[] src) {
        VkSampleLocationsInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$sampleLocationsPerPixel = PathElement.groupElement("PATH$sampleLocationsPerPixel");
    public static final PathElement PATH$sampleLocationGridSize = PathElement.groupElement("PATH$sampleLocationGridSize");
    public static final PathElement PATH$sampleLocationsCount = PathElement.groupElement("PATH$sampleLocationsCount");
    public static final PathElement PATH$pSampleLocations = PathElement.groupElement("PATH$pSampleLocations");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$sampleLocationsPerPixel = LAYOUT$sampleLocationsPerPixel.byteSize();
    public static final long SIZE$sampleLocationGridSize = LAYOUT$sampleLocationGridSize.byteSize();
    public static final long SIZE$sampleLocationsCount = LAYOUT$sampleLocationsCount.byteSize();
    public static final long SIZE$pSampleLocations = LAYOUT$pSampleLocations.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sampleLocationsPerPixel = LAYOUT.byteOffset(PATH$sampleLocationsPerPixel);
    public static final long OFFSET$sampleLocationGridSize = LAYOUT.byteOffset(PATH$sampleLocationGridSize);
    public static final long OFFSET$sampleLocationsCount = LAYOUT.byteOffset(PATH$sampleLocationsCount);
    public static final long OFFSET$pSampleLocations = LAYOUT.byteOffset(PATH$pSampleLocations);

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

    public @enumtype(VkSampleCountFlags.class) int sampleLocationsPerPixel() {
        return segment.get(LAYOUT$sampleLocationsPerPixel, OFFSET$sampleLocationsPerPixel);
    }

    public void sampleLocationsPerPixel(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$sampleLocationsPerPixel, OFFSET$sampleLocationsPerPixel, value);
    }

    public VkExtent2D sampleLocationGridSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$sampleLocationGridSize, LAYOUT$sampleLocationGridSize));
    }

    public void sampleLocationGridSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sampleLocationGridSize, SIZE$sampleLocationGridSize);
    }

    public @unsigned int sampleLocationsCount() {
        return segment.get(LAYOUT$sampleLocationsCount, OFFSET$sampleLocationsCount);
    }

    public void sampleLocationsCount(@unsigned int value) {
        segment.set(LAYOUT$sampleLocationsCount, OFFSET$sampleLocationsCount, value);
    }

    public @pointer(comment="VkSampleLocationEXT*") MemorySegment pSampleLocationsRaw() {
        return segment.get(LAYOUT$pSampleLocations, OFFSET$pSampleLocations);
    }

    public void pSampleLocationsRaw(@pointer(comment="VkSampleLocationEXT*") MemorySegment value) {
        segment.set(LAYOUT$pSampleLocations, OFFSET$pSampleLocations, value);
    }

    public @Nullable VkSampleLocationEXT pSampleLocations() {
        MemorySegment s = pSampleLocationsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSampleLocationEXT(s);
    }

    public void pSampleLocations(@Nullable VkSampleLocationEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSampleLocationsRaw(s);
    }

    @unsafe public @Nullable VkSampleLocationEXT[] pSampleLocations(int assumedCount) {
        MemorySegment s = pSampleLocationsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSampleLocationEXT.SIZE);
        VkSampleLocationEXT[] ret = new VkSampleLocationEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSampleLocationEXT(s.asSlice(i * VkSampleLocationEXT.SIZE, VkSampleLocationEXT.SIZE));
        }
        return ret;
    }

}
