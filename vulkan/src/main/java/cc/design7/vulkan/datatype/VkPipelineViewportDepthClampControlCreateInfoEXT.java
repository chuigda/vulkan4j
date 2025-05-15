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

/// Represents a pointer to a {@code VkPipelineViewportDepthClampControlCreateInfoEXT} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineViewportDepthClampControlCreateInfoEXT.html">VkPipelineViewportDepthClampControlCreateInfoEXT</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineViewportDepthClampControlCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public VkPipelineViewportDepthClampControlCreateInfoEXT {
        sType(VkStructureType.PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT);
    }

    public static VkPipelineViewportDepthClampControlCreateInfoEXT allocate(Arena arena) {
        return new VkPipelineViewportDepthClampControlCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkPipelineViewportDepthClampControlCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineViewportDepthClampControlCreateInfoEXT[] ret = new VkPipelineViewportDepthClampControlCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineViewportDepthClampControlCreateInfoEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkPipelineViewportDepthClampControlCreateInfoEXT clone(Arena arena, VkPipelineViewportDepthClampControlCreateInfoEXT src) {
        VkPipelineViewportDepthClampControlCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineViewportDepthClampControlCreateInfoEXT[] clone(Arena arena, VkPipelineViewportDepthClampControlCreateInfoEXT[] src) {
        VkPipelineViewportDepthClampControlCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthClampMode"),
        ValueLayout.ADDRESS.withTargetLayout(VkDepthClampRangeEXT.LAYOUT).withName("pDepthClampRange")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$depthClampMode = PathElement.groupElement("PATH$depthClampMode");
    public static final PathElement PATH$pDepthClampRange = PathElement.groupElement("PATH$pDepthClampRange");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$depthClampMode = (OfInt) LAYOUT.select(PATH$depthClampMode);
    public static final AddressLayout LAYOUT$pDepthClampRange = (AddressLayout) LAYOUT.select(PATH$pDepthClampRange);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$depthClampMode = LAYOUT$depthClampMode.byteSize();
    public static final long SIZE$pDepthClampRange = LAYOUT$pDepthClampRange.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$depthClampMode = LAYOUT.byteOffset(PATH$depthClampMode);
    public static final long OFFSET$pDepthClampRange = LAYOUT.byteOffset(PATH$pDepthClampRange);

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

    public @enumtype(VkDepthClampModeEXT.class) int depthClampMode() {
        return segment.get(LAYOUT$depthClampMode, OFFSET$depthClampMode);
    }

    public void depthClampMode(@enumtype(VkDepthClampModeEXT.class) int value) {
        segment.set(LAYOUT$depthClampMode, OFFSET$depthClampMode, value);
    }

    public @pointer(comment="VkDepthClampRangeEXT*") MemorySegment pDepthClampRangeRaw() {
        return segment.get(LAYOUT$pDepthClampRange, OFFSET$pDepthClampRange);
    }

    public void pDepthClampRangeRaw(@pointer(comment="VkDepthClampRangeEXT*") MemorySegment value) {
        segment.set(LAYOUT$pDepthClampRange, OFFSET$pDepthClampRange, value);
    }

    public @Nullable VkDepthClampRangeEXT pDepthClampRange() {
        MemorySegment s = pDepthClampRangeRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDepthClampRangeEXT(s);
    }

    public void pDepthClampRange(@Nullable VkDepthClampRangeEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDepthClampRangeRaw(s);
    }

    @unsafe public @Nullable VkDepthClampRangeEXT[] pDepthClampRange(int assumedCount) {
        MemorySegment s = pDepthClampRangeRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDepthClampRangeEXT.SIZE);
        VkDepthClampRangeEXT[] ret = new VkDepthClampRangeEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDepthClampRangeEXT(s.asSlice(i * VkDepthClampRangeEXT.SIZE, VkDepthClampRangeEXT.SIZE));
        }
        return ret;
    }

}
