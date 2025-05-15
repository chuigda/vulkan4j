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

public record VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$maxIndirectPipelineCount = ValueLayout.JAVA_INT.withName("maxIndirectPipelineCount");
    public static final OfInt LAYOUT$maxIndirectShaderObjectCount = ValueLayout.JAVA_INT.withName("maxIndirectShaderObjectCount");
    public static final OfInt LAYOUT$maxIndirectSequenceCount = ValueLayout.JAVA_INT.withName("maxIndirectSequenceCount");
    public static final OfInt LAYOUT$maxIndirectCommandsTokenCount = ValueLayout.JAVA_INT.withName("maxIndirectCommandsTokenCount");
    public static final OfInt LAYOUT$maxIndirectCommandsTokenOffset = ValueLayout.JAVA_INT.withName("maxIndirectCommandsTokenOffset");
    public static final OfInt LAYOUT$maxIndirectCommandsIndirectStride = ValueLayout.JAVA_INT.withName("maxIndirectCommandsIndirectStride");
    public static final OfInt LAYOUT$supportedIndirectCommandsInputModes = ValueLayout.JAVA_INT.withName("supportedIndirectCommandsInputModes");
    public static final OfInt LAYOUT$supportedIndirectCommandsShaderStages = ValueLayout.JAVA_INT.withName("supportedIndirectCommandsShaderStages");
    public static final OfInt LAYOUT$supportedIndirectCommandsShaderStagesPipelineBinding = ValueLayout.JAVA_INT.withName("supportedIndirectCommandsShaderStagesPipelineBinding");
    public static final OfInt LAYOUT$supportedIndirectCommandsShaderStagesShaderBinding = ValueLayout.JAVA_INT.withName("supportedIndirectCommandsShaderStagesShaderBinding");
    public static final OfInt LAYOUT$deviceGeneratedCommandsTransformFeedback = ValueLayout.JAVA_INT.withName("deviceGeneratedCommandsTransformFeedback");
    public static final OfInt LAYOUT$deviceGeneratedCommandsMultiDrawIndirectCount = ValueLayout.JAVA_INT.withName("deviceGeneratedCommandsMultiDrawIndirectCount");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$maxIndirectPipelineCount, LAYOUT$maxIndirectShaderObjectCount, LAYOUT$maxIndirectSequenceCount, LAYOUT$maxIndirectCommandsTokenCount, LAYOUT$maxIndirectCommandsTokenOffset, LAYOUT$maxIndirectCommandsIndirectStride, LAYOUT$supportedIndirectCommandsInputModes, LAYOUT$supportedIndirectCommandsShaderStages, LAYOUT$supportedIndirectCommandsShaderStagesPipelineBinding, LAYOUT$supportedIndirectCommandsShaderStagesShaderBinding, LAYOUT$deviceGeneratedCommandsTransformFeedback, LAYOUT$deviceGeneratedCommandsMultiDrawIndirectCount);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT[] ret = new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT clone(Arena arena, VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT src) {
        VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT[] clone(Arena arena, VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT[] src) {
        VkPhysicalDeviceDeviceGeneratedCommandsPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxIndirectPipelineCount = PathElement.groupElement("PATH$maxIndirectPipelineCount");
    public static final PathElement PATH$maxIndirectShaderObjectCount = PathElement.groupElement("PATH$maxIndirectShaderObjectCount");
    public static final PathElement PATH$maxIndirectSequenceCount = PathElement.groupElement("PATH$maxIndirectSequenceCount");
    public static final PathElement PATH$maxIndirectCommandsTokenCount = PathElement.groupElement("PATH$maxIndirectCommandsTokenCount");
    public static final PathElement PATH$maxIndirectCommandsTokenOffset = PathElement.groupElement("PATH$maxIndirectCommandsTokenOffset");
    public static final PathElement PATH$maxIndirectCommandsIndirectStride = PathElement.groupElement("PATH$maxIndirectCommandsIndirectStride");
    public static final PathElement PATH$supportedIndirectCommandsInputModes = PathElement.groupElement("PATH$supportedIndirectCommandsInputModes");
    public static final PathElement PATH$supportedIndirectCommandsShaderStages = PathElement.groupElement("PATH$supportedIndirectCommandsShaderStages");
    public static final PathElement PATH$supportedIndirectCommandsShaderStagesPipelineBinding = PathElement.groupElement("PATH$supportedIndirectCommandsShaderStagesPipelineBinding");
    public static final PathElement PATH$supportedIndirectCommandsShaderStagesShaderBinding = PathElement.groupElement("PATH$supportedIndirectCommandsShaderStagesShaderBinding");
    public static final PathElement PATH$deviceGeneratedCommandsTransformFeedback = PathElement.groupElement("PATH$deviceGeneratedCommandsTransformFeedback");
    public static final PathElement PATH$deviceGeneratedCommandsMultiDrawIndirectCount = PathElement.groupElement("PATH$deviceGeneratedCommandsMultiDrawIndirectCount");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxIndirectPipelineCount = LAYOUT$maxIndirectPipelineCount.byteSize();
    public static final long SIZE$maxIndirectShaderObjectCount = LAYOUT$maxIndirectShaderObjectCount.byteSize();
    public static final long SIZE$maxIndirectSequenceCount = LAYOUT$maxIndirectSequenceCount.byteSize();
    public static final long SIZE$maxIndirectCommandsTokenCount = LAYOUT$maxIndirectCommandsTokenCount.byteSize();
    public static final long SIZE$maxIndirectCommandsTokenOffset = LAYOUT$maxIndirectCommandsTokenOffset.byteSize();
    public static final long SIZE$maxIndirectCommandsIndirectStride = LAYOUT$maxIndirectCommandsIndirectStride.byteSize();
    public static final long SIZE$supportedIndirectCommandsInputModes = LAYOUT$supportedIndirectCommandsInputModes.byteSize();
    public static final long SIZE$supportedIndirectCommandsShaderStages = LAYOUT$supportedIndirectCommandsShaderStages.byteSize();
    public static final long SIZE$supportedIndirectCommandsShaderStagesPipelineBinding = LAYOUT$supportedIndirectCommandsShaderStagesPipelineBinding.byteSize();
    public static final long SIZE$supportedIndirectCommandsShaderStagesShaderBinding = LAYOUT$supportedIndirectCommandsShaderStagesShaderBinding.byteSize();
    public static final long SIZE$deviceGeneratedCommandsTransformFeedback = LAYOUT$deviceGeneratedCommandsTransformFeedback.byteSize();
    public static final long SIZE$deviceGeneratedCommandsMultiDrawIndirectCount = LAYOUT$deviceGeneratedCommandsMultiDrawIndirectCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxIndirectPipelineCount = LAYOUT.byteOffset(PATH$maxIndirectPipelineCount);
    public static final long OFFSET$maxIndirectShaderObjectCount = LAYOUT.byteOffset(PATH$maxIndirectShaderObjectCount);
    public static final long OFFSET$maxIndirectSequenceCount = LAYOUT.byteOffset(PATH$maxIndirectSequenceCount);
    public static final long OFFSET$maxIndirectCommandsTokenCount = LAYOUT.byteOffset(PATH$maxIndirectCommandsTokenCount);
    public static final long OFFSET$maxIndirectCommandsTokenOffset = LAYOUT.byteOffset(PATH$maxIndirectCommandsTokenOffset);
    public static final long OFFSET$maxIndirectCommandsIndirectStride = LAYOUT.byteOffset(PATH$maxIndirectCommandsIndirectStride);
    public static final long OFFSET$supportedIndirectCommandsInputModes = LAYOUT.byteOffset(PATH$supportedIndirectCommandsInputModes);
    public static final long OFFSET$supportedIndirectCommandsShaderStages = LAYOUT.byteOffset(PATH$supportedIndirectCommandsShaderStages);
    public static final long OFFSET$supportedIndirectCommandsShaderStagesPipelineBinding = LAYOUT.byteOffset(PATH$supportedIndirectCommandsShaderStagesPipelineBinding);
    public static final long OFFSET$supportedIndirectCommandsShaderStagesShaderBinding = LAYOUT.byteOffset(PATH$supportedIndirectCommandsShaderStagesShaderBinding);
    public static final long OFFSET$deviceGeneratedCommandsTransformFeedback = LAYOUT.byteOffset(PATH$deviceGeneratedCommandsTransformFeedback);
    public static final long OFFSET$deviceGeneratedCommandsMultiDrawIndirectCount = LAYOUT.byteOffset(PATH$deviceGeneratedCommandsMultiDrawIndirectCount);

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

    public @unsigned int maxIndirectPipelineCount() {
        return segment.get(LAYOUT$maxIndirectPipelineCount, OFFSET$maxIndirectPipelineCount);
    }

    public void maxIndirectPipelineCount(@unsigned int value) {
        segment.set(LAYOUT$maxIndirectPipelineCount, OFFSET$maxIndirectPipelineCount, value);
    }

    public @unsigned int maxIndirectShaderObjectCount() {
        return segment.get(LAYOUT$maxIndirectShaderObjectCount, OFFSET$maxIndirectShaderObjectCount);
    }

    public void maxIndirectShaderObjectCount(@unsigned int value) {
        segment.set(LAYOUT$maxIndirectShaderObjectCount, OFFSET$maxIndirectShaderObjectCount, value);
    }

    public @unsigned int maxIndirectSequenceCount() {
        return segment.get(LAYOUT$maxIndirectSequenceCount, OFFSET$maxIndirectSequenceCount);
    }

    public void maxIndirectSequenceCount(@unsigned int value) {
        segment.set(LAYOUT$maxIndirectSequenceCount, OFFSET$maxIndirectSequenceCount, value);
    }

    public @unsigned int maxIndirectCommandsTokenCount() {
        return segment.get(LAYOUT$maxIndirectCommandsTokenCount, OFFSET$maxIndirectCommandsTokenCount);
    }

    public void maxIndirectCommandsTokenCount(@unsigned int value) {
        segment.set(LAYOUT$maxIndirectCommandsTokenCount, OFFSET$maxIndirectCommandsTokenCount, value);
    }

    public @unsigned int maxIndirectCommandsTokenOffset() {
        return segment.get(LAYOUT$maxIndirectCommandsTokenOffset, OFFSET$maxIndirectCommandsTokenOffset);
    }

    public void maxIndirectCommandsTokenOffset(@unsigned int value) {
        segment.set(LAYOUT$maxIndirectCommandsTokenOffset, OFFSET$maxIndirectCommandsTokenOffset, value);
    }

    public @unsigned int maxIndirectCommandsIndirectStride() {
        return segment.get(LAYOUT$maxIndirectCommandsIndirectStride, OFFSET$maxIndirectCommandsIndirectStride);
    }

    public void maxIndirectCommandsIndirectStride(@unsigned int value) {
        segment.set(LAYOUT$maxIndirectCommandsIndirectStride, OFFSET$maxIndirectCommandsIndirectStride, value);
    }

    public @enumtype(VkIndirectCommandsInputModeFlagsEXT.class) int supportedIndirectCommandsInputModes() {
        return segment.get(LAYOUT$supportedIndirectCommandsInputModes, OFFSET$supportedIndirectCommandsInputModes);
    }

    public void supportedIndirectCommandsInputModes(@enumtype(VkIndirectCommandsInputModeFlagsEXT.class) int value) {
        segment.set(LAYOUT$supportedIndirectCommandsInputModes, OFFSET$supportedIndirectCommandsInputModes, value);
    }

    public @enumtype(VkShaderStageFlags.class) int supportedIndirectCommandsShaderStages() {
        return segment.get(LAYOUT$supportedIndirectCommandsShaderStages, OFFSET$supportedIndirectCommandsShaderStages);
    }

    public void supportedIndirectCommandsShaderStages(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$supportedIndirectCommandsShaderStages, OFFSET$supportedIndirectCommandsShaderStages, value);
    }

    public @enumtype(VkShaderStageFlags.class) int supportedIndirectCommandsShaderStagesPipelineBinding() {
        return segment.get(LAYOUT$supportedIndirectCommandsShaderStagesPipelineBinding, OFFSET$supportedIndirectCommandsShaderStagesPipelineBinding);
    }

    public void supportedIndirectCommandsShaderStagesPipelineBinding(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$supportedIndirectCommandsShaderStagesPipelineBinding, OFFSET$supportedIndirectCommandsShaderStagesPipelineBinding, value);
    }

    public @enumtype(VkShaderStageFlags.class) int supportedIndirectCommandsShaderStagesShaderBinding() {
        return segment.get(LAYOUT$supportedIndirectCommandsShaderStagesShaderBinding, OFFSET$supportedIndirectCommandsShaderStagesShaderBinding);
    }

    public void supportedIndirectCommandsShaderStagesShaderBinding(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$supportedIndirectCommandsShaderStagesShaderBinding, OFFSET$supportedIndirectCommandsShaderStagesShaderBinding, value);
    }

    public @unsigned int deviceGeneratedCommandsTransformFeedback() {
        return segment.get(LAYOUT$deviceGeneratedCommandsTransformFeedback, OFFSET$deviceGeneratedCommandsTransformFeedback);
    }

    public void deviceGeneratedCommandsTransformFeedback(@unsigned int value) {
        segment.set(LAYOUT$deviceGeneratedCommandsTransformFeedback, OFFSET$deviceGeneratedCommandsTransformFeedback, value);
    }

    public @unsigned int deviceGeneratedCommandsMultiDrawIndirectCount() {
        return segment.get(LAYOUT$deviceGeneratedCommandsMultiDrawIndirectCount, OFFSET$deviceGeneratedCommandsMultiDrawIndirectCount);
    }

    public void deviceGeneratedCommandsMultiDrawIndirectCount(@unsigned int value) {
        segment.set(LAYOUT$deviceGeneratedCommandsMultiDrawIndirectCount, OFFSET$deviceGeneratedCommandsMultiDrawIndirectCount, value);
    }

}
/// dummy, not implemented yet
