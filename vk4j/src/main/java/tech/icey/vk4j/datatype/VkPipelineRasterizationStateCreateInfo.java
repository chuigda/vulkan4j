package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
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
/// typedef struct VkPipelineRasterizationStateCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineRasterizationStateCreateFlags flags;
///     VkBool32 depthClampEnable;
///     VkBool32 rasterizerDiscardEnable;
///     VkPolygonMode polygonMode;
///     VkCullModeFlags cullMode;
///     VkFrontFace frontFace;
///     VkBool32 depthBiasEnable;
///     float depthBiasConstantFactor;
///     float depthBiasClamp;
///     float depthBiasSlopeFactor;
///     float lineWidth;
/// } VkPipelineRasterizationStateCreateInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineRasterizationStateCreateInfo.html">VkPipelineRasterizationStateCreateInfo</a>
public record VkPipelineRasterizationStateCreateInfo(MemorySegment segment) implements IPointer {
    public VkPipelineRasterizationStateCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @enumtype(VkPipelineRasterizationStateCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineRasterizationStateCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int depthClampEnable() {
        return segment.get(LAYOUT$depthClampEnable, OFFSET$depthClampEnable);
    }

    public void depthClampEnable(@unsigned int value) {
        segment.set(LAYOUT$depthClampEnable, OFFSET$depthClampEnable, value);
    }

    public @unsigned int rasterizerDiscardEnable() {
        return segment.get(LAYOUT$rasterizerDiscardEnable, OFFSET$rasterizerDiscardEnable);
    }

    public void rasterizerDiscardEnable(@unsigned int value) {
        segment.set(LAYOUT$rasterizerDiscardEnable, OFFSET$rasterizerDiscardEnable, value);
    }

    public @enumtype(VkPolygonMode.class) int polygonMode() {
        return segment.get(LAYOUT$polygonMode, OFFSET$polygonMode);
    }

    public void polygonMode(@enumtype(VkPolygonMode.class) int value) {
        segment.set(LAYOUT$polygonMode, OFFSET$polygonMode, value);
    }

    public @enumtype(VkCullModeFlags.class) int cullMode() {
        return segment.get(LAYOUT$cullMode, OFFSET$cullMode);
    }

    public void cullMode(@enumtype(VkCullModeFlags.class) int value) {
        segment.set(LAYOUT$cullMode, OFFSET$cullMode, value);
    }

    public @enumtype(VkFrontFace.class) int frontFace() {
        return segment.get(LAYOUT$frontFace, OFFSET$frontFace);
    }

    public void frontFace(@enumtype(VkFrontFace.class) int value) {
        segment.set(LAYOUT$frontFace, OFFSET$frontFace, value);
    }

    public @unsigned int depthBiasEnable() {
        return segment.get(LAYOUT$depthBiasEnable, OFFSET$depthBiasEnable);
    }

    public void depthBiasEnable(@unsigned int value) {
        segment.set(LAYOUT$depthBiasEnable, OFFSET$depthBiasEnable, value);
    }

    public float depthBiasConstantFactor() {
        return segment.get(LAYOUT$depthBiasConstantFactor, OFFSET$depthBiasConstantFactor);
    }

    public void depthBiasConstantFactor(float value) {
        segment.set(LAYOUT$depthBiasConstantFactor, OFFSET$depthBiasConstantFactor, value);
    }

    public float depthBiasClamp() {
        return segment.get(LAYOUT$depthBiasClamp, OFFSET$depthBiasClamp);
    }

    public void depthBiasClamp(float value) {
        segment.set(LAYOUT$depthBiasClamp, OFFSET$depthBiasClamp, value);
    }

    public float depthBiasSlopeFactor() {
        return segment.get(LAYOUT$depthBiasSlopeFactor, OFFSET$depthBiasSlopeFactor);
    }

    public void depthBiasSlopeFactor(float value) {
        segment.set(LAYOUT$depthBiasSlopeFactor, OFFSET$depthBiasSlopeFactor, value);
    }

    public float lineWidth() {
        return segment.get(LAYOUT$lineWidth, OFFSET$lineWidth);
    }

    public void lineWidth(float value) {
        segment.set(LAYOUT$lineWidth, OFFSET$lineWidth, value);
    }

    public static VkPipelineRasterizationStateCreateInfo allocate(Arena arena) {
        return new VkPipelineRasterizationStateCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkPipelineRasterizationStateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineRasterizationStateCreateInfo[] ret = new VkPipelineRasterizationStateCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineRasterizationStateCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineRasterizationStateCreateInfo clone(Arena arena, VkPipelineRasterizationStateCreateInfo src) {
        VkPipelineRasterizationStateCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineRasterizationStateCreateInfo[] clone(Arena arena, VkPipelineRasterizationStateCreateInfo[] src) {
        VkPipelineRasterizationStateCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("depthClampEnable"),
        ValueLayout.JAVA_INT.withName("rasterizerDiscardEnable"),
        ValueLayout.JAVA_INT.withName("polygonMode"),
        ValueLayout.JAVA_INT.withName("cullMode"),
        ValueLayout.JAVA_INT.withName("frontFace"),
        ValueLayout.JAVA_INT.withName("depthBiasEnable"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasConstantFactor"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasClamp"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasSlopeFactor"),
        ValueLayout.JAVA_FLOAT.withName("lineWidth")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$depthClampEnable = PathElement.groupElement("depthClampEnable");
    public static final PathElement PATH$rasterizerDiscardEnable = PathElement.groupElement("rasterizerDiscardEnable");
    public static final PathElement PATH$polygonMode = PathElement.groupElement("polygonMode");
    public static final PathElement PATH$cullMode = PathElement.groupElement("cullMode");
    public static final PathElement PATH$frontFace = PathElement.groupElement("frontFace");
    public static final PathElement PATH$depthBiasEnable = PathElement.groupElement("depthBiasEnable");
    public static final PathElement PATH$depthBiasConstantFactor = PathElement.groupElement("depthBiasConstantFactor");
    public static final PathElement PATH$depthBiasClamp = PathElement.groupElement("depthBiasClamp");
    public static final PathElement PATH$depthBiasSlopeFactor = PathElement.groupElement("depthBiasSlopeFactor");
    public static final PathElement PATH$lineWidth = PathElement.groupElement("lineWidth");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$depthClampEnable = (OfInt) LAYOUT.select(PATH$depthClampEnable);
    public static final OfInt LAYOUT$rasterizerDiscardEnable = (OfInt) LAYOUT.select(PATH$rasterizerDiscardEnable);
    public static final OfInt LAYOUT$polygonMode = (OfInt) LAYOUT.select(PATH$polygonMode);
    public static final OfInt LAYOUT$cullMode = (OfInt) LAYOUT.select(PATH$cullMode);
    public static final OfInt LAYOUT$frontFace = (OfInt) LAYOUT.select(PATH$frontFace);
    public static final OfInt LAYOUT$depthBiasEnable = (OfInt) LAYOUT.select(PATH$depthBiasEnable);
    public static final OfFloat LAYOUT$depthBiasConstantFactor = (OfFloat) LAYOUT.select(PATH$depthBiasConstantFactor);
    public static final OfFloat LAYOUT$depthBiasClamp = (OfFloat) LAYOUT.select(PATH$depthBiasClamp);
    public static final OfFloat LAYOUT$depthBiasSlopeFactor = (OfFloat) LAYOUT.select(PATH$depthBiasSlopeFactor);
    public static final OfFloat LAYOUT$lineWidth = (OfFloat) LAYOUT.select(PATH$lineWidth);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$depthClampEnable = LAYOUT.byteOffset(PATH$depthClampEnable);
    public static final long OFFSET$rasterizerDiscardEnable = LAYOUT.byteOffset(PATH$rasterizerDiscardEnable);
    public static final long OFFSET$polygonMode = LAYOUT.byteOffset(PATH$polygonMode);
    public static final long OFFSET$cullMode = LAYOUT.byteOffset(PATH$cullMode);
    public static final long OFFSET$frontFace = LAYOUT.byteOffset(PATH$frontFace);
    public static final long OFFSET$depthBiasEnable = LAYOUT.byteOffset(PATH$depthBiasEnable);
    public static final long OFFSET$depthBiasConstantFactor = LAYOUT.byteOffset(PATH$depthBiasConstantFactor);
    public static final long OFFSET$depthBiasClamp = LAYOUT.byteOffset(PATH$depthBiasClamp);
    public static final long OFFSET$depthBiasSlopeFactor = LAYOUT.byteOffset(PATH$depthBiasSlopeFactor);
    public static final long OFFSET$lineWidth = LAYOUT.byteOffset(PATH$lineWidth);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$depthClampEnable = LAYOUT$depthClampEnable.byteSize();
    public static final long SIZE$rasterizerDiscardEnable = LAYOUT$rasterizerDiscardEnable.byteSize();
    public static final long SIZE$polygonMode = LAYOUT$polygonMode.byteSize();
    public static final long SIZE$cullMode = LAYOUT$cullMode.byteSize();
    public static final long SIZE$frontFace = LAYOUT$frontFace.byteSize();
    public static final long SIZE$depthBiasEnable = LAYOUT$depthBiasEnable.byteSize();
    public static final long SIZE$depthBiasConstantFactor = LAYOUT$depthBiasConstantFactor.byteSize();
    public static final long SIZE$depthBiasClamp = LAYOUT$depthBiasClamp.byteSize();
    public static final long SIZE$depthBiasSlopeFactor = LAYOUT$depthBiasSlopeFactor.byteSize();
    public static final long SIZE$lineWidth = LAYOUT$lineWidth.byteSize();
}
