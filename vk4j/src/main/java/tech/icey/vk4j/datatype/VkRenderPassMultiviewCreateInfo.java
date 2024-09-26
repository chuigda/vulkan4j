package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkRenderPassMultiviewCreateInfo(MemorySegment segment) {
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
}
