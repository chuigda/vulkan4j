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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264CapabilitiesKHR.html"><code>VkVideoEncodeH264CapabilitiesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH264CapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkVideoEncodeH264CapabilityFlagsKHR flags;
///     StdVideoH264LevelIdc maxLevelIdc;
///     uint32_t maxSliceCount;
///     uint32_t maxPPictureL0ReferenceCount;
///     uint32_t maxBPictureL0ReferenceCount;
///     uint32_t maxL1ReferenceCount;
///     uint32_t maxTemporalLayerCount;
///     VkBool32 expectDyadicTemporalLayerPattern;
///     int32_t minQp;
///     int32_t maxQp;
///     VkBool32 prefersGopRemainingFrames;
///     VkBool32 requiresGopRemainingFrames;
///     VkVideoEncodeH264StdFlagsKHR stdSyntaxFlags;
/// } VkVideoEncodeH264CapabilitiesKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_CAPABILITIES_KHR`
///
/// The {@link VkVideoEncodeH264CapabilitiesKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoEncodeH264CapabilitiesKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264CapabilitiesKHR.html"><code>VkVideoEncodeH264CapabilitiesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH264CapabilitiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeH264CapabilitiesKHR allocate(Arena arena) {
        VkVideoEncodeH264CapabilitiesKHR ret = new VkVideoEncodeH264CapabilitiesKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_H264_CAPABILITIES_KHR);
        return ret;
    }

    public static VkVideoEncodeH264CapabilitiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH264CapabilitiesKHR[] ret = new VkVideoEncodeH264CapabilitiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH264CapabilitiesKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_H264_CAPABILITIES_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeH264CapabilitiesKHR clone(Arena arena, VkVideoEncodeH264CapabilitiesKHR src) {
        VkVideoEncodeH264CapabilitiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH264CapabilitiesKHR[] clone(Arena arena, VkVideoEncodeH264CapabilitiesKHR[] src) {
        VkVideoEncodeH264CapabilitiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_H264_CAPABILITIES_KHR);
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

    public @enumtype(VkVideoEncodeH264CapabilityFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkVideoEncodeH264CapabilityFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(StdVideoH264LevelIdc.class) int maxLevelIdc() {
        return segment.get(LAYOUT$maxLevelIdc, OFFSET$maxLevelIdc);
    }

    public void maxLevelIdc(@enumtype(StdVideoH264LevelIdc.class) int value) {
        segment.set(LAYOUT$maxLevelIdc, OFFSET$maxLevelIdc, value);
    }

    public @unsigned int maxSliceCount() {
        return segment.get(LAYOUT$maxSliceCount, OFFSET$maxSliceCount);
    }

    public void maxSliceCount(@unsigned int value) {
        segment.set(LAYOUT$maxSliceCount, OFFSET$maxSliceCount, value);
    }

    public @unsigned int maxPPictureL0ReferenceCount() {
        return segment.get(LAYOUT$maxPPictureL0ReferenceCount, OFFSET$maxPPictureL0ReferenceCount);
    }

    public void maxPPictureL0ReferenceCount(@unsigned int value) {
        segment.set(LAYOUT$maxPPictureL0ReferenceCount, OFFSET$maxPPictureL0ReferenceCount, value);
    }

    public @unsigned int maxBPictureL0ReferenceCount() {
        return segment.get(LAYOUT$maxBPictureL0ReferenceCount, OFFSET$maxBPictureL0ReferenceCount);
    }

    public void maxBPictureL0ReferenceCount(@unsigned int value) {
        segment.set(LAYOUT$maxBPictureL0ReferenceCount, OFFSET$maxBPictureL0ReferenceCount, value);
    }

    public @unsigned int maxL1ReferenceCount() {
        return segment.get(LAYOUT$maxL1ReferenceCount, OFFSET$maxL1ReferenceCount);
    }

    public void maxL1ReferenceCount(@unsigned int value) {
        segment.set(LAYOUT$maxL1ReferenceCount, OFFSET$maxL1ReferenceCount, value);
    }

    public @unsigned int maxTemporalLayerCount() {
        return segment.get(LAYOUT$maxTemporalLayerCount, OFFSET$maxTemporalLayerCount);
    }

    public void maxTemporalLayerCount(@unsigned int value) {
        segment.set(LAYOUT$maxTemporalLayerCount, OFFSET$maxTemporalLayerCount, value);
    }

    public @unsigned int expectDyadicTemporalLayerPattern() {
        return segment.get(LAYOUT$expectDyadicTemporalLayerPattern, OFFSET$expectDyadicTemporalLayerPattern);
    }

    public void expectDyadicTemporalLayerPattern(@unsigned int value) {
        segment.set(LAYOUT$expectDyadicTemporalLayerPattern, OFFSET$expectDyadicTemporalLayerPattern, value);
    }

    public int minQp() {
        return segment.get(LAYOUT$minQp, OFFSET$minQp);
    }

    public void minQp(int value) {
        segment.set(LAYOUT$minQp, OFFSET$minQp, value);
    }

    public int maxQp() {
        return segment.get(LAYOUT$maxQp, OFFSET$maxQp);
    }

    public void maxQp(int value) {
        segment.set(LAYOUT$maxQp, OFFSET$maxQp, value);
    }

    public @unsigned int prefersGopRemainingFrames() {
        return segment.get(LAYOUT$prefersGopRemainingFrames, OFFSET$prefersGopRemainingFrames);
    }

    public void prefersGopRemainingFrames(@unsigned int value) {
        segment.set(LAYOUT$prefersGopRemainingFrames, OFFSET$prefersGopRemainingFrames, value);
    }

    public @unsigned int requiresGopRemainingFrames() {
        return segment.get(LAYOUT$requiresGopRemainingFrames, OFFSET$requiresGopRemainingFrames);
    }

    public void requiresGopRemainingFrames(@unsigned int value) {
        segment.set(LAYOUT$requiresGopRemainingFrames, OFFSET$requiresGopRemainingFrames, value);
    }

    public @enumtype(VkVideoEncodeH264StdFlagsKHR.class) int stdSyntaxFlags() {
        return segment.get(LAYOUT$stdSyntaxFlags, OFFSET$stdSyntaxFlags);
    }

    public void stdSyntaxFlags(@enumtype(VkVideoEncodeH264StdFlagsKHR.class) int value) {
        segment.set(LAYOUT$stdSyntaxFlags, OFFSET$stdSyntaxFlags, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("maxLevelIdc"),
        ValueLayout.JAVA_INT.withName("maxSliceCount"),
        ValueLayout.JAVA_INT.withName("maxPPictureL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxBPictureL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxL1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxTemporalLayerCount"),
        ValueLayout.JAVA_INT.withName("expectDyadicTemporalLayerPattern"),
        ValueLayout.JAVA_INT.withName("minQp"),
        ValueLayout.JAVA_INT.withName("maxQp"),
        ValueLayout.JAVA_INT.withName("prefersGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("requiresGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("stdSyntaxFlags")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$maxLevelIdc = PathElement.groupElement("PATH$maxLevelIdc");
    public static final PathElement PATH$maxSliceCount = PathElement.groupElement("PATH$maxSliceCount");
    public static final PathElement PATH$maxPPictureL0ReferenceCount = PathElement.groupElement("PATH$maxPPictureL0ReferenceCount");
    public static final PathElement PATH$maxBPictureL0ReferenceCount = PathElement.groupElement("PATH$maxBPictureL0ReferenceCount");
    public static final PathElement PATH$maxL1ReferenceCount = PathElement.groupElement("PATH$maxL1ReferenceCount");
    public static final PathElement PATH$maxTemporalLayerCount = PathElement.groupElement("PATH$maxTemporalLayerCount");
    public static final PathElement PATH$expectDyadicTemporalLayerPattern = PathElement.groupElement("PATH$expectDyadicTemporalLayerPattern");
    public static final PathElement PATH$minQp = PathElement.groupElement("PATH$minQp");
    public static final PathElement PATH$maxQp = PathElement.groupElement("PATH$maxQp");
    public static final PathElement PATH$prefersGopRemainingFrames = PathElement.groupElement("PATH$prefersGopRemainingFrames");
    public static final PathElement PATH$requiresGopRemainingFrames = PathElement.groupElement("PATH$requiresGopRemainingFrames");
    public static final PathElement PATH$stdSyntaxFlags = PathElement.groupElement("PATH$stdSyntaxFlags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$maxLevelIdc = (OfInt) LAYOUT.select(PATH$maxLevelIdc);
    public static final OfInt LAYOUT$maxSliceCount = (OfInt) LAYOUT.select(PATH$maxSliceCount);
    public static final OfInt LAYOUT$maxPPictureL0ReferenceCount = (OfInt) LAYOUT.select(PATH$maxPPictureL0ReferenceCount);
    public static final OfInt LAYOUT$maxBPictureL0ReferenceCount = (OfInt) LAYOUT.select(PATH$maxBPictureL0ReferenceCount);
    public static final OfInt LAYOUT$maxL1ReferenceCount = (OfInt) LAYOUT.select(PATH$maxL1ReferenceCount);
    public static final OfInt LAYOUT$maxTemporalLayerCount = (OfInt) LAYOUT.select(PATH$maxTemporalLayerCount);
    public static final OfInt LAYOUT$expectDyadicTemporalLayerPattern = (OfInt) LAYOUT.select(PATH$expectDyadicTemporalLayerPattern);
    public static final OfInt LAYOUT$minQp = (OfInt) LAYOUT.select(PATH$minQp);
    public static final OfInt LAYOUT$maxQp = (OfInt) LAYOUT.select(PATH$maxQp);
    public static final OfInt LAYOUT$prefersGopRemainingFrames = (OfInt) LAYOUT.select(PATH$prefersGopRemainingFrames);
    public static final OfInt LAYOUT$requiresGopRemainingFrames = (OfInt) LAYOUT.select(PATH$requiresGopRemainingFrames);
    public static final OfInt LAYOUT$stdSyntaxFlags = (OfInt) LAYOUT.select(PATH$stdSyntaxFlags);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$maxLevelIdc = LAYOUT$maxLevelIdc.byteSize();
    public static final long SIZE$maxSliceCount = LAYOUT$maxSliceCount.byteSize();
    public static final long SIZE$maxPPictureL0ReferenceCount = LAYOUT$maxPPictureL0ReferenceCount.byteSize();
    public static final long SIZE$maxBPictureL0ReferenceCount = LAYOUT$maxBPictureL0ReferenceCount.byteSize();
    public static final long SIZE$maxL1ReferenceCount = LAYOUT$maxL1ReferenceCount.byteSize();
    public static final long SIZE$maxTemporalLayerCount = LAYOUT$maxTemporalLayerCount.byteSize();
    public static final long SIZE$expectDyadicTemporalLayerPattern = LAYOUT$expectDyadicTemporalLayerPattern.byteSize();
    public static final long SIZE$minQp = LAYOUT$minQp.byteSize();
    public static final long SIZE$maxQp = LAYOUT$maxQp.byteSize();
    public static final long SIZE$prefersGopRemainingFrames = LAYOUT$prefersGopRemainingFrames.byteSize();
    public static final long SIZE$requiresGopRemainingFrames = LAYOUT$requiresGopRemainingFrames.byteSize();
    public static final long SIZE$stdSyntaxFlags = LAYOUT$stdSyntaxFlags.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$maxLevelIdc = LAYOUT.byteOffset(PATH$maxLevelIdc);
    public static final long OFFSET$maxSliceCount = LAYOUT.byteOffset(PATH$maxSliceCount);
    public static final long OFFSET$maxPPictureL0ReferenceCount = LAYOUT.byteOffset(PATH$maxPPictureL0ReferenceCount);
    public static final long OFFSET$maxBPictureL0ReferenceCount = LAYOUT.byteOffset(PATH$maxBPictureL0ReferenceCount);
    public static final long OFFSET$maxL1ReferenceCount = LAYOUT.byteOffset(PATH$maxL1ReferenceCount);
    public static final long OFFSET$maxTemporalLayerCount = LAYOUT.byteOffset(PATH$maxTemporalLayerCount);
    public static final long OFFSET$expectDyadicTemporalLayerPattern = LAYOUT.byteOffset(PATH$expectDyadicTemporalLayerPattern);
    public static final long OFFSET$minQp = LAYOUT.byteOffset(PATH$minQp);
    public static final long OFFSET$maxQp = LAYOUT.byteOffset(PATH$maxQp);
    public static final long OFFSET$prefersGopRemainingFrames = LAYOUT.byteOffset(PATH$prefersGopRemainingFrames);
    public static final long OFFSET$requiresGopRemainingFrames = LAYOUT.byteOffset(PATH$requiresGopRemainingFrames);
    public static final long OFFSET$stdSyntaxFlags = LAYOUT.byteOffset(PATH$stdSyntaxFlags);
}
