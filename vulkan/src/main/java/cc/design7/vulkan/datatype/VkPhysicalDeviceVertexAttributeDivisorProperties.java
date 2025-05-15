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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVertexAttributeDivisorProperties.html">VkPhysicalDeviceVertexAttributeDivisorProperties</a>
@ValueBasedCandidate
public record VkPhysicalDeviceVertexAttributeDivisorProperties(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$maxVertexAttribDivisor = ValueLayout.JAVA_INT.withName("maxVertexAttribDivisor");
    public static final OfInt LAYOUT$supportsNonZeroFirstInstance = ValueLayout.JAVA_INT.withName("supportsNonZeroFirstInstance");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$maxVertexAttribDivisor, LAYOUT$supportsNonZeroFirstInstance);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceVertexAttributeDivisorProperties allocate(Arena arena) {
        return new VkPhysicalDeviceVertexAttributeDivisorProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceVertexAttributeDivisorProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceVertexAttributeDivisorProperties[] ret = new VkPhysicalDeviceVertexAttributeDivisorProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceVertexAttributeDivisorProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceVertexAttributeDivisorProperties clone(Arena arena, VkPhysicalDeviceVertexAttributeDivisorProperties src) {
        VkPhysicalDeviceVertexAttributeDivisorProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceVertexAttributeDivisorProperties[] clone(Arena arena, VkPhysicalDeviceVertexAttributeDivisorProperties[] src) {
        VkPhysicalDeviceVertexAttributeDivisorProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxVertexAttribDivisor = PathElement.groupElement("PATH$maxVertexAttribDivisor");
    public static final PathElement PATH$supportsNonZeroFirstInstance = PathElement.groupElement("PATH$supportsNonZeroFirstInstance");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxVertexAttribDivisor = LAYOUT$maxVertexAttribDivisor.byteSize();
    public static final long SIZE$supportsNonZeroFirstInstance = LAYOUT$supportsNonZeroFirstInstance.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxVertexAttribDivisor = LAYOUT.byteOffset(PATH$maxVertexAttribDivisor);
    public static final long OFFSET$supportsNonZeroFirstInstance = LAYOUT.byteOffset(PATH$supportsNonZeroFirstInstance);

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

    public @unsigned int maxVertexAttribDivisor() {
        return segment.get(LAYOUT$maxVertexAttribDivisor, OFFSET$maxVertexAttribDivisor);
    }

    public void maxVertexAttribDivisor(@unsigned int value) {
        segment.set(LAYOUT$maxVertexAttribDivisor, OFFSET$maxVertexAttribDivisor, value);
    }

    public @unsigned int supportsNonZeroFirstInstance() {
        return segment.get(LAYOUT$supportsNonZeroFirstInstance, OFFSET$supportsNonZeroFirstInstance);
    }

    public void supportsNonZeroFirstInstance(@unsigned int value) {
        segment.set(LAYOUT$supportsNonZeroFirstInstance, OFFSET$supportsNonZeroFirstInstance, value);
    }

}
