package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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
/// typedef struct VkDisplayModeParametersKHR {
///     VkExtent2D visibleRegion;
///     uint32_t refreshRate;
/// } VkDisplayModeParametersKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDisplayModeParametersKHR.html">VkDisplayModeParametersKHR</a>
public record VkDisplayModeParametersKHR(MemorySegment segment) implements IPointer {
    public VkDisplayModeParametersKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public VkExtent2D visibleRegion() {
        return new VkExtent2D(segment.asSlice(OFFSET$visibleRegion, LAYOUT$visibleRegion));
    }

    public void visibleRegion(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$visibleRegion, SIZE$visibleRegion);
    }

    public @unsigned int refreshRate() {
        return segment.get(LAYOUT$refreshRate, OFFSET$refreshRate);
    }

    public void refreshRate(@unsigned int value) {
        segment.set(LAYOUT$refreshRate, OFFSET$refreshRate, value);
    }

    public static VkDisplayModeParametersKHR allocate(Arena arena) {
        return new VkDisplayModeParametersKHR(arena.allocate(LAYOUT));
    }

    public static VkDisplayModeParametersKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayModeParametersKHR[] ret = new VkDisplayModeParametersKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDisplayModeParametersKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDisplayModeParametersKHR clone(Arena arena, VkDisplayModeParametersKHR src) {
        VkDisplayModeParametersKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDisplayModeParametersKHR[] clone(Arena arena, VkDisplayModeParametersKHR[] src) {
        VkDisplayModeParametersKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VkExtent2D.LAYOUT.withName("visibleRegion"),
        ValueLayout.JAVA_INT.withName("refreshRate")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$visibleRegion = PathElement.groupElement("visibleRegion");
    public static final PathElement PATH$refreshRate = PathElement.groupElement("refreshRate");

    public static final StructLayout LAYOUT$visibleRegion = (StructLayout) LAYOUT.select(PATH$visibleRegion);
    public static final OfInt LAYOUT$refreshRate = (OfInt) LAYOUT.select(PATH$refreshRate);

    public static final long OFFSET$visibleRegion = LAYOUT.byteOffset(PATH$visibleRegion);
    public static final long OFFSET$refreshRate = LAYOUT.byteOffset(PATH$refreshRate);

    public static final long SIZE$visibleRegion = LAYOUT$visibleRegion.byteSize();
    public static final long SIZE$refreshRate = LAYOUT$refreshRate.byteSize();
}
