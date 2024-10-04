package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkRenderPassMultiviewCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t subpassCount;
///     const uint32_t* pViewMasks;
///     uint32_t dependencyCount;
///     const int32_t* pViewOffsets;
///     uint32_t correlationMaskCount;
///     const uint32_t* pCorrelationMasks;
/// } VkRenderPassMultiviewCreateInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkRenderPassMultiviewCreateInfo.html">VkRenderPassMultiviewCreateInfo</a>
public record VkRenderPassMultiviewCreateInfo(MemorySegment segment) implements IPointer {
    public VkRenderPassMultiviewCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int subpassCount() {
        return segment.get(LAYOUT$subpassCount, OFFSET$subpassCount);
    }

    public void subpassCount(@unsigned int value) {
        segment.set(LAYOUT$subpassCount, OFFSET$subpassCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pViewMasksRaw() {
        return segment.get(LAYOUT$pViewMasks, OFFSET$pViewMasks);
    }

    public void pViewMasksRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pViewMasks, OFFSET$pViewMasks, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or
    /// {@link IntBuffer#write}ing the buffer.
    public @nullable @unsigned IntBuffer pViewMasks() {
        MemorySegment s = pViewMasksRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pViewMasks(@nullable @unsigned IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pViewMasksRaw(s);
    }

    public @unsigned int dependencyCount() {
        return segment.get(LAYOUT$dependencyCount, OFFSET$dependencyCount);
    }

    public void dependencyCount(@unsigned int value) {
        segment.set(LAYOUT$dependencyCount, OFFSET$dependencyCount, value);
    }

    public @pointer(comment="int32_t*") MemorySegment pViewOffsetsRaw() {
        return segment.get(LAYOUT$pViewOffsets, OFFSET$pViewOffsets);
    }

    public void pViewOffsetsRaw(@pointer(comment="int32_t*") MemorySegment value) {
        segment.set(LAYOUT$pViewOffsets, OFFSET$pViewOffsets, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or
    /// {@link IntBuffer#write}ing the buffer.
    public @nullable IntBuffer pViewOffsets() {
        MemorySegment s = pViewOffsetsRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pViewOffsets(@nullable IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pViewOffsetsRaw(s);
    }

    public @unsigned int correlationMaskCount() {
        return segment.get(LAYOUT$correlationMaskCount, OFFSET$correlationMaskCount);
    }

    public void correlationMaskCount(@unsigned int value) {
        segment.set(LAYOUT$correlationMaskCount, OFFSET$correlationMaskCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pCorrelationMasksRaw() {
        return segment.get(LAYOUT$pCorrelationMasks, OFFSET$pCorrelationMasks);
    }

    public void pCorrelationMasksRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pCorrelationMasks, OFFSET$pCorrelationMasks, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or
    /// {@link IntBuffer#write}ing the buffer.
    public @nullable @unsigned IntBuffer pCorrelationMasks() {
        MemorySegment s = pCorrelationMasksRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pCorrelationMasks(@nullable @unsigned IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCorrelationMasksRaw(s);
    }

    public static VkRenderPassMultiviewCreateInfo allocate(Arena arena) {
        return new VkRenderPassMultiviewCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkRenderPassMultiviewCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassMultiviewCreateInfo[] ret = new VkRenderPassMultiviewCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRenderPassMultiviewCreateInfo(segment.asSlice(i * SIZE, SIZE));
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("subpassCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pViewMasks"),
        ValueLayout.JAVA_INT.withName("dependencyCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pViewOffsets"),
        ValueLayout.JAVA_INT.withName("correlationMaskCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pCorrelationMasks")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$subpassCount = PathElement.groupElement("subpassCount");
    public static final PathElement PATH$pViewMasks = PathElement.groupElement("pViewMasks");
    public static final PathElement PATH$dependencyCount = PathElement.groupElement("dependencyCount");
    public static final PathElement PATH$pViewOffsets = PathElement.groupElement("pViewOffsets");
    public static final PathElement PATH$correlationMaskCount = PathElement.groupElement("correlationMaskCount");
    public static final PathElement PATH$pCorrelationMasks = PathElement.groupElement("pCorrelationMasks");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$subpassCount = (OfInt) LAYOUT.select(PATH$subpassCount);
    public static final AddressLayout LAYOUT$pViewMasks = (AddressLayout) LAYOUT.select(PATH$pViewMasks);
    public static final OfInt LAYOUT$dependencyCount = (OfInt) LAYOUT.select(PATH$dependencyCount);
    public static final AddressLayout LAYOUT$pViewOffsets = (AddressLayout) LAYOUT.select(PATH$pViewOffsets);
    public static final OfInt LAYOUT$correlationMaskCount = (OfInt) LAYOUT.select(PATH$correlationMaskCount);
    public static final AddressLayout LAYOUT$pCorrelationMasks = (AddressLayout) LAYOUT.select(PATH$pCorrelationMasks);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$subpassCount = LAYOUT.byteOffset(PATH$subpassCount);
    public static final long OFFSET$pViewMasks = LAYOUT.byteOffset(PATH$pViewMasks);
    public static final long OFFSET$dependencyCount = LAYOUT.byteOffset(PATH$dependencyCount);
    public static final long OFFSET$pViewOffsets = LAYOUT.byteOffset(PATH$pViewOffsets);
    public static final long OFFSET$correlationMaskCount = LAYOUT.byteOffset(PATH$correlationMaskCount);
    public static final long OFFSET$pCorrelationMasks = LAYOUT.byteOffset(PATH$pCorrelationMasks);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$subpassCount = LAYOUT$subpassCount.byteSize();
    public static final long SIZE$pViewMasks = LAYOUT$pViewMasks.byteSize();
    public static final long SIZE$dependencyCount = LAYOUT$dependencyCount.byteSize();
    public static final long SIZE$pViewOffsets = LAYOUT$pViewOffsets.byteSize();
    public static final long SIZE$correlationMaskCount = LAYOUT$correlationMaskCount.byteSize();
    public static final long SIZE$pCorrelationMasks = LAYOUT$pCorrelationMasks.byteSize();
}
