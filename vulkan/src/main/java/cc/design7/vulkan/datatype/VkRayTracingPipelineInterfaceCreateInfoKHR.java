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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRayTracingPipelineInterfaceCreateInfoKHR.html"><code>VkRayTracingPipelineInterfaceCreateInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRayTracingPipelineInterfaceCreateInfoKHR {
///     VkStructureType sType;
///     void const* pNext;
///     uint32_t maxPipelineRayPayloadSize;
///     uint32_t maxPipelineRayHitAttributeSize;
/// } VkRayTracingPipelineInterfaceCreateInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR`
///
/// The {@link VkRayTracingPipelineInterfaceCreateInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkRayTracingPipelineInterfaceCreateInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRayTracingPipelineInterfaceCreateInfoKHR.html"><code>VkRayTracingPipelineInterfaceCreateInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRayTracingPipelineInterfaceCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkRayTracingPipelineInterfaceCreateInfoKHR allocate(Arena arena) {
        VkRayTracingPipelineInterfaceCreateInfoKHR ret = new VkRayTracingPipelineInterfaceCreateInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR);
        return ret;
    }

    public static VkRayTracingPipelineInterfaceCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRayTracingPipelineInterfaceCreateInfoKHR[] ret = new VkRayTracingPipelineInterfaceCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRayTracingPipelineInterfaceCreateInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR);
        }
        return ret;
    }

    public static VkRayTracingPipelineInterfaceCreateInfoKHR clone(Arena arena, VkRayTracingPipelineInterfaceCreateInfoKHR src) {
        VkRayTracingPipelineInterfaceCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRayTracingPipelineInterfaceCreateInfoKHR[] clone(Arena arena, VkRayTracingPipelineInterfaceCreateInfoKHR[] src) {
        VkRayTracingPipelineInterfaceCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR);
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

    public @unsigned int maxPipelineRayPayloadSize() {
        return segment.get(LAYOUT$maxPipelineRayPayloadSize, OFFSET$maxPipelineRayPayloadSize);
    }

    public void maxPipelineRayPayloadSize(@unsigned int value) {
        segment.set(LAYOUT$maxPipelineRayPayloadSize, OFFSET$maxPipelineRayPayloadSize, value);
    }

    public @unsigned int maxPipelineRayHitAttributeSize() {
        return segment.get(LAYOUT$maxPipelineRayHitAttributeSize, OFFSET$maxPipelineRayHitAttributeSize);
    }

    public void maxPipelineRayHitAttributeSize(@unsigned int value) {
        segment.set(LAYOUT$maxPipelineRayHitAttributeSize, OFFSET$maxPipelineRayHitAttributeSize, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxPipelineRayPayloadSize"),
        ValueLayout.JAVA_INT.withName("maxPipelineRayHitAttributeSize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxPipelineRayPayloadSize = PathElement.groupElement("PATH$maxPipelineRayPayloadSize");
    public static final PathElement PATH$maxPipelineRayHitAttributeSize = PathElement.groupElement("PATH$maxPipelineRayHitAttributeSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxPipelineRayPayloadSize = (OfInt) LAYOUT.select(PATH$maxPipelineRayPayloadSize);
    public static final OfInt LAYOUT$maxPipelineRayHitAttributeSize = (OfInt) LAYOUT.select(PATH$maxPipelineRayHitAttributeSize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxPipelineRayPayloadSize = LAYOUT$maxPipelineRayPayloadSize.byteSize();
    public static final long SIZE$maxPipelineRayHitAttributeSize = LAYOUT$maxPipelineRayHitAttributeSize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxPipelineRayPayloadSize = LAYOUT.byteOffset(PATH$maxPipelineRayPayloadSize);
    public static final long OFFSET$maxPipelineRayHitAttributeSize = LAYOUT.byteOffset(PATH$maxPipelineRayHitAttributeSize);
}
