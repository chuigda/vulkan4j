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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceDescriptorBufferFeaturesEXT.html"><code>VkPhysicalDeviceDescriptorBufferFeaturesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceDescriptorBufferFeaturesEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 descriptorBuffer; // @link substring="descriptorBuffer" target="#descriptorBuffer"
///     VkBool32 descriptorBufferCaptureReplay; // @link substring="descriptorBufferCaptureReplay" target="#descriptorBufferCaptureReplay"
///     VkBool32 descriptorBufferImageLayoutIgnored; // @link substring="descriptorBufferImageLayoutIgnored" target="#descriptorBufferImageLayoutIgnored"
///     VkBool32 descriptorBufferPushDescriptors; // @link substring="descriptorBufferPushDescriptors" target="#descriptorBufferPushDescriptors"
/// } VkPhysicalDeviceDescriptorBufferFeaturesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT`
///
/// The {@code allocate} ({@link VkPhysicalDeviceDescriptorBufferFeaturesEXT#allocate(Arena)}, {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceDescriptorBufferFeaturesEXT.html"><code>VkPhysicalDeviceDescriptorBufferFeaturesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceDescriptorBufferFeaturesEXT(@NotNull MemorySegment segment) implements IVkPhysicalDeviceDescriptorBufferFeaturesEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceDescriptorBufferFeaturesEXT.html"><code>VkPhysicalDeviceDescriptorBufferFeaturesEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPhysicalDeviceDescriptorBufferFeaturesEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPhysicalDeviceDescriptorBufferFeaturesEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPhysicalDeviceDescriptorBufferFeaturesEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPhysicalDeviceDescriptorBufferFeaturesEXT {
        public long size() {
            return segment.byteSize() / VkPhysicalDeviceDescriptorBufferFeaturesEXT.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPhysicalDeviceDescriptorBufferFeaturesEXT at(long index) {
            return new VkPhysicalDeviceDescriptorBufferFeaturesEXT(segment.asSlice(index * VkPhysicalDeviceDescriptorBufferFeaturesEXT.BYTES, VkPhysicalDeviceDescriptorBufferFeaturesEXT.BYTES));
        }
        public void write(long index, @NotNull VkPhysicalDeviceDescriptorBufferFeaturesEXT value) {
            MemorySegment s = segment.asSlice(index * VkPhysicalDeviceDescriptorBufferFeaturesEXT.BYTES, VkPhysicalDeviceDescriptorBufferFeaturesEXT.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT allocate(Arena arena) {
        VkPhysicalDeviceDescriptorBufferFeaturesEXT ret = new VkPhysicalDeviceDescriptorBufferFeaturesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceDescriptorBufferFeaturesEXT.Ptr ret = new VkPhysicalDeviceDescriptorBufferFeaturesEXT.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT);
        }
        return ret;
    }

    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT clone(Arena arena, VkPhysicalDeviceDescriptorBufferFeaturesEXT src) {
        VkPhysicalDeviceDescriptorBufferFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_FEATURES_EXT);
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

    public @unsigned int descriptorBuffer() {
        return segment.get(LAYOUT$descriptorBuffer, OFFSET$descriptorBuffer);
    }

    public void descriptorBuffer(@unsigned int value) {
        segment.set(LAYOUT$descriptorBuffer, OFFSET$descriptorBuffer, value);
    }

    public @unsigned int descriptorBufferCaptureReplay() {
        return segment.get(LAYOUT$descriptorBufferCaptureReplay, OFFSET$descriptorBufferCaptureReplay);
    }

    public void descriptorBufferCaptureReplay(@unsigned int value) {
        segment.set(LAYOUT$descriptorBufferCaptureReplay, OFFSET$descriptorBufferCaptureReplay, value);
    }

    public @unsigned int descriptorBufferImageLayoutIgnored() {
        return segment.get(LAYOUT$descriptorBufferImageLayoutIgnored, OFFSET$descriptorBufferImageLayoutIgnored);
    }

    public void descriptorBufferImageLayoutIgnored(@unsigned int value) {
        segment.set(LAYOUT$descriptorBufferImageLayoutIgnored, OFFSET$descriptorBufferImageLayoutIgnored, value);
    }

    public @unsigned int descriptorBufferPushDescriptors() {
        return segment.get(LAYOUT$descriptorBufferPushDescriptors, OFFSET$descriptorBufferPushDescriptors);
    }

    public void descriptorBufferPushDescriptors(@unsigned int value) {
        segment.set(LAYOUT$descriptorBufferPushDescriptors, OFFSET$descriptorBufferPushDescriptors, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorBuffer"),
        ValueLayout.JAVA_INT.withName("descriptorBufferCaptureReplay"),
        ValueLayout.JAVA_INT.withName("descriptorBufferImageLayoutIgnored"),
        ValueLayout.JAVA_INT.withName("descriptorBufferPushDescriptors")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$descriptorBuffer = PathElement.groupElement("descriptorBuffer");
    public static final PathElement PATH$descriptorBufferCaptureReplay = PathElement.groupElement("descriptorBufferCaptureReplay");
    public static final PathElement PATH$descriptorBufferImageLayoutIgnored = PathElement.groupElement("descriptorBufferImageLayoutIgnored");
    public static final PathElement PATH$descriptorBufferPushDescriptors = PathElement.groupElement("descriptorBufferPushDescriptors");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$descriptorBuffer = (OfInt) LAYOUT.select(PATH$descriptorBuffer);
    public static final OfInt LAYOUT$descriptorBufferCaptureReplay = (OfInt) LAYOUT.select(PATH$descriptorBufferCaptureReplay);
    public static final OfInt LAYOUT$descriptorBufferImageLayoutIgnored = (OfInt) LAYOUT.select(PATH$descriptorBufferImageLayoutIgnored);
    public static final OfInt LAYOUT$descriptorBufferPushDescriptors = (OfInt) LAYOUT.select(PATH$descriptorBufferPushDescriptors);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$descriptorBuffer = LAYOUT$descriptorBuffer.byteSize();
    public static final long SIZE$descriptorBufferCaptureReplay = LAYOUT$descriptorBufferCaptureReplay.byteSize();
    public static final long SIZE$descriptorBufferImageLayoutIgnored = LAYOUT$descriptorBufferImageLayoutIgnored.byteSize();
    public static final long SIZE$descriptorBufferPushDescriptors = LAYOUT$descriptorBufferPushDescriptors.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorBuffer = LAYOUT.byteOffset(PATH$descriptorBuffer);
    public static final long OFFSET$descriptorBufferCaptureReplay = LAYOUT.byteOffset(PATH$descriptorBufferCaptureReplay);
    public static final long OFFSET$descriptorBufferImageLayoutIgnored = LAYOUT.byteOffset(PATH$descriptorBufferImageLayoutIgnored);
    public static final long OFFSET$descriptorBufferPushDescriptors = LAYOUT.byteOffset(PATH$descriptorBufferPushDescriptors);
}
