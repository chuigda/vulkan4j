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

public record VkVideoCapabilitiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfLong LAYOUT$minBitstreamBufferOffsetAlignment = ValueLayout.JAVA_LONG.withName("minBitstreamBufferOffsetAlignment");
    public static final OfLong LAYOUT$minBitstreamBufferSizeAlignment = ValueLayout.JAVA_LONG.withName("minBitstreamBufferSizeAlignment");
    public static final StructLayout LAYOUT$pictureAccessGranularity = VkExtent2D.LAYOUT.withName("pictureAccessGranularity");
    public static final StructLayout LAYOUT$minCodedExtent = VkExtent2D.LAYOUT.withName("minCodedExtent");
    public static final StructLayout LAYOUT$maxCodedExtent = VkExtent2D.LAYOUT.withName("maxCodedExtent");
    public static final OfInt LAYOUT$maxDpbSlots = ValueLayout.JAVA_INT.withName("maxDpbSlots");
    public static final OfInt LAYOUT$maxActiveReferencePictures = ValueLayout.JAVA_INT.withName("maxActiveReferencePictures");
    public static final StructLayout LAYOUT$stdHeaderVersion = VkExtensionProperties.LAYOUT.withName("stdHeaderVersion");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$minBitstreamBufferOffsetAlignment, LAYOUT$minBitstreamBufferSizeAlignment, LAYOUT$pictureAccessGranularity, LAYOUT$minCodedExtent, LAYOUT$maxCodedExtent, LAYOUT$maxDpbSlots, LAYOUT$maxActiveReferencePictures, LAYOUT$stdHeaderVersion);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoCapabilitiesKHR allocate(Arena arena) {
        return new VkVideoCapabilitiesKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoCapabilitiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoCapabilitiesKHR[] ret = new VkVideoCapabilitiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoCapabilitiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoCapabilitiesKHR clone(Arena arena, VkVideoCapabilitiesKHR src) {
        VkVideoCapabilitiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoCapabilitiesKHR[] clone(Arena arena, VkVideoCapabilitiesKHR[] src) {
        VkVideoCapabilitiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$minBitstreamBufferOffsetAlignment = PathElement.groupElement("PATH$minBitstreamBufferOffsetAlignment");
    public static final PathElement PATH$minBitstreamBufferSizeAlignment = PathElement.groupElement("PATH$minBitstreamBufferSizeAlignment");
    public static final PathElement PATH$pictureAccessGranularity = PathElement.groupElement("PATH$pictureAccessGranularity");
    public static final PathElement PATH$minCodedExtent = PathElement.groupElement("PATH$minCodedExtent");
    public static final PathElement PATH$maxCodedExtent = PathElement.groupElement("PATH$maxCodedExtent");
    public static final PathElement PATH$maxDpbSlots = PathElement.groupElement("PATH$maxDpbSlots");
    public static final PathElement PATH$maxActiveReferencePictures = PathElement.groupElement("PATH$maxActiveReferencePictures");
    public static final PathElement PATH$stdHeaderVersion = PathElement.groupElement("PATH$stdHeaderVersion");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$minBitstreamBufferOffsetAlignment = LAYOUT$minBitstreamBufferOffsetAlignment.byteSize();
    public static final long SIZE$minBitstreamBufferSizeAlignment = LAYOUT$minBitstreamBufferSizeAlignment.byteSize();
    public static final long SIZE$pictureAccessGranularity = LAYOUT$pictureAccessGranularity.byteSize();
    public static final long SIZE$minCodedExtent = LAYOUT$minCodedExtent.byteSize();
    public static final long SIZE$maxCodedExtent = LAYOUT$maxCodedExtent.byteSize();
    public static final long SIZE$maxDpbSlots = LAYOUT$maxDpbSlots.byteSize();
    public static final long SIZE$maxActiveReferencePictures = LAYOUT$maxActiveReferencePictures.byteSize();
    public static final long SIZE$stdHeaderVersion = LAYOUT$stdHeaderVersion.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$minBitstreamBufferOffsetAlignment = LAYOUT.byteOffset(PATH$minBitstreamBufferOffsetAlignment);
    public static final long OFFSET$minBitstreamBufferSizeAlignment = LAYOUT.byteOffset(PATH$minBitstreamBufferSizeAlignment);
    public static final long OFFSET$pictureAccessGranularity = LAYOUT.byteOffset(PATH$pictureAccessGranularity);
    public static final long OFFSET$minCodedExtent = LAYOUT.byteOffset(PATH$minCodedExtent);
    public static final long OFFSET$maxCodedExtent = LAYOUT.byteOffset(PATH$maxCodedExtent);
    public static final long OFFSET$maxDpbSlots = LAYOUT.byteOffset(PATH$maxDpbSlots);
    public static final long OFFSET$maxActiveReferencePictures = LAYOUT.byteOffset(PATH$maxActiveReferencePictures);
    public static final long OFFSET$stdHeaderVersion = LAYOUT.byteOffset(PATH$stdHeaderVersion);

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

    public @enumtype(VkVideoCapabilityFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkVideoCapabilityFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned long minBitstreamBufferOffsetAlignment() {
        return segment.get(LAYOUT$minBitstreamBufferOffsetAlignment, OFFSET$minBitstreamBufferOffsetAlignment);
    }

    public void minBitstreamBufferOffsetAlignment(@unsigned long value) {
        segment.set(LAYOUT$minBitstreamBufferOffsetAlignment, OFFSET$minBitstreamBufferOffsetAlignment, value);
    }

    public @unsigned long minBitstreamBufferSizeAlignment() {
        return segment.get(LAYOUT$minBitstreamBufferSizeAlignment, OFFSET$minBitstreamBufferSizeAlignment);
    }

    public void minBitstreamBufferSizeAlignment(@unsigned long value) {
        segment.set(LAYOUT$minBitstreamBufferSizeAlignment, OFFSET$minBitstreamBufferSizeAlignment, value);
    }

    public VkExtent2D pictureAccessGranularity() {
        return new VkExtent2D(segment.asSlice(OFFSET$pictureAccessGranularity, LAYOUT$pictureAccessGranularity));
    }

    public void pictureAccessGranularity(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pictureAccessGranularity, SIZE$pictureAccessGranularity);
    }

    public VkExtent2D minCodedExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$minCodedExtent, LAYOUT$minCodedExtent));
    }

    public void minCodedExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minCodedExtent, SIZE$minCodedExtent);
    }

    public VkExtent2D maxCodedExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxCodedExtent, LAYOUT$maxCodedExtent));
    }

    public void maxCodedExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxCodedExtent, SIZE$maxCodedExtent);
    }

    public @unsigned int maxDpbSlots() {
        return segment.get(LAYOUT$maxDpbSlots, OFFSET$maxDpbSlots);
    }

    public void maxDpbSlots(@unsigned int value) {
        segment.set(LAYOUT$maxDpbSlots, OFFSET$maxDpbSlots, value);
    }

    public @unsigned int maxActiveReferencePictures() {
        return segment.get(LAYOUT$maxActiveReferencePictures, OFFSET$maxActiveReferencePictures);
    }

    public void maxActiveReferencePictures(@unsigned int value) {
        segment.set(LAYOUT$maxActiveReferencePictures, OFFSET$maxActiveReferencePictures, value);
    }

    public VkExtensionProperties stdHeaderVersion() {
        return new VkExtensionProperties(segment.asSlice(OFFSET$stdHeaderVersion, LAYOUT$stdHeaderVersion));
    }

    public void stdHeaderVersion(VkExtensionProperties value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$stdHeaderVersion, SIZE$stdHeaderVersion);
    }

}
/// dummy, not implemented yet
