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

public record VkVideoEncodeAV1PictureInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$predictionMode = ValueLayout.JAVA_INT.withName("predictionMode");
    public static final OfInt LAYOUT$rateControlGroup = ValueLayout.JAVA_INT.withName("rateControlGroup");
    public static final OfInt LAYOUT$constantQIndex = ValueLayout.JAVA_INT.withName("constantQIndex");
    public static final AddressLayout LAYOUT$pStdPictureInfo = ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeAV1PictureInfo.LAYOUT).withName("pStdPictureInfo");
    public static final OfInt LAYOUT$referenceNameSlotIndices = ValueLayout.JAVA_INT.withName("referenceNameSlotIndices");
    public static final OfInt LAYOUT$primaryReferenceCdfOnly = ValueLayout.JAVA_INT.withName("primaryReferenceCdfOnly");
    public static final OfInt LAYOUT$generateObuExtensionHeader = ValueLayout.JAVA_INT.withName("generateObuExtensionHeader");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$predictionMode, LAYOUT$rateControlGroup, LAYOUT$constantQIndex, LAYOUT$pStdPictureInfo, LAYOUT$referenceNameSlotIndices, LAYOUT$primaryReferenceCdfOnly, LAYOUT$generateObuExtensionHeader);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeAV1PictureInfoKHR allocate(Arena arena) {
        return new VkVideoEncodeAV1PictureInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeAV1PictureInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeAV1PictureInfoKHR[] ret = new VkVideoEncodeAV1PictureInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeAV1PictureInfoKHR(segment.asSlice(i * SIZE, SIZE));
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

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$predictionMode = PathElement.groupElement("PATH$predictionMode");
    public static final PathElement PATH$rateControlGroup = PathElement.groupElement("PATH$rateControlGroup");
    public static final PathElement PATH$constantQIndex = PathElement.groupElement("PATH$constantQIndex");
    public static final PathElement PATH$pStdPictureInfo = PathElement.groupElement("PATH$pStdPictureInfo");
    public static final PathElement PATH$referenceNameSlotIndices = PathElement.groupElement("PATH$referenceNameSlotIndices");
    public static final PathElement PATH$primaryReferenceCdfOnly = PathElement.groupElement("PATH$primaryReferenceCdfOnly");
    public static final PathElement PATH$generateObuExtensionHeader = PathElement.groupElement("PATH$generateObuExtensionHeader");

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
        if (s.address() == 0) {
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
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeAV1PictureInfo.SIZE);
        StdVideoEncodeAV1PictureInfo[] ret = new StdVideoEncodeAV1PictureInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeAV1PictureInfo(s.asSlice(i * StdVideoEncodeAV1PictureInfo.SIZE, StdVideoEncodeAV1PictureInfo.SIZE));
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

}
/// dummy, not implemented yet
