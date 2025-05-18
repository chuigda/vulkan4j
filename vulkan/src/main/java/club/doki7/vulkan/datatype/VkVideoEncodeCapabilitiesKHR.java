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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeCapabilitiesKHR.html"><code>VkVideoEncodeCapabilitiesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeCapabilitiesKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkVideoEncodeCapabilityFlagsKHR flags; // @link substring="VkVideoEncodeCapabilityFlagsKHR" target="VkVideoEncodeCapabilityFlagsKHR" @link substring="flags" target="#flags"
///     VkVideoEncodeRateControlModeFlagsKHR rateControlModes; // @link substring="VkVideoEncodeRateControlModeFlagsKHR" target="VkVideoEncodeRateControlModeFlagsKHR" @link substring="rateControlModes" target="#rateControlModes"
///     uint32_t maxRateControlLayers; // @link substring="maxRateControlLayers" target="#maxRateControlLayers"
///     uint64_t maxBitrate; // @link substring="maxBitrate" target="#maxBitrate"
///     uint32_t maxQualityLevels; // @link substring="maxQualityLevels" target="#maxQualityLevels"
///     VkExtent2D encodeInputPictureGranularity; // @link substring="VkExtent2D" target="VkExtent2D" @link substring="encodeInputPictureGranularity" target="#encodeInputPictureGranularity"
///     VkVideoEncodeFeedbackFlagsKHR supportedEncodeFeedbackFlags; // @link substring="VkVideoEncodeFeedbackFlagsKHR" target="VkVideoEncodeFeedbackFlagsKHR" @link substring="supportedEncodeFeedbackFlags" target="#supportedEncodeFeedbackFlags"
/// } VkVideoEncodeCapabilitiesKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_CAPABILITIES_KHR`
///
/// The {@link VkVideoEncodeCapabilitiesKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoEncodeCapabilitiesKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeCapabilitiesKHR.html"><code>VkVideoEncodeCapabilitiesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeCapabilitiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeCapabilitiesKHR allocate(Arena arena) {
        VkVideoEncodeCapabilitiesKHR ret = new VkVideoEncodeCapabilitiesKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_CAPABILITIES_KHR);
        return ret;
    }

    public static VkVideoEncodeCapabilitiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeCapabilitiesKHR[] ret = new VkVideoEncodeCapabilitiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeCapabilitiesKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_CAPABILITIES_KHR);
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

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_CAPABILITIES_KHR);
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

    public @NotNull VkExtent2D encodeInputPictureGranularity() {
        return new VkExtent2D(segment.asSlice(OFFSET$encodeInputPictureGranularity, LAYOUT$encodeInputPictureGranularity));
    }

    public void encodeInputPictureGranularity(@NotNull VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$encodeInputPictureGranularity, SIZE$encodeInputPictureGranularity);
    }

    public @enumtype(VkVideoEncodeFeedbackFlagsKHR.class) int supportedEncodeFeedbackFlags() {
        return segment.get(LAYOUT$supportedEncodeFeedbackFlags, OFFSET$supportedEncodeFeedbackFlags);
    }

    public void supportedEncodeFeedbackFlags(@enumtype(VkVideoEncodeFeedbackFlagsKHR.class) int value) {
        segment.set(LAYOUT$supportedEncodeFeedbackFlags, OFFSET$supportedEncodeFeedbackFlags, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("rateControlModes"),
        ValueLayout.JAVA_INT.withName("maxRateControlLayers"),
        ValueLayout.JAVA_LONG.withName("maxBitrate"),
        ValueLayout.JAVA_INT.withName("maxQualityLevels"),
        VkExtent2D.LAYOUT.withName("encodeInputPictureGranularity"),
        ValueLayout.JAVA_INT.withName("supportedEncodeFeedbackFlags")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$rateControlModes = PathElement.groupElement("PATH$rateControlModes");
    public static final PathElement PATH$maxRateControlLayers = PathElement.groupElement("PATH$maxRateControlLayers");
    public static final PathElement PATH$maxBitrate = PathElement.groupElement("PATH$maxBitrate");
    public static final PathElement PATH$maxQualityLevels = PathElement.groupElement("PATH$maxQualityLevels");
    public static final PathElement PATH$encodeInputPictureGranularity = PathElement.groupElement("PATH$encodeInputPictureGranularity");
    public static final PathElement PATH$supportedEncodeFeedbackFlags = PathElement.groupElement("PATH$supportedEncodeFeedbackFlags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$rateControlModes = (OfInt) LAYOUT.select(PATH$rateControlModes);
    public static final OfInt LAYOUT$maxRateControlLayers = (OfInt) LAYOUT.select(PATH$maxRateControlLayers);
    public static final OfLong LAYOUT$maxBitrate = (OfLong) LAYOUT.select(PATH$maxBitrate);
    public static final OfInt LAYOUT$maxQualityLevels = (OfInt) LAYOUT.select(PATH$maxQualityLevels);
    public static final StructLayout LAYOUT$encodeInputPictureGranularity = (StructLayout) LAYOUT.select(PATH$encodeInputPictureGranularity);
    public static final OfInt LAYOUT$supportedEncodeFeedbackFlags = (OfInt) LAYOUT.select(PATH$supportedEncodeFeedbackFlags);

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
}
