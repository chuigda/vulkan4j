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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.html"><code>VkPhysicalDeviceExtendedDynamicState2FeaturesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceExtendedDynamicState2FeaturesEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 extendedDynamicState2; // @link substring="extendedDynamicState2" target="#extendedDynamicState2"
///     VkBool32 extendedDynamicState2LogicOp; // @link substring="extendedDynamicState2LogicOp" target="#extendedDynamicState2LogicOp"
///     VkBool32 extendedDynamicState2PatchControlPoints; // @link substring="extendedDynamicState2PatchControlPoints" target="#extendedDynamicState2PatchControlPoints"
/// } VkPhysicalDeviceExtendedDynamicState2FeaturesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT`
///
/// The {@code allocate} ({@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT#allocate(Arena)}, {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.html"><code>VkPhysicalDeviceExtendedDynamicState2FeaturesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(@NotNull MemorySegment segment) implements IVkPhysicalDeviceExtendedDynamicState2FeaturesEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.html"><code>VkPhysicalDeviceExtendedDynamicState2FeaturesEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPhysicalDeviceExtendedDynamicState2FeaturesEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPhysicalDeviceExtendedDynamicState2FeaturesEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPhysicalDeviceExtendedDynamicState2FeaturesEXT {
        public long size() {
            return segment.byteSize() / VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPhysicalDeviceExtendedDynamicState2FeaturesEXT at(long index) {
            return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(segment.asSlice(index * VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.BYTES, VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.BYTES));
        }
        public void write(long index, @NotNull VkPhysicalDeviceExtendedDynamicState2FeaturesEXT value) {
            MemorySegment s = segment.asSlice(index * VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.BYTES, VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT allocate(Arena arena) {
        VkPhysicalDeviceExtendedDynamicState2FeaturesEXT ret = new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Ptr ret = new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT clone(Arena arena, VkPhysicalDeviceExtendedDynamicState2FeaturesEXT src) {
        VkPhysicalDeviceExtendedDynamicState2FeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT);
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

    public @unsigned int extendedDynamicState2() {
        return segment.get(LAYOUT$extendedDynamicState2, OFFSET$extendedDynamicState2);
    }

    public void extendedDynamicState2(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState2, OFFSET$extendedDynamicState2, value);
    }

    public @unsigned int extendedDynamicState2LogicOp() {
        return segment.get(LAYOUT$extendedDynamicState2LogicOp, OFFSET$extendedDynamicState2LogicOp);
    }

    public void extendedDynamicState2LogicOp(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState2LogicOp, OFFSET$extendedDynamicState2LogicOp, value);
    }

    public @unsigned int extendedDynamicState2PatchControlPoints() {
        return segment.get(LAYOUT$extendedDynamicState2PatchControlPoints, OFFSET$extendedDynamicState2PatchControlPoints);
    }

    public void extendedDynamicState2PatchControlPoints(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState2PatchControlPoints, OFFSET$extendedDynamicState2PatchControlPoints, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2LogicOp"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2PatchControlPoints")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$extendedDynamicState2 = PathElement.groupElement("extendedDynamicState2");
    public static final PathElement PATH$extendedDynamicState2LogicOp = PathElement.groupElement("extendedDynamicState2LogicOp");
    public static final PathElement PATH$extendedDynamicState2PatchControlPoints = PathElement.groupElement("extendedDynamicState2PatchControlPoints");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$extendedDynamicState2 = (OfInt) LAYOUT.select(PATH$extendedDynamicState2);
    public static final OfInt LAYOUT$extendedDynamicState2LogicOp = (OfInt) LAYOUT.select(PATH$extendedDynamicState2LogicOp);
    public static final OfInt LAYOUT$extendedDynamicState2PatchControlPoints = (OfInt) LAYOUT.select(PATH$extendedDynamicState2PatchControlPoints);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$extendedDynamicState2 = LAYOUT$extendedDynamicState2.byteSize();
    public static final long SIZE$extendedDynamicState2LogicOp = LAYOUT$extendedDynamicState2LogicOp.byteSize();
    public static final long SIZE$extendedDynamicState2PatchControlPoints = LAYOUT$extendedDynamicState2PatchControlPoints.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$extendedDynamicState2 = LAYOUT.byteOffset(PATH$extendedDynamicState2);
    public static final long OFFSET$extendedDynamicState2LogicOp = LAYOUT.byteOffset(PATH$extendedDynamicState2LogicOp);
    public static final long OFFSET$extendedDynamicState2PatchControlPoints = LAYOUT.byteOffset(PATH$extendedDynamicState2PatchControlPoints);
}
