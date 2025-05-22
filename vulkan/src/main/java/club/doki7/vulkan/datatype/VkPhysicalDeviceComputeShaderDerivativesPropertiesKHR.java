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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.html"><code>VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 meshAndTaskShaderDerivatives; // @link substring="meshAndTaskShaderDerivatives" target="#meshAndTaskShaderDerivatives"
/// } VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_PROPERTIES_KHR`
///
/// The {@code allocate} ({@link VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR#allocate(Arena)}, {@link VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.html"><code>VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR(@NotNull MemorySegment segment) implements IVkPhysicalDeviceComputeShaderDerivativesPropertiesKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.html"><code>VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPhysicalDeviceComputeShaderDerivativesPropertiesKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPhysicalDeviceComputeShaderDerivativesPropertiesKHR {
        public long size() {
            return segment.byteSize() / VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR at(long index) {
            return new VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR(segment.asSlice(index * VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.BYTES, VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.BYTES));
        }
        public void write(long index, @NotNull VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR value) {
            MemorySegment s = segment.asSlice(index * VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.BYTES, VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR allocate(Arena arena) {
        VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR ret = new VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_PROPERTIES_KHR);
        return ret;
    }

    public static VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.Ptr ret = new VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_PROPERTIES_KHR);
        }
        return ret;
    }

    public static VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR clone(Arena arena, VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR src) {
        VkPhysicalDeviceComputeShaderDerivativesPropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_PROPERTIES_KHR);
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

    public @unsigned int meshAndTaskShaderDerivatives() {
        return segment.get(LAYOUT$meshAndTaskShaderDerivatives, OFFSET$meshAndTaskShaderDerivatives);
    }

    public void meshAndTaskShaderDerivatives(@unsigned int value) {
        segment.set(LAYOUT$meshAndTaskShaderDerivatives, OFFSET$meshAndTaskShaderDerivatives, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("meshAndTaskShaderDerivatives")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$meshAndTaskShaderDerivatives = PathElement.groupElement("meshAndTaskShaderDerivatives");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$meshAndTaskShaderDerivatives = (OfInt) LAYOUT.select(PATH$meshAndTaskShaderDerivatives);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$meshAndTaskShaderDerivatives = LAYOUT$meshAndTaskShaderDerivatives.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$meshAndTaskShaderDerivatives = LAYOUT.byteOffset(PATH$meshAndTaskShaderDerivatives);
}
