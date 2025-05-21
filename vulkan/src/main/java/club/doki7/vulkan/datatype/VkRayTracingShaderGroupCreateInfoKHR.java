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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRayTracingShaderGroupCreateInfoKHR.html"><code>VkRayTracingShaderGroupCreateInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkRayTracingShaderGroupCreateInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkRayTracingShaderGroupTypeKHR type; // @link substring="VkRayTracingShaderGroupTypeKHR" target="VkRayTracingShaderGroupTypeKHR" @link substring="type" target="#type"
///     uint32_t generalShader; // @link substring="generalShader" target="#generalShader"
///     uint32_t closestHitShader; // @link substring="closestHitShader" target="#closestHitShader"
///     uint32_t anyHitShader; // @link substring="anyHitShader" target="#anyHitShader"
///     uint32_t intersectionShader; // @link substring="intersectionShader" target="#intersectionShader"
///     void const* pShaderGroupCaptureReplayHandle; // optional // @link substring="pShaderGroupCaptureReplayHandle" target="#pShaderGroupCaptureReplayHandle"
/// } VkRayTracingShaderGroupCreateInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR`
///
/// The {@code allocate} ({@link VkRayTracingShaderGroupCreateInfoKHR#allocate(Arena)}, {@link VkRayTracingShaderGroupCreateInfoKHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkRayTracingShaderGroupCreateInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRayTracingShaderGroupCreateInfoKHR.html"><code>VkRayTracingShaderGroupCreateInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRayTracingShaderGroupCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkRayTracingShaderGroupCreateInfoKHR allocate(Arena arena) {
        VkRayTracingShaderGroupCreateInfoKHR ret = new VkRayTracingShaderGroupCreateInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR);
        return ret;
    }

    public static VkRayTracingShaderGroupCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRayTracingShaderGroupCreateInfoKHR[] ret = new VkRayTracingShaderGroupCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRayTracingShaderGroupCreateInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR);
        }
        return ret;
    }

    public static VkRayTracingShaderGroupCreateInfoKHR clone(Arena arena, VkRayTracingShaderGroupCreateInfoKHR src) {
        VkRayTracingShaderGroupCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRayTracingShaderGroupCreateInfoKHR[] clone(Arena arena, VkRayTracingShaderGroupCreateInfoKHR[] src) {
        VkRayTracingShaderGroupCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR);
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

    public @enumtype(VkRayTracingShaderGroupTypeKHR.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkRayTracingShaderGroupTypeKHR.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @unsigned int generalShader() {
        return segment.get(LAYOUT$generalShader, OFFSET$generalShader);
    }

    public void generalShader(@unsigned int value) {
        segment.set(LAYOUT$generalShader, OFFSET$generalShader, value);
    }

    public @unsigned int closestHitShader() {
        return segment.get(LAYOUT$closestHitShader, OFFSET$closestHitShader);
    }

    public void closestHitShader(@unsigned int value) {
        segment.set(LAYOUT$closestHitShader, OFFSET$closestHitShader, value);
    }

    public @unsigned int anyHitShader() {
        return segment.get(LAYOUT$anyHitShader, OFFSET$anyHitShader);
    }

    public void anyHitShader(@unsigned int value) {
        segment.set(LAYOUT$anyHitShader, OFFSET$anyHitShader, value);
    }

    public @unsigned int intersectionShader() {
        return segment.get(LAYOUT$intersectionShader, OFFSET$intersectionShader);
    }

    public void intersectionShader(@unsigned int value) {
        segment.set(LAYOUT$intersectionShader, OFFSET$intersectionShader, value);
    }

    public @pointer(comment="void*") MemorySegment pShaderGroupCaptureReplayHandle() {
        return segment.get(LAYOUT$pShaderGroupCaptureReplayHandle, OFFSET$pShaderGroupCaptureReplayHandle);
    }

    public void pShaderGroupCaptureReplayHandle(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pShaderGroupCaptureReplayHandle, OFFSET$pShaderGroupCaptureReplayHandle, value);
    }

    public void pShaderGroupCaptureReplayHandle(@Nullable IPointer pointer) {
        pShaderGroupCaptureReplayHandle(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("generalShader"),
        ValueLayout.JAVA_INT.withName("closestHitShader"),
        ValueLayout.JAVA_INT.withName("anyHitShader"),
        ValueLayout.JAVA_INT.withName("intersectionShader"),
        ValueLayout.ADDRESS.withName("pShaderGroupCaptureReplayHandle")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$generalShader = PathElement.groupElement("generalShader");
    public static final PathElement PATH$closestHitShader = PathElement.groupElement("closestHitShader");
    public static final PathElement PATH$anyHitShader = PathElement.groupElement("anyHitShader");
    public static final PathElement PATH$intersectionShader = PathElement.groupElement("intersectionShader");
    public static final PathElement PATH$pShaderGroupCaptureReplayHandle = PathElement.groupElement("pShaderGroupCaptureReplayHandle");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$generalShader = (OfInt) LAYOUT.select(PATH$generalShader);
    public static final OfInt LAYOUT$closestHitShader = (OfInt) LAYOUT.select(PATH$closestHitShader);
    public static final OfInt LAYOUT$anyHitShader = (OfInt) LAYOUT.select(PATH$anyHitShader);
    public static final OfInt LAYOUT$intersectionShader = (OfInt) LAYOUT.select(PATH$intersectionShader);
    public static final AddressLayout LAYOUT$pShaderGroupCaptureReplayHandle = (AddressLayout) LAYOUT.select(PATH$pShaderGroupCaptureReplayHandle);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$generalShader = LAYOUT$generalShader.byteSize();
    public static final long SIZE$closestHitShader = LAYOUT$closestHitShader.byteSize();
    public static final long SIZE$anyHitShader = LAYOUT$anyHitShader.byteSize();
    public static final long SIZE$intersectionShader = LAYOUT$intersectionShader.byteSize();
    public static final long SIZE$pShaderGroupCaptureReplayHandle = LAYOUT$pShaderGroupCaptureReplayHandle.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$generalShader = LAYOUT.byteOffset(PATH$generalShader);
    public static final long OFFSET$closestHitShader = LAYOUT.byteOffset(PATH$closestHitShader);
    public static final long OFFSET$anyHitShader = LAYOUT.byteOffset(PATH$anyHitShader);
    public static final long OFFSET$intersectionShader = LAYOUT.byteOffset(PATH$intersectionShader);
    public static final long OFFSET$pShaderGroupCaptureReplayHandle = LAYOUT.byteOffset(PATH$pShaderGroupCaptureReplayHandle);
}
