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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineCoverageToColorStateCreateInfoNV.html"><code>VkPipelineCoverageToColorStateCreateInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineCoverageToColorStateCreateInfoNV {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkPipelineCoverageToColorStateCreateFlagsNV flags; // optional // @link substring="VkPipelineCoverageToColorStateCreateFlagsNV" target="VkPipelineCoverageToColorStateCreateFlagsNV" @link substring="flags" target="#flags"
///     VkBool32 coverageToColorEnable; // @link substring="coverageToColorEnable" target="#coverageToColorEnable"
///     uint32_t coverageToColorLocation; // optional // @link substring="coverageToColorLocation" target="#coverageToColorLocation"
/// } VkPipelineCoverageToColorStateCreateInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV`
///
/// The {@code allocate} ({@link VkPipelineCoverageToColorStateCreateInfoNV#allocate(Arena)}, {@link VkPipelineCoverageToColorStateCreateInfoNV#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPipelineCoverageToColorStateCreateInfoNV#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineCoverageToColorStateCreateInfoNV.html"><code>VkPipelineCoverageToColorStateCreateInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineCoverageToColorStateCreateInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineCoverageToColorStateCreateInfoNV allocate(Arena arena) {
        VkPipelineCoverageToColorStateCreateInfoNV ret = new VkPipelineCoverageToColorStateCreateInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV);
        return ret;
    }

    public static VkPipelineCoverageToColorStateCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineCoverageToColorStateCreateInfoNV[] ret = new VkPipelineCoverageToColorStateCreateInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineCoverageToColorStateCreateInfoNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV);
        }
        return ret;
    }

    public static VkPipelineCoverageToColorStateCreateInfoNV clone(Arena arena, VkPipelineCoverageToColorStateCreateInfoNV src) {
        VkPipelineCoverageToColorStateCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineCoverageToColorStateCreateInfoNV[] clone(Arena arena, VkPipelineCoverageToColorStateCreateInfoNV[] src) {
        VkPipelineCoverageToColorStateCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV);
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

    public @enumtype(VkPipelineCoverageToColorStateCreateFlagsNV.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineCoverageToColorStateCreateFlagsNV.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int coverageToColorEnable() {
        return segment.get(LAYOUT$coverageToColorEnable, OFFSET$coverageToColorEnable);
    }

    public void coverageToColorEnable(@unsigned int value) {
        segment.set(LAYOUT$coverageToColorEnable, OFFSET$coverageToColorEnable, value);
    }

    public @unsigned int coverageToColorLocation() {
        return segment.get(LAYOUT$coverageToColorLocation, OFFSET$coverageToColorLocation);
    }

    public void coverageToColorLocation(@unsigned int value) {
        segment.set(LAYOUT$coverageToColorLocation, OFFSET$coverageToColorLocation, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("coverageToColorEnable"),
        ValueLayout.JAVA_INT.withName("coverageToColorLocation")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$coverageToColorEnable = PathElement.groupElement("coverageToColorEnable");
    public static final PathElement PATH$coverageToColorLocation = PathElement.groupElement("coverageToColorLocation");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$coverageToColorEnable = (OfInt) LAYOUT.select(PATH$coverageToColorEnable);
    public static final OfInt LAYOUT$coverageToColorLocation = (OfInt) LAYOUT.select(PATH$coverageToColorLocation);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$coverageToColorEnable = LAYOUT$coverageToColorEnable.byteSize();
    public static final long SIZE$coverageToColorLocation = LAYOUT$coverageToColorLocation.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$coverageToColorEnable = LAYOUT.byteOffset(PATH$coverageToColorEnable);
    public static final long OFFSET$coverageToColorLocation = LAYOUT.byteOffset(PATH$coverageToColorLocation);
}
