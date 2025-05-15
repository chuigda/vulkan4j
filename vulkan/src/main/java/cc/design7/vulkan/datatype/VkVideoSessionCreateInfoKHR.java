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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoSessionCreateInfoKHR.html"><code>VkVideoSessionCreateInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoSessionCreateInfoKHR {
///     VkStructureType sType;
///     void const* pNext;
///     uint32_t queueFamilyIndex;
///     VkVideoSessionCreateFlagsKHR flags;
///     VkVideoProfileInfoKHR const* pVideoProfile;
///     VkFormat pictureFormat;
///     VkExtent2D maxCodedExtent;
///     VkFormat referencePictureFormat;
///     uint32_t maxDpbSlots;
///     uint32_t maxActiveReferencePictures;
///     VkExtensionProperties const* pStdHeaderVersion;
/// } VkVideoSessionCreateInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_SESSION_CREATE_INFO_KHR`
///
/// The {@link VkVideoSessionCreateInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoSessionCreateInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoSessionCreateInfoKHR.html"><code>VkVideoSessionCreateInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoSessionCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoSessionCreateInfoKHR allocate(Arena arena) {
        VkVideoSessionCreateInfoKHR ret = new VkVideoSessionCreateInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_SESSION_CREATE_INFO_KHR);
        return ret;
    }

    public static VkVideoSessionCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoSessionCreateInfoKHR[] ret = new VkVideoSessionCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoSessionCreateInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_SESSION_CREATE_INFO_KHR);
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

    public void autoInit() {
        sType(VkStructureType.VIDEO_SESSION_CREATE_INFO_KHR);
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
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkExtensionProperties.SIZE);
        VkExtensionProperties[] ret = new VkExtensionProperties[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkExtensionProperties(s.asSlice(i * VkExtensionProperties.SIZE, VkExtensionProperties.SIZE));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withTargetLayout(VkVideoProfileInfoKHR.LAYOUT).withName("pVideoProfile"),
        ValueLayout.JAVA_INT.withName("pictureFormat"),
        VkExtent2D.LAYOUT.withName("maxCodedExtent"),
        ValueLayout.JAVA_INT.withName("referencePictureFormat"),
        ValueLayout.JAVA_INT.withName("maxDpbSlots"),
        ValueLayout.JAVA_INT.withName("maxActiveReferencePictures"),
        ValueLayout.ADDRESS.withTargetLayout(VkExtensionProperties.LAYOUT).withName("pStdHeaderVersion")
    );
    public static final long BYTES = LAYOUT.byteSize();

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

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$queueFamilyIndex = (OfInt) LAYOUT.select(PATH$queueFamilyIndex);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pVideoProfile = (AddressLayout) LAYOUT.select(PATH$pVideoProfile);
    public static final OfInt LAYOUT$pictureFormat = (OfInt) LAYOUT.select(PATH$pictureFormat);
    public static final StructLayout LAYOUT$maxCodedExtent = (StructLayout) LAYOUT.select(PATH$maxCodedExtent);
    public static final OfInt LAYOUT$referencePictureFormat = (OfInt) LAYOUT.select(PATH$referencePictureFormat);
    public static final OfInt LAYOUT$maxDpbSlots = (OfInt) LAYOUT.select(PATH$maxDpbSlots);
    public static final OfInt LAYOUT$maxActiveReferencePictures = (OfInt) LAYOUT.select(PATH$maxActiveReferencePictures);
    public static final AddressLayout LAYOUT$pStdHeaderVersion = (AddressLayout) LAYOUT.select(PATH$pStdHeaderVersion);

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
}
