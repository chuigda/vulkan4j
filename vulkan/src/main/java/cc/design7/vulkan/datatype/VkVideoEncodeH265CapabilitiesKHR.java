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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265CapabilitiesKHR.html"><code>VkVideoEncodeH265CapabilitiesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH265CapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkVideoEncodeH265CapabilityFlagsKHR flags;
///     StdVideoH265LevelIdc maxLevelIdc;
///     uint32_t maxSliceSegmentCount;
///     VkExtent2D maxTiles;
///     VkVideoEncodeH265CtbSizeFlagsKHR ctbSizes;
///     VkVideoEncodeH265TransformBlockSizeFlagsKHR transformBlockSizes;
///     uint32_t maxPPictureL0ReferenceCount;
///     uint32_t maxBPictureL0ReferenceCount;
///     uint32_t maxL1ReferenceCount;
///     uint32_t maxSubLayerCount;
///     VkBool32 expectDyadicTemporalSubLayerPattern;
///     int32_t minQp;
///     int32_t maxQp;
///     VkBool32 prefersGopRemainingFrames;
///     VkBool32 requiresGopRemainingFrames;
///     VkVideoEncodeH265StdFlagsKHR stdSyntaxFlags;
/// } VkVideoEncodeH265CapabilitiesKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_CAPABILITIES_KHR`
///
/// The {@link VkVideoEncodeH265CapabilitiesKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoEncodeH265CapabilitiesKHR#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265CapabilitiesKHR.html"><code>VkVideoEncodeH265CapabilitiesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH265CapabilitiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeH265CapabilitiesKHR allocate(Arena arena) {
        VkVideoEncodeH265CapabilitiesKHR ret = new VkVideoEncodeH265CapabilitiesKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_H265_CAPABILITIES_KHR);
        return ret;
    }

    public static VkVideoEncodeH265CapabilitiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH265CapabilitiesKHR[] ret = new VkVideoEncodeH265CapabilitiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH265CapabilitiesKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_H265_CAPABILITIES_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeH265CapabilitiesKHR clone(Arena arena, VkVideoEncodeH265CapabilitiesKHR src) {
        VkVideoEncodeH265CapabilitiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH265CapabilitiesKHR[] clone(Arena arena, VkVideoEncodeH265CapabilitiesKHR[] src) {
        VkVideoEncodeH265CapabilitiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_H265_CAPABILITIES_KHR);
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

    public @enumtype(VkVideoEncodeH265CapabilityFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkVideoEncodeH265CapabilityFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(StdVideoH265LevelIdc.class) int maxLevelIdc() {
        return segment.get(LAYOUT$maxLevelIdc, OFFSET$maxLevelIdc);
    }

    public void maxLevelIdc(@enumtype(StdVideoH265LevelIdc.class) int value) {
        segment.set(LAYOUT$maxLevelIdc, OFFSET$maxLevelIdc, value);
    }

    public @unsigned int maxSliceSegmentCount() {
        return segment.get(LAYOUT$maxSliceSegmentCount, OFFSET$maxSliceSegmentCount);
    }

    public void maxSliceSegmentCount(@unsigned int value) {
        segment.set(LAYOUT$maxSliceSegmentCount, OFFSET$maxSliceSegmentCount, value);
    }

    public VkExtent2D maxTiles() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxTiles, LAYOUT$maxTiles));
    }

    public void maxTiles(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxTiles, SIZE$maxTiles);
    }

    public @enumtype(VkVideoEncodeH265CtbSizeFlagsKHR.class) int ctbSizes() {
        return segment.get(LAYOUT$ctbSizes, OFFSET$ctbSizes);
    }

    public void ctbSizes(@enumtype(VkVideoEncodeH265CtbSizeFlagsKHR.class) int value) {
        segment.set(LAYOUT$ctbSizes, OFFSET$ctbSizes, value);
    }

    public @enumtype(VkVideoEncodeH265TransformBlockSizeFlagsKHR.class) int transformBlockSizes() {
        return segment.get(LAYOUT$transformBlockSizes, OFFSET$transformBlockSizes);
    }

    public void transformBlockSizes(@enumtype(VkVideoEncodeH265TransformBlockSizeFlagsKHR.class) int value) {
        segment.set(LAYOUT$transformBlockSizes, OFFSET$transformBlockSizes, value);
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

    public @unsigned int maxSubLayerCount() {
        return segment.get(LAYOUT$maxSubLayerCount, OFFSET$maxSubLayerCount);
    }

    public void maxSubLayerCount(@unsigned int value) {
        segment.set(LAYOUT$maxSubLayerCount, OFFSET$maxSubLayerCount, value);
    }

    public @unsigned int expectDyadicTemporalSubLayerPattern() {
        return segment.get(LAYOUT$expectDyadicTemporalSubLayerPattern, OFFSET$expectDyadicTemporalSubLayerPattern);
    }

    public void expectDyadicTemporalSubLayerPattern(@unsigned int value) {
        segment.set(LAYOUT$expectDyadicTemporalSubLayerPattern, OFFSET$expectDyadicTemporalSubLayerPattern, value);
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

    public @enumtype(VkVideoEncodeH265StdFlagsKHR.class) int stdSyntaxFlags() {
        return segment.get(LAYOUT$stdSyntaxFlags, OFFSET$stdSyntaxFlags);
    }

    public void stdSyntaxFlags(@enumtype(VkVideoEncodeH265StdFlagsKHR.class) int value) {
        segment.set(LAYOUT$stdSyntaxFlags, OFFSET$stdSyntaxFlags, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("maxLevelIdc"),
        ValueLayout.JAVA_INT.withName("maxSliceSegmentCount"),
        VkExtent2D.LAYOUT.withName("maxTiles"),
        ValueLayout.JAVA_INT.withName("ctbSizes"),
        ValueLayout.JAVA_INT.withName("transformBlockSizes"),
        ValueLayout.JAVA_INT.withName("maxPPictureL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxBPictureL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxL1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxSubLayerCount"),
        ValueLayout.JAVA_INT.withName("expectDyadicTemporalSubLayerPattern"),
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
    public static final PathElement PATH$maxSliceSegmentCount = PathElement.groupElement("PATH$maxSliceSegmentCount");
    public static final PathElement PATH$maxTiles = PathElement.groupElement("PATH$maxTiles");
    public static final PathElement PATH$ctbSizes = PathElement.groupElement("PATH$ctbSizes");
    public static final PathElement PATH$transformBlockSizes = PathElement.groupElement("PATH$transformBlockSizes");
    public static final PathElement PATH$maxPPictureL0ReferenceCount = PathElement.groupElement("PATH$maxPPictureL0ReferenceCount");
    public static final PathElement PATH$maxBPictureL0ReferenceCount = PathElement.groupElement("PATH$maxBPictureL0ReferenceCount");
    public static final PathElement PATH$maxL1ReferenceCount = PathElement.groupElement("PATH$maxL1ReferenceCount");
    public static final PathElement PATH$maxSubLayerCount = PathElement.groupElement("PATH$maxSubLayerCount");
    public static final PathElement PATH$expectDyadicTemporalSubLayerPattern = PathElement.groupElement("PATH$expectDyadicTemporalSubLayerPattern");
    public static final PathElement PATH$minQp = PathElement.groupElement("PATH$minQp");
    public static final PathElement PATH$maxQp = PathElement.groupElement("PATH$maxQp");
    public static final PathElement PATH$prefersGopRemainingFrames = PathElement.groupElement("PATH$prefersGopRemainingFrames");
    public static final PathElement PATH$requiresGopRemainingFrames = PathElement.groupElement("PATH$requiresGopRemainingFrames");
    public static final PathElement PATH$stdSyntaxFlags = PathElement.groupElement("PATH$stdSyntaxFlags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$maxLevelIdc = (OfInt) LAYOUT.select(PATH$maxLevelIdc);
    public static final OfInt LAYOUT$maxSliceSegmentCount = (OfInt) LAYOUT.select(PATH$maxSliceSegmentCount);
    public static final StructLayout LAYOUT$maxTiles = (StructLayout) LAYOUT.select(PATH$maxTiles);
    public static final OfInt LAYOUT$ctbSizes = (OfInt) LAYOUT.select(PATH$ctbSizes);
    public static final OfInt LAYOUT$transformBlockSizes = (OfInt) LAYOUT.select(PATH$transformBlockSizes);
    public static final OfInt LAYOUT$maxPPictureL0ReferenceCount = (OfInt) LAYOUT.select(PATH$maxPPictureL0ReferenceCount);
    public static final OfInt LAYOUT$maxBPictureL0ReferenceCount = (OfInt) LAYOUT.select(PATH$maxBPictureL0ReferenceCount);
    public static final OfInt LAYOUT$maxL1ReferenceCount = (OfInt) LAYOUT.select(PATH$maxL1ReferenceCount);
    public static final OfInt LAYOUT$maxSubLayerCount = (OfInt) LAYOUT.select(PATH$maxSubLayerCount);
    public static final OfInt LAYOUT$expectDyadicTemporalSubLayerPattern = (OfInt) LAYOUT.select(PATH$expectDyadicTemporalSubLayerPattern);
    public static final OfInt LAYOUT$minQp = (OfInt) LAYOUT.select(PATH$minQp);
    public static final OfInt LAYOUT$maxQp = (OfInt) LAYOUT.select(PATH$maxQp);
    public static final OfInt LAYOUT$prefersGopRemainingFrames = (OfInt) LAYOUT.select(PATH$prefersGopRemainingFrames);
    public static final OfInt LAYOUT$requiresGopRemainingFrames = (OfInt) LAYOUT.select(PATH$requiresGopRemainingFrames);
    public static final OfInt LAYOUT$stdSyntaxFlags = (OfInt) LAYOUT.select(PATH$stdSyntaxFlags);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$maxLevelIdc = LAYOUT$maxLevelIdc.byteSize();
    public static final long SIZE$maxSliceSegmentCount = LAYOUT$maxSliceSegmentCount.byteSize();
    public static final long SIZE$maxTiles = LAYOUT$maxTiles.byteSize();
    public static final long SIZE$ctbSizes = LAYOUT$ctbSizes.byteSize();
    public static final long SIZE$transformBlockSizes = LAYOUT$transformBlockSizes.byteSize();
    public static final long SIZE$maxPPictureL0ReferenceCount = LAYOUT$maxPPictureL0ReferenceCount.byteSize();
    public static final long SIZE$maxBPictureL0ReferenceCount = LAYOUT$maxBPictureL0ReferenceCount.byteSize();
    public static final long SIZE$maxL1ReferenceCount = LAYOUT$maxL1ReferenceCount.byteSize();
    public static final long SIZE$maxSubLayerCount = LAYOUT$maxSubLayerCount.byteSize();
    public static final long SIZE$expectDyadicTemporalSubLayerPattern = LAYOUT$expectDyadicTemporalSubLayerPattern.byteSize();
    public static final long SIZE$minQp = LAYOUT$minQp.byteSize();
    public static final long SIZE$maxQp = LAYOUT$maxQp.byteSize();
    public static final long SIZE$prefersGopRemainingFrames = LAYOUT$prefersGopRemainingFrames.byteSize();
    public static final long SIZE$requiresGopRemainingFrames = LAYOUT$requiresGopRemainingFrames.byteSize();
    public static final long SIZE$stdSyntaxFlags = LAYOUT$stdSyntaxFlags.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$maxLevelIdc = LAYOUT.byteOffset(PATH$maxLevelIdc);
    public static final long OFFSET$maxSliceSegmentCount = LAYOUT.byteOffset(PATH$maxSliceSegmentCount);
    public static final long OFFSET$maxTiles = LAYOUT.byteOffset(PATH$maxTiles);
    public static final long OFFSET$ctbSizes = LAYOUT.byteOffset(PATH$ctbSizes);
    public static final long OFFSET$transformBlockSizes = LAYOUT.byteOffset(PATH$transformBlockSizes);
    public static final long OFFSET$maxPPictureL0ReferenceCount = LAYOUT.byteOffset(PATH$maxPPictureL0ReferenceCount);
    public static final long OFFSET$maxBPictureL0ReferenceCount = LAYOUT.byteOffset(PATH$maxBPictureL0ReferenceCount);
    public static final long OFFSET$maxL1ReferenceCount = LAYOUT.byteOffset(PATH$maxL1ReferenceCount);
    public static final long OFFSET$maxSubLayerCount = LAYOUT.byteOffset(PATH$maxSubLayerCount);
    public static final long OFFSET$expectDyadicTemporalSubLayerPattern = LAYOUT.byteOffset(PATH$expectDyadicTemporalSubLayerPattern);
    public static final long OFFSET$minQp = LAYOUT.byteOffset(PATH$minQp);
    public static final long OFFSET$maxQp = LAYOUT.byteOffset(PATH$maxQp);
    public static final long OFFSET$prefersGopRemainingFrames = LAYOUT.byteOffset(PATH$prefersGopRemainingFrames);
    public static final long OFFSET$requiresGopRemainingFrames = LAYOUT.byteOffset(PATH$requiresGopRemainingFrames);
    public static final long OFFSET$stdSyntaxFlags = LAYOUT.byteOffset(PATH$stdSyntaxFlags);
}
