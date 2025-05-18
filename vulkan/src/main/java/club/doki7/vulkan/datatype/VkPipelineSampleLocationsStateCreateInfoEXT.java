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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineSampleLocationsStateCreateInfoEXT.html"><code>VkPipelineSampleLocationsStateCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineSampleLocationsStateCreateInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 sampleLocationsEnable; // @link substring="sampleLocationsEnable" target="#sampleLocationsEnable"
///     VkSampleLocationsInfoEXT sampleLocationsInfo; // @link substring="VkSampleLocationsInfoEXT" target="VkSampleLocationsInfoEXT" @link substring="sampleLocationsInfo" target="#sampleLocationsInfo"
/// } VkPipelineSampleLocationsStateCreateInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT`
///
/// The {@code allocate} ({@link VkPipelineSampleLocationsStateCreateInfoEXT#allocate(Arena)}, {@link VkPipelineSampleLocationsStateCreateInfoEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPipelineSampleLocationsStateCreateInfoEXT#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineSampleLocationsStateCreateInfoEXT.html"><code>VkPipelineSampleLocationsStateCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineSampleLocationsStateCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineSampleLocationsStateCreateInfoEXT allocate(Arena arena) {
        VkPipelineSampleLocationsStateCreateInfoEXT ret = new VkPipelineSampleLocationsStateCreateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT);
        return ret;
    }

    public static VkPipelineSampleLocationsStateCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineSampleLocationsStateCreateInfoEXT[] ret = new VkPipelineSampleLocationsStateCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineSampleLocationsStateCreateInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static VkPipelineSampleLocationsStateCreateInfoEXT clone(Arena arena, VkPipelineSampleLocationsStateCreateInfoEXT src) {
        VkPipelineSampleLocationsStateCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineSampleLocationsStateCreateInfoEXT[] clone(Arena arena, VkPipelineSampleLocationsStateCreateInfoEXT[] src) {
        VkPipelineSampleLocationsStateCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT);
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

    public @unsigned int sampleLocationsEnable() {
        return segment.get(LAYOUT$sampleLocationsEnable, OFFSET$sampleLocationsEnable);
    }

    public void sampleLocationsEnable(@unsigned int value) {
        segment.set(LAYOUT$sampleLocationsEnable, OFFSET$sampleLocationsEnable, value);
    }

    public @NotNull VkSampleLocationsInfoEXT sampleLocationsInfo() {
        return new VkSampleLocationsInfoEXT(segment.asSlice(OFFSET$sampleLocationsInfo, LAYOUT$sampleLocationsInfo));
    }

    public void sampleLocationsInfo(@NotNull VkSampleLocationsInfoEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sampleLocationsInfo, SIZE$sampleLocationsInfo);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleLocationsEnable"),
        VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$sampleLocationsEnable = PathElement.groupElement("PATH$sampleLocationsEnable");
    public static final PathElement PATH$sampleLocationsInfo = PathElement.groupElement("PATH$sampleLocationsInfo");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$sampleLocationsEnable = (OfInt) LAYOUT.select(PATH$sampleLocationsEnable);
    public static final StructLayout LAYOUT$sampleLocationsInfo = (StructLayout) LAYOUT.select(PATH$sampleLocationsInfo);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$sampleLocationsEnable = LAYOUT$sampleLocationsEnable.byteSize();
    public static final long SIZE$sampleLocationsInfo = LAYOUT$sampleLocationsInfo.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sampleLocationsEnable = LAYOUT.byteOffset(PATH$sampleLocationsEnable);
    public static final long OFFSET$sampleLocationsInfo = LAYOUT.byteOffset(PATH$sampleLocationsInfo);
}
