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
/// typedef struct VkShadingRatePaletteNV {
///     uint32_t shadingRatePaletteEntryCount;
///     const VkShadingRatePaletteEntryNV* pShadingRatePaletteEntries;
/// } VkShadingRatePaletteNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkShadingRatePaletteNV.html">VkShadingRatePaletteNV</a>
public record VkShadingRatePaletteNV(MemorySegment segment) implements IPointer {
    public VkShadingRatePaletteNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int shadingRatePaletteEntryCount() {
        return segment.get(LAYOUT$shadingRatePaletteEntryCount, OFFSET$shadingRatePaletteEntryCount);
    }

    public void shadingRatePaletteEntryCount(@unsigned int value) {
        segment.set(LAYOUT$shadingRatePaletteEntryCount, OFFSET$shadingRatePaletteEntryCount, value);
    }

    public @pointer(target=VkShadingRatePaletteEntryNV.class) MemorySegment pShadingRatePaletteEntriesRaw() {
        return segment.get(LAYOUT$pShadingRatePaletteEntries, OFFSET$pShadingRatePaletteEntries);
    }

    public void pShadingRatePaletteEntriesRaw(@pointer(target=VkShadingRatePaletteEntryNV.class) MemorySegment value) {
        segment.set(LAYOUT$pShadingRatePaletteEntries, OFFSET$pShadingRatePaletteEntries, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or {@link IntBuffer#write}ing
    /// the buffer.
    public @nullable @enumtype(VkShadingRatePaletteEntryNV.class) IntBuffer pShadingRatePaletteEntries() {
        MemorySegment s = pShadingRatePaletteEntriesRaw();
        if (s.address() == 0) {
            return null;
        }
        
        return new IntBuffer(s);
    }

    public void pShadingRatePaletteEntries(@nullable @enumtype(VkShadingRatePaletteEntryNV.class) IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pShadingRatePaletteEntriesRaw(s);
    }

    public static VkShadingRatePaletteNV allocate(Arena arena) {
        return new VkShadingRatePaletteNV(arena.allocate(LAYOUT));
    }
    
    public static VkShadingRatePaletteNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkShadingRatePaletteNV[] ret = new VkShadingRatePaletteNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkShadingRatePaletteNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("shadingRatePaletteEntryCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pShadingRatePaletteEntries")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$shadingRatePaletteEntryCount = PathElement.groupElement("shadingRatePaletteEntryCount");
    public static final PathElement PATH$pShadingRatePaletteEntries = PathElement.groupElement("pShadingRatePaletteEntries");

    public static final OfInt LAYOUT$shadingRatePaletteEntryCount = (OfInt) LAYOUT.select(PATH$shadingRatePaletteEntryCount);
    public static final AddressLayout LAYOUT$pShadingRatePaletteEntries = (AddressLayout) LAYOUT.select(PATH$pShadingRatePaletteEntries);

    public static final long OFFSET$shadingRatePaletteEntryCount = LAYOUT.byteOffset(PATH$shadingRatePaletteEntryCount);
    public static final long OFFSET$pShadingRatePaletteEntries = LAYOUT.byteOffset(PATH$pShadingRatePaletteEntries);

    public static final long SIZE$shadingRatePaletteEntryCount = LAYOUT$shadingRatePaletteEntryCount.byteSize();
    public static final long SIZE$pShadingRatePaletteEntries = LAYOUT$pShadingRatePaletteEntries.byteSize();
}
