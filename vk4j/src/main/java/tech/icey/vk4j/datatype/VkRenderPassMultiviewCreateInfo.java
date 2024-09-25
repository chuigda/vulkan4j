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
    
    public @unsigned IntBuffer pViewMasks() {
        return new IntBuffer(pViewMasksRaw());
    }

    public void pViewMasks(@unsigned IntBuffer value) {
        pViewMasksRaw(value.segment());
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
    
    public IntBuffer pViewOffsets() {
        return new IntBuffer(pViewOffsetsRaw());
    }

    public void pViewOffsets(IntBuffer value) {
        pViewOffsetsRaw(value.segment());
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
    
    public @unsigned IntBuffer pCorrelationMasks() {
        return new IntBuffer(pCorrelationMasksRaw());
    }

    public void pCorrelationMasks(@unsigned IntBuffer value) {
        pCorrelationMasksRaw(value.segment());
    }

    public static VkRenderPassMultiviewCreateInfo allocate(Arena arena) {
        return new VkRenderPassMultiviewCreateInfo(arena.allocate(LAYOUT));
    }
    
    public static VkRenderPassMultiviewCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassMultiviewCreateInfo[] ret = new VkRenderPassMultiviewCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRenderPassMultiviewCreateInfo(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
