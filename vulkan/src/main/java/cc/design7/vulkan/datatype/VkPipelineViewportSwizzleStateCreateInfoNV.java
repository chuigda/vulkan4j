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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineViewportSwizzleStateCreateInfoNV.html"><code>VkPipelineViewportSwizzleStateCreateInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineViewportSwizzleStateCreateInfoNV {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkPipelineViewportSwizzleStateCreateFlagsNV flags; // optional
///     uint32_t viewportCount;
///     VkViewportSwizzleNV const* pViewportSwizzles;
/// } VkPipelineViewportSwizzleStateCreateInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV`
///
/// The {@link VkPipelineViewportSwizzleStateCreateInfoNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPipelineViewportSwizzleStateCreateInfoNV#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineViewportSwizzleStateCreateInfoNV.html"><code>VkPipelineViewportSwizzleStateCreateInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineViewportSwizzleStateCreateInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineViewportSwizzleStateCreateInfoNV allocate(Arena arena) {
        VkPipelineViewportSwizzleStateCreateInfoNV ret = new VkPipelineViewportSwizzleStateCreateInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV);
        return ret;
    }

    public static VkPipelineViewportSwizzleStateCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineViewportSwizzleStateCreateInfoNV[] ret = new VkPipelineViewportSwizzleStateCreateInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineViewportSwizzleStateCreateInfoNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV);
        }
        return ret;
    }

    public static VkPipelineViewportSwizzleStateCreateInfoNV clone(Arena arena, VkPipelineViewportSwizzleStateCreateInfoNV src) {
        VkPipelineViewportSwizzleStateCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineViewportSwizzleStateCreateInfoNV[] clone(Arena arena, VkPipelineViewportSwizzleStateCreateInfoNV[] src) {
        VkPipelineViewportSwizzleStateCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_VIEWPORT_SWIZZLE_STATE_CREATE_INFO_NV);
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

    public @enumtype(VkPipelineViewportSwizzleStateCreateFlagsNV.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineViewportSwizzleStateCreateFlagsNV.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int viewportCount() {
        return segment.get(LAYOUT$viewportCount, OFFSET$viewportCount);
    }

    public void viewportCount(@unsigned int value) {
        segment.set(LAYOUT$viewportCount, OFFSET$viewportCount, value);
    }

    public @pointer(comment="VkViewportSwizzleNV*") MemorySegment pViewportSwizzlesRaw() {
        return segment.get(LAYOUT$pViewportSwizzles, OFFSET$pViewportSwizzles);
    }

    public void pViewportSwizzlesRaw(@pointer(comment="VkViewportSwizzleNV*") MemorySegment value) {
        segment.set(LAYOUT$pViewportSwizzles, OFFSET$pViewportSwizzles, value);
    }

    public @Nullable VkViewportSwizzleNV pViewportSwizzles() {
        MemorySegment s = pViewportSwizzlesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkViewportSwizzleNV(s);
    }

    public void pViewportSwizzles(@Nullable VkViewportSwizzleNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pViewportSwizzlesRaw(s);
    }

    @unsafe public @Nullable VkViewportSwizzleNV[] pViewportSwizzles(int assumedCount) {
        MemorySegment s = pViewportSwizzlesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkViewportSwizzleNV.BYTES);
        VkViewportSwizzleNV[] ret = new VkViewportSwizzleNV[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkViewportSwizzleNV(s.asSlice(i * VkViewportSwizzleNV.BYTES, VkViewportSwizzleNV.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkViewportSwizzleNV.LAYOUT).withName("pViewportSwizzles")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$viewportCount = PathElement.groupElement("PATH$viewportCount");
    public static final PathElement PATH$pViewportSwizzles = PathElement.groupElement("PATH$pViewportSwizzles");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$viewportCount = (OfInt) LAYOUT.select(PATH$viewportCount);
    public static final AddressLayout LAYOUT$pViewportSwizzles = (AddressLayout) LAYOUT.select(PATH$pViewportSwizzles);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$viewportCount = LAYOUT$viewportCount.byteSize();
    public static final long SIZE$pViewportSwizzles = LAYOUT$pViewportSwizzles.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$viewportCount = LAYOUT.byteOffset(PATH$viewportCount);
    public static final long OFFSET$pViewportSwizzles = LAYOUT.byteOffset(PATH$pViewportSwizzles);
}
