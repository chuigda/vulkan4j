package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceProvokingVertexFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 provokingVertexLast;
///     VkBool32 transformFeedbackPreservesProvokingVertex;
/// } VkPhysicalDeviceProvokingVertexFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceProvokingVertexFeaturesEXT.html">VkPhysicalDeviceProvokingVertexFeaturesEXT</a>
public record VkPhysicalDeviceProvokingVertexFeaturesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceProvokingVertexFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PROVOKING_VERTEX_FEATURES_EXT);
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

    public static VkPhysicalDeviceProvokingVertexFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceProvokingVertexFeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceProvokingVertexFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceProvokingVertexFeaturesEXT[] ret = new VkPhysicalDeviceProvokingVertexFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceProvokingVertexFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("provokingVertexLast"),
        ValueLayout.JAVA_INT.withName("transformFeedbackPreservesProvokingVertex")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$provokingVertexLast = PathElement.groupElement("provokingVertexLast");
    public static final PathElement PATH$transformFeedbackPreservesProvokingVertex = PathElement.groupElement("transformFeedbackPreservesProvokingVertex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$provokingVertexLast = (OfInt) LAYOUT.select(PATH$provokingVertexLast);
    public static final OfInt LAYOUT$transformFeedbackPreservesProvokingVertex = (OfInt) LAYOUT.select(PATH$transformFeedbackPreservesProvokingVertex);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$provokingVertexLast = LAYOUT.byteOffset(PATH$provokingVertexLast);
    public static final long OFFSET$transformFeedbackPreservesProvokingVertex = LAYOUT.byteOffset(PATH$transformFeedbackPreservesProvokingVertex);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$provokingVertexLast = LAYOUT$provokingVertexLast.byteSize();
    public static final long SIZE$transformFeedbackPreservesProvokingVertex = LAYOUT$transformFeedbackPreservesProvokingVertex.byteSize();
}
