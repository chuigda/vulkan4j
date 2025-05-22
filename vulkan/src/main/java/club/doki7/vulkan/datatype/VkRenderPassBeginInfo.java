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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassBeginInfo.html"><code>VkRenderPassBeginInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRenderPassBeginInfo {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkRenderPass renderPass; // @link substring="VkRenderPass" target="VkRenderPass" @link substring="renderPass" target="#renderPass"
///     VkFramebuffer framebuffer; // @link substring="VkFramebuffer" target="VkFramebuffer" @link substring="framebuffer" target="#framebuffer"
///     VkRect2D renderArea; // @link substring="VkRect2D" target="VkRect2D" @link substring="renderArea" target="#renderArea"
///     uint32_t clearValueCount; // optional // @link substring="clearValueCount" target="#clearValueCount"
///     VkClearValue const* pClearValues; // @link substring="VkClearValue" target="VkClearValue" @link substring="pClearValues" target="#pClearValues"
/// } VkRenderPassBeginInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO`
///
/// The {@code allocate} ({@link VkRenderPassBeginInfo#allocate(Arena)}, {@link VkRenderPassBeginInfo#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkRenderPassBeginInfo#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassBeginInfo.html"><code>VkRenderPassBeginInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRenderPassBeginInfo(@NotNull MemorySegment segment) implements IVkRenderPassBeginInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassBeginInfo.html"><code>VkRenderPassBeginInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkRenderPassBeginInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkRenderPassBeginInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkRenderPassBeginInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkRenderPassBeginInfo {
        public long size() {
            return segment.byteSize() / VkRenderPassBeginInfo.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkRenderPassBeginInfo at(long index) {
            return new VkRenderPassBeginInfo(segment.asSlice(index * VkRenderPassBeginInfo.BYTES, VkRenderPassBeginInfo.BYTES));
        }
        public void write(long index, @NotNull VkRenderPassBeginInfo value) {
            MemorySegment s = segment.asSlice(index * VkRenderPassBeginInfo.BYTES, VkRenderPassBeginInfo.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkRenderPassBeginInfo allocate(Arena arena) {
        VkRenderPassBeginInfo ret = new VkRenderPassBeginInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.RENDER_PASS_BEGIN_INFO);
        return ret;
    }

    public static VkRenderPassBeginInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassBeginInfo.Ptr ret = new VkRenderPassBeginInfo.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.RENDER_PASS_BEGIN_INFO);
        }
        return ret;
    }

    public static VkRenderPassBeginInfo clone(Arena arena, VkRenderPassBeginInfo src) {
        VkRenderPassBeginInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.RENDER_PASS_BEGIN_INFO);
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

    public @Nullable VkRenderPass renderPass() {
        MemorySegment s = segment.asSlice(OFFSET$renderPass, SIZE$renderPass);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkRenderPass(s);
    }

    public void renderPass(@Nullable VkRenderPass value) {
        segment.set(LAYOUT$renderPass, OFFSET$renderPass, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkFramebuffer framebuffer() {
        MemorySegment s = segment.asSlice(OFFSET$framebuffer, SIZE$framebuffer);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkFramebuffer(s);
    }

    public void framebuffer(@Nullable VkFramebuffer value) {
        segment.set(LAYOUT$framebuffer, OFFSET$framebuffer, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @NotNull VkRect2D renderArea() {
        return new VkRect2D(segment.asSlice(OFFSET$renderArea, LAYOUT$renderArea));
    }

    public void renderArea(@NotNull VkRect2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$renderArea, SIZE$renderArea);
    }

    public @unsigned int clearValueCount() {
        return segment.get(LAYOUT$clearValueCount, OFFSET$clearValueCount);
    }

    public void clearValueCount(@unsigned int value) {
        segment.set(LAYOUT$clearValueCount, OFFSET$clearValueCount, value);
    }

    public @Nullable VkClearValue pClearValues() {
        MemorySegment s = pClearValuesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkClearValue(s);
    }

    public void pClearValues(@Nullable VkClearValue value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pClearValuesRaw(s);
    }

    @unsafe public @Nullable VkClearValue[] pClearValues(int assumedCount) {
        MemorySegment s = pClearValuesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkClearValue.BYTES);
        VkClearValue[] ret = new VkClearValue[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkClearValue(s.asSlice(i * VkClearValue.BYTES, VkClearValue.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkClearValue.class) MemorySegment pClearValuesRaw() {
        return segment.get(LAYOUT$pClearValues, OFFSET$pClearValues);
    }

    public void pClearValuesRaw(@pointer(target=VkClearValue.class) MemorySegment value) {
        segment.set(LAYOUT$pClearValues, OFFSET$pClearValues, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("renderPass"),
        ValueLayout.ADDRESS.withName("framebuffer"),
        VkRect2D.LAYOUT.withName("renderArea"),
        ValueLayout.JAVA_INT.withName("clearValueCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkClearValue.LAYOUT).withName("pClearValues")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$renderPass = PathElement.groupElement("renderPass");
    public static final PathElement PATH$framebuffer = PathElement.groupElement("framebuffer");
    public static final PathElement PATH$renderArea = PathElement.groupElement("renderArea");
    public static final PathElement PATH$clearValueCount = PathElement.groupElement("clearValueCount");
    public static final PathElement PATH$pClearValues = PathElement.groupElement("pClearValues");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$renderPass = (AddressLayout) LAYOUT.select(PATH$renderPass);
    public static final AddressLayout LAYOUT$framebuffer = (AddressLayout) LAYOUT.select(PATH$framebuffer);
    public static final StructLayout LAYOUT$renderArea = (StructLayout) LAYOUT.select(PATH$renderArea);
    public static final OfInt LAYOUT$clearValueCount = (OfInt) LAYOUT.select(PATH$clearValueCount);
    public static final AddressLayout LAYOUT$pClearValues = (AddressLayout) LAYOUT.select(PATH$pClearValues);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$renderPass = LAYOUT$renderPass.byteSize();
    public static final long SIZE$framebuffer = LAYOUT$framebuffer.byteSize();
    public static final long SIZE$renderArea = LAYOUT$renderArea.byteSize();
    public static final long SIZE$clearValueCount = LAYOUT$clearValueCount.byteSize();
    public static final long SIZE$pClearValues = LAYOUT$pClearValues.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$renderPass = LAYOUT.byteOffset(PATH$renderPass);
    public static final long OFFSET$framebuffer = LAYOUT.byteOffset(PATH$framebuffer);
    public static final long OFFSET$renderArea = LAYOUT.byteOffset(PATH$renderArea);
    public static final long OFFSET$clearValueCount = LAYOUT.byteOffset(PATH$clearValueCount);
    public static final long OFFSET$pClearValues = LAYOUT.byteOffset(PATH$pClearValues);
}
