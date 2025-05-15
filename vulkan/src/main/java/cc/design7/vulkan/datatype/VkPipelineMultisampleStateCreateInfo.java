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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineMultisampleStateCreateInfo.html">VkPipelineMultisampleStateCreateInfo</a>
@ValueBasedCandidate
public record VkPipelineMultisampleStateCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$rasterizationSamples = ValueLayout.JAVA_INT.withName("rasterizationSamples");
    public static final OfInt LAYOUT$sampleShadingEnable = ValueLayout.JAVA_INT.withName("sampleShadingEnable");
    public static final OfFloat LAYOUT$minSampleShading = ValueLayout.JAVA_FLOAT.withName("minSampleShading");
    public static final AddressLayout LAYOUT$pSampleMask = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pSampleMask");
    public static final OfInt LAYOUT$alphaToCoverageEnable = ValueLayout.JAVA_INT.withName("alphaToCoverageEnable");
    public static final OfInt LAYOUT$alphaToOneEnable = ValueLayout.JAVA_INT.withName("alphaToOneEnable");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$rasterizationSamples, LAYOUT$sampleShadingEnable, LAYOUT$minSampleShading, LAYOUT$pSampleMask, LAYOUT$alphaToCoverageEnable, LAYOUT$alphaToOneEnable);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineMultisampleStateCreateInfo allocate(Arena arena) {
        return new VkPipelineMultisampleStateCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkPipelineMultisampleStateCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineMultisampleStateCreateInfo[] ret = new VkPipelineMultisampleStateCreateInfo[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$rasterizationSamples = PathElement.groupElement("PATH$rasterizationSamples");
    public static final PathElement PATH$sampleShadingEnable = PathElement.groupElement("PATH$sampleShadingEnable");
    public static final PathElement PATH$minSampleShading = PathElement.groupElement("PATH$minSampleShading");
    public static final PathElement PATH$pSampleMask = PathElement.groupElement("PATH$pSampleMask");
    public static final PathElement PATH$alphaToCoverageEnable = PathElement.groupElement("PATH$alphaToCoverageEnable");
    public static final PathElement PATH$alphaToOneEnable = PathElement.groupElement("PATH$alphaToOneEnable");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$rasterizationSamples = LAYOUT$rasterizationSamples.byteSize();
    public static final long SIZE$sampleShadingEnable = LAYOUT$sampleShadingEnable.byteSize();
    public static final long SIZE$minSampleShading = LAYOUT$minSampleShading.byteSize();
    public static final long SIZE$pSampleMask = LAYOUT$pSampleMask.byteSize();
    public static final long SIZE$alphaToCoverageEnable = LAYOUT$alphaToCoverageEnable.byteSize();
    public static final long SIZE$alphaToOneEnable = LAYOUT$alphaToOneEnable.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$rasterizationSamples = LAYOUT.byteOffset(PATH$rasterizationSamples);
    public static final long OFFSET$sampleShadingEnable = LAYOUT.byteOffset(PATH$sampleShadingEnable);
    public static final long OFFSET$minSampleShading = LAYOUT.byteOffset(PATH$minSampleShading);
    public static final long OFFSET$pSampleMask = LAYOUT.byteOffset(PATH$pSampleMask);
    public static final long OFFSET$alphaToCoverageEnable = LAYOUT.byteOffset(PATH$alphaToCoverageEnable);
    public static final long OFFSET$alphaToOneEnable = LAYOUT.byteOffset(PATH$alphaToOneEnable);

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

    public @pointer(comment="int*") MemorySegment pSampleMaskRaw() {
        return segment.get(LAYOUT$pSampleMask, OFFSET$pSampleMask);
    }

    public void pSampleMaskRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pSampleMask, OFFSET$pSampleMask, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pSampleMask() {
        MemorySegment s = pSampleMaskRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pSampleMask(@Nullable @unsigned IntPtr value) {
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

}
