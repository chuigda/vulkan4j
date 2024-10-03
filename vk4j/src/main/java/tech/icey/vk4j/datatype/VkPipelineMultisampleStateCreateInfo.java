package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.panama.buffer.IntBuffer;
import tech.icey.vk4j.bitmask.VkPipelineMultisampleStateCreateFlags;
import tech.icey.vk4j.bitmask.VkSampleCountFlags;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO;

/// {@snippet lang=c :
/// typedef struct VkPipelineMultisampleStateCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineMultisampleStateCreateFlags flags;
///     VkSampleCountFlagBits rasterizationSamples;
///     VkBool32 sampleShadingEnable;
///     float minSampleShading;
///     const VkSampleMask* pSampleMask;
///     VkBool32 alphaToCoverageEnable;
///     VkBool32 alphaToOneEnable;
/// } VkPipelineMultisampleStateCreateInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineMultisampleStateCreateInfo.html">VkPipelineMultisampleStateCreateInfo</a>
public record VkPipelineMultisampleStateCreateInfo(MemorySegment segment) implements IPointer {
    public VkPipelineMultisampleStateCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO);
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

    public @enumtype(VkPipelineMultisampleStateCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineMultisampleStateCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkSampleCountFlags.class) int rasterizationSamples() {
        return segment.get(LAYOUT$rasterizationSamples, OFFSET$rasterizationSamples);
    }

    public void rasterizationSamples(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$rasterizationSamples, OFFSET$rasterizationSamples, value);
    }

    public @unsigned int sampleShadingEnable() {
        return segment.get(LAYOUT$sampleShadingEnable, OFFSET$sampleShadingEnable);
    }

    public void sampleShadingEnable(@unsigned int value) {
        segment.set(LAYOUT$sampleShadingEnable, OFFSET$sampleShadingEnable, value);
    }

    public float minSampleShading() {
        return segment.get(LAYOUT$minSampleShading, OFFSET$minSampleShading);
    }

    public void minSampleShading(float value) {
        segment.set(LAYOUT$minSampleShading, OFFSET$minSampleShading, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pSampleMaskRaw() {
        return segment.get(LAYOUT$pSampleMask, OFFSET$pSampleMask);
    }

    public void pSampleMaskRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pSampleMask, OFFSET$pSampleMask, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or
    /// {@link IntBuffer#write}ing the buffer.
    public @nullable @unsigned IntBuffer pSampleMask() {
        MemorySegment s = pSampleMaskRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pSampleMask(@nullable @unsigned IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSampleMaskRaw(s);
    }

    public @unsigned int alphaToCoverageEnable() {
        return segment.get(LAYOUT$alphaToCoverageEnable, OFFSET$alphaToCoverageEnable);
    }

    public void alphaToCoverageEnable(@unsigned int value) {
        segment.set(LAYOUT$alphaToCoverageEnable, OFFSET$alphaToCoverageEnable, value);
    }

    public @unsigned int alphaToOneEnable() {
        return segment.get(LAYOUT$alphaToOneEnable, OFFSET$alphaToOneEnable);
    }

    public void alphaToOneEnable(@unsigned int value) {
        segment.set(LAYOUT$alphaToOneEnable, OFFSET$alphaToOneEnable, value);
    }

    public static VkPipelineMultisampleStateCreateInfo allocate(Arena arena) {
        return new VkPipelineMultisampleStateCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkPipelineMultisampleStateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineMultisampleStateCreateInfo[] ret = new VkPipelineMultisampleStateCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineMultisampleStateCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineMultisampleStateCreateInfo clone(Arena arena, VkPipelineMultisampleStateCreateInfo src) {
        VkPipelineMultisampleStateCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineMultisampleStateCreateInfo[] clone(Arena arena, VkPipelineMultisampleStateCreateInfo[] src) {
        VkPipelineMultisampleStateCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("rasterizationSamples"),
        ValueLayout.JAVA_INT.withName("sampleShadingEnable"),
        ValueLayout.JAVA_FLOAT.withName("minSampleShading"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pSampleMask"),
        ValueLayout.JAVA_INT.withName("alphaToCoverageEnable"),
        ValueLayout.JAVA_INT.withName("alphaToOneEnable")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$rasterizationSamples = PathElement.groupElement("rasterizationSamples");
    public static final PathElement PATH$sampleShadingEnable = PathElement.groupElement("sampleShadingEnable");
    public static final PathElement PATH$minSampleShading = PathElement.groupElement("minSampleShading");
    public static final PathElement PATH$pSampleMask = PathElement.groupElement("pSampleMask");
    public static final PathElement PATH$alphaToCoverageEnable = PathElement.groupElement("alphaToCoverageEnable");
    public static final PathElement PATH$alphaToOneEnable = PathElement.groupElement("alphaToOneEnable");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$rasterizationSamples = (OfInt) LAYOUT.select(PATH$rasterizationSamples);
    public static final OfInt LAYOUT$sampleShadingEnable = (OfInt) LAYOUT.select(PATH$sampleShadingEnable);
    public static final OfFloat LAYOUT$minSampleShading = (OfFloat) LAYOUT.select(PATH$minSampleShading);
    public static final AddressLayout LAYOUT$pSampleMask = (AddressLayout) LAYOUT.select(PATH$pSampleMask);
    public static final OfInt LAYOUT$alphaToCoverageEnable = (OfInt) LAYOUT.select(PATH$alphaToCoverageEnable);
    public static final OfInt LAYOUT$alphaToOneEnable = (OfInt) LAYOUT.select(PATH$alphaToOneEnable);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$rasterizationSamples = LAYOUT.byteOffset(PATH$rasterizationSamples);
    public static final long OFFSET$sampleShadingEnable = LAYOUT.byteOffset(PATH$sampleShadingEnable);
    public static final long OFFSET$minSampleShading = LAYOUT.byteOffset(PATH$minSampleShading);
    public static final long OFFSET$pSampleMask = LAYOUT.byteOffset(PATH$pSampleMask);
    public static final long OFFSET$alphaToCoverageEnable = LAYOUT.byteOffset(PATH$alphaToCoverageEnable);
    public static final long OFFSET$alphaToOneEnable = LAYOUT.byteOffset(PATH$alphaToOneEnable);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$rasterizationSamples = LAYOUT$rasterizationSamples.byteSize();
    public static final long SIZE$sampleShadingEnable = LAYOUT$sampleShadingEnable.byteSize();
    public static final long SIZE$minSampleShading = LAYOUT$minSampleShading.byteSize();
    public static final long SIZE$pSampleMask = LAYOUT$pSampleMask.byteSize();
    public static final long SIZE$alphaToCoverageEnable = LAYOUT$alphaToCoverageEnable.byteSize();
    public static final long SIZE$alphaToOneEnable = LAYOUT$alphaToOneEnable.byteSize();
}
