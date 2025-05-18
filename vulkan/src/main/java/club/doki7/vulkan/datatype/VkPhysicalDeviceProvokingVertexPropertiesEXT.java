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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceProvokingVertexPropertiesEXT.html"><code>VkPhysicalDeviceProvokingVertexPropertiesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceProvokingVertexPropertiesEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 provokingVertexModePerPipeline; // @link substring="provokingVertexModePerPipeline" target="#provokingVertexModePerPipeline"
///     VkBool32 transformFeedbackPreservesTriangleFanProvokingVertex; // @link substring="transformFeedbackPreservesTriangleFanProvokingVertex" target="#transformFeedbackPreservesTriangleFanProvokingVertex"
/// } VkPhysicalDeviceProvokingVertexPropertiesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_PROPERTIES_EXT`
///
/// The {@code allocate} ({@link VkPhysicalDeviceProvokingVertexPropertiesEXT#allocate(Arena)}, {@link VkPhysicalDeviceProvokingVertexPropertiesEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceProvokingVertexPropertiesEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceProvokingVertexPropertiesEXT.html"><code>VkPhysicalDeviceProvokingVertexPropertiesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceProvokingVertexPropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceProvokingVertexPropertiesEXT allocate(Arena arena) {
        VkPhysicalDeviceProvokingVertexPropertiesEXT ret = new VkPhysicalDeviceProvokingVertexPropertiesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_PROVOKING_VERTEX_PROPERTIES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceProvokingVertexPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceProvokingVertexPropertiesEXT[] ret = new VkPhysicalDeviceProvokingVertexPropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceProvokingVertexPropertiesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_PROVOKING_VERTEX_PROPERTIES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceProvokingVertexPropertiesEXT clone(Arena arena, VkPhysicalDeviceProvokingVertexPropertiesEXT src) {
        VkPhysicalDeviceProvokingVertexPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceProvokingVertexPropertiesEXT[] clone(Arena arena, VkPhysicalDeviceProvokingVertexPropertiesEXT[] src) {
        VkPhysicalDeviceProvokingVertexPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_PROVOKING_VERTEX_PROPERTIES_EXT);
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

    public @unsigned int provokingVertexModePerPipeline() {
        return segment.get(LAYOUT$provokingVertexModePerPipeline, OFFSET$provokingVertexModePerPipeline);
    }

    public void provokingVertexModePerPipeline(@unsigned int value) {
        segment.set(LAYOUT$provokingVertexModePerPipeline, OFFSET$provokingVertexModePerPipeline, value);
    }

    public @unsigned int transformFeedbackPreservesTriangleFanProvokingVertex() {
        return segment.get(LAYOUT$transformFeedbackPreservesTriangleFanProvokingVertex, OFFSET$transformFeedbackPreservesTriangleFanProvokingVertex);
    }

    public void transformFeedbackPreservesTriangleFanProvokingVertex(@unsigned int value) {
        segment.set(LAYOUT$transformFeedbackPreservesTriangleFanProvokingVertex, OFFSET$transformFeedbackPreservesTriangleFanProvokingVertex, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("provokingVertexModePerPipeline"),
        ValueLayout.JAVA_INT.withName("transformFeedbackPreservesTriangleFanProvokingVertex")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$provokingVertexModePerPipeline = PathElement.groupElement("PATH$provokingVertexModePerPipeline");
    public static final PathElement PATH$transformFeedbackPreservesTriangleFanProvokingVertex = PathElement.groupElement("PATH$transformFeedbackPreservesTriangleFanProvokingVertex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$provokingVertexModePerPipeline = (OfInt) LAYOUT.select(PATH$provokingVertexModePerPipeline);
    public static final OfInt LAYOUT$transformFeedbackPreservesTriangleFanProvokingVertex = (OfInt) LAYOUT.select(PATH$transformFeedbackPreservesTriangleFanProvokingVertex);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$provokingVertexModePerPipeline = LAYOUT$provokingVertexModePerPipeline.byteSize();
    public static final long SIZE$transformFeedbackPreservesTriangleFanProvokingVertex = LAYOUT$transformFeedbackPreservesTriangleFanProvokingVertex.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$provokingVertexModePerPipeline = LAYOUT.byteOffset(PATH$provokingVertexModePerPipeline);
    public static final long OFFSET$transformFeedbackPreservesTriangleFanProvokingVertex = LAYOUT.byteOffset(PATH$transformFeedbackPreservesTriangleFanProvokingVertex);
}
