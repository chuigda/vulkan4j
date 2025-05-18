package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkShadingRatePaletteNV.html"><code>VkShadingRatePaletteNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkShadingRatePaletteNV {
///     uint32_t shadingRatePaletteEntryCount; // @link substring="shadingRatePaletteEntryCount" target="#shadingRatePaletteEntryCount"
///     VkShadingRatePaletteEntryNV const* pShadingRatePaletteEntries; // @link substring="VkShadingRatePaletteEntryNV" target="VkShadingRatePaletteEntryNV" @link substring="pShadingRatePaletteEntries" target="#pShadingRatePaletteEntries"
/// } VkShadingRatePaletteNV;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkShadingRatePaletteNV.html"><code>VkShadingRatePaletteNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkShadingRatePaletteNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkShadingRatePaletteNV allocate(Arena arena) {
        return new VkShadingRatePaletteNV(arena.allocate(LAYOUT));
    }

    public static VkShadingRatePaletteNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkShadingRatePaletteNV[] ret = new VkShadingRatePaletteNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkShadingRatePaletteNV(segment.asSlice(i * BYTES, BYTES));
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

    public @unsigned int shadingRatePaletteEntryCount() {
        return segment.get(LAYOUT$shadingRatePaletteEntryCount, OFFSET$shadingRatePaletteEntryCount);
    }

    public void shadingRatePaletteEntryCount(@unsigned int value) {
        segment.set(LAYOUT$shadingRatePaletteEntryCount, OFFSET$shadingRatePaletteEntryCount, value);
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkShadingRatePaletteEntryNV.class) IntPtr pShadingRatePaletteEntries() {
        MemorySegment s = pShadingRatePaletteEntriesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pShadingRatePaletteEntries(@Nullable @enumtype(VkShadingRatePaletteEntryNV.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pShadingRatePaletteEntriesRaw(s);
    }

    public @pointer(target=VkShadingRatePaletteEntryNV.class) MemorySegment pShadingRatePaletteEntriesRaw() {
        return segment.get(LAYOUT$pShadingRatePaletteEntries, OFFSET$pShadingRatePaletteEntries);
    }

    public void pShadingRatePaletteEntriesRaw(@pointer(target=VkShadingRatePaletteEntryNV.class) MemorySegment value) {
        segment.set(LAYOUT$pShadingRatePaletteEntries, OFFSET$pShadingRatePaletteEntries, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("shadingRatePaletteEntryCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pShadingRatePaletteEntries")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$shadingRatePaletteEntryCount = PathElement.groupElement("PATH$shadingRatePaletteEntryCount");
    public static final PathElement PATH$pShadingRatePaletteEntries = PathElement.groupElement("PATH$pShadingRatePaletteEntries");

    public static final OfInt LAYOUT$shadingRatePaletteEntryCount = (OfInt) LAYOUT.select(PATH$shadingRatePaletteEntryCount);
    public static final AddressLayout LAYOUT$pShadingRatePaletteEntries = (AddressLayout) LAYOUT.select(PATH$pShadingRatePaletteEntries);

    public static final long SIZE$shadingRatePaletteEntryCount = LAYOUT$shadingRatePaletteEntryCount.byteSize();
    public static final long SIZE$pShadingRatePaletteEntries = LAYOUT$pShadingRatePaletteEntries.byteSize();

    public static final long OFFSET$shadingRatePaletteEntryCount = LAYOUT.byteOffset(PATH$shadingRatePaletteEntryCount);
    public static final long OFFSET$pShadingRatePaletteEntries = LAYOUT.byteOffset(PATH$pShadingRatePaletteEntries);
}
