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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoSessionCreateInfoKHR.html">VkVideoSessionCreateInfoKHR</a>
@ValueBasedCandidate
public record VkVideoSessionCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$queueFamilyIndex = ValueLayout.JAVA_INT.withName("queueFamilyIndex");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final AddressLayout LAYOUT$pVideoProfile = ValueLayout.ADDRESS.withTargetLayout(VkVideoProfileInfoKHR.LAYOUT).withName("pVideoProfile");
    public static final OfInt LAYOUT$pictureFormat = ValueLayout.JAVA_INT.withName("pictureFormat");
    public static final StructLayout LAYOUT$maxCodedExtent = VkExtent2D.LAYOUT.withName("maxCodedExtent");
    public static final OfInt LAYOUT$referencePictureFormat = ValueLayout.JAVA_INT.withName("referencePictureFormat");
    public static final OfInt LAYOUT$maxDpbSlots = ValueLayout.JAVA_INT.withName("maxDpbSlots");
    public static final OfInt LAYOUT$maxActiveReferencePictures = ValueLayout.JAVA_INT.withName("maxActiveReferencePictures");
    public static final AddressLayout LAYOUT$pStdHeaderVersion = ValueLayout.ADDRESS.withTargetLayout(VkExtensionProperties.LAYOUT).withName("pStdHeaderVersion");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$queueFamilyIndex, LAYOUT$flags, LAYOUT$pVideoProfile, LAYOUT$pictureFormat, LAYOUT$maxCodedExtent, LAYOUT$referencePictureFormat, LAYOUT$maxDpbSlots, LAYOUT$maxActiveReferencePictures, LAYOUT$pStdHeaderVersion);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoSessionCreateInfoKHR allocate(Arena arena) {
        return new VkVideoSessionCreateInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoSessionCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoSessionCreateInfoKHR[] ret = new VkVideoSessionCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoSessionCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoSessionCreateInfoKHR clone(Arena arena, VkVideoSessionCreateInfoKHR src) {
        VkVideoSessionCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoSessionCreateInfoKHR[] clone(Arena arena, VkVideoSessionCreateInfoKHR[] src) {
        VkVideoSessionCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$queueFamilyIndex = PathElement.groupElement("PATH$queueFamilyIndex");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$pVideoProfile = PathElement.groupElement("PATH$pVideoProfile");
    public static final PathElement PATH$pictureFormat = PathElement.groupElement("PATH$pictureFormat");
    public static final PathElement PATH$maxCodedExtent = PathElement.groupElement("PATH$maxCodedExtent");
    public static final PathElement PATH$referencePictureFormat = PathElement.groupElement("PATH$referencePictureFormat");
    public static final PathElement PATH$maxDpbSlots = PathElement.groupElement("PATH$maxDpbSlots");
    public static final PathElement PATH$maxActiveReferencePictures = PathElement.groupElement("PATH$maxActiveReferencePictures");
    public static final PathElement PATH$pStdHeaderVersion = PathElement.groupElement("PATH$pStdHeaderVersion");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$queueFamilyIndex = LAYOUT$queueFamilyIndex.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pVideoProfile = LAYOUT$pVideoProfile.byteSize();
    public static final long SIZE$pictureFormat = LAYOUT$pictureFormat.byteSize();
    public static final long SIZE$maxCodedExtent = LAYOUT$maxCodedExtent.byteSize();
    public static final long SIZE$referencePictureFormat = LAYOUT$referencePictureFormat.byteSize();
    public static final long SIZE$maxDpbSlots = LAYOUT$maxDpbSlots.byteSize();
    public static final long SIZE$maxActiveReferencePictures = LAYOUT$maxActiveReferencePictures.byteSize();
    public static final long SIZE$pStdHeaderVersion = LAYOUT$pStdHeaderVersion.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$queueFamilyIndex = LAYOUT.byteOffset(PATH$queueFamilyIndex);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pVideoProfile = LAYOUT.byteOffset(PATH$pVideoProfile);
    public static final long OFFSET$pictureFormat = LAYOUT.byteOffset(PATH$pictureFormat);
    public static final long OFFSET$maxCodedExtent = LAYOUT.byteOffset(PATH$maxCodedExtent);
    public static final long OFFSET$referencePictureFormat = LAYOUT.byteOffset(PATH$referencePictureFormat);
    public static final long OFFSET$maxDpbSlots = LAYOUT.byteOffset(PATH$maxDpbSlots);
    public static final long OFFSET$maxActiveReferencePictures = LAYOUT.byteOffset(PATH$maxActiveReferencePictures);
    public static final long OFFSET$pStdHeaderVersion = LAYOUT.byteOffset(PATH$pStdHeaderVersion);

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

    public @unsigned int queueFamilyIndex() {
        return segment.get(LAYOUT$queueFamilyIndex, OFFSET$queueFamilyIndex);
    }

    public void queueFamilyIndex(@unsigned int value) {
        segment.set(LAYOUT$queueFamilyIndex, OFFSET$queueFamilyIndex, value);
    }

    public @enumtype(VkVideoSessionCreateFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkVideoSessionCreateFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="VkVideoProfileInfoKHR*") MemorySegment pVideoProfileRaw() {
        return segment.get(LAYOUT$pVideoProfile, OFFSET$pVideoProfile);
    }

    public void pVideoProfileRaw(@pointer(comment="VkVideoProfileInfoKHR*") MemorySegment value) {
        segment.set(LAYOUT$pVideoProfile, OFFSET$pVideoProfile, value);
    }

    public @Nullable VkVideoProfileInfoKHR pVideoProfile() {
        MemorySegment s = pVideoProfileRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkVideoProfileInfoKHR(s);
    }

    public void pVideoProfile(@Nullable VkVideoProfileInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVideoProfileRaw(s);
    }

    @unsafe public @Nullable VkVideoProfileInfoKHR[] pVideoProfile(int assumedCount) {
        MemorySegment s = pVideoProfileRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVideoProfileInfoKHR.SIZE);
        VkVideoProfileInfoKHR[] ret = new VkVideoProfileInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkVideoProfileInfoKHR(s.asSlice(i * VkVideoProfileInfoKHR.SIZE, VkVideoProfileInfoKHR.SIZE));
        }
        return ret;
    }

    public @enumtype(VkFormat.class) int pictureFormat() {
        return segment.get(LAYOUT$pictureFormat, OFFSET$pictureFormat);
    }

    public void pictureFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$pictureFormat, OFFSET$pictureFormat, value);
    }

    public VkExtent2D maxCodedExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxCodedExtent, LAYOUT$maxCodedExtent));
    }

    public void maxCodedExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxCodedExtent, SIZE$maxCodedExtent);
    }

    public @enumtype(VkFormat.class) int referencePictureFormat() {
        return segment.get(LAYOUT$referencePictureFormat, OFFSET$referencePictureFormat);
    }

    public void referencePictureFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$referencePictureFormat, OFFSET$referencePictureFormat, value);
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

    public @pointer(comment="VkExtensionProperties*") MemorySegment pStdHeaderVersionRaw() {
        return segment.get(LAYOUT$pStdHeaderVersion, OFFSET$pStdHeaderVersion);
    }

    public void pStdHeaderVersionRaw(@pointer(comment="VkExtensionProperties*") MemorySegment value) {
        segment.set(LAYOUT$pStdHeaderVersion, OFFSET$pStdHeaderVersion, value);
    }

    public @Nullable VkExtensionProperties pStdHeaderVersion() {
        MemorySegment s = pStdHeaderVersionRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkExtensionProperties(s);
    }

    public void pStdHeaderVersion(@Nullable VkExtensionProperties value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdHeaderVersionRaw(s);
    }

    @unsafe public @Nullable VkExtensionProperties[] pStdHeaderVersion(int assumedCount) {
        MemorySegment s = pStdHeaderVersionRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkExtensionProperties.SIZE);
        VkExtensionProperties[] ret = new VkExtensionProperties[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkExtensionProperties(s.asSlice(i * VkExtensionProperties.SIZE, VkExtensionProperties.SIZE));
        }
        return ret;
    }

}
