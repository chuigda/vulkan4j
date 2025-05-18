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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineExecutableInfoKHR.html"><code>VkPipelineExecutableInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineExecutableInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkPipeline pipeline; // @link substring="VkPipeline" target="VkPipeline" @link substring="pipeline" target="#pipeline"
///     uint32_t executableIndex; // @link substring="executableIndex" target="#executableIndex"
/// } VkPipelineExecutableInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR`
///
/// The {@code allocate} ({@link VkPipelineExecutableInfoKHR#allocate(Arena)}, {@link VkPipelineExecutableInfoKHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPipelineExecutableInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineExecutableInfoKHR.html"><code>VkPipelineExecutableInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineExecutableInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineExecutableInfoKHR allocate(Arena arena) {
        VkPipelineExecutableInfoKHR ret = new VkPipelineExecutableInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_EXECUTABLE_INFO_KHR);
        return ret;
    }

    public static VkPipelineExecutableInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineExecutableInfoKHR[] ret = new VkPipelineExecutableInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineExecutableInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_EXECUTABLE_INFO_KHR);
        }
        return ret;
    }

    public static VkPipelineExecutableInfoKHR clone(Arena arena, VkPipelineExecutableInfoKHR src) {
        VkPipelineExecutableInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineExecutableInfoKHR[] clone(Arena arena, VkPipelineExecutableInfoKHR[] src) {
        VkPipelineExecutableInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_EXECUTABLE_INFO_KHR);
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

    public @Nullable VkPipeline pipeline() {
        MemorySegment s = segment.asSlice(OFFSET$pipeline, SIZE$pipeline);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPipeline(s);
    }

    public void pipeline(@Nullable VkPipeline value) {
        segment.set(LAYOUT$pipeline, OFFSET$pipeline, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int executableIndex() {
        return segment.get(LAYOUT$executableIndex, OFFSET$executableIndex);
    }

    public void executableIndex(@unsigned int value) {
        segment.set(LAYOUT$executableIndex, OFFSET$executableIndex, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pipeline"),
        ValueLayout.JAVA_INT.withName("executableIndex")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pipeline = PathElement.groupElement("PATH$pipeline");
    public static final PathElement PATH$executableIndex = PathElement.groupElement("PATH$executableIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pipeline = (AddressLayout) LAYOUT.select(PATH$pipeline);
    public static final OfInt LAYOUT$executableIndex = (OfInt) LAYOUT.select(PATH$executableIndex);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pipeline = LAYOUT$pipeline.byteSize();
    public static final long SIZE$executableIndex = LAYOUT$executableIndex.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipeline = LAYOUT.byteOffset(PATH$pipeline);
    public static final long OFFSET$executableIndex = LAYOUT.byteOffset(PATH$executableIndex);
}
