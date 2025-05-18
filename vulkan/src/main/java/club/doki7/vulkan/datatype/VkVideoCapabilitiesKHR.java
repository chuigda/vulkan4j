package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoCapabilitiesKHR.html"><code>VkVideoCapabilitiesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoCapabilitiesKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkVideoCapabilityFlagsKHR flags; // @link substring="VkVideoCapabilityFlagsKHR" target="VkVideoCapabilityFlagsKHR" @link substring="flags" target="#flags"
///     VkDeviceSize minBitstreamBufferOffsetAlignment; // @link substring="minBitstreamBufferOffsetAlignment" target="#minBitstreamBufferOffsetAlignment"
///     VkDeviceSize minBitstreamBufferSizeAlignment; // @link substring="minBitstreamBufferSizeAlignment" target="#minBitstreamBufferSizeAlignment"
///     VkExtent2D pictureAccessGranularity; // @link substring="VkExtent2D" target="VkExtent2D" @link substring="pictureAccessGranularity" target="#pictureAccessGranularity"
///     VkExtent2D minCodedExtent; // @link substring="VkExtent2D" target="VkExtent2D" @link substring="minCodedExtent" target="#minCodedExtent"
///     VkExtent2D maxCodedExtent; // @link substring="VkExtent2D" target="VkExtent2D" @link substring="maxCodedExtent" target="#maxCodedExtent"
///     uint32_t maxDpbSlots; // @link substring="maxDpbSlots" target="#maxDpbSlots"
///     uint32_t maxActiveReferencePictures; // @link substring="maxActiveReferencePictures" target="#maxActiveReferencePictures"
///     VkExtensionProperties stdHeaderVersion; // @link substring="VkExtensionProperties" target="VkExtensionProperties" @link substring="stdHeaderVersion" target="#stdHeaderVersion"
/// } VkVideoCapabilitiesKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_CAPABILITIES_KHR`
///
/// The {@code allocate} ({@link VkVideoCapabilitiesKHR#allocate(Arena)}, {@link VkVideoCapabilitiesKHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoCapabilitiesKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoCapabilitiesKHR.html"><code>VkVideoCapabilitiesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoCapabilitiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoCapabilitiesKHR allocate(Arena arena) {
        VkVideoCapabilitiesKHR ret = new VkVideoCapabilitiesKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_CAPABILITIES_KHR);
        return ret;
    }

    public static VkVideoCapabilitiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoCapabilitiesKHR[] ret = new VkVideoCapabilitiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoCapabilitiesKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_CAPABILITIES_KHR);
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

    public void autoInit() {
        sType(VkStructureType.VIDEO_CAPABILITIES_KHR);
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

    public @NotNull VkExtent2D pictureAccessGranularity() {
        return new VkExtent2D(segment.asSlice(OFFSET$pictureAccessGranularity, LAYOUT$pictureAccessGranularity));
    }

    public void pictureAccessGranularity(@NotNull VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pictureAccessGranularity, SIZE$pictureAccessGranularity);
    }

    public @NotNull VkExtent2D minCodedExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$minCodedExtent, LAYOUT$minCodedExtent));
    }

    public void minCodedExtent(@NotNull VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minCodedExtent, SIZE$minCodedExtent);
    }

    public @NotNull VkExtent2D maxCodedExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxCodedExtent, LAYOUT$maxCodedExtent));
    }

    public void maxCodedExtent(@NotNull VkExtent2D value) {
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

    public @NotNull VkExtensionProperties stdHeaderVersion() {
        return new VkExtensionProperties(segment.asSlice(OFFSET$stdHeaderVersion, LAYOUT$stdHeaderVersion));
    }

    public void stdHeaderVersion(@NotNull VkExtensionProperties value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$stdHeaderVersion, SIZE$stdHeaderVersion);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("minBitstreamBufferOffsetAlignment"),
        ValueLayout.JAVA_LONG.withName("minBitstreamBufferSizeAlignment"),
        VkExtent2D.LAYOUT.withName("pictureAccessGranularity"),
        VkExtent2D.LAYOUT.withName("minCodedExtent"),
        VkExtent2D.LAYOUT.withName("maxCodedExtent"),
        ValueLayout.JAVA_INT.withName("maxDpbSlots"),
        ValueLayout.JAVA_INT.withName("maxActiveReferencePictures"),
        VkExtensionProperties.LAYOUT.withName("stdHeaderVersion")
    );
    public static final long BYTES = LAYOUT.byteSize();

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

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfLong LAYOUT$minBitstreamBufferOffsetAlignment = (OfLong) LAYOUT.select(PATH$minBitstreamBufferOffsetAlignment);
    public static final OfLong LAYOUT$minBitstreamBufferSizeAlignment = (OfLong) LAYOUT.select(PATH$minBitstreamBufferSizeAlignment);
    public static final StructLayout LAYOUT$pictureAccessGranularity = (StructLayout) LAYOUT.select(PATH$pictureAccessGranularity);
    public static final StructLayout LAYOUT$minCodedExtent = (StructLayout) LAYOUT.select(PATH$minCodedExtent);
    public static final StructLayout LAYOUT$maxCodedExtent = (StructLayout) LAYOUT.select(PATH$maxCodedExtent);
    public static final OfInt LAYOUT$maxDpbSlots = (OfInt) LAYOUT.select(PATH$maxDpbSlots);
    public static final OfInt LAYOUT$maxActiveReferencePictures = (OfInt) LAYOUT.select(PATH$maxActiveReferencePictures);
    public static final StructLayout LAYOUT$stdHeaderVersion = (StructLayout) LAYOUT.select(PATH$stdHeaderVersion);

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
}
