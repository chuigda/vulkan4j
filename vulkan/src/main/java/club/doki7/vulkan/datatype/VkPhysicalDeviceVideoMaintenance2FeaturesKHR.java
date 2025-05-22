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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVideoMaintenance2FeaturesKHR.html"><code>VkPhysicalDeviceVideoMaintenance2FeaturesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceVideoMaintenance2FeaturesKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 videoMaintenance2; // @link substring="videoMaintenance2" target="#videoMaintenance2"
/// } VkPhysicalDeviceVideoMaintenance2FeaturesKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_MAINTENANCE_2_FEATURES_KHR`
///
/// The {@code allocate} ({@link VkPhysicalDeviceVideoMaintenance2FeaturesKHR#allocate(Arena)}, {@link VkPhysicalDeviceVideoMaintenance2FeaturesKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceVideoMaintenance2FeaturesKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVideoMaintenance2FeaturesKHR.html"><code>VkPhysicalDeviceVideoMaintenance2FeaturesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceVideoMaintenance2FeaturesKHR(@NotNull MemorySegment segment) implements IVkPhysicalDeviceVideoMaintenance2FeaturesKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVideoMaintenance2FeaturesKHR.html"><code>VkPhysicalDeviceVideoMaintenance2FeaturesKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPhysicalDeviceVideoMaintenance2FeaturesKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPhysicalDeviceVideoMaintenance2FeaturesKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPhysicalDeviceVideoMaintenance2FeaturesKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPhysicalDeviceVideoMaintenance2FeaturesKHR {
        public long size() {
            return segment.byteSize() / VkPhysicalDeviceVideoMaintenance2FeaturesKHR.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPhysicalDeviceVideoMaintenance2FeaturesKHR at(long index) {
            return new VkPhysicalDeviceVideoMaintenance2FeaturesKHR(segment.asSlice(index * VkPhysicalDeviceVideoMaintenance2FeaturesKHR.BYTES, VkPhysicalDeviceVideoMaintenance2FeaturesKHR.BYTES));
        }
        public void write(long index, @NotNull VkPhysicalDeviceVideoMaintenance2FeaturesKHR value) {
            MemorySegment s = segment.asSlice(index * VkPhysicalDeviceVideoMaintenance2FeaturesKHR.BYTES, VkPhysicalDeviceVideoMaintenance2FeaturesKHR.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkPhysicalDeviceVideoMaintenance2FeaturesKHR allocate(Arena arena) {
        VkPhysicalDeviceVideoMaintenance2FeaturesKHR ret = new VkPhysicalDeviceVideoMaintenance2FeaturesKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_VIDEO_MAINTENANCE_2_FEATURES_KHR);
        return ret;
    }

    public static VkPhysicalDeviceVideoMaintenance2FeaturesKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceVideoMaintenance2FeaturesKHR.Ptr ret = new VkPhysicalDeviceVideoMaintenance2FeaturesKHR.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.PHYSICAL_DEVICE_VIDEO_MAINTENANCE_2_FEATURES_KHR);
        }
        return ret;
    }

    public static VkPhysicalDeviceVideoMaintenance2FeaturesKHR clone(Arena arena, VkPhysicalDeviceVideoMaintenance2FeaturesKHR src) {
        VkPhysicalDeviceVideoMaintenance2FeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_VIDEO_MAINTENANCE_2_FEATURES_KHR);
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

    public @unsigned int videoMaintenance2() {
        return segment.get(LAYOUT$videoMaintenance2, OFFSET$videoMaintenance2);
    }

    public void videoMaintenance2(@unsigned int value) {
        segment.set(LAYOUT$videoMaintenance2, OFFSET$videoMaintenance2, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("videoMaintenance2")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$videoMaintenance2 = PathElement.groupElement("videoMaintenance2");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$videoMaintenance2 = (OfInt) LAYOUT.select(PATH$videoMaintenance2);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$videoMaintenance2 = LAYOUT$videoMaintenance2.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$videoMaintenance2 = LAYOUT.byteOffset(PATH$videoMaintenance2);
}
