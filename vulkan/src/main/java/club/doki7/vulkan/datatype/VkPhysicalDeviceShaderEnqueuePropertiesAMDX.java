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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderEnqueuePropertiesAMDX.html"><code>VkPhysicalDeviceShaderEnqueuePropertiesAMDX</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceShaderEnqueuePropertiesAMDX {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t maxExecutionGraphDepth; // @link substring="maxExecutionGraphDepth" target="#maxExecutionGraphDepth"
///     uint32_t maxExecutionGraphShaderOutputNodes; // @link substring="maxExecutionGraphShaderOutputNodes" target="#maxExecutionGraphShaderOutputNodes"
///     uint32_t maxExecutionGraphShaderPayloadSize; // @link substring="maxExecutionGraphShaderPayloadSize" target="#maxExecutionGraphShaderPayloadSize"
///     uint32_t maxExecutionGraphShaderPayloadCount; // @link substring="maxExecutionGraphShaderPayloadCount" target="#maxExecutionGraphShaderPayloadCount"
///     uint32_t executionGraphDispatchAddressAlignment; // @link substring="executionGraphDispatchAddressAlignment" target="#executionGraphDispatchAddressAlignment"
///     uint32_t maxExecutionGraphWorkgroupCount; // @link substring="maxExecutionGraphWorkgroupCount" target="#maxExecutionGraphWorkgroupCount"
///     uint32_t maxExecutionGraphWorkgroups; // @link substring="maxExecutionGraphWorkgroups" target="#maxExecutionGraphWorkgroups"
/// } VkPhysicalDeviceShaderEnqueuePropertiesAMDX;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX`
///
/// The {@code allocate} ({@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX#allocate(Arena)}, {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceShaderEnqueuePropertiesAMDX#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderEnqueuePropertiesAMDX.html"><code>VkPhysicalDeviceShaderEnqueuePropertiesAMDX</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceShaderEnqueuePropertiesAMDX(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX allocate(Arena arena) {
        VkPhysicalDeviceShaderEnqueuePropertiesAMDX ret = new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX);
        return ret;
    }

    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderEnqueuePropertiesAMDX[] ret = new VkPhysicalDeviceShaderEnqueuePropertiesAMDX[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX);
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX clone(Arena arena, VkPhysicalDeviceShaderEnqueuePropertiesAMDX src) {
        VkPhysicalDeviceShaderEnqueuePropertiesAMDX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX[] clone(Arena arena, VkPhysicalDeviceShaderEnqueuePropertiesAMDX[] src) {
        VkPhysicalDeviceShaderEnqueuePropertiesAMDX[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX);
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

    public @unsigned int maxExecutionGraphDepth() {
        return segment.get(LAYOUT$maxExecutionGraphDepth, OFFSET$maxExecutionGraphDepth);
    }

    public void maxExecutionGraphDepth(@unsigned int value) {
        segment.set(LAYOUT$maxExecutionGraphDepth, OFFSET$maxExecutionGraphDepth, value);
    }

    public @unsigned int maxExecutionGraphShaderOutputNodes() {
        return segment.get(LAYOUT$maxExecutionGraphShaderOutputNodes, OFFSET$maxExecutionGraphShaderOutputNodes);
    }

    public void maxExecutionGraphShaderOutputNodes(@unsigned int value) {
        segment.set(LAYOUT$maxExecutionGraphShaderOutputNodes, OFFSET$maxExecutionGraphShaderOutputNodes, value);
    }

    public @unsigned int maxExecutionGraphShaderPayloadSize() {
        return segment.get(LAYOUT$maxExecutionGraphShaderPayloadSize, OFFSET$maxExecutionGraphShaderPayloadSize);
    }

    public void maxExecutionGraphShaderPayloadSize(@unsigned int value) {
        segment.set(LAYOUT$maxExecutionGraphShaderPayloadSize, OFFSET$maxExecutionGraphShaderPayloadSize, value);
    }

    public @unsigned int maxExecutionGraphShaderPayloadCount() {
        return segment.get(LAYOUT$maxExecutionGraphShaderPayloadCount, OFFSET$maxExecutionGraphShaderPayloadCount);
    }

    public void maxExecutionGraphShaderPayloadCount(@unsigned int value) {
        segment.set(LAYOUT$maxExecutionGraphShaderPayloadCount, OFFSET$maxExecutionGraphShaderPayloadCount, value);
    }

    public @unsigned int executionGraphDispatchAddressAlignment() {
        return segment.get(LAYOUT$executionGraphDispatchAddressAlignment, OFFSET$executionGraphDispatchAddressAlignment);
    }

    public void executionGraphDispatchAddressAlignment(@unsigned int value) {
        segment.set(LAYOUT$executionGraphDispatchAddressAlignment, OFFSET$executionGraphDispatchAddressAlignment, value);
    }

    public @unsigned int maxExecutionGraphWorkgroupCount() {
        return segment.get(LAYOUT$maxExecutionGraphWorkgroupCount, OFFSET$maxExecutionGraphWorkgroupCount);
    }

    public void maxExecutionGraphWorkgroupCount(@unsigned int value) {
        segment.set(LAYOUT$maxExecutionGraphWorkgroupCount, OFFSET$maxExecutionGraphWorkgroupCount, value);
    }

    public @unsigned int maxExecutionGraphWorkgroups() {
        return segment.get(LAYOUT$maxExecutionGraphWorkgroups, OFFSET$maxExecutionGraphWorkgroups);
    }

    public void maxExecutionGraphWorkgroups(@unsigned int value) {
        segment.set(LAYOUT$maxExecutionGraphWorkgroups, OFFSET$maxExecutionGraphWorkgroups, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxExecutionGraphDepth"),
        ValueLayout.JAVA_INT.withName("maxExecutionGraphShaderOutputNodes"),
        ValueLayout.JAVA_INT.withName("maxExecutionGraphShaderPayloadSize"),
        ValueLayout.JAVA_INT.withName("maxExecutionGraphShaderPayloadCount"),
        ValueLayout.JAVA_INT.withName("executionGraphDispatchAddressAlignment"),
        ValueLayout.JAVA_INT.withName("maxExecutionGraphWorkgroupCount"),
        ValueLayout.JAVA_INT.withName("maxExecutionGraphWorkgroups")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxExecutionGraphDepth = PathElement.groupElement("maxExecutionGraphDepth");
    public static final PathElement PATH$maxExecutionGraphShaderOutputNodes = PathElement.groupElement("maxExecutionGraphShaderOutputNodes");
    public static final PathElement PATH$maxExecutionGraphShaderPayloadSize = PathElement.groupElement("maxExecutionGraphShaderPayloadSize");
    public static final PathElement PATH$maxExecutionGraphShaderPayloadCount = PathElement.groupElement("maxExecutionGraphShaderPayloadCount");
    public static final PathElement PATH$executionGraphDispatchAddressAlignment = PathElement.groupElement("executionGraphDispatchAddressAlignment");
    public static final PathElement PATH$maxExecutionGraphWorkgroupCount = PathElement.groupElement("maxExecutionGraphWorkgroupCount");
    public static final PathElement PATH$maxExecutionGraphWorkgroups = PathElement.groupElement("maxExecutionGraphWorkgroups");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxExecutionGraphDepth = (OfInt) LAYOUT.select(PATH$maxExecutionGraphDepth);
    public static final OfInt LAYOUT$maxExecutionGraphShaderOutputNodes = (OfInt) LAYOUT.select(PATH$maxExecutionGraphShaderOutputNodes);
    public static final OfInt LAYOUT$maxExecutionGraphShaderPayloadSize = (OfInt) LAYOUT.select(PATH$maxExecutionGraphShaderPayloadSize);
    public static final OfInt LAYOUT$maxExecutionGraphShaderPayloadCount = (OfInt) LAYOUT.select(PATH$maxExecutionGraphShaderPayloadCount);
    public static final OfInt LAYOUT$executionGraphDispatchAddressAlignment = (OfInt) LAYOUT.select(PATH$executionGraphDispatchAddressAlignment);
    public static final OfInt LAYOUT$maxExecutionGraphWorkgroupCount = (OfInt) LAYOUT.select(PATH$maxExecutionGraphWorkgroupCount);
    public static final OfInt LAYOUT$maxExecutionGraphWorkgroups = (OfInt) LAYOUT.select(PATH$maxExecutionGraphWorkgroups);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxExecutionGraphDepth = LAYOUT$maxExecutionGraphDepth.byteSize();
    public static final long SIZE$maxExecutionGraphShaderOutputNodes = LAYOUT$maxExecutionGraphShaderOutputNodes.byteSize();
    public static final long SIZE$maxExecutionGraphShaderPayloadSize = LAYOUT$maxExecutionGraphShaderPayloadSize.byteSize();
    public static final long SIZE$maxExecutionGraphShaderPayloadCount = LAYOUT$maxExecutionGraphShaderPayloadCount.byteSize();
    public static final long SIZE$executionGraphDispatchAddressAlignment = LAYOUT$executionGraphDispatchAddressAlignment.byteSize();
    public static final long SIZE$maxExecutionGraphWorkgroupCount = LAYOUT$maxExecutionGraphWorkgroupCount.byteSize();
    public static final long SIZE$maxExecutionGraphWorkgroups = LAYOUT$maxExecutionGraphWorkgroups.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxExecutionGraphDepth = LAYOUT.byteOffset(PATH$maxExecutionGraphDepth);
    public static final long OFFSET$maxExecutionGraphShaderOutputNodes = LAYOUT.byteOffset(PATH$maxExecutionGraphShaderOutputNodes);
    public static final long OFFSET$maxExecutionGraphShaderPayloadSize = LAYOUT.byteOffset(PATH$maxExecutionGraphShaderPayloadSize);
    public static final long OFFSET$maxExecutionGraphShaderPayloadCount = LAYOUT.byteOffset(PATH$maxExecutionGraphShaderPayloadCount);
    public static final long OFFSET$executionGraphDispatchAddressAlignment = LAYOUT.byteOffset(PATH$executionGraphDispatchAddressAlignment);
    public static final long OFFSET$maxExecutionGraphWorkgroupCount = LAYOUT.byteOffset(PATH$maxExecutionGraphWorkgroupCount);
    public static final long OFFSET$maxExecutionGraphWorkgroups = LAYOUT.byteOffset(PATH$maxExecutionGraphWorkgroups);
}
