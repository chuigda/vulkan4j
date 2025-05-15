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

/// Represents a pointer to a {@code VkPhysicalDeviceProvokingVertexFeaturesEXT} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceProvokingVertexFeaturesEXT.html">VkPhysicalDeviceProvokingVertexFeaturesEXT</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceProvokingVertexFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceProvokingVertexFeaturesEXT {
        sType(VkStructureType.PHYSICAL_DEVICE_PROVOKING_VERTEX_FEATURES_EXT);
    }

    public static VkPhysicalDeviceProvokingVertexFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceProvokingVertexFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceProvokingVertexFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceProvokingVertexFeaturesEXT[] ret = new VkPhysicalDeviceProvokingVertexFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceProvokingVertexFeaturesEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkPhysicalDeviceProvokingVertexFeaturesEXT clone(Arena arena, VkPhysicalDeviceProvokingVertexFeaturesEXT src) {
        VkPhysicalDeviceProvokingVertexFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceProvokingVertexFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceProvokingVertexFeaturesEXT[] src) {
        VkPhysicalDeviceProvokingVertexFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("provokingVertexLast"),
        ValueLayout.JAVA_INT.withName("transformFeedbackPreservesProvokingVertex")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$provokingVertexLast = PathElement.groupElement("PATH$provokingVertexLast");
    public static final PathElement PATH$transformFeedbackPreservesProvokingVertex = PathElement.groupElement("PATH$transformFeedbackPreservesProvokingVertex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$provokingVertexLast = (OfInt) LAYOUT.select(PATH$provokingVertexLast);
    public static final OfInt LAYOUT$transformFeedbackPreservesProvokingVertex = (OfInt) LAYOUT.select(PATH$transformFeedbackPreservesProvokingVertex);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$provokingVertexLast = LAYOUT$provokingVertexLast.byteSize();
    public static final long SIZE$transformFeedbackPreservesProvokingVertex = LAYOUT$transformFeedbackPreservesProvokingVertex.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$provokingVertexLast = LAYOUT.byteOffset(PATH$provokingVertexLast);
    public static final long OFFSET$transformFeedbackPreservesProvokingVertex = LAYOUT.byteOffset(PATH$transformFeedbackPreservesProvokingVertex);

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

    public @unsigned int provokingVertexLast() {
        return segment.get(LAYOUT$provokingVertexLast, OFFSET$provokingVertexLast);
    }

    public void provokingVertexLast(@unsigned int value) {
        segment.set(LAYOUT$provokingVertexLast, OFFSET$provokingVertexLast, value);
    }

    public @unsigned int transformFeedbackPreservesProvokingVertex() {
        return segment.get(LAYOUT$transformFeedbackPreservesProvokingVertex, OFFSET$transformFeedbackPreservesProvokingVertex);
    }

    public void transformFeedbackPreservesProvokingVertex(@unsigned int value) {
        segment.set(LAYOUT$transformFeedbackPreservesProvokingVertex, OFFSET$transformFeedbackPreservesProvokingVertex, value);
    }

}
