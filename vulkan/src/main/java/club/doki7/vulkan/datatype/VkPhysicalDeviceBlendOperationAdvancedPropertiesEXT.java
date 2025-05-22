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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.html"><code>VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t advancedBlendMaxColorAttachments; // @link substring="advancedBlendMaxColorAttachments" target="#advancedBlendMaxColorAttachments"
///     VkBool32 advancedBlendIndependentBlend; // @link substring="advancedBlendIndependentBlend" target="#advancedBlendIndependentBlend"
///     VkBool32 advancedBlendNonPremultipliedSrcColor; // @link substring="advancedBlendNonPremultipliedSrcColor" target="#advancedBlendNonPremultipliedSrcColor"
///     VkBool32 advancedBlendNonPremultipliedDstColor; // @link substring="advancedBlendNonPremultipliedDstColor" target="#advancedBlendNonPremultipliedDstColor"
///     VkBool32 advancedBlendCorrelatedOverlap; // @link substring="advancedBlendCorrelatedOverlap" target="#advancedBlendCorrelatedOverlap"
///     VkBool32 advancedBlendAllOperations; // @link substring="advancedBlendAllOperations" target="#advancedBlendAllOperations"
/// } VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT`
///
/// The {@code allocate} ({@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT#allocate(Arena)}, {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.html"><code>VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(@NotNull MemorySegment segment) implements IVkPhysicalDeviceBlendOperationAdvancedPropertiesEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.html"><code>VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPhysicalDeviceBlendOperationAdvancedPropertiesEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPhysicalDeviceBlendOperationAdvancedPropertiesEXT {
        public long size() {
            return segment.byteSize() / VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT at(long index) {
            return new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(segment.asSlice(index * VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.BYTES, VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.BYTES));
        }
        public void write(long index, @NotNull VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT value) {
            MemorySegment s = segment.asSlice(index * VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.BYTES, VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT allocate(Arena arena) {
        VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT ret = new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Ptr ret = new VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT clone(Arena arena, VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT src) {
        VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_PROPERTIES_EXT);
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

    public @unsigned int advancedBlendMaxColorAttachments() {
        return segment.get(LAYOUT$advancedBlendMaxColorAttachments, OFFSET$advancedBlendMaxColorAttachments);
    }

    public void advancedBlendMaxColorAttachments(@unsigned int value) {
        segment.set(LAYOUT$advancedBlendMaxColorAttachments, OFFSET$advancedBlendMaxColorAttachments, value);
    }

    public @unsigned int advancedBlendIndependentBlend() {
        return segment.get(LAYOUT$advancedBlendIndependentBlend, OFFSET$advancedBlendIndependentBlend);
    }

    public void advancedBlendIndependentBlend(@unsigned int value) {
        segment.set(LAYOUT$advancedBlendIndependentBlend, OFFSET$advancedBlendIndependentBlend, value);
    }

    public @unsigned int advancedBlendNonPremultipliedSrcColor() {
        return segment.get(LAYOUT$advancedBlendNonPremultipliedSrcColor, OFFSET$advancedBlendNonPremultipliedSrcColor);
    }

    public void advancedBlendNonPremultipliedSrcColor(@unsigned int value) {
        segment.set(LAYOUT$advancedBlendNonPremultipliedSrcColor, OFFSET$advancedBlendNonPremultipliedSrcColor, value);
    }

    public @unsigned int advancedBlendNonPremultipliedDstColor() {
        return segment.get(LAYOUT$advancedBlendNonPremultipliedDstColor, OFFSET$advancedBlendNonPremultipliedDstColor);
    }

    public void advancedBlendNonPremultipliedDstColor(@unsigned int value) {
        segment.set(LAYOUT$advancedBlendNonPremultipliedDstColor, OFFSET$advancedBlendNonPremultipliedDstColor, value);
    }

    public @unsigned int advancedBlendCorrelatedOverlap() {
        return segment.get(LAYOUT$advancedBlendCorrelatedOverlap, OFFSET$advancedBlendCorrelatedOverlap);
    }

    public void advancedBlendCorrelatedOverlap(@unsigned int value) {
        segment.set(LAYOUT$advancedBlendCorrelatedOverlap, OFFSET$advancedBlendCorrelatedOverlap, value);
    }

    public @unsigned int advancedBlendAllOperations() {
        return segment.get(LAYOUT$advancedBlendAllOperations, OFFSET$advancedBlendAllOperations);
    }

    public void advancedBlendAllOperations(@unsigned int value) {
        segment.set(LAYOUT$advancedBlendAllOperations, OFFSET$advancedBlendAllOperations, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("advancedBlendMaxColorAttachments"),
        ValueLayout.JAVA_INT.withName("advancedBlendIndependentBlend"),
        ValueLayout.JAVA_INT.withName("advancedBlendNonPremultipliedSrcColor"),
        ValueLayout.JAVA_INT.withName("advancedBlendNonPremultipliedDstColor"),
        ValueLayout.JAVA_INT.withName("advancedBlendCorrelatedOverlap"),
        ValueLayout.JAVA_INT.withName("advancedBlendAllOperations")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$advancedBlendMaxColorAttachments = PathElement.groupElement("advancedBlendMaxColorAttachments");
    public static final PathElement PATH$advancedBlendIndependentBlend = PathElement.groupElement("advancedBlendIndependentBlend");
    public static final PathElement PATH$advancedBlendNonPremultipliedSrcColor = PathElement.groupElement("advancedBlendNonPremultipliedSrcColor");
    public static final PathElement PATH$advancedBlendNonPremultipliedDstColor = PathElement.groupElement("advancedBlendNonPremultipliedDstColor");
    public static final PathElement PATH$advancedBlendCorrelatedOverlap = PathElement.groupElement("advancedBlendCorrelatedOverlap");
    public static final PathElement PATH$advancedBlendAllOperations = PathElement.groupElement("advancedBlendAllOperations");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$advancedBlendMaxColorAttachments = (OfInt) LAYOUT.select(PATH$advancedBlendMaxColorAttachments);
    public static final OfInt LAYOUT$advancedBlendIndependentBlend = (OfInt) LAYOUT.select(PATH$advancedBlendIndependentBlend);
    public static final OfInt LAYOUT$advancedBlendNonPremultipliedSrcColor = (OfInt) LAYOUT.select(PATH$advancedBlendNonPremultipliedSrcColor);
    public static final OfInt LAYOUT$advancedBlendNonPremultipliedDstColor = (OfInt) LAYOUT.select(PATH$advancedBlendNonPremultipliedDstColor);
    public static final OfInt LAYOUT$advancedBlendCorrelatedOverlap = (OfInt) LAYOUT.select(PATH$advancedBlendCorrelatedOverlap);
    public static final OfInt LAYOUT$advancedBlendAllOperations = (OfInt) LAYOUT.select(PATH$advancedBlendAllOperations);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$advancedBlendMaxColorAttachments = LAYOUT$advancedBlendMaxColorAttachments.byteSize();
    public static final long SIZE$advancedBlendIndependentBlend = LAYOUT$advancedBlendIndependentBlend.byteSize();
    public static final long SIZE$advancedBlendNonPremultipliedSrcColor = LAYOUT$advancedBlendNonPremultipliedSrcColor.byteSize();
    public static final long SIZE$advancedBlendNonPremultipliedDstColor = LAYOUT$advancedBlendNonPremultipliedDstColor.byteSize();
    public static final long SIZE$advancedBlendCorrelatedOverlap = LAYOUT$advancedBlendCorrelatedOverlap.byteSize();
    public static final long SIZE$advancedBlendAllOperations = LAYOUT$advancedBlendAllOperations.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$advancedBlendMaxColorAttachments = LAYOUT.byteOffset(PATH$advancedBlendMaxColorAttachments);
    public static final long OFFSET$advancedBlendIndependentBlend = LAYOUT.byteOffset(PATH$advancedBlendIndependentBlend);
    public static final long OFFSET$advancedBlendNonPremultipliedSrcColor = LAYOUT.byteOffset(PATH$advancedBlendNonPremultipliedSrcColor);
    public static final long OFFSET$advancedBlendNonPremultipliedDstColor = LAYOUT.byteOffset(PATH$advancedBlendNonPremultipliedDstColor);
    public static final long OFFSET$advancedBlendCorrelatedOverlap = LAYOUT.byteOffset(PATH$advancedBlendCorrelatedOverlap);
    public static final long OFFSET$advancedBlendAllOperations = LAYOUT.byteOffset(PATH$advancedBlendAllOperations);
}
