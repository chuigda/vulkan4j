package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.html"><code>VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 rayTracingMaintenance1; // @link substring="rayTracingMaintenance1" target="#rayTracingMaintenance1"
///     VkBool32 rayTracingPipelineTraceRaysIndirect2; // @link substring="rayTracingPipelineTraceRaysIndirect2" target="#rayTracingPipelineTraceRaysIndirect2"
/// } VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR`
///
/// The {@code allocate} ({@link VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR#allocate(Arena)}, {@link VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.html"><code>VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(@NotNull MemorySegment segment) implements IVkPhysicalDeviceRayTracingMaintenance1FeaturesKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.html"><code>VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPhysicalDeviceRayTracingMaintenance1FeaturesKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPhysicalDeviceRayTracingMaintenance1FeaturesKHR {
        public long size() {
            return segment.byteSize() / VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR at(long index) {
            return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(segment.asSlice(index * VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.BYTES, VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.BYTES));
        }

        public void write(long index, @NotNull VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR value) {
            MemorySegment s = segment.asSlice(index * VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.BYTES, VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.BYTES, VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.BYTES,
                (end - start) * VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.BYTES));
        }

        public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR[] toArray() {
            VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR[] ret = new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR allocate(Arena arena) {
        VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR ret = new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR);
        return ret;
    }

    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Ptr ret = new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR);
        }
        return ret;
    }

    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR clone(Arena arena, VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR src) {
        VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR);
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

    public @unsigned int rayTracingMaintenance1() {
        return segment.get(LAYOUT$rayTracingMaintenance1, OFFSET$rayTracingMaintenance1);
    }

    public void rayTracingMaintenance1(@unsigned int value) {
        segment.set(LAYOUT$rayTracingMaintenance1, OFFSET$rayTracingMaintenance1, value);
    }

    public @unsigned int rayTracingPipelineTraceRaysIndirect2() {
        return segment.get(LAYOUT$rayTracingPipelineTraceRaysIndirect2, OFFSET$rayTracingPipelineTraceRaysIndirect2);
    }

    public void rayTracingPipelineTraceRaysIndirect2(@unsigned int value) {
        segment.set(LAYOUT$rayTracingPipelineTraceRaysIndirect2, OFFSET$rayTracingPipelineTraceRaysIndirect2, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingMaintenance1"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineTraceRaysIndirect2")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$rayTracingMaintenance1 = PathElement.groupElement("rayTracingMaintenance1");
    public static final PathElement PATH$rayTracingPipelineTraceRaysIndirect2 = PathElement.groupElement("rayTracingPipelineTraceRaysIndirect2");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$rayTracingMaintenance1 = (OfInt) LAYOUT.select(PATH$rayTracingMaintenance1);
    public static final OfInt LAYOUT$rayTracingPipelineTraceRaysIndirect2 = (OfInt) LAYOUT.select(PATH$rayTracingPipelineTraceRaysIndirect2);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$rayTracingMaintenance1 = LAYOUT$rayTracingMaintenance1.byteSize();
    public static final long SIZE$rayTracingPipelineTraceRaysIndirect2 = LAYOUT$rayTracingPipelineTraceRaysIndirect2.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$rayTracingMaintenance1 = LAYOUT.byteOffset(PATH$rayTracingMaintenance1);
    public static final long OFFSET$rayTracingPipelineTraceRaysIndirect2 = LAYOUT.byteOffset(PATH$rayTracingPipelineTraceRaysIndirect2);
}
