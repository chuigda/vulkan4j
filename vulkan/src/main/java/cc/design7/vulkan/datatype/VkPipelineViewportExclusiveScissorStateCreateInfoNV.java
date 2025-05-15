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

/// Represents a pointer to a {@code VkPipelineViewportExclusiveScissorStateCreateInfoNV} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineViewportExclusiveScissorStateCreateInfoNV.html">VkPipelineViewportExclusiveScissorStateCreateInfoNV</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineViewportExclusiveScissorStateCreateInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV {
        sType(VkStructureType.PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV);
    }

    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV allocate(Arena arena) {
        return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineViewportExclusiveScissorStateCreateInfoNV[] ret = new VkPipelineViewportExclusiveScissorStateCreateInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineViewportExclusiveScissorStateCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV clone(Arena arena, VkPipelineViewportExclusiveScissorStateCreateInfoNV src) {
        VkPipelineViewportExclusiveScissorStateCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineViewportExclusiveScissorStateCreateInfoNV[] clone(Arena arena, VkPipelineViewportExclusiveScissorStateCreateInfoNV[] src) {
        VkPipelineViewportExclusiveScissorStateCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("exclusiveScissorCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT).withName("pExclusiveScissors")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$exclusiveScissorCount = PathElement.groupElement("PATH$exclusiveScissorCount");
    public static final PathElement PATH$pExclusiveScissors = PathElement.groupElement("PATH$pExclusiveScissors");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$exclusiveScissorCount = (OfInt) LAYOUT.select(PATH$exclusiveScissorCount);
    public static final AddressLayout LAYOUT$pExclusiveScissors = (AddressLayout) LAYOUT.select(PATH$pExclusiveScissors);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$exclusiveScissorCount = LAYOUT$exclusiveScissorCount.byteSize();
    public static final long SIZE$pExclusiveScissors = LAYOUT$pExclusiveScissors.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$exclusiveScissorCount = LAYOUT.byteOffset(PATH$exclusiveScissorCount);
    public static final long OFFSET$pExclusiveScissors = LAYOUT.byteOffset(PATH$pExclusiveScissors);

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

    public @unsigned int exclusiveScissorCount() {
        return segment.get(LAYOUT$exclusiveScissorCount, OFFSET$exclusiveScissorCount);
    }

    public void exclusiveScissorCount(@unsigned int value) {
        segment.set(LAYOUT$exclusiveScissorCount, OFFSET$exclusiveScissorCount, value);
    }

    public @pointer(comment="VkRect2D*") MemorySegment pExclusiveScissorsRaw() {
        return segment.get(LAYOUT$pExclusiveScissors, OFFSET$pExclusiveScissors);
    }

    public void pExclusiveScissorsRaw(@pointer(comment="VkRect2D*") MemorySegment value) {
        segment.set(LAYOUT$pExclusiveScissors, OFFSET$pExclusiveScissors, value);
    }

    public @Nullable VkRect2D pExclusiveScissors() {
        MemorySegment s = pExclusiveScissorsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRect2D(s);
    }

    public void pExclusiveScissors(@Nullable VkRect2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pExclusiveScissorsRaw(s);
    }

    @unsafe public @Nullable VkRect2D[] pExclusiveScissors(int assumedCount) {
        MemorySegment s = pExclusiveScissorsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkRect2D.SIZE);
        VkRect2D[] ret = new VkRect2D[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkRect2D(s.asSlice(i * VkRect2D.SIZE, VkRect2D.SIZE));
        }
        return ret;
    }

}
