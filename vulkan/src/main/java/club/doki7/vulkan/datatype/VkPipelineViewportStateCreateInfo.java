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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineViewportStateCreateInfo.html"><code>VkPipelineViewportStateCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineViewportStateCreateInfo {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkPipelineViewportStateCreateFlags flags; // optional // @link substring="VkPipelineViewportStateCreateFlags" target="VkPipelineViewportStateCreateFlags" @link substring="flags" target="#flags"
///     uint32_t viewportCount; // optional // @link substring="viewportCount" target="#viewportCount"
///     VkViewport const* pViewports; // optional // @link substring="VkViewport" target="VkViewport" @link substring="pViewports" target="#pViewports"
///     uint32_t scissorCount; // optional // @link substring="scissorCount" target="#scissorCount"
///     VkRect2D const* pScissors; // optional // @link substring="VkRect2D" target="VkRect2D" @link substring="pScissors" target="#pScissors"
/// } VkPipelineViewportStateCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO`
///
/// The {@code allocate} ({@link VkPipelineViewportStateCreateInfo#allocate(Arena)}, {@link VkPipelineViewportStateCreateInfo#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPipelineViewportStateCreateInfo#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineViewportStateCreateInfo.html"><code>VkPipelineViewportStateCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineViewportStateCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineViewportStateCreateInfo allocate(Arena arena) {
        VkPipelineViewportStateCreateInfo ret = new VkPipelineViewportStateCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_VIEWPORT_STATE_CREATE_INFO);
        return ret;
    }

    public static VkPipelineViewportStateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineViewportStateCreateInfo[] ret = new VkPipelineViewportStateCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineViewportStateCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_VIEWPORT_STATE_CREATE_INFO);
        }
        return ret;
    }

    public static VkPipelineViewportStateCreateInfo clone(Arena arena, VkPipelineViewportStateCreateInfo src) {
        VkPipelineViewportStateCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineViewportStateCreateInfo[] clone(Arena arena, VkPipelineViewportStateCreateInfo[] src) {
        VkPipelineViewportStateCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_VIEWPORT_STATE_CREATE_INFO);
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

    public @enumtype(VkPipelineViewportStateCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineViewportStateCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int viewportCount() {
        return segment.get(LAYOUT$viewportCount, OFFSET$viewportCount);
    }

    public void viewportCount(@unsigned int value) {
        segment.set(LAYOUT$viewportCount, OFFSET$viewportCount, value);
    }

    public @Nullable VkViewport pViewports() {
        MemorySegment s = pViewportsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkViewport(s);
    }

    public void pViewports(@Nullable VkViewport value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pViewportsRaw(s);
    }

    @unsafe public @Nullable VkViewport[] pViewports(int assumedCount) {
        MemorySegment s = pViewportsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkViewport.BYTES);
        VkViewport[] ret = new VkViewport[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkViewport(s.asSlice(i * VkViewport.BYTES, VkViewport.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkViewport.class) MemorySegment pViewportsRaw() {
        return segment.get(LAYOUT$pViewports, OFFSET$pViewports);
    }

    public void pViewportsRaw(@pointer(target=VkViewport.class) MemorySegment value) {
        segment.set(LAYOUT$pViewports, OFFSET$pViewports, value);
    }

    public @unsigned int scissorCount() {
        return segment.get(LAYOUT$scissorCount, OFFSET$scissorCount);
    }

    public void scissorCount(@unsigned int value) {
        segment.set(LAYOUT$scissorCount, OFFSET$scissorCount, value);
    }

    public @Nullable VkRect2D pScissors() {
        MemorySegment s = pScissorsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkRect2D(s);
    }

    public void pScissors(@Nullable VkRect2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pScissorsRaw(s);
    }

    @unsafe public @Nullable VkRect2D[] pScissors(int assumedCount) {
        MemorySegment s = pScissorsRaw();
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

    public @pointer(target=VkRect2D.class) MemorySegment pScissorsRaw() {
        return segment.get(LAYOUT$pScissors, OFFSET$pScissors);
    }

    public void pScissorsRaw(@pointer(target=VkRect2D.class) MemorySegment value) {
        segment.set(LAYOUT$pScissors, OFFSET$pScissors, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkViewport.LAYOUT).withName("pViewports"),
        ValueLayout.JAVA_INT.withName("scissorCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT).withName("pScissors")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$viewportCount = PathElement.groupElement("PATH$viewportCount");
    public static final PathElement PATH$pViewports = PathElement.groupElement("PATH$pViewports");
    public static final PathElement PATH$scissorCount = PathElement.groupElement("PATH$scissorCount");
    public static final PathElement PATH$pScissors = PathElement.groupElement("PATH$pScissors");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$viewportCount = (OfInt) LAYOUT.select(PATH$viewportCount);
    public static final AddressLayout LAYOUT$pViewports = (AddressLayout) LAYOUT.select(PATH$pViewports);
    public static final OfInt LAYOUT$scissorCount = (OfInt) LAYOUT.select(PATH$scissorCount);
    public static final AddressLayout LAYOUT$pScissors = (AddressLayout) LAYOUT.select(PATH$pScissors);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$viewportCount = LAYOUT$viewportCount.byteSize();
    public static final long SIZE$pViewports = LAYOUT$pViewports.byteSize();
    public static final long SIZE$scissorCount = LAYOUT$scissorCount.byteSize();
    public static final long SIZE$pScissors = LAYOUT$pScissors.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$viewportCount = LAYOUT.byteOffset(PATH$viewportCount);
    public static final long OFFSET$pViewports = LAYOUT.byteOffset(PATH$pViewports);
    public static final long OFFSET$scissorCount = LAYOUT.byteOffset(PATH$scissorCount);
    public static final long OFFSET$pScissors = LAYOUT.byteOffset(PATH$pScissors);
}
