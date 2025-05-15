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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAntiLagDataAMD.html"><code>VkAntiLagDataAMD</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAntiLagDataAMD {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkAntiLagModeAMD mode;
///     uint32_t maxFPS;
///     VkAntiLagPresentationInfoAMD const* pPresentationInfo; // optional
/// } VkAntiLagDataAMD;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_ANTI_LAG_DATA_AMD`
///
/// The {@link VkAntiLagDataAMD#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkAntiLagDataAMD#autoInit} to initialize these fields manually for
/// non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAntiLagDataAMD.html"><code>VkAntiLagDataAMD</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAntiLagDataAMD(@NotNull MemorySegment segment) implements IPointer {
    public static VkAntiLagDataAMD allocate(Arena arena) {
        VkAntiLagDataAMD ret = new VkAntiLagDataAMD(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.ANTI_LAG_DATA_AMD);
        return ret;
    }

    public static VkAntiLagDataAMD[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAntiLagDataAMD[] ret = new VkAntiLagDataAMD[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAntiLagDataAMD(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.ANTI_LAG_DATA_AMD);
        }
        return ret;
    }

    public static VkAntiLagDataAMD clone(Arena arena, VkAntiLagDataAMD src) {
        VkAntiLagDataAMD ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAntiLagDataAMD[] clone(Arena arena, VkAntiLagDataAMD[] src) {
        VkAntiLagDataAMD[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.ANTI_LAG_DATA_AMD);
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

    public @enumtype(VkAntiLagModeAMD.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public void mode(@enumtype(VkAntiLagModeAMD.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
    }

    public @unsigned int maxFPS() {
        return segment.get(LAYOUT$maxFPS, OFFSET$maxFPS);
    }

    public void maxFPS(@unsigned int value) {
        segment.set(LAYOUT$maxFPS, OFFSET$maxFPS, value);
    }

    public @pointer(comment="VkAntiLagPresentationInfoAMD*") MemorySegment pPresentationInfoRaw() {
        return segment.get(LAYOUT$pPresentationInfo, OFFSET$pPresentationInfo);
    }

    public void pPresentationInfoRaw(@pointer(comment="VkAntiLagPresentationInfoAMD*") MemorySegment value) {
        segment.set(LAYOUT$pPresentationInfo, OFFSET$pPresentationInfo, value);
    }

    public @Nullable VkAntiLagPresentationInfoAMD pPresentationInfo() {
        MemorySegment s = pPresentationInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkAntiLagPresentationInfoAMD(s);
    }

    public void pPresentationInfo(@Nullable VkAntiLagPresentationInfoAMD value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPresentationInfoRaw(s);
    }

    @unsafe public @Nullable VkAntiLagPresentationInfoAMD[] pPresentationInfo(int assumedCount) {
        MemorySegment s = pPresentationInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAntiLagPresentationInfoAMD.BYTES);
        VkAntiLagPresentationInfoAMD[] ret = new VkAntiLagPresentationInfoAMD[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAntiLagPresentationInfoAMD(s.asSlice(i * VkAntiLagPresentationInfoAMD.BYTES, VkAntiLagPresentationInfoAMD.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.JAVA_INT.withName("maxFPS"),
        ValueLayout.ADDRESS.withTargetLayout(VkAntiLagPresentationInfoAMD.LAYOUT).withName("pPresentationInfo")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$mode = PathElement.groupElement("PATH$mode");
    public static final PathElement PATH$maxFPS = PathElement.groupElement("PATH$maxFPS");
    public static final PathElement PATH$pPresentationInfo = PathElement.groupElement("PATH$pPresentationInfo");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$mode = (OfInt) LAYOUT.select(PATH$mode);
    public static final OfInt LAYOUT$maxFPS = (OfInt) LAYOUT.select(PATH$maxFPS);
    public static final AddressLayout LAYOUT$pPresentationInfo = (AddressLayout) LAYOUT.select(PATH$pPresentationInfo);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$mode = LAYOUT$mode.byteSize();
    public static final long SIZE$maxFPS = LAYOUT$maxFPS.byteSize();
    public static final long SIZE$pPresentationInfo = LAYOUT$pPresentationInfo.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);
    public static final long OFFSET$maxFPS = LAYOUT.byteOffset(PATH$maxFPS);
    public static final long OFFSET$pPresentationInfo = LAYOUT.byteOffset(PATH$pPresentationInfo);
}
