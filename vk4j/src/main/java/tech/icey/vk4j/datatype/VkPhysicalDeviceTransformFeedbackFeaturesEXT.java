package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceTransformFeedbackFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 transformFeedback;
///     VkBool32 geometryStreams;
/// } VkPhysicalDeviceTransformFeedbackFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceTransformFeedbackFeaturesEXT.html">VkPhysicalDeviceTransformFeedbackFeaturesEXT</a>
public record VkPhysicalDeviceTransformFeedbackFeaturesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceTransformFeedbackFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TRANSFORM_FEEDBACK_FEATURES_EXT);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int transformFeedback() {
        return segment.get(LAYOUT$transformFeedback, OFFSET$transformFeedback);
    }

    public void transformFeedback(@unsigned int value) {
        segment.set(LAYOUT$transformFeedback, OFFSET$transformFeedback, value);
    }

    public @unsigned int geometryStreams() {
        return segment.get(LAYOUT$geometryStreams, OFFSET$geometryStreams);
    }

    public void geometryStreams(@unsigned int value) {
        segment.set(LAYOUT$geometryStreams, OFFSET$geometryStreams, value);
    }

    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceTransformFeedbackFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceTransformFeedbackFeaturesEXT[] ret = new VkPhysicalDeviceTransformFeedbackFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceTransformFeedbackFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT clone(Arena arena, VkPhysicalDeviceTransformFeedbackFeaturesEXT src) {
        VkPhysicalDeviceTransformFeedbackFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceTransformFeedbackFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceTransformFeedbackFeaturesEXT[] src) {
        VkPhysicalDeviceTransformFeedbackFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("transformFeedback"),
        ValueLayout.JAVA_INT.withName("geometryStreams")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$transformFeedback = PathElement.groupElement("transformFeedback");
    public static final PathElement PATH$geometryStreams = PathElement.groupElement("geometryStreams");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$transformFeedback = (OfInt) LAYOUT.select(PATH$transformFeedback);
    public static final OfInt LAYOUT$geometryStreams = (OfInt) LAYOUT.select(PATH$geometryStreams);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$transformFeedback = LAYOUT.byteOffset(PATH$transformFeedback);
    public static final long OFFSET$geometryStreams = LAYOUT.byteOffset(PATH$geometryStreams);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$transformFeedback = LAYOUT$transformFeedback.byteSize();
    public static final long SIZE$geometryStreams = LAYOUT$geometryStreams.byteSize();
}
