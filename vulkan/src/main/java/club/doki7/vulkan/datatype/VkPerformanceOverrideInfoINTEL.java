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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerformanceOverrideInfoINTEL.html"><code>VkPerformanceOverrideInfoINTEL</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPerformanceOverrideInfoINTEL {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkPerformanceOverrideTypeINTEL type; // @link substring="VkPerformanceOverrideTypeINTEL" target="VkPerformanceOverrideTypeINTEL" @link substring="type" target="#type"
///     VkBool32 enable; // @link substring="enable" target="#enable"
///     uint64_t parameter; // @link substring="parameter" target="#parameter"
/// } VkPerformanceOverrideInfoINTEL;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PERFORMANCE_OVERRIDE_INFO_INTEL`
///
/// The {@link VkPerformanceOverrideInfoINTEL#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPerformanceOverrideInfoINTEL#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerformanceOverrideInfoINTEL.html"><code>VkPerformanceOverrideInfoINTEL</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPerformanceOverrideInfoINTEL(@NotNull MemorySegment segment) implements IPointer {
    public static VkPerformanceOverrideInfoINTEL allocate(Arena arena) {
        VkPerformanceOverrideInfoINTEL ret = new VkPerformanceOverrideInfoINTEL(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PERFORMANCE_OVERRIDE_INFO_INTEL);
        return ret;
    }

    public static VkPerformanceOverrideInfoINTEL[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPerformanceOverrideInfoINTEL[] ret = new VkPerformanceOverrideInfoINTEL[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPerformanceOverrideInfoINTEL(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PERFORMANCE_OVERRIDE_INFO_INTEL);
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PERFORMANCE_OVERRIDE_INFO_INTEL);
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("enable"),
        ValueLayout.JAVA_LONG.withName("parameter")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$type = PathElement.groupElement("PATH$type");
    public static final PathElement PATH$enable = PathElement.groupElement("PATH$enable");
    public static final PathElement PATH$parameter = PathElement.groupElement("PATH$parameter");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$enable = (OfInt) LAYOUT.select(PATH$enable);
    public static final OfLong LAYOUT$parameter = (OfLong) LAYOUT.select(PATH$parameter);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$enable = LAYOUT$enable.byteSize();
    public static final long SIZE$parameter = LAYOUT$parameter.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$enable = LAYOUT.byteOffset(PATH$enable);
    public static final long OFFSET$parameter = LAYOUT.byteOffset(PATH$parameter);
}
