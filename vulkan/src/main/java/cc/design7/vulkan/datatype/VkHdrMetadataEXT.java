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

public record VkHdrMetadataEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final StructLayout LAYOUT$displayPrimaryRed = VkXYColorEXT.LAYOUT.withName("displayPrimaryRed");
    public static final StructLayout LAYOUT$displayPrimaryGreen = VkXYColorEXT.LAYOUT.withName("displayPrimaryGreen");
    public static final StructLayout LAYOUT$displayPrimaryBlue = VkXYColorEXT.LAYOUT.withName("displayPrimaryBlue");
    public static final StructLayout LAYOUT$whitePoint = VkXYColorEXT.LAYOUT.withName("whitePoint");
    public static final OfFloat LAYOUT$maxLuminance = ValueLayout.JAVA_FLOAT.withName("maxLuminance");
    public static final OfFloat LAYOUT$minLuminance = ValueLayout.JAVA_FLOAT.withName("minLuminance");
    public static final OfFloat LAYOUT$maxContentLightLevel = ValueLayout.JAVA_FLOAT.withName("maxContentLightLevel");
    public static final OfFloat LAYOUT$maxFrameAverageLightLevel = ValueLayout.JAVA_FLOAT.withName("maxFrameAverageLightLevel");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$displayPrimaryRed, LAYOUT$displayPrimaryGreen, LAYOUT$displayPrimaryBlue, LAYOUT$whitePoint, LAYOUT$maxLuminance, LAYOUT$minLuminance, LAYOUT$maxContentLightLevel, LAYOUT$maxFrameAverageLightLevel);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkHdrMetadataEXT allocate(Arena arena) {
        return new VkHdrMetadataEXT(arena.allocate(LAYOUT));
    }

    public static VkHdrMetadataEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkHdrMetadataEXT[] ret = new VkHdrMetadataEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkHdrMetadataEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkHdrMetadataEXT clone(Arena arena, VkHdrMetadataEXT src) {
        VkHdrMetadataEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkHdrMetadataEXT[] clone(Arena arena, VkHdrMetadataEXT[] src) {
        VkHdrMetadataEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$displayPrimaryRed = PathElement.groupElement("PATH$displayPrimaryRed");
    public static final PathElement PATH$displayPrimaryGreen = PathElement.groupElement("PATH$displayPrimaryGreen");
    public static final PathElement PATH$displayPrimaryBlue = PathElement.groupElement("PATH$displayPrimaryBlue");
    public static final PathElement PATH$whitePoint = PathElement.groupElement("PATH$whitePoint");
    public static final PathElement PATH$maxLuminance = PathElement.groupElement("PATH$maxLuminance");
    public static final PathElement PATH$minLuminance = PathElement.groupElement("PATH$minLuminance");
    public static final PathElement PATH$maxContentLightLevel = PathElement.groupElement("PATH$maxContentLightLevel");
    public static final PathElement PATH$maxFrameAverageLightLevel = PathElement.groupElement("PATH$maxFrameAverageLightLevel");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$displayPrimaryRed = LAYOUT$displayPrimaryRed.byteSize();
    public static final long SIZE$displayPrimaryGreen = LAYOUT$displayPrimaryGreen.byteSize();
    public static final long SIZE$displayPrimaryBlue = LAYOUT$displayPrimaryBlue.byteSize();
    public static final long SIZE$whitePoint = LAYOUT$whitePoint.byteSize();
    public static final long SIZE$maxLuminance = LAYOUT$maxLuminance.byteSize();
    public static final long SIZE$minLuminance = LAYOUT$minLuminance.byteSize();
    public static final long SIZE$maxContentLightLevel = LAYOUT$maxContentLightLevel.byteSize();
    public static final long SIZE$maxFrameAverageLightLevel = LAYOUT$maxFrameAverageLightLevel.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$displayPrimaryRed = LAYOUT.byteOffset(PATH$displayPrimaryRed);
    public static final long OFFSET$displayPrimaryGreen = LAYOUT.byteOffset(PATH$displayPrimaryGreen);
    public static final long OFFSET$displayPrimaryBlue = LAYOUT.byteOffset(PATH$displayPrimaryBlue);
    public static final long OFFSET$whitePoint = LAYOUT.byteOffset(PATH$whitePoint);
    public static final long OFFSET$maxLuminance = LAYOUT.byteOffset(PATH$maxLuminance);
    public static final long OFFSET$minLuminance = LAYOUT.byteOffset(PATH$minLuminance);
    public static final long OFFSET$maxContentLightLevel = LAYOUT.byteOffset(PATH$maxContentLightLevel);
    public static final long OFFSET$maxFrameAverageLightLevel = LAYOUT.byteOffset(PATH$maxFrameAverageLightLevel);

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

    public VkXYColorEXT displayPrimaryRed() {
        return new VkXYColorEXT(segment.asSlice(OFFSET$displayPrimaryRed, LAYOUT$displayPrimaryRed));
    }

    public void displayPrimaryRed(VkXYColorEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$displayPrimaryRed, SIZE$displayPrimaryRed);
    }

    public VkXYColorEXT displayPrimaryGreen() {
        return new VkXYColorEXT(segment.asSlice(OFFSET$displayPrimaryGreen, LAYOUT$displayPrimaryGreen));
    }

    public void displayPrimaryGreen(VkXYColorEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$displayPrimaryGreen, SIZE$displayPrimaryGreen);
    }

    public VkXYColorEXT displayPrimaryBlue() {
        return new VkXYColorEXT(segment.asSlice(OFFSET$displayPrimaryBlue, LAYOUT$displayPrimaryBlue));
    }

    public void displayPrimaryBlue(VkXYColorEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$displayPrimaryBlue, SIZE$displayPrimaryBlue);
    }

    public VkXYColorEXT whitePoint() {
        return new VkXYColorEXT(segment.asSlice(OFFSET$whitePoint, LAYOUT$whitePoint));
    }

    public void whitePoint(VkXYColorEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$whitePoint, SIZE$whitePoint);
    }

    public float maxLuminance() {
        return segment.get(LAYOUT$maxLuminance, OFFSET$maxLuminance);
    }

    public void maxLuminance(float value) {
        segment.set(LAYOUT$maxLuminance, OFFSET$maxLuminance, value);
    }

    public float minLuminance() {
        return segment.get(LAYOUT$minLuminance, OFFSET$minLuminance);
    }

    public void minLuminance(float value) {
        segment.set(LAYOUT$minLuminance, OFFSET$minLuminance, value);
    }

    public float maxContentLightLevel() {
        return segment.get(LAYOUT$maxContentLightLevel, OFFSET$maxContentLightLevel);
    }

    public void maxContentLightLevel(float value) {
        segment.set(LAYOUT$maxContentLightLevel, OFFSET$maxContentLightLevel, value);
    }

    public float maxFrameAverageLightLevel() {
        return segment.get(LAYOUT$maxFrameAverageLightLevel, OFFSET$maxFrameAverageLightLevel);
    }

    public void maxFrameAverageLightLevel(float value) {
        segment.set(LAYOUT$maxFrameAverageLightLevel, OFFSET$maxFrameAverageLightLevel, value);
    }

}
/// dummy, not implemented yet
