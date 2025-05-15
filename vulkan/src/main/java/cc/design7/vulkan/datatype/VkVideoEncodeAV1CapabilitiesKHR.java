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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1CapabilitiesKHR.html"><code>VkVideoEncodeAV1CapabilitiesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeAV1CapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkVideoEncodeAV1CapabilityFlagsKHR flags;
///     StdVideoAV1Level maxLevel;
///     VkExtent2D codedPictureAlignment;
///     VkExtent2D maxTiles;
///     VkExtent2D minTileSize;
///     VkExtent2D maxTileSize;
///     VkVideoEncodeAV1SuperblockSizeFlagsKHR superblockSizes;
///     uint32_t maxSingleReferenceCount;
///     uint32_t singleReferenceNameMask;
///     uint32_t maxUnidirectionalCompoundReferenceCount;
///     uint32_t maxUnidirectionalCompoundGroup1ReferenceCount;
///     uint32_t unidirectionalCompoundReferenceNameMask;
///     uint32_t maxBidirectionalCompoundReferenceCount;
///     uint32_t maxBidirectionalCompoundGroup1ReferenceCount;
///     uint32_t maxBidirectionalCompoundGroup2ReferenceCount;
///     uint32_t bidirectionalCompoundReferenceNameMask;
///     uint32_t maxTemporalLayerCount;
///     uint32_t maxSpatialLayerCount;
///     uint32_t maxOperatingPoints;
///     uint32_t minQIndex;
///     uint32_t maxQIndex;
///     VkBool32 prefersGopRemainingFrames;
///     VkBool32 requiresGopRemainingFrames;
///     VkVideoEncodeAV1StdFlagsKHR stdSyntaxFlags;
/// } VkVideoEncodeAV1CapabilitiesKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_CAPABILITIES_KHR`
///
/// The {@link VkVideoEncodeAV1CapabilitiesKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoEncodeAV1CapabilitiesKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1CapabilitiesKHR.html"><code>VkVideoEncodeAV1CapabilitiesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeAV1CapabilitiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeAV1CapabilitiesKHR allocate(Arena arena) {
        VkVideoEncodeAV1CapabilitiesKHR ret = new VkVideoEncodeAV1CapabilitiesKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_AV1_CAPABILITIES_KHR);
        return ret;
    }

    public static VkVideoEncodeAV1CapabilitiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeAV1CapabilitiesKHR[] ret = new VkVideoEncodeAV1CapabilitiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeAV1CapabilitiesKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_AV1_CAPABILITIES_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeAV1CapabilitiesKHR clone(Arena arena, VkVideoEncodeAV1CapabilitiesKHR src) {
        VkVideoEncodeAV1CapabilitiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeAV1CapabilitiesKHR[] clone(Arena arena, VkVideoEncodeAV1CapabilitiesKHR[] src) {
        VkVideoEncodeAV1CapabilitiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_AV1_CAPABILITIES_KHR);
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

    public @enumtype(VkVideoEncodeAV1CapabilityFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkVideoEncodeAV1CapabilityFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(StdVideoAV1Level.class) int maxLevel() {
        return segment.get(LAYOUT$maxLevel, OFFSET$maxLevel);
    }

    public void maxLevel(@enumtype(StdVideoAV1Level.class) int value) {
        segment.set(LAYOUT$maxLevel, OFFSET$maxLevel, value);
    }

    public VkExtent2D codedPictureAlignment() {
        return new VkExtent2D(segment.asSlice(OFFSET$codedPictureAlignment, LAYOUT$codedPictureAlignment));
    }

    public void codedPictureAlignment(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$codedPictureAlignment, SIZE$codedPictureAlignment);
    }

    public VkExtent2D maxTiles() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxTiles, LAYOUT$maxTiles));
    }

    public void maxTiles(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxTiles, SIZE$maxTiles);
    }

    public VkExtent2D minTileSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$minTileSize, LAYOUT$minTileSize));
    }

    public void minTileSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minTileSize, SIZE$minTileSize);
    }

    public VkExtent2D maxTileSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxTileSize, LAYOUT$maxTileSize));
    }

    public void maxTileSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxTileSize, SIZE$maxTileSize);
    }

    public @enumtype(VkVideoEncodeAV1SuperblockSizeFlagsKHR.class) int superblockSizes() {
        return segment.get(LAYOUT$superblockSizes, OFFSET$superblockSizes);
    }

    public void superblockSizes(@enumtype(VkVideoEncodeAV1SuperblockSizeFlagsKHR.class) int value) {
        segment.set(LAYOUT$superblockSizes, OFFSET$superblockSizes, value);
    }

    public @unsigned int maxSingleReferenceCount() {
        return segment.get(LAYOUT$maxSingleReferenceCount, OFFSET$maxSingleReferenceCount);
    }

    public void maxSingleReferenceCount(@unsigned int value) {
        segment.set(LAYOUT$maxSingleReferenceCount, OFFSET$maxSingleReferenceCount, value);
    }

    public @unsigned int singleReferenceNameMask() {
        return segment.get(LAYOUT$singleReferenceNameMask, OFFSET$singleReferenceNameMask);
    }

    public void singleReferenceNameMask(@unsigned int value) {
        segment.set(LAYOUT$singleReferenceNameMask, OFFSET$singleReferenceNameMask, value);
    }

    public @unsigned int maxUnidirectionalCompoundReferenceCount() {
        return segment.get(LAYOUT$maxUnidirectionalCompoundReferenceCount, OFFSET$maxUnidirectionalCompoundReferenceCount);
    }

    public void maxUnidirectionalCompoundReferenceCount(@unsigned int value) {
        segment.set(LAYOUT$maxUnidirectionalCompoundReferenceCount, OFFSET$maxUnidirectionalCompoundReferenceCount, value);
    }

    public @unsigned int maxUnidirectionalCompoundGroup1ReferenceCount() {
        return segment.get(LAYOUT$maxUnidirectionalCompoundGroup1ReferenceCount, OFFSET$maxUnidirectionalCompoundGroup1ReferenceCount);
    }

    public void maxUnidirectionalCompoundGroup1ReferenceCount(@unsigned int value) {
        segment.set(LAYOUT$maxUnidirectionalCompoundGroup1ReferenceCount, OFFSET$maxUnidirectionalCompoundGroup1ReferenceCount, value);
    }

    public @unsigned int unidirectionalCompoundReferenceNameMask() {
        return segment.get(LAYOUT$unidirectionalCompoundReferenceNameMask, OFFSET$unidirectionalCompoundReferenceNameMask);
    }

    public void unidirectionalCompoundReferenceNameMask(@unsigned int value) {
        segment.set(LAYOUT$unidirectionalCompoundReferenceNameMask, OFFSET$unidirectionalCompoundReferenceNameMask, value);
    }

    public @unsigned int maxBidirectionalCompoundReferenceCount() {
        return segment.get(LAYOUT$maxBidirectionalCompoundReferenceCount, OFFSET$maxBidirectionalCompoundReferenceCount);
    }

    public void maxBidirectionalCompoundReferenceCount(@unsigned int value) {
        segment.set(LAYOUT$maxBidirectionalCompoundReferenceCount, OFFSET$maxBidirectionalCompoundReferenceCount, value);
    }

    public @unsigned int maxBidirectionalCompoundGroup1ReferenceCount() {
        return segment.get(LAYOUT$maxBidirectionalCompoundGroup1ReferenceCount, OFFSET$maxBidirectionalCompoundGroup1ReferenceCount);
    }

    public void maxBidirectionalCompoundGroup1ReferenceCount(@unsigned int value) {
        segment.set(LAYOUT$maxBidirectionalCompoundGroup1ReferenceCount, OFFSET$maxBidirectionalCompoundGroup1ReferenceCount, value);
    }

    public @unsigned int maxBidirectionalCompoundGroup2ReferenceCount() {
        return segment.get(LAYOUT$maxBidirectionalCompoundGroup2ReferenceCount, OFFSET$maxBidirectionalCompoundGroup2ReferenceCount);
    }

    public void maxBidirectionalCompoundGroup2ReferenceCount(@unsigned int value) {
        segment.set(LAYOUT$maxBidirectionalCompoundGroup2ReferenceCount, OFFSET$maxBidirectionalCompoundGroup2ReferenceCount, value);
    }

    public @unsigned int bidirectionalCompoundReferenceNameMask() {
        return segment.get(LAYOUT$bidirectionalCompoundReferenceNameMask, OFFSET$bidirectionalCompoundReferenceNameMask);
    }

    public void bidirectionalCompoundReferenceNameMask(@unsigned int value) {
        segment.set(LAYOUT$bidirectionalCompoundReferenceNameMask, OFFSET$bidirectionalCompoundReferenceNameMask, value);
    }

    public @unsigned int maxTemporalLayerCount() {
        return segment.get(LAYOUT$maxTemporalLayerCount, OFFSET$maxTemporalLayerCount);
    }

    public void maxTemporalLayerCount(@unsigned int value) {
        segment.set(LAYOUT$maxTemporalLayerCount, OFFSET$maxTemporalLayerCount, value);
    }

    public @unsigned int maxSpatialLayerCount() {
        return segment.get(LAYOUT$maxSpatialLayerCount, OFFSET$maxSpatialLayerCount);
    }

    public void maxSpatialLayerCount(@unsigned int value) {
        segment.set(LAYOUT$maxSpatialLayerCount, OFFSET$maxSpatialLayerCount, value);
    }

    public @unsigned int maxOperatingPoints() {
        return segment.get(LAYOUT$maxOperatingPoints, OFFSET$maxOperatingPoints);
    }

    public void maxOperatingPoints(@unsigned int value) {
        segment.set(LAYOUT$maxOperatingPoints, OFFSET$maxOperatingPoints, value);
    }

    public @unsigned int minQIndex() {
        return segment.get(LAYOUT$minQIndex, OFFSET$minQIndex);
    }

    public void minQIndex(@unsigned int value) {
        segment.set(LAYOUT$minQIndex, OFFSET$minQIndex, value);
    }

    public @unsigned int maxQIndex() {
        return segment.get(LAYOUT$maxQIndex, OFFSET$maxQIndex);
    }

    public void maxQIndex(@unsigned int value) {
        segment.set(LAYOUT$maxQIndex, OFFSET$maxQIndex, value);
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

    public @enumtype(VkVideoEncodeAV1StdFlagsKHR.class) int stdSyntaxFlags() {
        return segment.get(LAYOUT$stdSyntaxFlags, OFFSET$stdSyntaxFlags);
    }

    public void stdSyntaxFlags(@enumtype(VkVideoEncodeAV1StdFlagsKHR.class) int value) {
        segment.set(LAYOUT$stdSyntaxFlags, OFFSET$stdSyntaxFlags, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("maxLevel"),
        VkExtent2D.LAYOUT.withName("codedPictureAlignment"),
        VkExtent2D.LAYOUT.withName("maxTiles"),
        VkExtent2D.LAYOUT.withName("minTileSize"),
        VkExtent2D.LAYOUT.withName("maxTileSize"),
        ValueLayout.JAVA_INT.withName("superblockSizes"),
        ValueLayout.JAVA_INT.withName("maxSingleReferenceCount"),
        ValueLayout.JAVA_INT.withName("singleReferenceNameMask"),
        ValueLayout.JAVA_INT.withName("maxUnidirectionalCompoundReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxUnidirectionalCompoundGroup1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("unidirectionalCompoundReferenceNameMask"),
        ValueLayout.JAVA_INT.withName("maxBidirectionalCompoundReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxBidirectionalCompoundGroup1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxBidirectionalCompoundGroup2ReferenceCount"),
        ValueLayout.JAVA_INT.withName("bidirectionalCompoundReferenceNameMask"),
        ValueLayout.JAVA_INT.withName("maxTemporalLayerCount"),
        ValueLayout.JAVA_INT.withName("maxSpatialLayerCount"),
        ValueLayout.JAVA_INT.withName("maxOperatingPoints"),
        ValueLayout.JAVA_INT.withName("minQIndex"),
        ValueLayout.JAVA_INT.withName("maxQIndex"),
        ValueLayout.JAVA_INT.withName("prefersGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("requiresGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("stdSyntaxFlags")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$maxLevel = PathElement.groupElement("PATH$maxLevel");
    public static final PathElement PATH$codedPictureAlignment = PathElement.groupElement("PATH$codedPictureAlignment");
    public static final PathElement PATH$maxTiles = PathElement.groupElement("PATH$maxTiles");
    public static final PathElement PATH$minTileSize = PathElement.groupElement("PATH$minTileSize");
    public static final PathElement PATH$maxTileSize = PathElement.groupElement("PATH$maxTileSize");
    public static final PathElement PATH$superblockSizes = PathElement.groupElement("PATH$superblockSizes");
    public static final PathElement PATH$maxSingleReferenceCount = PathElement.groupElement("PATH$maxSingleReferenceCount");
    public static final PathElement PATH$singleReferenceNameMask = PathElement.groupElement("PATH$singleReferenceNameMask");
    public static final PathElement PATH$maxUnidirectionalCompoundReferenceCount = PathElement.groupElement("PATH$maxUnidirectionalCompoundReferenceCount");
    public static final PathElement PATH$maxUnidirectionalCompoundGroup1ReferenceCount = PathElement.groupElement("PATH$maxUnidirectionalCompoundGroup1ReferenceCount");
    public static final PathElement PATH$unidirectionalCompoundReferenceNameMask = PathElement.groupElement("PATH$unidirectionalCompoundReferenceNameMask");
    public static final PathElement PATH$maxBidirectionalCompoundReferenceCount = PathElement.groupElement("PATH$maxBidirectionalCompoundReferenceCount");
    public static final PathElement PATH$maxBidirectionalCompoundGroup1ReferenceCount = PathElement.groupElement("PATH$maxBidirectionalCompoundGroup1ReferenceCount");
    public static final PathElement PATH$maxBidirectionalCompoundGroup2ReferenceCount = PathElement.groupElement("PATH$maxBidirectionalCompoundGroup2ReferenceCount");
    public static final PathElement PATH$bidirectionalCompoundReferenceNameMask = PathElement.groupElement("PATH$bidirectionalCompoundReferenceNameMask");
    public static final PathElement PATH$maxTemporalLayerCount = PathElement.groupElement("PATH$maxTemporalLayerCount");
    public static final PathElement PATH$maxSpatialLayerCount = PathElement.groupElement("PATH$maxSpatialLayerCount");
    public static final PathElement PATH$maxOperatingPoints = PathElement.groupElement("PATH$maxOperatingPoints");
    public static final PathElement PATH$minQIndex = PathElement.groupElement("PATH$minQIndex");
    public static final PathElement PATH$maxQIndex = PathElement.groupElement("PATH$maxQIndex");
    public static final PathElement PATH$prefersGopRemainingFrames = PathElement.groupElement("PATH$prefersGopRemainingFrames");
    public static final PathElement PATH$requiresGopRemainingFrames = PathElement.groupElement("PATH$requiresGopRemainingFrames");
    public static final PathElement PATH$stdSyntaxFlags = PathElement.groupElement("PATH$stdSyntaxFlags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$maxLevel = (OfInt) LAYOUT.select(PATH$maxLevel);
    public static final StructLayout LAYOUT$codedPictureAlignment = (StructLayout) LAYOUT.select(PATH$codedPictureAlignment);
    public static final StructLayout LAYOUT$maxTiles = (StructLayout) LAYOUT.select(PATH$maxTiles);
    public static final StructLayout LAYOUT$minTileSize = (StructLayout) LAYOUT.select(PATH$minTileSize);
    public static final StructLayout LAYOUT$maxTileSize = (StructLayout) LAYOUT.select(PATH$maxTileSize);
    public static final OfInt LAYOUT$superblockSizes = (OfInt) LAYOUT.select(PATH$superblockSizes);
    public static final OfInt LAYOUT$maxSingleReferenceCount = (OfInt) LAYOUT.select(PATH$maxSingleReferenceCount);
    public static final OfInt LAYOUT$singleReferenceNameMask = (OfInt) LAYOUT.select(PATH$singleReferenceNameMask);
    public static final OfInt LAYOUT$maxUnidirectionalCompoundReferenceCount = (OfInt) LAYOUT.select(PATH$maxUnidirectionalCompoundReferenceCount);
    public static final OfInt LAYOUT$maxUnidirectionalCompoundGroup1ReferenceCount = (OfInt) LAYOUT.select(PATH$maxUnidirectionalCompoundGroup1ReferenceCount);
    public static final OfInt LAYOUT$unidirectionalCompoundReferenceNameMask = (OfInt) LAYOUT.select(PATH$unidirectionalCompoundReferenceNameMask);
    public static final OfInt LAYOUT$maxBidirectionalCompoundReferenceCount = (OfInt) LAYOUT.select(PATH$maxBidirectionalCompoundReferenceCount);
    public static final OfInt LAYOUT$maxBidirectionalCompoundGroup1ReferenceCount = (OfInt) LAYOUT.select(PATH$maxBidirectionalCompoundGroup1ReferenceCount);
    public static final OfInt LAYOUT$maxBidirectionalCompoundGroup2ReferenceCount = (OfInt) LAYOUT.select(PATH$maxBidirectionalCompoundGroup2ReferenceCount);
    public static final OfInt LAYOUT$bidirectionalCompoundReferenceNameMask = (OfInt) LAYOUT.select(PATH$bidirectionalCompoundReferenceNameMask);
    public static final OfInt LAYOUT$maxTemporalLayerCount = (OfInt) LAYOUT.select(PATH$maxTemporalLayerCount);
    public static final OfInt LAYOUT$maxSpatialLayerCount = (OfInt) LAYOUT.select(PATH$maxSpatialLayerCount);
    public static final OfInt LAYOUT$maxOperatingPoints = (OfInt) LAYOUT.select(PATH$maxOperatingPoints);
    public static final OfInt LAYOUT$minQIndex = (OfInt) LAYOUT.select(PATH$minQIndex);
    public static final OfInt LAYOUT$maxQIndex = (OfInt) LAYOUT.select(PATH$maxQIndex);
    public static final OfInt LAYOUT$prefersGopRemainingFrames = (OfInt) LAYOUT.select(PATH$prefersGopRemainingFrames);
    public static final OfInt LAYOUT$requiresGopRemainingFrames = (OfInt) LAYOUT.select(PATH$requiresGopRemainingFrames);
    public static final OfInt LAYOUT$stdSyntaxFlags = (OfInt) LAYOUT.select(PATH$stdSyntaxFlags);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$maxLevel = LAYOUT$maxLevel.byteSize();
    public static final long SIZE$codedPictureAlignment = LAYOUT$codedPictureAlignment.byteSize();
    public static final long SIZE$maxTiles = LAYOUT$maxTiles.byteSize();
    public static final long SIZE$minTileSize = LAYOUT$minTileSize.byteSize();
    public static final long SIZE$maxTileSize = LAYOUT$maxTileSize.byteSize();
    public static final long SIZE$superblockSizes = LAYOUT$superblockSizes.byteSize();
    public static final long SIZE$maxSingleReferenceCount = LAYOUT$maxSingleReferenceCount.byteSize();
    public static final long SIZE$singleReferenceNameMask = LAYOUT$singleReferenceNameMask.byteSize();
    public static final long SIZE$maxUnidirectionalCompoundReferenceCount = LAYOUT$maxUnidirectionalCompoundReferenceCount.byteSize();
    public static final long SIZE$maxUnidirectionalCompoundGroup1ReferenceCount = LAYOUT$maxUnidirectionalCompoundGroup1ReferenceCount.byteSize();
    public static final long SIZE$unidirectionalCompoundReferenceNameMask = LAYOUT$unidirectionalCompoundReferenceNameMask.byteSize();
    public static final long SIZE$maxBidirectionalCompoundReferenceCount = LAYOUT$maxBidirectionalCompoundReferenceCount.byteSize();
    public static final long SIZE$maxBidirectionalCompoundGroup1ReferenceCount = LAYOUT$maxBidirectionalCompoundGroup1ReferenceCount.byteSize();
    public static final long SIZE$maxBidirectionalCompoundGroup2ReferenceCount = LAYOUT$maxBidirectionalCompoundGroup2ReferenceCount.byteSize();
    public static final long SIZE$bidirectionalCompoundReferenceNameMask = LAYOUT$bidirectionalCompoundReferenceNameMask.byteSize();
    public static final long SIZE$maxTemporalLayerCount = LAYOUT$maxTemporalLayerCount.byteSize();
    public static final long SIZE$maxSpatialLayerCount = LAYOUT$maxSpatialLayerCount.byteSize();
    public static final long SIZE$maxOperatingPoints = LAYOUT$maxOperatingPoints.byteSize();
    public static final long SIZE$minQIndex = LAYOUT$minQIndex.byteSize();
    public static final long SIZE$maxQIndex = LAYOUT$maxQIndex.byteSize();
    public static final long SIZE$prefersGopRemainingFrames = LAYOUT$prefersGopRemainingFrames.byteSize();
    public static final long SIZE$requiresGopRemainingFrames = LAYOUT$requiresGopRemainingFrames.byteSize();
    public static final long SIZE$stdSyntaxFlags = LAYOUT$stdSyntaxFlags.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$maxLevel = LAYOUT.byteOffset(PATH$maxLevel);
    public static final long OFFSET$codedPictureAlignment = LAYOUT.byteOffset(PATH$codedPictureAlignment);
    public static final long OFFSET$maxTiles = LAYOUT.byteOffset(PATH$maxTiles);
    public static final long OFFSET$minTileSize = LAYOUT.byteOffset(PATH$minTileSize);
    public static final long OFFSET$maxTileSize = LAYOUT.byteOffset(PATH$maxTileSize);
    public static final long OFFSET$superblockSizes = LAYOUT.byteOffset(PATH$superblockSizes);
    public static final long OFFSET$maxSingleReferenceCount = LAYOUT.byteOffset(PATH$maxSingleReferenceCount);
    public static final long OFFSET$singleReferenceNameMask = LAYOUT.byteOffset(PATH$singleReferenceNameMask);
    public static final long OFFSET$maxUnidirectionalCompoundReferenceCount = LAYOUT.byteOffset(PATH$maxUnidirectionalCompoundReferenceCount);
    public static final long OFFSET$maxUnidirectionalCompoundGroup1ReferenceCount = LAYOUT.byteOffset(PATH$maxUnidirectionalCompoundGroup1ReferenceCount);
    public static final long OFFSET$unidirectionalCompoundReferenceNameMask = LAYOUT.byteOffset(PATH$unidirectionalCompoundReferenceNameMask);
    public static final long OFFSET$maxBidirectionalCompoundReferenceCount = LAYOUT.byteOffset(PATH$maxBidirectionalCompoundReferenceCount);
    public static final long OFFSET$maxBidirectionalCompoundGroup1ReferenceCount = LAYOUT.byteOffset(PATH$maxBidirectionalCompoundGroup1ReferenceCount);
    public static final long OFFSET$maxBidirectionalCompoundGroup2ReferenceCount = LAYOUT.byteOffset(PATH$maxBidirectionalCompoundGroup2ReferenceCount);
    public static final long OFFSET$bidirectionalCompoundReferenceNameMask = LAYOUT.byteOffset(PATH$bidirectionalCompoundReferenceNameMask);
    public static final long OFFSET$maxTemporalLayerCount = LAYOUT.byteOffset(PATH$maxTemporalLayerCount);
    public static final long OFFSET$maxSpatialLayerCount = LAYOUT.byteOffset(PATH$maxSpatialLayerCount);
    public static final long OFFSET$maxOperatingPoints = LAYOUT.byteOffset(PATH$maxOperatingPoints);
    public static final long OFFSET$minQIndex = LAYOUT.byteOffset(PATH$minQIndex);
    public static final long OFFSET$maxQIndex = LAYOUT.byteOffset(PATH$maxQIndex);
    public static final long OFFSET$prefersGopRemainingFrames = LAYOUT.byteOffset(PATH$prefersGopRemainingFrames);
    public static final long OFFSET$requiresGopRemainingFrames = LAYOUT.byteOffset(PATH$requiresGopRemainingFrames);
    public static final long OFFSET$stdSyntaxFlags = LAYOUT.byteOffset(PATH$stdSyntaxFlags);
}
