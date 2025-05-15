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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassMultiviewCreateInfo.html"><code>VkRenderPassMultiviewCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRenderPassMultiviewCreateInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t subpassCount; // optional
///     uint32_t const* pViewMasks;
///     uint32_t dependencyCount; // optional
///     int32_t const* pViewOffsets;
///     uint32_t correlationMaskCount; // optional
///     uint32_t const* pCorrelationMasks;
/// } VkRenderPassMultiviewCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO`
///
/// The {@link VkRenderPassMultiviewCreateInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkRenderPassMultiviewCreateInfo#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassMultiviewCreateInfo.html"><code>VkRenderPassMultiviewCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRenderPassMultiviewCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkRenderPassMultiviewCreateInfo allocate(Arena arena) {
        VkRenderPassMultiviewCreateInfo ret = new VkRenderPassMultiviewCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.RENDER_PASS_MULTIVIEW_CREATE_INFO);
        return ret;
    }

    public static VkRenderPassMultiviewCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassMultiviewCreateInfo[] ret = new VkRenderPassMultiviewCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderPassMultiviewCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.RENDER_PASS_MULTIVIEW_CREATE_INFO);
        }
        return ret;
    }

    public static VkRenderPassMultiviewCreateInfo clone(Arena arena, VkRenderPassMultiviewCreateInfo src) {
        VkRenderPassMultiviewCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderPassMultiviewCreateInfo[] clone(Arena arena, VkRenderPassMultiviewCreateInfo[] src) {
        VkRenderPassMultiviewCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.RENDER_PASS_MULTIVIEW_CREATE_INFO);
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

    public @unsigned int subpassCount() {
        return segment.get(LAYOUT$subpassCount, OFFSET$subpassCount);
    }

    public void subpassCount(@unsigned int value) {
        segment.set(LAYOUT$subpassCount, OFFSET$subpassCount, value);
    }

    public @pointer(comment="int*") MemorySegment pViewMasksRaw() {
        return segment.get(LAYOUT$pViewMasks, OFFSET$pViewMasks);
    }

    public void pViewMasksRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pViewMasks, OFFSET$pViewMasks, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pViewMasks() {
        MemorySegment s = pViewMasksRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pViewMasks(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pViewMasksRaw(s);
    }

    public @unsigned int dependencyCount() {
        return segment.get(LAYOUT$dependencyCount, OFFSET$dependencyCount);
    }

    public void dependencyCount(@unsigned int value) {
        segment.set(LAYOUT$dependencyCount, OFFSET$dependencyCount, value);
    }

    public @pointer(comment="int*") MemorySegment pViewOffsetsRaw() {
        return segment.get(LAYOUT$pViewOffsets, OFFSET$pViewOffsets);
    }

    public void pViewOffsetsRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pViewOffsets, OFFSET$pViewOffsets, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable IntPtr pViewOffsets() {
        MemorySegment s = pViewOffsetsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pViewOffsets(@Nullable IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pViewOffsetsRaw(s);
    }

    public @unsigned int correlationMaskCount() {
        return segment.get(LAYOUT$correlationMaskCount, OFFSET$correlationMaskCount);
    }

    public void correlationMaskCount(@unsigned int value) {
        segment.set(LAYOUT$correlationMaskCount, OFFSET$correlationMaskCount, value);
    }

    public @pointer(comment="int*") MemorySegment pCorrelationMasksRaw() {
        return segment.get(LAYOUT$pCorrelationMasks, OFFSET$pCorrelationMasks);
    }

    public void pCorrelationMasksRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pCorrelationMasks, OFFSET$pCorrelationMasks, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pCorrelationMasks() {
        MemorySegment s = pCorrelationMasksRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pCorrelationMasks(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCorrelationMasksRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("subpassCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pViewMasks"),
        ValueLayout.JAVA_INT.withName("dependencyCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pViewOffsets"),
        ValueLayout.JAVA_INT.withName("correlationMaskCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pCorrelationMasks")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$subpassCount = PathElement.groupElement("PATH$subpassCount");
    public static final PathElement PATH$pViewMasks = PathElement.groupElement("PATH$pViewMasks");
    public static final PathElement PATH$dependencyCount = PathElement.groupElement("PATH$dependencyCount");
    public static final PathElement PATH$pViewOffsets = PathElement.groupElement("PATH$pViewOffsets");
    public static final PathElement PATH$correlationMaskCount = PathElement.groupElement("PATH$correlationMaskCount");
    public static final PathElement PATH$pCorrelationMasks = PathElement.groupElement("PATH$pCorrelationMasks");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$subpassCount = (OfInt) LAYOUT.select(PATH$subpassCount);
    public static final AddressLayout LAYOUT$pViewMasks = (AddressLayout) LAYOUT.select(PATH$pViewMasks);
    public static final OfInt LAYOUT$dependencyCount = (OfInt) LAYOUT.select(PATH$dependencyCount);
    public static final AddressLayout LAYOUT$pViewOffsets = (AddressLayout) LAYOUT.select(PATH$pViewOffsets);
    public static final OfInt LAYOUT$correlationMaskCount = (OfInt) LAYOUT.select(PATH$correlationMaskCount);
    public static final AddressLayout LAYOUT$pCorrelationMasks = (AddressLayout) LAYOUT.select(PATH$pCorrelationMasks);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$subpassCount = LAYOUT$subpassCount.byteSize();
    public static final long SIZE$pViewMasks = LAYOUT$pViewMasks.byteSize();
    public static final long SIZE$dependencyCount = LAYOUT$dependencyCount.byteSize();
    public static final long SIZE$pViewOffsets = LAYOUT$pViewOffsets.byteSize();
    public static final long SIZE$correlationMaskCount = LAYOUT$correlationMaskCount.byteSize();
    public static final long SIZE$pCorrelationMasks = LAYOUT$pCorrelationMasks.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$subpassCount = LAYOUT.byteOffset(PATH$subpassCount);
    public static final long OFFSET$pViewMasks = LAYOUT.byteOffset(PATH$pViewMasks);
    public static final long OFFSET$dependencyCount = LAYOUT.byteOffset(PATH$dependencyCount);
    public static final long OFFSET$pViewOffsets = LAYOUT.byteOffset(PATH$pViewOffsets);
    public static final long OFFSET$correlationMaskCount = LAYOUT.byteOffset(PATH$correlationMaskCount);
    public static final long OFFSET$pCorrelationMasks = LAYOUT.byteOffset(PATH$pCorrelationMasks);
}
