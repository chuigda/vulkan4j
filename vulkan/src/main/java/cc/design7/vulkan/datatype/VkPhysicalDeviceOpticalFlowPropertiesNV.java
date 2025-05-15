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

public record VkPhysicalDeviceOpticalFlowPropertiesNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$supportedOutputGridSizes = ValueLayout.JAVA_INT.withName("supportedOutputGridSizes");
    public static final OfInt LAYOUT$supportedHintGridSizes = ValueLayout.JAVA_INT.withName("supportedHintGridSizes");
    public static final OfInt LAYOUT$hintSupported = ValueLayout.JAVA_INT.withName("hintSupported");
    public static final OfInt LAYOUT$costSupported = ValueLayout.JAVA_INT.withName("costSupported");
    public static final OfInt LAYOUT$bidirectionalFlowSupported = ValueLayout.JAVA_INT.withName("bidirectionalFlowSupported");
    public static final OfInt LAYOUT$globalFlowSupported = ValueLayout.JAVA_INT.withName("globalFlowSupported");
    public static final OfInt LAYOUT$minWidth = ValueLayout.JAVA_INT.withName("minWidth");
    public static final OfInt LAYOUT$minHeight = ValueLayout.JAVA_INT.withName("minHeight");
    public static final OfInt LAYOUT$maxWidth = ValueLayout.JAVA_INT.withName("maxWidth");
    public static final OfInt LAYOUT$maxHeight = ValueLayout.JAVA_INT.withName("maxHeight");
    public static final OfInt LAYOUT$maxNumRegionsOfInterest = ValueLayout.JAVA_INT.withName("maxNumRegionsOfInterest");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$supportedOutputGridSizes, LAYOUT$supportedHintGridSizes, LAYOUT$hintSupported, LAYOUT$costSupported, LAYOUT$bidirectionalFlowSupported, LAYOUT$globalFlowSupported, LAYOUT$minWidth, LAYOUT$minHeight, LAYOUT$maxWidth, LAYOUT$maxHeight, LAYOUT$maxNumRegionsOfInterest);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceOpticalFlowPropertiesNV allocate(Arena arena) {
        return new VkPhysicalDeviceOpticalFlowPropertiesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceOpticalFlowPropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceOpticalFlowPropertiesNV[] ret = new VkPhysicalDeviceOpticalFlowPropertiesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceOpticalFlowPropertiesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceOpticalFlowPropertiesNV clone(Arena arena, VkPhysicalDeviceOpticalFlowPropertiesNV src) {
        VkPhysicalDeviceOpticalFlowPropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceOpticalFlowPropertiesNV[] clone(Arena arena, VkPhysicalDeviceOpticalFlowPropertiesNV[] src) {
        VkPhysicalDeviceOpticalFlowPropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$supportedOutputGridSizes = PathElement.groupElement("PATH$supportedOutputGridSizes");
    public static final PathElement PATH$supportedHintGridSizes = PathElement.groupElement("PATH$supportedHintGridSizes");
    public static final PathElement PATH$hintSupported = PathElement.groupElement("PATH$hintSupported");
    public static final PathElement PATH$costSupported = PathElement.groupElement("PATH$costSupported");
    public static final PathElement PATH$bidirectionalFlowSupported = PathElement.groupElement("PATH$bidirectionalFlowSupported");
    public static final PathElement PATH$globalFlowSupported = PathElement.groupElement("PATH$globalFlowSupported");
    public static final PathElement PATH$minWidth = PathElement.groupElement("PATH$minWidth");
    public static final PathElement PATH$minHeight = PathElement.groupElement("PATH$minHeight");
    public static final PathElement PATH$maxWidth = PathElement.groupElement("PATH$maxWidth");
    public static final PathElement PATH$maxHeight = PathElement.groupElement("PATH$maxHeight");
    public static final PathElement PATH$maxNumRegionsOfInterest = PathElement.groupElement("PATH$maxNumRegionsOfInterest");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$supportedOutputGridSizes = LAYOUT$supportedOutputGridSizes.byteSize();
    public static final long SIZE$supportedHintGridSizes = LAYOUT$supportedHintGridSizes.byteSize();
    public static final long SIZE$hintSupported = LAYOUT$hintSupported.byteSize();
    public static final long SIZE$costSupported = LAYOUT$costSupported.byteSize();
    public static final long SIZE$bidirectionalFlowSupported = LAYOUT$bidirectionalFlowSupported.byteSize();
    public static final long SIZE$globalFlowSupported = LAYOUT$globalFlowSupported.byteSize();
    public static final long SIZE$minWidth = LAYOUT$minWidth.byteSize();
    public static final long SIZE$minHeight = LAYOUT$minHeight.byteSize();
    public static final long SIZE$maxWidth = LAYOUT$maxWidth.byteSize();
    public static final long SIZE$maxHeight = LAYOUT$maxHeight.byteSize();
    public static final long SIZE$maxNumRegionsOfInterest = LAYOUT$maxNumRegionsOfInterest.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$supportedOutputGridSizes = LAYOUT.byteOffset(PATH$supportedOutputGridSizes);
    public static final long OFFSET$supportedHintGridSizes = LAYOUT.byteOffset(PATH$supportedHintGridSizes);
    public static final long OFFSET$hintSupported = LAYOUT.byteOffset(PATH$hintSupported);
    public static final long OFFSET$costSupported = LAYOUT.byteOffset(PATH$costSupported);
    public static final long OFFSET$bidirectionalFlowSupported = LAYOUT.byteOffset(PATH$bidirectionalFlowSupported);
    public static final long OFFSET$globalFlowSupported = LAYOUT.byteOffset(PATH$globalFlowSupported);
    public static final long OFFSET$minWidth = LAYOUT.byteOffset(PATH$minWidth);
    public static final long OFFSET$minHeight = LAYOUT.byteOffset(PATH$minHeight);
    public static final long OFFSET$maxWidth = LAYOUT.byteOffset(PATH$maxWidth);
    public static final long OFFSET$maxHeight = LAYOUT.byteOffset(PATH$maxHeight);
    public static final long OFFSET$maxNumRegionsOfInterest = LAYOUT.byteOffset(PATH$maxNumRegionsOfInterest);

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

    public @enumtype(VkOpticalFlowGridSizeFlagsNV.class) int supportedOutputGridSizes() {
        return segment.get(LAYOUT$supportedOutputGridSizes, OFFSET$supportedOutputGridSizes);
    }

    public void supportedOutputGridSizes(@enumtype(VkOpticalFlowGridSizeFlagsNV.class) int value) {
        segment.set(LAYOUT$supportedOutputGridSizes, OFFSET$supportedOutputGridSizes, value);
    }

    public @enumtype(VkOpticalFlowGridSizeFlagsNV.class) int supportedHintGridSizes() {
        return segment.get(LAYOUT$supportedHintGridSizes, OFFSET$supportedHintGridSizes);
    }

    public void supportedHintGridSizes(@enumtype(VkOpticalFlowGridSizeFlagsNV.class) int value) {
        segment.set(LAYOUT$supportedHintGridSizes, OFFSET$supportedHintGridSizes, value);
    }

    public @unsigned int hintSupported() {
        return segment.get(LAYOUT$hintSupported, OFFSET$hintSupported);
    }

    public void hintSupported(@unsigned int value) {
        segment.set(LAYOUT$hintSupported, OFFSET$hintSupported, value);
    }

    public @unsigned int costSupported() {
        return segment.get(LAYOUT$costSupported, OFFSET$costSupported);
    }

    public void costSupported(@unsigned int value) {
        segment.set(LAYOUT$costSupported, OFFSET$costSupported, value);
    }

    public @unsigned int bidirectionalFlowSupported() {
        return segment.get(LAYOUT$bidirectionalFlowSupported, OFFSET$bidirectionalFlowSupported);
    }

    public void bidirectionalFlowSupported(@unsigned int value) {
        segment.set(LAYOUT$bidirectionalFlowSupported, OFFSET$bidirectionalFlowSupported, value);
    }

    public @unsigned int globalFlowSupported() {
        return segment.get(LAYOUT$globalFlowSupported, OFFSET$globalFlowSupported);
    }

    public void globalFlowSupported(@unsigned int value) {
        segment.set(LAYOUT$globalFlowSupported, OFFSET$globalFlowSupported, value);
    }

    public @unsigned int minWidth() {
        return segment.get(LAYOUT$minWidth, OFFSET$minWidth);
    }

    public void minWidth(@unsigned int value) {
        segment.set(LAYOUT$minWidth, OFFSET$minWidth, value);
    }

    public @unsigned int minHeight() {
        return segment.get(LAYOUT$minHeight, OFFSET$minHeight);
    }

    public void minHeight(@unsigned int value) {
        segment.set(LAYOUT$minHeight, OFFSET$minHeight, value);
    }

    public @unsigned int maxWidth() {
        return segment.get(LAYOUT$maxWidth, OFFSET$maxWidth);
    }

    public void maxWidth(@unsigned int value) {
        segment.set(LAYOUT$maxWidth, OFFSET$maxWidth, value);
    }

    public @unsigned int maxHeight() {
        return segment.get(LAYOUT$maxHeight, OFFSET$maxHeight);
    }

    public void maxHeight(@unsigned int value) {
        segment.set(LAYOUT$maxHeight, OFFSET$maxHeight, value);
    }

    public @unsigned int maxNumRegionsOfInterest() {
        return segment.get(LAYOUT$maxNumRegionsOfInterest, OFFSET$maxNumRegionsOfInterest);
    }

    public void maxNumRegionsOfInterest(@unsigned int value) {
        segment.set(LAYOUT$maxNumRegionsOfInterest, OFFSET$maxNumRegionsOfInterest, value);
    }

}
/// dummy, not implemented yet
