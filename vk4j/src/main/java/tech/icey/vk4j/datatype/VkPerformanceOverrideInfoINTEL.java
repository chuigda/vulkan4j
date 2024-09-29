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
/// typedef struct VkPerformanceOverrideInfoINTEL {
///     VkStructureType sType;
///     const void* pNext;
///     VkPerformanceOverrideTypeINTEL type;
///     VkBool32 enable;
///     uint64_t parameter;
/// } VkPerformanceOverrideInfoINTEL;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPerformanceOverrideInfoINTEL.html">VkPerformanceOverrideInfoINTEL</a>
public record VkPerformanceOverrideInfoINTEL(MemorySegment segment) implements IPointer {
    public VkPerformanceOverrideInfoINTEL(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL);
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

    public @enumtype(VkPerformanceOverrideTypeINTEL.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkPerformanceOverrideTypeINTEL.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @unsigned int enable() {
        return segment.get(LAYOUT$enable, OFFSET$enable);
    }

    public void enable(@unsigned int value) {
        segment.set(LAYOUT$enable, OFFSET$enable, value);
    }

    public @unsigned long parameter() {
        return segment.get(LAYOUT$parameter, OFFSET$parameter);
    }

    public void parameter(@unsigned long value) {
        segment.set(LAYOUT$parameter, OFFSET$parameter, value);
    }

    public static VkPerformanceOverrideInfoINTEL allocate(Arena arena) {
        return new VkPerformanceOverrideInfoINTEL(arena.allocate(LAYOUT));
    }
    
    public static VkPerformanceOverrideInfoINTEL[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPerformanceOverrideInfoINTEL[] ret = new VkPerformanceOverrideInfoINTEL[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPerformanceOverrideInfoINTEL(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPerformanceOverrideInfoINTEL clone(Arena arena, VkPerformanceOverrideInfoINTEL src) {
        VkPerformanceOverrideInfoINTEL ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPerformanceOverrideInfoINTEL[] clone(Arena arena, VkPerformanceOverrideInfoINTEL[] src) {
        VkPerformanceOverrideInfoINTEL[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("enable"),
        ValueLayout.JAVA_LONG.withName("parameter")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$enable = PathElement.groupElement("enable");
    public static final PathElement PATH$parameter = PathElement.groupElement("parameter");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$enable = (OfInt) LAYOUT.select(PATH$enable);
    public static final OfLong LAYOUT$parameter = (OfLong) LAYOUT.select(PATH$parameter);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$enable = LAYOUT.byteOffset(PATH$enable);
    public static final long OFFSET$parameter = LAYOUT.byteOffset(PATH$parameter);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$enable = LAYOUT$enable.byteSize();
    public static final long SIZE$parameter = LAYOUT$parameter.byteSize();
}
