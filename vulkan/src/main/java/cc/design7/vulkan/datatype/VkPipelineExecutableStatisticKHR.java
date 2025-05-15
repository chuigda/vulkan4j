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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineExecutableStatisticKHR.html"><code>VkPipelineExecutableStatisticKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineExecutableStatisticKHR {
///     VkStructureType sType;
///     void* pNext;
///     char name;
///     char description;
///     VkPipelineExecutableStatisticFormatKHR format;
///     VkPipelineExecutableStatisticValueKHR value;
/// } VkPipelineExecutableStatisticKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR`
///
/// The {@link VkPipelineExecutableStatisticKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPipelineExecutableStatisticKHR#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineExecutableStatisticKHR.html"><code>VkPipelineExecutableStatisticKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineExecutableStatisticKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineExecutableStatisticKHR allocate(Arena arena) {
        VkPipelineExecutableStatisticKHR ret = new VkPipelineExecutableStatisticKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_EXECUTABLE_STATISTIC_KHR);
        return ret;
    }

    public static VkPipelineExecutableStatisticKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineExecutableStatisticKHR[] ret = new VkPipelineExecutableStatisticKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineExecutableStatisticKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_EXECUTABLE_STATISTIC_KHR);
        }
        return ret;
    }

    public static VkPipelineExecutableStatisticKHR clone(Arena arena, VkPipelineExecutableStatisticKHR src) {
        VkPipelineExecutableStatisticKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineExecutableStatisticKHR[] clone(Arena arena, VkPipelineExecutableStatisticKHR[] src) {
        VkPipelineExecutableStatisticKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_EXECUTABLE_STATISTIC_KHR);
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

    public byte name() {
        return segment.get(LAYOUT$name, OFFSET$name);
    }

    public void name(byte value) {
        segment.set(LAYOUT$name, OFFSET$name, value);
    }

    public byte description() {
        return segment.get(LAYOUT$description, OFFSET$description);
    }

    public void description(byte value) {
        segment.set(LAYOUT$description, OFFSET$description, value);
    }

    public @enumtype(VkPipelineExecutableStatisticFormatKHR.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@enumtype(VkPipelineExecutableStatisticFormatKHR.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }

    public VkPipelineExecutableStatisticValueKHR value() {
        return new VkPipelineExecutableStatisticValueKHR(segment.asSlice(OFFSET$value, LAYOUT$value));
    }

    public void value(VkPipelineExecutableStatisticValueKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$value, SIZE$value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_BYTE.withName("name"),
        ValueLayout.JAVA_BYTE.withName("description"),
        ValueLayout.JAVA_INT.withName("format"),
        VkPipelineExecutableStatisticValueKHR.LAYOUT.withName("value")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$name = PathElement.groupElement("PATH$name");
    public static final PathElement PATH$description = PathElement.groupElement("PATH$description");
    public static final PathElement PATH$format = PathElement.groupElement("PATH$format");
    public static final PathElement PATH$value = PathElement.groupElement("PATH$value");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfByte LAYOUT$name = (OfByte) LAYOUT.select(PATH$name);
    public static final OfByte LAYOUT$description = (OfByte) LAYOUT.select(PATH$description);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final StructLayout LAYOUT$value = (StructLayout) LAYOUT.select(PATH$value);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$name = LAYOUT$name.byteSize();
    public static final long SIZE$description = LAYOUT$description.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$value = LAYOUT$value.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$value = LAYOUT.byteOffset(PATH$value);
}
