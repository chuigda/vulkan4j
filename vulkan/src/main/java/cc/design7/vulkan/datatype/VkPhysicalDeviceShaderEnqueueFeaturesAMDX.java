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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderEnqueueFeaturesAMDX.html"><code>VkPhysicalDeviceShaderEnqueueFeaturesAMDX</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceShaderEnqueueFeaturesAMDX {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderEnqueue;
///     VkBool32 shaderMeshEnqueue;
/// } VkPhysicalDeviceShaderEnqueueFeaturesAMDX;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_FEATURES_AMDX`
///
/// The {@link VkPhysicalDeviceShaderEnqueueFeaturesAMDX#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceShaderEnqueueFeaturesAMDX#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderEnqueueFeaturesAMDX.html"><code>VkPhysicalDeviceShaderEnqueueFeaturesAMDX</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceShaderEnqueueFeaturesAMDX(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX allocate(Arena arena) {
        VkPhysicalDeviceShaderEnqueueFeaturesAMDX ret = new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_SHADER_ENQUEUE_FEATURES_AMDX);
        return ret;
    }

    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderEnqueueFeaturesAMDX[] ret = new VkPhysicalDeviceShaderEnqueueFeaturesAMDX[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceShaderEnqueueFeaturesAMDX(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_SHADER_ENQUEUE_FEATURES_AMDX);
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX clone(Arena arena, VkPhysicalDeviceShaderEnqueueFeaturesAMDX src) {
        VkPhysicalDeviceShaderEnqueueFeaturesAMDX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderEnqueueFeaturesAMDX[] clone(Arena arena, VkPhysicalDeviceShaderEnqueueFeaturesAMDX[] src) {
        VkPhysicalDeviceShaderEnqueueFeaturesAMDX[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_SHADER_ENQUEUE_FEATURES_AMDX);
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

    public @unsigned int shaderEnqueue() {
        return segment.get(LAYOUT$shaderEnqueue, OFFSET$shaderEnqueue);
    }

    public void shaderEnqueue(@unsigned int value) {
        segment.set(LAYOUT$shaderEnqueue, OFFSET$shaderEnqueue, value);
    }

    public @unsigned int shaderMeshEnqueue() {
        return segment.get(LAYOUT$shaderMeshEnqueue, OFFSET$shaderMeshEnqueue);
    }

    public void shaderMeshEnqueue(@unsigned int value) {
        segment.set(LAYOUT$shaderMeshEnqueue, OFFSET$shaderMeshEnqueue, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderEnqueue"),
        ValueLayout.JAVA_INT.withName("shaderMeshEnqueue")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shaderEnqueue = PathElement.groupElement("PATH$shaderEnqueue");
    public static final PathElement PATH$shaderMeshEnqueue = PathElement.groupElement("PATH$shaderMeshEnqueue");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderEnqueue = (OfInt) LAYOUT.select(PATH$shaderEnqueue);
    public static final OfInt LAYOUT$shaderMeshEnqueue = (OfInt) LAYOUT.select(PATH$shaderMeshEnqueue);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderEnqueue = LAYOUT$shaderEnqueue.byteSize();
    public static final long SIZE$shaderMeshEnqueue = LAYOUT$shaderMeshEnqueue.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderEnqueue = LAYOUT.byteOffset(PATH$shaderEnqueue);
    public static final long OFFSET$shaderMeshEnqueue = LAYOUT.byteOffset(PATH$shaderMeshEnqueue);
}
