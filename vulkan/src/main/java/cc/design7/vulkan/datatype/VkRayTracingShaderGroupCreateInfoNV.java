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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRayTracingShaderGroupCreateInfoNV.html">VkRayTracingShaderGroupCreateInfoNV</a>
@ValueBasedCandidate
public record VkRayTracingShaderGroupCreateInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$type = ValueLayout.JAVA_INT.withName("type");
    public static final OfInt LAYOUT$generalShader = ValueLayout.JAVA_INT.withName("generalShader");
    public static final OfInt LAYOUT$closestHitShader = ValueLayout.JAVA_INT.withName("closestHitShader");
    public static final OfInt LAYOUT$anyHitShader = ValueLayout.JAVA_INT.withName("anyHitShader");
    public static final OfInt LAYOUT$intersectionShader = ValueLayout.JAVA_INT.withName("intersectionShader");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$type, LAYOUT$generalShader, LAYOUT$closestHitShader, LAYOUT$anyHitShader, LAYOUT$intersectionShader);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkRayTracingShaderGroupCreateInfoNV allocate(Arena arena) {
        return new VkRayTracingShaderGroupCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkRayTracingShaderGroupCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRayTracingShaderGroupCreateInfoNV[] ret = new VkRayTracingShaderGroupCreateInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRayTracingShaderGroupCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRayTracingShaderGroupCreateInfoNV clone(Arena arena, VkRayTracingShaderGroupCreateInfoNV src) {
        VkRayTracingShaderGroupCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRayTracingShaderGroupCreateInfoNV[] clone(Arena arena, VkRayTracingShaderGroupCreateInfoNV[] src) {
        VkRayTracingShaderGroupCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$type = PathElement.groupElement("PATH$type");
    public static final PathElement PATH$generalShader = PathElement.groupElement("PATH$generalShader");
    public static final PathElement PATH$closestHitShader = PathElement.groupElement("PATH$closestHitShader");
    public static final PathElement PATH$anyHitShader = PathElement.groupElement("PATH$anyHitShader");
    public static final PathElement PATH$intersectionShader = PathElement.groupElement("PATH$intersectionShader");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$generalShader = LAYOUT$generalShader.byteSize();
    public static final long SIZE$closestHitShader = LAYOUT$closestHitShader.byteSize();
    public static final long SIZE$anyHitShader = LAYOUT$anyHitShader.byteSize();
    public static final long SIZE$intersectionShader = LAYOUT$intersectionShader.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$generalShader = LAYOUT.byteOffset(PATH$generalShader);
    public static final long OFFSET$closestHitShader = LAYOUT.byteOffset(PATH$closestHitShader);
    public static final long OFFSET$anyHitShader = LAYOUT.byteOffset(PATH$anyHitShader);
    public static final long OFFSET$intersectionShader = LAYOUT.byteOffset(PATH$intersectionShader);

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

}
