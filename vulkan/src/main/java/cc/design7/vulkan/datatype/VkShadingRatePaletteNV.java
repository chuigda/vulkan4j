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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkShadingRatePaletteNV.html">VkShadingRatePaletteNV</a>
@ValueBasedCandidate
public record VkShadingRatePaletteNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$shadingRatePaletteEntryCount = ValueLayout.JAVA_INT.withName("shadingRatePaletteEntryCount");
    public static final AddressLayout LAYOUT$pShadingRatePaletteEntries = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pShadingRatePaletteEntries");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$shadingRatePaletteEntryCount, LAYOUT$pShadingRatePaletteEntries);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkShadingRatePaletteNV allocate(Arena arena) {
        return new VkShadingRatePaletteNV(arena.allocate(LAYOUT));
    }

    public static VkShadingRatePaletteNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkShadingRatePaletteNV[] ret = new VkShadingRatePaletteNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkShadingRatePaletteNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkShadingRatePaletteNV clone(Arena arena, VkShadingRatePaletteNV src) {
        VkShadingRatePaletteNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkShadingRatePaletteNV[] clone(Arena arena, VkShadingRatePaletteNV[] src) {
        VkShadingRatePaletteNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$shadingRatePaletteEntryCount = PathElement.groupElement("PATH$shadingRatePaletteEntryCount");
    public static final PathElement PATH$pShadingRatePaletteEntries = PathElement.groupElement("PATH$pShadingRatePaletteEntries");

    public static final long SIZE$shadingRatePaletteEntryCount = LAYOUT$shadingRatePaletteEntryCount.byteSize();
    public static final long SIZE$pShadingRatePaletteEntries = LAYOUT$pShadingRatePaletteEntries.byteSize();

    public static final long OFFSET$shadingRatePaletteEntryCount = LAYOUT.byteOffset(PATH$shadingRatePaletteEntryCount);
    public static final long OFFSET$pShadingRatePaletteEntries = LAYOUT.byteOffset(PATH$pShadingRatePaletteEntries);

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

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkShadingRatePaletteEntryNV.class) IntPtr pShadingRatePaletteEntries() {
        MemorySegment s = pShadingRatePaletteEntriesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pShadingRatePaletteEntries(@Nullable @enumtype(VkShadingRatePaletteEntryNV.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pShadingRatePaletteEntriesRaw(s);
    }

}
