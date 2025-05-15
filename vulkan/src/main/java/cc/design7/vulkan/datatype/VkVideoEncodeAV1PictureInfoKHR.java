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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1PictureInfoKHR.html"><code>VkVideoEncodeAV1PictureInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeAV1PictureInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkVideoEncodeAV1PredictionModeKHR predictionMode;
///     VkVideoEncodeAV1RateControlGroupKHR rateControlGroup;
///     uint32_t constantQIndex;
///     StdVideoEncodeAV1PictureInfo const* pStdPictureInfo;
///     int32_t referenceNameSlotIndices;
///     VkBool32 primaryReferenceCdfOnly;
///     VkBool32 generateObuExtensionHeader;
/// } VkVideoEncodeAV1PictureInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_PICTURE_INFO_KHR`
///
/// The {@link VkVideoEncodeAV1PictureInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoEncodeAV1PictureInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1PictureInfoKHR.html"><code>VkVideoEncodeAV1PictureInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeAV1PictureInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeAV1PictureInfoKHR allocate(Arena arena) {
        VkVideoEncodeAV1PictureInfoKHR ret = new VkVideoEncodeAV1PictureInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_AV1_PICTURE_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeAV1PictureInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeAV1PictureInfoKHR[] ret = new VkVideoEncodeAV1PictureInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeAV1PictureInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_AV1_PICTURE_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeAV1PictureInfoKHR clone(Arena arena, VkVideoEncodeAV1PictureInfoKHR src) {
        VkVideoEncodeAV1PictureInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeAV1PictureInfoKHR[] clone(Arena arena, VkVideoEncodeAV1PictureInfoKHR[] src) {
        VkVideoEncodeAV1PictureInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_AV1_PICTURE_INFO_KHR);
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

    public @enumtype(VkVideoEncodeAV1PredictionModeKHR.class) int predictionMode() {
        return segment.get(LAYOUT$predictionMode, OFFSET$predictionMode);
    }

    public void predictionMode(@enumtype(VkVideoEncodeAV1PredictionModeKHR.class) int value) {
        segment.set(LAYOUT$predictionMode, OFFSET$predictionMode, value);
    }

    public @enumtype(VkVideoEncodeAV1RateControlGroupKHR.class) int rateControlGroup() {
        return segment.get(LAYOUT$rateControlGroup, OFFSET$rateControlGroup);
    }

    public void rateControlGroup(@enumtype(VkVideoEncodeAV1RateControlGroupKHR.class) int value) {
        segment.set(LAYOUT$rateControlGroup, OFFSET$rateControlGroup, value);
    }

    public @unsigned int constantQIndex() {
        return segment.get(LAYOUT$constantQIndex, OFFSET$constantQIndex);
    }

    public void constantQIndex(@unsigned int value) {
        segment.set(LAYOUT$constantQIndex, OFFSET$constantQIndex, value);
    }

    public @pointer(comment="StdVideoEncodeAV1PictureInfo*") MemorySegment pStdPictureInfoRaw() {
        return segment.get(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo);
    }

    public void pStdPictureInfoRaw(@pointer(comment="StdVideoEncodeAV1PictureInfo*") MemorySegment value) {
        segment.set(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo, value);
    }

    public @Nullable StdVideoEncodeAV1PictureInfo pStdPictureInfo() {
        MemorySegment s = pStdPictureInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoEncodeAV1PictureInfo(s);
    }

    public void pStdPictureInfo(@Nullable StdVideoEncodeAV1PictureInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdPictureInfoRaw(s);
    }

    @unsafe public @Nullable StdVideoEncodeAV1PictureInfo[] pStdPictureInfo(int assumedCount) {
        MemorySegment s = pStdPictureInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeAV1PictureInfo.BYTES);
        StdVideoEncodeAV1PictureInfo[] ret = new StdVideoEncodeAV1PictureInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeAV1PictureInfo(s.asSlice(i * StdVideoEncodeAV1PictureInfo.BYTES, StdVideoEncodeAV1PictureInfo.BYTES));
        }
        return ret;
    }

    public int referenceNameSlotIndices() {
        return segment.get(LAYOUT$referenceNameSlotIndices, OFFSET$referenceNameSlotIndices);
    }

    public void referenceNameSlotIndices(int value) {
        segment.set(LAYOUT$referenceNameSlotIndices, OFFSET$referenceNameSlotIndices, value);
    }

    public @unsigned int primaryReferenceCdfOnly() {
        return segment.get(LAYOUT$primaryReferenceCdfOnly, OFFSET$primaryReferenceCdfOnly);
    }

    public void primaryReferenceCdfOnly(@unsigned int value) {
        segment.set(LAYOUT$primaryReferenceCdfOnly, OFFSET$primaryReferenceCdfOnly, value);
    }

    public @unsigned int generateObuExtensionHeader() {
        return segment.get(LAYOUT$generateObuExtensionHeader, OFFSET$generateObuExtensionHeader);
    }

    public void generateObuExtensionHeader(@unsigned int value) {
        segment.set(LAYOUT$generateObuExtensionHeader, OFFSET$generateObuExtensionHeader, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("predictionMode"),
        ValueLayout.JAVA_INT.withName("rateControlGroup"),
        ValueLayout.JAVA_INT.withName("constantQIndex"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeAV1PictureInfo.LAYOUT).withName("pStdPictureInfo"),
        ValueLayout.JAVA_INT.withName("referenceNameSlotIndices"),
        ValueLayout.JAVA_INT.withName("primaryReferenceCdfOnly"),
        ValueLayout.JAVA_INT.withName("generateObuExtensionHeader")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$predictionMode = PathElement.groupElement("PATH$predictionMode");
    public static final PathElement PATH$rateControlGroup = PathElement.groupElement("PATH$rateControlGroup");
    public static final PathElement PATH$constantQIndex = PathElement.groupElement("PATH$constantQIndex");
    public static final PathElement PATH$pStdPictureInfo = PathElement.groupElement("PATH$pStdPictureInfo");
    public static final PathElement PATH$referenceNameSlotIndices = PathElement.groupElement("PATH$referenceNameSlotIndices");
    public static final PathElement PATH$primaryReferenceCdfOnly = PathElement.groupElement("PATH$primaryReferenceCdfOnly");
    public static final PathElement PATH$generateObuExtensionHeader = PathElement.groupElement("PATH$generateObuExtensionHeader");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$predictionMode = (OfInt) LAYOUT.select(PATH$predictionMode);
    public static final OfInt LAYOUT$rateControlGroup = (OfInt) LAYOUT.select(PATH$rateControlGroup);
    public static final OfInt LAYOUT$constantQIndex = (OfInt) LAYOUT.select(PATH$constantQIndex);
    public static final AddressLayout LAYOUT$pStdPictureInfo = (AddressLayout) LAYOUT.select(PATH$pStdPictureInfo);
    public static final OfInt LAYOUT$referenceNameSlotIndices = (OfInt) LAYOUT.select(PATH$referenceNameSlotIndices);
    public static final OfInt LAYOUT$primaryReferenceCdfOnly = (OfInt) LAYOUT.select(PATH$primaryReferenceCdfOnly);
    public static final OfInt LAYOUT$generateObuExtensionHeader = (OfInt) LAYOUT.select(PATH$generateObuExtensionHeader);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$predictionMode = LAYOUT$predictionMode.byteSize();
    public static final long SIZE$rateControlGroup = LAYOUT$rateControlGroup.byteSize();
    public static final long SIZE$constantQIndex = LAYOUT$constantQIndex.byteSize();
    public static final long SIZE$pStdPictureInfo = LAYOUT$pStdPictureInfo.byteSize();
    public static final long SIZE$referenceNameSlotIndices = LAYOUT$referenceNameSlotIndices.byteSize();
    public static final long SIZE$primaryReferenceCdfOnly = LAYOUT$primaryReferenceCdfOnly.byteSize();
    public static final long SIZE$generateObuExtensionHeader = LAYOUT$generateObuExtensionHeader.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$predictionMode = LAYOUT.byteOffset(PATH$predictionMode);
    public static final long OFFSET$rateControlGroup = LAYOUT.byteOffset(PATH$rateControlGroup);
    public static final long OFFSET$constantQIndex = LAYOUT.byteOffset(PATH$constantQIndex);
    public static final long OFFSET$pStdPictureInfo = LAYOUT.byteOffset(PATH$pStdPictureInfo);
    public static final long OFFSET$referenceNameSlotIndices = LAYOUT.byteOffset(PATH$referenceNameSlotIndices);
    public static final long OFFSET$primaryReferenceCdfOnly = LAYOUT.byteOffset(PATH$primaryReferenceCdfOnly);
    public static final long OFFSET$generateObuExtensionHeader = LAYOUT.byteOffset(PATH$generateObuExtensionHeader);
}
