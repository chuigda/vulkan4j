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

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkRayTracingShaderGroupCreateInfoNV.html">VkRayTracingShaderGroupCreateInfoNV</a>
public record VkRayTracingShaderGroupCreateInfoNV(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("generalShader"),
        ValueLayout.JAVA_INT.withName("closestHitShader"),
        ValueLayout.JAVA_INT.withName("anyHitShader"),
        ValueLayout.JAVA_INT.withName("intersectionShader")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$generalShader = PathElement.groupElement("generalShader");
    public static final PathElement PATH$closestHitShader = PathElement.groupElement("closestHitShader");
    public static final PathElement PATH$anyHitShader = PathElement.groupElement("anyHitShader");
    public static final PathElement PATH$intersectionShader = PathElement.groupElement("intersectionShader");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$generalShader = (OfInt) LAYOUT.select(PATH$generalShader);
    public static final OfInt LAYOUT$closestHitShader = (OfInt) LAYOUT.select(PATH$closestHitShader);
    public static final OfInt LAYOUT$anyHitShader = (OfInt) LAYOUT.select(PATH$anyHitShader);
    public static final OfInt LAYOUT$intersectionShader = (OfInt) LAYOUT.select(PATH$intersectionShader);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$generalShader = LAYOUT.byteOffset(PATH$generalShader);
    public static final long OFFSET$closestHitShader = LAYOUT.byteOffset(PATH$closestHitShader);
    public static final long OFFSET$anyHitShader = LAYOUT.byteOffset(PATH$anyHitShader);
    public static final long OFFSET$intersectionShader = LAYOUT.byteOffset(PATH$intersectionShader);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$generalShader = LAYOUT$generalShader.byteSize();
    public static final long SIZE$closestHitShader = LAYOUT$closestHitShader.byteSize();
    public static final long SIZE$anyHitShader = LAYOUT$anyHitShader.byteSize();
    public static final long SIZE$intersectionShader = LAYOUT$intersectionShader.byteSize();

    public VkRayTracingShaderGroupCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV);
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

    public @enumtype(VkRayTracingShaderGroupTypeKHR.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkRayTracingShaderGroupTypeKHR.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @unsigned int generalShader() {
        return segment.get(LAYOUT$generalShader, OFFSET$generalShader);
    }

    public void generalShader(@unsigned int value) {
        segment.set(LAYOUT$generalShader, OFFSET$generalShader, value);
    }

    public @unsigned int closestHitShader() {
        return segment.get(LAYOUT$closestHitShader, OFFSET$closestHitShader);
    }

    public void closestHitShader(@unsigned int value) {
        segment.set(LAYOUT$closestHitShader, OFFSET$closestHitShader, value);
    }

    public @unsigned int anyHitShader() {
        return segment.get(LAYOUT$anyHitShader, OFFSET$anyHitShader);
    }

    public void anyHitShader(@unsigned int value) {
        segment.set(LAYOUT$anyHitShader, OFFSET$anyHitShader, value);
    }

    public @unsigned int intersectionShader() {
        return segment.get(LAYOUT$intersectionShader, OFFSET$intersectionShader);
    }

    public void intersectionShader(@unsigned int value) {
        segment.set(LAYOUT$intersectionShader, OFFSET$intersectionShader, value);
    }

    public static VkRayTracingShaderGroupCreateInfoNV allocate(Arena arena) {
        return new VkRayTracingShaderGroupCreateInfoNV(arena.allocate(LAYOUT));
    }
    
    public static VkRayTracingShaderGroupCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRayTracingShaderGroupCreateInfoNV[] ret = new VkRayTracingShaderGroupCreateInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRayTracingShaderGroupCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
