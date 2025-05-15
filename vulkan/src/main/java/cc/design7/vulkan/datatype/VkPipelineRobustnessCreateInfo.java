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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineRobustnessCreateInfo.html"><code>VkPipelineRobustnessCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineRobustnessCreateInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkPipelineRobustnessBufferBehavior storageBuffers;
///     VkPipelineRobustnessBufferBehavior uniformBuffers;
///     VkPipelineRobustnessBufferBehavior vertexInputs;
///     VkPipelineRobustnessImageBehavior images;
/// } VkPipelineRobustnessCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO`
///
/// The {@link VkPipelineRobustnessCreateInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPipelineRobustnessCreateInfo#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineRobustnessCreateInfo.html"><code>VkPipelineRobustnessCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineRobustnessCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineRobustnessCreateInfo allocate(Arena arena) {
        VkPipelineRobustnessCreateInfo ret = new VkPipelineRobustnessCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_ROBUSTNESS_CREATE_INFO);
        return ret;
    }

    public static VkPipelineRobustnessCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineRobustnessCreateInfo[] ret = new VkPipelineRobustnessCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineRobustnessCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_ROBUSTNESS_CREATE_INFO);
        }
        return ret;
    }

    public static VkPipelineRobustnessCreateInfo clone(Arena arena, VkPipelineRobustnessCreateInfo src) {
        VkPipelineRobustnessCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineRobustnessCreateInfo[] clone(Arena arena, VkPipelineRobustnessCreateInfo[] src) {
        VkPipelineRobustnessCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_ROBUSTNESS_CREATE_INFO);
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

    public @enumtype(VkPipelineRobustnessBufferBehavior.class) int storageBuffers() {
        return segment.get(LAYOUT$storageBuffers, OFFSET$storageBuffers);
    }

    public void storageBuffers(@enumtype(VkPipelineRobustnessBufferBehavior.class) int value) {
        segment.set(LAYOUT$storageBuffers, OFFSET$storageBuffers, value);
    }

    public @enumtype(VkPipelineRobustnessBufferBehavior.class) int uniformBuffers() {
        return segment.get(LAYOUT$uniformBuffers, OFFSET$uniformBuffers);
    }

    public void uniformBuffers(@enumtype(VkPipelineRobustnessBufferBehavior.class) int value) {
        segment.set(LAYOUT$uniformBuffers, OFFSET$uniformBuffers, value);
    }

    public @enumtype(VkPipelineRobustnessBufferBehavior.class) int vertexInputs() {
        return segment.get(LAYOUT$vertexInputs, OFFSET$vertexInputs);
    }

    public void vertexInputs(@enumtype(VkPipelineRobustnessBufferBehavior.class) int value) {
        segment.set(LAYOUT$vertexInputs, OFFSET$vertexInputs, value);
    }

    public @enumtype(VkPipelineRobustnessImageBehavior.class) int images() {
        return segment.get(LAYOUT$images, OFFSET$images);
    }

    public void images(@enumtype(VkPipelineRobustnessImageBehavior.class) int value) {
        segment.set(LAYOUT$images, OFFSET$images, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffers"),
        ValueLayout.JAVA_INT.withName("uniformBuffers"),
        ValueLayout.JAVA_INT.withName("vertexInputs"),
        ValueLayout.JAVA_INT.withName("images")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$storageBuffers = PathElement.groupElement("PATH$storageBuffers");
    public static final PathElement PATH$uniformBuffers = PathElement.groupElement("PATH$uniformBuffers");
    public static final PathElement PATH$vertexInputs = PathElement.groupElement("PATH$vertexInputs");
    public static final PathElement PATH$images = PathElement.groupElement("PATH$images");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$storageBuffers = (OfInt) LAYOUT.select(PATH$storageBuffers);
    public static final OfInt LAYOUT$uniformBuffers = (OfInt) LAYOUT.select(PATH$uniformBuffers);
    public static final OfInt LAYOUT$vertexInputs = (OfInt) LAYOUT.select(PATH$vertexInputs);
    public static final OfInt LAYOUT$images = (OfInt) LAYOUT.select(PATH$images);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$storageBuffers = LAYOUT$storageBuffers.byteSize();
    public static final long SIZE$uniformBuffers = LAYOUT$uniformBuffers.byteSize();
    public static final long SIZE$vertexInputs = LAYOUT$vertexInputs.byteSize();
    public static final long SIZE$images = LAYOUT$images.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$storageBuffers = LAYOUT.byteOffset(PATH$storageBuffers);
    public static final long OFFSET$uniformBuffers = LAYOUT.byteOffset(PATH$uniformBuffers);
    public static final long OFFSET$vertexInputs = LAYOUT.byteOffset(PATH$vertexInputs);
    public static final long OFFSET$images = LAYOUT.byteOffset(PATH$images);
}
