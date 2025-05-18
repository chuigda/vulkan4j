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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSurfaceCapabilities2EXT.html"><code>VkSurfaceCapabilities2EXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSurfaceCapabilities2EXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t minImageCount; // @link substring="minImageCount" target="#minImageCount"
///     uint32_t maxImageCount; // @link substring="maxImageCount" target="#maxImageCount"
///     VkExtent2D currentExtent; // @link substring="VkExtent2D" target="VkExtent2D" @link substring="currentExtent" target="#currentExtent"
///     VkExtent2D minImageExtent; // @link substring="VkExtent2D" target="VkExtent2D" @link substring="minImageExtent" target="#minImageExtent"
///     VkExtent2D maxImageExtent; // @link substring="VkExtent2D" target="VkExtent2D" @link substring="maxImageExtent" target="#maxImageExtent"
///     uint32_t maxImageArrayLayers; // @link substring="maxImageArrayLayers" target="#maxImageArrayLayers"
///     VkSurfaceTransformFlagsKHR supportedTransforms; // @link substring="VkSurfaceTransformFlagsKHR" target="VkSurfaceTransformFlagsKHR" @link substring="supportedTransforms" target="#supportedTransforms"
///     VkSurfaceTransformFlagsKHR currentTransform; // @link substring="VkSurfaceTransformFlagsKHR" target="VkSurfaceTransformFlagsKHR" @link substring="currentTransform" target="#currentTransform"
///     VkCompositeAlphaFlagsKHR supportedCompositeAlpha; // @link substring="VkCompositeAlphaFlagsKHR" target="VkCompositeAlphaFlagsKHR" @link substring="supportedCompositeAlpha" target="#supportedCompositeAlpha"
///     VkImageUsageFlags supportedUsageFlags; // @link substring="VkImageUsageFlags" target="VkImageUsageFlags" @link substring="supportedUsageFlags" target="#supportedUsageFlags"
///     VkSurfaceCounterFlagsEXT supportedSurfaceCounters; // optional // @link substring="VkSurfaceCounterFlagsEXT" target="VkSurfaceCounterFlagsEXT" @link substring="supportedSurfaceCounters" target="#supportedSurfaceCounters"
/// } VkSurfaceCapabilities2EXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT`
///
/// The {@code allocate} ({@link VkSurfaceCapabilities2EXT#allocate(Arena)}, {@link VkSurfaceCapabilities2EXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkSurfaceCapabilities2EXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSurfaceCapabilities2EXT.html"><code>VkSurfaceCapabilities2EXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSurfaceCapabilities2EXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkSurfaceCapabilities2EXT allocate(Arena arena) {
        VkSurfaceCapabilities2EXT ret = new VkSurfaceCapabilities2EXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SURFACE_CAPABILITIES_2_EXT);
        return ret;
    }

    public static VkSurfaceCapabilities2EXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSurfaceCapabilities2EXT[] ret = new VkSurfaceCapabilities2EXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSurfaceCapabilities2EXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SURFACE_CAPABILITIES_2_EXT);
        }
        return ret;
    }

    public static VkSurfaceCapabilities2EXT clone(Arena arena, VkSurfaceCapabilities2EXT src) {
        VkSurfaceCapabilities2EXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSurfaceCapabilities2EXT[] clone(Arena arena, VkSurfaceCapabilities2EXT[] src) {
        VkSurfaceCapabilities2EXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SURFACE_CAPABILITIES_2_EXT);
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

    public @unsigned int minImageCount() {
        return segment.get(LAYOUT$minImageCount, OFFSET$minImageCount);
    }

    public void minImageCount(@unsigned int value) {
        segment.set(LAYOUT$minImageCount, OFFSET$minImageCount, value);
    }

    public @unsigned int maxImageCount() {
        return segment.get(LAYOUT$maxImageCount, OFFSET$maxImageCount);
    }

    public void maxImageCount(@unsigned int value) {
        segment.set(LAYOUT$maxImageCount, OFFSET$maxImageCount, value);
    }

    public @NotNull VkExtent2D currentExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$currentExtent, LAYOUT$currentExtent));
    }

    public void currentExtent(@NotNull VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$currentExtent, SIZE$currentExtent);
    }

    public @NotNull VkExtent2D minImageExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$minImageExtent, LAYOUT$minImageExtent));
    }

    public void minImageExtent(@NotNull VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minImageExtent, SIZE$minImageExtent);
    }

    public @NotNull VkExtent2D maxImageExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxImageExtent, LAYOUT$maxImageExtent));
    }

    public void maxImageExtent(@NotNull VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxImageExtent, SIZE$maxImageExtent);
    }

    public @unsigned int maxImageArrayLayers() {
        return segment.get(LAYOUT$maxImageArrayLayers, OFFSET$maxImageArrayLayers);
    }

    public void maxImageArrayLayers(@unsigned int value) {
        segment.set(LAYOUT$maxImageArrayLayers, OFFSET$maxImageArrayLayers, value);
    }

    public @enumtype(VkSurfaceTransformFlagsKHR.class) int supportedTransforms() {
        return segment.get(LAYOUT$supportedTransforms, OFFSET$supportedTransforms);
    }

    public void supportedTransforms(@enumtype(VkSurfaceTransformFlagsKHR.class) int value) {
        segment.set(LAYOUT$supportedTransforms, OFFSET$supportedTransforms, value);
    }

    public @enumtype(VkSurfaceTransformFlagsKHR.class) int currentTransform() {
        return segment.get(LAYOUT$currentTransform, OFFSET$currentTransform);
    }

    public void currentTransform(@enumtype(VkSurfaceTransformFlagsKHR.class) int value) {
        segment.set(LAYOUT$currentTransform, OFFSET$currentTransform, value);
    }

    public @enumtype(VkCompositeAlphaFlagsKHR.class) int supportedCompositeAlpha() {
        return segment.get(LAYOUT$supportedCompositeAlpha, OFFSET$supportedCompositeAlpha);
    }

    public void supportedCompositeAlpha(@enumtype(VkCompositeAlphaFlagsKHR.class) int value) {
        segment.set(LAYOUT$supportedCompositeAlpha, OFFSET$supportedCompositeAlpha, value);
    }

    public @enumtype(VkImageUsageFlags.class) int supportedUsageFlags() {
        return segment.get(LAYOUT$supportedUsageFlags, OFFSET$supportedUsageFlags);
    }

    public void supportedUsageFlags(@enumtype(VkImageUsageFlags.class) int value) {
        segment.set(LAYOUT$supportedUsageFlags, OFFSET$supportedUsageFlags, value);
    }

    public @enumtype(VkSurfaceCounterFlagsEXT.class) int supportedSurfaceCounters() {
        return segment.get(LAYOUT$supportedSurfaceCounters, OFFSET$supportedSurfaceCounters);
    }

    public void supportedSurfaceCounters(@enumtype(VkSurfaceCounterFlagsEXT.class) int value) {
        segment.set(LAYOUT$supportedSurfaceCounters, OFFSET$supportedSurfaceCounters, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minImageCount"),
        ValueLayout.JAVA_INT.withName("maxImageCount"),
        VkExtent2D.LAYOUT.withName("currentExtent"),
        VkExtent2D.LAYOUT.withName("minImageExtent"),
        VkExtent2D.LAYOUT.withName("maxImageExtent"),
        ValueLayout.JAVA_INT.withName("maxImageArrayLayers"),
        ValueLayout.JAVA_INT.withName("supportedTransforms"),
        ValueLayout.JAVA_INT.withName("currentTransform"),
        ValueLayout.JAVA_INT.withName("supportedCompositeAlpha"),
        ValueLayout.JAVA_INT.withName("supportedUsageFlags"),
        ValueLayout.JAVA_INT.withName("supportedSurfaceCounters")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$minImageCount = PathElement.groupElement("PATH$minImageCount");
    public static final PathElement PATH$maxImageCount = PathElement.groupElement("PATH$maxImageCount");
    public static final PathElement PATH$currentExtent = PathElement.groupElement("PATH$currentExtent");
    public static final PathElement PATH$minImageExtent = PathElement.groupElement("PATH$minImageExtent");
    public static final PathElement PATH$maxImageExtent = PathElement.groupElement("PATH$maxImageExtent");
    public static final PathElement PATH$maxImageArrayLayers = PathElement.groupElement("PATH$maxImageArrayLayers");
    public static final PathElement PATH$supportedTransforms = PathElement.groupElement("PATH$supportedTransforms");
    public static final PathElement PATH$currentTransform = PathElement.groupElement("PATH$currentTransform");
    public static final PathElement PATH$supportedCompositeAlpha = PathElement.groupElement("PATH$supportedCompositeAlpha");
    public static final PathElement PATH$supportedUsageFlags = PathElement.groupElement("PATH$supportedUsageFlags");
    public static final PathElement PATH$supportedSurfaceCounters = PathElement.groupElement("PATH$supportedSurfaceCounters");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$minImageCount = (OfInt) LAYOUT.select(PATH$minImageCount);
    public static final OfInt LAYOUT$maxImageCount = (OfInt) LAYOUT.select(PATH$maxImageCount);
    public static final StructLayout LAYOUT$currentExtent = (StructLayout) LAYOUT.select(PATH$currentExtent);
    public static final StructLayout LAYOUT$minImageExtent = (StructLayout) LAYOUT.select(PATH$minImageExtent);
    public static final StructLayout LAYOUT$maxImageExtent = (StructLayout) LAYOUT.select(PATH$maxImageExtent);
    public static final OfInt LAYOUT$maxImageArrayLayers = (OfInt) LAYOUT.select(PATH$maxImageArrayLayers);
    public static final OfInt LAYOUT$supportedTransforms = (OfInt) LAYOUT.select(PATH$supportedTransforms);
    public static final OfInt LAYOUT$currentTransform = (OfInt) LAYOUT.select(PATH$currentTransform);
    public static final OfInt LAYOUT$supportedCompositeAlpha = (OfInt) LAYOUT.select(PATH$supportedCompositeAlpha);
    public static final OfInt LAYOUT$supportedUsageFlags = (OfInt) LAYOUT.select(PATH$supportedUsageFlags);
    public static final OfInt LAYOUT$supportedSurfaceCounters = (OfInt) LAYOUT.select(PATH$supportedSurfaceCounters);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$minImageCount = LAYOUT$minImageCount.byteSize();
    public static final long SIZE$maxImageCount = LAYOUT$maxImageCount.byteSize();
    public static final long SIZE$currentExtent = LAYOUT$currentExtent.byteSize();
    public static final long SIZE$minImageExtent = LAYOUT$minImageExtent.byteSize();
    public static final long SIZE$maxImageExtent = LAYOUT$maxImageExtent.byteSize();
    public static final long SIZE$maxImageArrayLayers = LAYOUT$maxImageArrayLayers.byteSize();
    public static final long SIZE$supportedTransforms = LAYOUT$supportedTransforms.byteSize();
    public static final long SIZE$currentTransform = LAYOUT$currentTransform.byteSize();
    public static final long SIZE$supportedCompositeAlpha = LAYOUT$supportedCompositeAlpha.byteSize();
    public static final long SIZE$supportedUsageFlags = LAYOUT$supportedUsageFlags.byteSize();
    public static final long SIZE$supportedSurfaceCounters = LAYOUT$supportedSurfaceCounters.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$minImageCount = LAYOUT.byteOffset(PATH$minImageCount);
    public static final long OFFSET$maxImageCount = LAYOUT.byteOffset(PATH$maxImageCount);
    public static final long OFFSET$currentExtent = LAYOUT.byteOffset(PATH$currentExtent);
    public static final long OFFSET$minImageExtent = LAYOUT.byteOffset(PATH$minImageExtent);
    public static final long OFFSET$maxImageExtent = LAYOUT.byteOffset(PATH$maxImageExtent);
    public static final long OFFSET$maxImageArrayLayers = LAYOUT.byteOffset(PATH$maxImageArrayLayers);
    public static final long OFFSET$supportedTransforms = LAYOUT.byteOffset(PATH$supportedTransforms);
    public static final long OFFSET$currentTransform = LAYOUT.byteOffset(PATH$currentTransform);
    public static final long OFFSET$supportedCompositeAlpha = LAYOUT.byteOffset(PATH$supportedCompositeAlpha);
    public static final long OFFSET$supportedUsageFlags = LAYOUT.byteOffset(PATH$supportedUsageFlags);
    public static final long OFFSET$supportedSurfaceCounters = LAYOUT.byteOffset(PATH$supportedSurfaceCounters);
}
