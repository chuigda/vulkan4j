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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineDiscardRectangleStateCreateInfoEXT.html"><code>VkPipelineDiscardRectangleStateCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineDiscardRectangleStateCreateInfoEXT {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkPipelineDiscardRectangleStateCreateFlagsEXT flags; // optional
///     VkDiscardRectangleModeEXT discardRectangleMode;
///     uint32_t discardRectangleCount; // optional
///     VkRect2D const* pDiscardRectangles;
/// } VkPipelineDiscardRectangleStateCreateInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT`
///
/// The {@link VkPipelineDiscardRectangleStateCreateInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPipelineDiscardRectangleStateCreateInfoEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineDiscardRectangleStateCreateInfoEXT.html"><code>VkPipelineDiscardRectangleStateCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineDiscardRectangleStateCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineDiscardRectangleStateCreateInfoEXT allocate(Arena arena) {
        VkPipelineDiscardRectangleStateCreateInfoEXT ret = new VkPipelineDiscardRectangleStateCreateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT);
        return ret;
    }

    public static VkPipelineDiscardRectangleStateCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineDiscardRectangleStateCreateInfoEXT[] ret = new VkPipelineDiscardRectangleStateCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineDiscardRectangleStateCreateInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static VkPipelineDiscardRectangleStateCreateInfoEXT clone(Arena arena, VkPipelineDiscardRectangleStateCreateInfoEXT src) {
        VkPipelineDiscardRectangleStateCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineDiscardRectangleStateCreateInfoEXT[] clone(Arena arena, VkPipelineDiscardRectangleStateCreateInfoEXT[] src) {
        VkPipelineDiscardRectangleStateCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_DISCARD_RECTANGLE_STATE_CREATE_INFO_EXT);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkPipelineDiscardRectangleStateCreateFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineDiscardRectangleStateCreateFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkDiscardRectangleModeEXT.class) int discardRectangleMode() {
        return segment.get(LAYOUT$discardRectangleMode, OFFSET$discardRectangleMode);
    }

    public void discardRectangleMode(@enumtype(VkDiscardRectangleModeEXT.class) int value) {
        segment.set(LAYOUT$discardRectangleMode, OFFSET$discardRectangleMode, value);
    }

    public @unsigned int discardRectangleCount() {
        return segment.get(LAYOUT$discardRectangleCount, OFFSET$discardRectangleCount);
    }

    public void discardRectangleCount(@unsigned int value) {
        segment.set(LAYOUT$discardRectangleCount, OFFSET$discardRectangleCount, value);
    }

    public @pointer(target=VkRect2D.class) MemorySegment pDiscardRectanglesRaw() {
        return segment.get(LAYOUT$pDiscardRectangles, OFFSET$pDiscardRectangles);
    }

    public void pDiscardRectanglesRaw(@pointer(target=VkRect2D.class) MemorySegment value) {
        segment.set(LAYOUT$pDiscardRectangles, OFFSET$pDiscardRectangles, value);
    }

    public @Nullable VkRect2D pDiscardRectangles() {
        MemorySegment s = pDiscardRectanglesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkRect2D(s);
    }

    public void pDiscardRectangles(@Nullable VkRect2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDiscardRectanglesRaw(s);
    }

    @unsafe public @Nullable VkRect2D[] pDiscardRectangles(int assumedCount) {
        MemorySegment s = pDiscardRectanglesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkRect2D.BYTES);
        VkRect2D[] ret = new VkRect2D[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkRect2D(s.asSlice(i * VkRect2D.BYTES, VkRect2D.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("discardRectangleMode"),
        ValueLayout.JAVA_INT.withName("discardRectangleCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT).withName("pDiscardRectangles")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$discardRectangleMode = PathElement.groupElement("PATH$discardRectangleMode");
    public static final PathElement PATH$discardRectangleCount = PathElement.groupElement("PATH$discardRectangleCount");
    public static final PathElement PATH$pDiscardRectangles = PathElement.groupElement("PATH$pDiscardRectangles");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$discardRectangleMode = (OfInt) LAYOUT.select(PATH$discardRectangleMode);
    public static final OfInt LAYOUT$discardRectangleCount = (OfInt) LAYOUT.select(PATH$discardRectangleCount);
    public static final AddressLayout LAYOUT$pDiscardRectangles = (AddressLayout) LAYOUT.select(PATH$pDiscardRectangles);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$discardRectangleMode = LAYOUT$discardRectangleMode.byteSize();
    public static final long SIZE$discardRectangleCount = LAYOUT$discardRectangleCount.byteSize();
    public static final long SIZE$pDiscardRectangles = LAYOUT$pDiscardRectangles.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$discardRectangleMode = LAYOUT.byteOffset(PATH$discardRectangleMode);
    public static final long OFFSET$discardRectangleCount = LAYOUT.byteOffset(PATH$discardRectangleCount);
    public static final long OFFSET$pDiscardRectangles = LAYOUT.byteOffset(PATH$pDiscardRectangles);
}
