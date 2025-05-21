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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceTransformFeedbackPropertiesEXT.html"><code>VkPhysicalDeviceTransformFeedbackPropertiesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceTransformFeedbackPropertiesEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t maxTransformFeedbackStreams; // @link substring="maxTransformFeedbackStreams" target="#maxTransformFeedbackStreams"
///     uint32_t maxTransformFeedbackBuffers; // @link substring="maxTransformFeedbackBuffers" target="#maxTransformFeedbackBuffers"
///     VkDeviceSize maxTransformFeedbackBufferSize; // @link substring="maxTransformFeedbackBufferSize" target="#maxTransformFeedbackBufferSize"
///     uint32_t maxTransformFeedbackStreamDataSize; // @link substring="maxTransformFeedbackStreamDataSize" target="#maxTransformFeedbackStreamDataSize"
///     uint32_t maxTransformFeedbackBufferDataSize; // @link substring="maxTransformFeedbackBufferDataSize" target="#maxTransformFeedbackBufferDataSize"
///     uint32_t maxTransformFeedbackBufferDataStride; // @link substring="maxTransformFeedbackBufferDataStride" target="#maxTransformFeedbackBufferDataStride"
///     VkBool32 transformFeedbackQueries; // @link substring="transformFeedbackQueries" target="#transformFeedbackQueries"
///     VkBool32 transformFeedbackStreamsLinesTriangles; // @link substring="transformFeedbackStreamsLinesTriangles" target="#transformFeedbackStreamsLinesTriangles"
///     VkBool32 transformFeedbackRasterizationStreamSelect; // @link substring="transformFeedbackRasterizationStreamSelect" target="#transformFeedbackRasterizationStreamSelect"
///     VkBool32 transformFeedbackDraw; // @link substring="transformFeedbackDraw" target="#transformFeedbackDraw"
/// } VkPhysicalDeviceTransformFeedbackPropertiesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT`
///
/// The {@code allocate} ({@link VkPhysicalDeviceTransformFeedbackPropertiesEXT#allocate(Arena)}, {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceTransformFeedbackPropertiesEXT#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceTransformFeedbackPropertiesEXT.html"><code>VkPhysicalDeviceTransformFeedbackPropertiesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceTransformFeedbackPropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT allocate(Arena arena) {
        VkPhysicalDeviceTransformFeedbackPropertiesEXT ret = new VkPhysicalDeviceTransformFeedbackPropertiesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceTransformFeedbackPropertiesEXT[] ret = new VkPhysicalDeviceTransformFeedbackPropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceTransformFeedbackPropertiesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT clone(Arena arena, VkPhysicalDeviceTransformFeedbackPropertiesEXT src) {
        VkPhysicalDeviceTransformFeedbackPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT[] clone(Arena arena, VkPhysicalDeviceTransformFeedbackPropertiesEXT[] src) {
        VkPhysicalDeviceTransformFeedbackPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_PROPERTIES_EXT);
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

    public @unsigned int maxTransformFeedbackStreams() {
        return segment.get(LAYOUT$maxTransformFeedbackStreams, OFFSET$maxTransformFeedbackStreams);
    }

    public void maxTransformFeedbackStreams(@unsigned int value) {
        segment.set(LAYOUT$maxTransformFeedbackStreams, OFFSET$maxTransformFeedbackStreams, value);
    }

    public @unsigned int maxTransformFeedbackBuffers() {
        return segment.get(LAYOUT$maxTransformFeedbackBuffers, OFFSET$maxTransformFeedbackBuffers);
    }

    public void maxTransformFeedbackBuffers(@unsigned int value) {
        segment.set(LAYOUT$maxTransformFeedbackBuffers, OFFSET$maxTransformFeedbackBuffers, value);
    }

    public @unsigned long maxTransformFeedbackBufferSize() {
        return segment.get(LAYOUT$maxTransformFeedbackBufferSize, OFFSET$maxTransformFeedbackBufferSize);
    }

    public void maxTransformFeedbackBufferSize(@unsigned long value) {
        segment.set(LAYOUT$maxTransformFeedbackBufferSize, OFFSET$maxTransformFeedbackBufferSize, value);
    }

    public @unsigned int maxTransformFeedbackStreamDataSize() {
        return segment.get(LAYOUT$maxTransformFeedbackStreamDataSize, OFFSET$maxTransformFeedbackStreamDataSize);
    }

    public void maxTransformFeedbackStreamDataSize(@unsigned int value) {
        segment.set(LAYOUT$maxTransformFeedbackStreamDataSize, OFFSET$maxTransformFeedbackStreamDataSize, value);
    }

    public @unsigned int maxTransformFeedbackBufferDataSize() {
        return segment.get(LAYOUT$maxTransformFeedbackBufferDataSize, OFFSET$maxTransformFeedbackBufferDataSize);
    }

    public void maxTransformFeedbackBufferDataSize(@unsigned int value) {
        segment.set(LAYOUT$maxTransformFeedbackBufferDataSize, OFFSET$maxTransformFeedbackBufferDataSize, value);
    }

    public @unsigned int maxTransformFeedbackBufferDataStride() {
        return segment.get(LAYOUT$maxTransformFeedbackBufferDataStride, OFFSET$maxTransformFeedbackBufferDataStride);
    }

    public void maxTransformFeedbackBufferDataStride(@unsigned int value) {
        segment.set(LAYOUT$maxTransformFeedbackBufferDataStride, OFFSET$maxTransformFeedbackBufferDataStride, value);
    }

    public @unsigned int transformFeedbackQueries() {
        return segment.get(LAYOUT$transformFeedbackQueries, OFFSET$transformFeedbackQueries);
    }

    public void transformFeedbackQueries(@unsigned int value) {
        segment.set(LAYOUT$transformFeedbackQueries, OFFSET$transformFeedbackQueries, value);
    }

    public @unsigned int transformFeedbackStreamsLinesTriangles() {
        return segment.get(LAYOUT$transformFeedbackStreamsLinesTriangles, OFFSET$transformFeedbackStreamsLinesTriangles);
    }

    public void transformFeedbackStreamsLinesTriangles(@unsigned int value) {
        segment.set(LAYOUT$transformFeedbackStreamsLinesTriangles, OFFSET$transformFeedbackStreamsLinesTriangles, value);
    }

    public @unsigned int transformFeedbackRasterizationStreamSelect() {
        return segment.get(LAYOUT$transformFeedbackRasterizationStreamSelect, OFFSET$transformFeedbackRasterizationStreamSelect);
    }

    public void transformFeedbackRasterizationStreamSelect(@unsigned int value) {
        segment.set(LAYOUT$transformFeedbackRasterizationStreamSelect, OFFSET$transformFeedbackRasterizationStreamSelect, value);
    }

    public @unsigned int transformFeedbackDraw() {
        return segment.get(LAYOUT$transformFeedbackDraw, OFFSET$transformFeedbackDraw);
    }

    public void transformFeedbackDraw(@unsigned int value) {
        segment.set(LAYOUT$transformFeedbackDraw, OFFSET$transformFeedbackDraw, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackStreams"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackBuffers"),
        ValueLayout.JAVA_LONG.withName("maxTransformFeedbackBufferSize"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackStreamDataSize"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackBufferDataSize"),
        ValueLayout.JAVA_INT.withName("maxTransformFeedbackBufferDataStride"),
        ValueLayout.JAVA_INT.withName("transformFeedbackQueries"),
        ValueLayout.JAVA_INT.withName("transformFeedbackStreamsLinesTriangles"),
        ValueLayout.JAVA_INT.withName("transformFeedbackRasterizationStreamSelect"),
        ValueLayout.JAVA_INT.withName("transformFeedbackDraw")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxTransformFeedbackStreams = PathElement.groupElement("maxTransformFeedbackStreams");
    public static final PathElement PATH$maxTransformFeedbackBuffers = PathElement.groupElement("maxTransformFeedbackBuffers");
    public static final PathElement PATH$maxTransformFeedbackBufferSize = PathElement.groupElement("maxTransformFeedbackBufferSize");
    public static final PathElement PATH$maxTransformFeedbackStreamDataSize = PathElement.groupElement("maxTransformFeedbackStreamDataSize");
    public static final PathElement PATH$maxTransformFeedbackBufferDataSize = PathElement.groupElement("maxTransformFeedbackBufferDataSize");
    public static final PathElement PATH$maxTransformFeedbackBufferDataStride = PathElement.groupElement("maxTransformFeedbackBufferDataStride");
    public static final PathElement PATH$transformFeedbackQueries = PathElement.groupElement("transformFeedbackQueries");
    public static final PathElement PATH$transformFeedbackStreamsLinesTriangles = PathElement.groupElement("transformFeedbackStreamsLinesTriangles");
    public static final PathElement PATH$transformFeedbackRasterizationStreamSelect = PathElement.groupElement("transformFeedbackRasterizationStreamSelect");
    public static final PathElement PATH$transformFeedbackDraw = PathElement.groupElement("transformFeedbackDraw");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxTransformFeedbackStreams = (OfInt) LAYOUT.select(PATH$maxTransformFeedbackStreams);
    public static final OfInt LAYOUT$maxTransformFeedbackBuffers = (OfInt) LAYOUT.select(PATH$maxTransformFeedbackBuffers);
    public static final OfLong LAYOUT$maxTransformFeedbackBufferSize = (OfLong) LAYOUT.select(PATH$maxTransformFeedbackBufferSize);
    public static final OfInt LAYOUT$maxTransformFeedbackStreamDataSize = (OfInt) LAYOUT.select(PATH$maxTransformFeedbackStreamDataSize);
    public static final OfInt LAYOUT$maxTransformFeedbackBufferDataSize = (OfInt) LAYOUT.select(PATH$maxTransformFeedbackBufferDataSize);
    public static final OfInt LAYOUT$maxTransformFeedbackBufferDataStride = (OfInt) LAYOUT.select(PATH$maxTransformFeedbackBufferDataStride);
    public static final OfInt LAYOUT$transformFeedbackQueries = (OfInt) LAYOUT.select(PATH$transformFeedbackQueries);
    public static final OfInt LAYOUT$transformFeedbackStreamsLinesTriangles = (OfInt) LAYOUT.select(PATH$transformFeedbackStreamsLinesTriangles);
    public static final OfInt LAYOUT$transformFeedbackRasterizationStreamSelect = (OfInt) LAYOUT.select(PATH$transformFeedbackRasterizationStreamSelect);
    public static final OfInt LAYOUT$transformFeedbackDraw = (OfInt) LAYOUT.select(PATH$transformFeedbackDraw);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxTransformFeedbackStreams = LAYOUT$maxTransformFeedbackStreams.byteSize();
    public static final long SIZE$maxTransformFeedbackBuffers = LAYOUT$maxTransformFeedbackBuffers.byteSize();
    public static final long SIZE$maxTransformFeedbackBufferSize = LAYOUT$maxTransformFeedbackBufferSize.byteSize();
    public static final long SIZE$maxTransformFeedbackStreamDataSize = LAYOUT$maxTransformFeedbackStreamDataSize.byteSize();
    public static final long SIZE$maxTransformFeedbackBufferDataSize = LAYOUT$maxTransformFeedbackBufferDataSize.byteSize();
    public static final long SIZE$maxTransformFeedbackBufferDataStride = LAYOUT$maxTransformFeedbackBufferDataStride.byteSize();
    public static final long SIZE$transformFeedbackQueries = LAYOUT$transformFeedbackQueries.byteSize();
    public static final long SIZE$transformFeedbackStreamsLinesTriangles = LAYOUT$transformFeedbackStreamsLinesTriangles.byteSize();
    public static final long SIZE$transformFeedbackRasterizationStreamSelect = LAYOUT$transformFeedbackRasterizationStreamSelect.byteSize();
    public static final long SIZE$transformFeedbackDraw = LAYOUT$transformFeedbackDraw.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxTransformFeedbackStreams = LAYOUT.byteOffset(PATH$maxTransformFeedbackStreams);
    public static final long OFFSET$maxTransformFeedbackBuffers = LAYOUT.byteOffset(PATH$maxTransformFeedbackBuffers);
    public static final long OFFSET$maxTransformFeedbackBufferSize = LAYOUT.byteOffset(PATH$maxTransformFeedbackBufferSize);
    public static final long OFFSET$maxTransformFeedbackStreamDataSize = LAYOUT.byteOffset(PATH$maxTransformFeedbackStreamDataSize);
    public static final long OFFSET$maxTransformFeedbackBufferDataSize = LAYOUT.byteOffset(PATH$maxTransformFeedbackBufferDataSize);
    public static final long OFFSET$maxTransformFeedbackBufferDataStride = LAYOUT.byteOffset(PATH$maxTransformFeedbackBufferDataStride);
    public static final long OFFSET$transformFeedbackQueries = LAYOUT.byteOffset(PATH$transformFeedbackQueries);
    public static final long OFFSET$transformFeedbackStreamsLinesTriangles = LAYOUT.byteOffset(PATH$transformFeedbackStreamsLinesTriangles);
    public static final long OFFSET$transformFeedbackRasterizationStreamSelect = LAYOUT.byteOffset(PATH$transformFeedbackRasterizationStreamSelect);
    public static final long OFFSET$transformFeedbackDraw = LAYOUT.byteOffset(PATH$transformFeedbackDraw);
}
