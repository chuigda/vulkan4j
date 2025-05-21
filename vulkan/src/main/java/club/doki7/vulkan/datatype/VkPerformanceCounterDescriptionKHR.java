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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerformanceCounterDescriptionKHR.html"><code>VkPerformanceCounterDescriptionKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPerformanceCounterDescriptionKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkPerformanceCounterDescriptionFlagsKHR flags; // optional // @link substring="VkPerformanceCounterDescriptionFlagsKHR" target="VkPerformanceCounterDescriptionFlagsKHR" @link substring="flags" target="#flags"
///     char name; // @link substring="name" target="#name"
///     char category; // @link substring="category" target="#category"
///     char description; // @link substring="description" target="#description"
/// } VkPerformanceCounterDescriptionKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR`
///
/// The {@code allocate} ({@link VkPerformanceCounterDescriptionKHR#allocate(Arena)}, {@link VkPerformanceCounterDescriptionKHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPerformanceCounterDescriptionKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerformanceCounterDescriptionKHR.html"><code>VkPerformanceCounterDescriptionKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPerformanceCounterDescriptionKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkPerformanceCounterDescriptionKHR allocate(Arena arena) {
        VkPerformanceCounterDescriptionKHR ret = new VkPerformanceCounterDescriptionKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PERFORMANCE_COUNTER_DESCRIPTION_KHR);
        return ret;
    }

    public static VkPerformanceCounterDescriptionKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPerformanceCounterDescriptionKHR[] ret = new VkPerformanceCounterDescriptionKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPerformanceCounterDescriptionKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PERFORMANCE_COUNTER_DESCRIPTION_KHR);
        }
        return ret;
    }

    public static VkPerformanceCounterDescriptionKHR clone(Arena arena, VkPerformanceCounterDescriptionKHR src) {
        VkPerformanceCounterDescriptionKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPerformanceCounterDescriptionKHR[] clone(Arena arena, VkPerformanceCounterDescriptionKHR[] src) {
        VkPerformanceCounterDescriptionKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PERFORMANCE_COUNTER_DESCRIPTION_KHR);
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

    public @enumtype(VkPerformanceCounterDescriptionFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPerformanceCounterDescriptionFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public byte name() {
        return segment.get(LAYOUT$name, OFFSET$name);
    }

    public void name(byte value) {
        segment.set(LAYOUT$name, OFFSET$name, value);
    }

    public byte category() {
        return segment.get(LAYOUT$category, OFFSET$category);
    }

    public void category(byte value) {
        segment.set(LAYOUT$category, OFFSET$category, value);
    }

    public byte description() {
        return segment.get(LAYOUT$description, OFFSET$description);
    }

    public void description(byte value) {
        segment.set(LAYOUT$description, OFFSET$description, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("name"),
        ValueLayout.JAVA_BYTE.withName("category"),
        ValueLayout.JAVA_BYTE.withName("description")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$name = PathElement.groupElement("name");
    public static final PathElement PATH$category = PathElement.groupElement("category");
    public static final PathElement PATH$description = PathElement.groupElement("description");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfByte LAYOUT$name = (OfByte) LAYOUT.select(PATH$name);
    public static final OfByte LAYOUT$category = (OfByte) LAYOUT.select(PATH$category);
    public static final OfByte LAYOUT$description = (OfByte) LAYOUT.select(PATH$description);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$name = LAYOUT$name.byteSize();
    public static final long SIZE$category = LAYOUT$category.byteSize();
    public static final long SIZE$description = LAYOUT$description.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);
    public static final long OFFSET$category = LAYOUT.byteOffset(PATH$category);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
}
