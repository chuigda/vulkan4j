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

public record VkVideoEncodeCapabilitiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$rateControlModes = ValueLayout.JAVA_INT.withName("rateControlModes");
    public static final OfInt LAYOUT$maxRateControlLayers = ValueLayout.JAVA_INT.withName("maxRateControlLayers");
    public static final OfLong LAYOUT$maxBitrate = ValueLayout.JAVA_LONG.withName("maxBitrate");
    public static final OfInt LAYOUT$maxQualityLevels = ValueLayout.JAVA_INT.withName("maxQualityLevels");
    public static final StructLayout LAYOUT$encodeInputPictureGranularity = VkExtent2D.LAYOUT.withName("encodeInputPictureGranularity");
    public static final OfInt LAYOUT$supportedEncodeFeedbackFlags = ValueLayout.JAVA_INT.withName("supportedEncodeFeedbackFlags");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$rateControlModes, LAYOUT$maxRateControlLayers, LAYOUT$maxBitrate, LAYOUT$maxQualityLevels, LAYOUT$encodeInputPictureGranularity, LAYOUT$supportedEncodeFeedbackFlags);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeCapabilitiesKHR allocate(Arena arena) {
        return new VkVideoEncodeCapabilitiesKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeCapabilitiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeCapabilitiesKHR[] ret = new VkVideoEncodeCapabilitiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeCapabilitiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeCapabilitiesKHR clone(Arena arena, VkVideoEncodeCapabilitiesKHR src) {
        VkVideoEncodeCapabilitiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeCapabilitiesKHR[] clone(Arena arena, VkVideoEncodeCapabilitiesKHR[] src) {
        VkVideoEncodeCapabilitiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$rateControlModes = PathElement.groupElement("PATH$rateControlModes");
    public static final PathElement PATH$maxRateControlLayers = PathElement.groupElement("PATH$maxRateControlLayers");
    public static final PathElement PATH$maxBitrate = PathElement.groupElement("PATH$maxBitrate");
    public static final PathElement PATH$maxQualityLevels = PathElement.groupElement("PATH$maxQualityLevels");
    public static final PathElement PATH$encodeInputPictureGranularity = PathElement.groupElement("PATH$encodeInputPictureGranularity");
    public static final PathElement PATH$supportedEncodeFeedbackFlags = PathElement.groupElement("PATH$supportedEncodeFeedbackFlags");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$rateControlModes = LAYOUT$rateControlModes.byteSize();
    public static final long SIZE$maxRateControlLayers = LAYOUT$maxRateControlLayers.byteSize();
    public static final long SIZE$maxBitrate = LAYOUT$maxBitrate.byteSize();
    public static final long SIZE$maxQualityLevels = LAYOUT$maxQualityLevels.byteSize();
    public static final long SIZE$encodeInputPictureGranularity = LAYOUT$encodeInputPictureGranularity.byteSize();
    public static final long SIZE$supportedEncodeFeedbackFlags = LAYOUT$supportedEncodeFeedbackFlags.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$rateControlModes = LAYOUT.byteOffset(PATH$rateControlModes);
    public static final long OFFSET$maxRateControlLayers = LAYOUT.byteOffset(PATH$maxRateControlLayers);
    public static final long OFFSET$maxBitrate = LAYOUT.byteOffset(PATH$maxBitrate);
    public static final long OFFSET$maxQualityLevels = LAYOUT.byteOffset(PATH$maxQualityLevels);
    public static final long OFFSET$encodeInputPictureGranularity = LAYOUT.byteOffset(PATH$encodeInputPictureGranularity);
    public static final long OFFSET$supportedEncodeFeedbackFlags = LAYOUT.byteOffset(PATH$supportedEncodeFeedbackFlags);

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

    public @enumtype(VkVideoEncodeCapabilityFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkVideoEncodeCapabilityFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkVideoEncodeRateControlModeFlagsKHR.class) int rateControlModes() {
        return segment.get(LAYOUT$rateControlModes, OFFSET$rateControlModes);
    }

    public void rateControlModes(@enumtype(VkVideoEncodeRateControlModeFlagsKHR.class) int value) {
        segment.set(LAYOUT$rateControlModes, OFFSET$rateControlModes, value);
    }

    public @unsigned int maxRateControlLayers() {
        return segment.get(LAYOUT$maxRateControlLayers, OFFSET$maxRateControlLayers);
    }

    public void maxRateControlLayers(@unsigned int value) {
        segment.set(LAYOUT$maxRateControlLayers, OFFSET$maxRateControlLayers, value);
    }

    public @unsigned long maxBitrate() {
        return segment.get(LAYOUT$maxBitrate, OFFSET$maxBitrate);
    }

    public void maxBitrate(@unsigned long value) {
        segment.set(LAYOUT$maxBitrate, OFFSET$maxBitrate, value);
    }

    public @unsigned int maxQualityLevels() {
        return segment.get(LAYOUT$maxQualityLevels, OFFSET$maxQualityLevels);
    }

    public void maxQualityLevels(@unsigned int value) {
        segment.set(LAYOUT$maxQualityLevels, OFFSET$maxQualityLevels, value);
    }

    public VkExtent2D encodeInputPictureGranularity() {
        return new VkExtent2D(segment.asSlice(OFFSET$encodeInputPictureGranularity, LAYOUT$encodeInputPictureGranularity));
    }

    public void encodeInputPictureGranularity(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$encodeInputPictureGranularity, SIZE$encodeInputPictureGranularity);
    }

    public @enumtype(VkVideoEncodeFeedbackFlagsKHR.class) int supportedEncodeFeedbackFlags() {
        return segment.get(LAYOUT$supportedEncodeFeedbackFlags, OFFSET$supportedEncodeFeedbackFlags);
    }

    public void supportedEncodeFeedbackFlags(@enumtype(VkVideoEncodeFeedbackFlagsKHR.class) int value) {
        segment.set(LAYOUT$supportedEncodeFeedbackFlags, OFFSET$supportedEncodeFeedbackFlags, value);
    }

}
/// dummy, not implemented yet
