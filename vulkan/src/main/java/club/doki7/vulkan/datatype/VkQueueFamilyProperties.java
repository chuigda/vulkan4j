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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueueFamilyProperties.html"><code>VkQueueFamilyProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkQueueFamilyProperties {
///     VkQueueFlags queueFlags; // optional // @link substring="VkQueueFlags" target="VkQueueFlags" @link substring="queueFlags" target="#queueFlags"
///     uint32_t queueCount; // @link substring="queueCount" target="#queueCount"
///     uint32_t timestampValidBits; // @link substring="timestampValidBits" target="#timestampValidBits"
///     VkExtent3D minImageTransferGranularity; // @link substring="VkExtent3D" target="VkExtent3D" @link substring="minImageTransferGranularity" target="#minImageTransferGranularity"
/// } VkQueueFamilyProperties;
/// }
///
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueueFamilyProperties.html"><code>VkQueueFamilyProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkQueueFamilyProperties(@NotNull MemorySegment segment) implements IVkQueueFamilyProperties {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueueFamilyProperties.html"><code>VkQueueFamilyProperties</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkQueueFamilyProperties}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkQueueFamilyProperties to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkQueueFamilyProperties.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkQueueFamilyProperties {
        public long size() {
            return segment.byteSize() / VkQueueFamilyProperties.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkQueueFamilyProperties at(long index) {
            return new VkQueueFamilyProperties(segment.asSlice(index * VkQueueFamilyProperties.BYTES, VkQueueFamilyProperties.BYTES));
        }
        public void write(long index, @NotNull VkQueueFamilyProperties value) {
            MemorySegment s = segment.asSlice(index * VkQueueFamilyProperties.BYTES, VkQueueFamilyProperties.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkQueueFamilyProperties allocate(Arena arena) {
        return new VkQueueFamilyProperties(arena.allocate(LAYOUT));
    }

    public static VkQueueFamilyProperties.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkQueueFamilyProperties.Ptr ret = new VkQueueFamilyProperties.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkQueueFamilyProperties clone(Arena arena, VkQueueFamilyProperties src) {
        VkQueueFamilyProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @enumtype(VkQueueFlags.class) int queueFlags() {
        return segment.get(LAYOUT$queueFlags, OFFSET$queueFlags);
    }

    public void queueFlags(@enumtype(VkQueueFlags.class) int value) {
        segment.set(LAYOUT$queueFlags, OFFSET$queueFlags, value);
    }

    public @unsigned int queueCount() {
        return segment.get(LAYOUT$queueCount, OFFSET$queueCount);
    }

    public void queueCount(@unsigned int value) {
        segment.set(LAYOUT$queueCount, OFFSET$queueCount, value);
    }

    public @unsigned int timestampValidBits() {
        return segment.get(LAYOUT$timestampValidBits, OFFSET$timestampValidBits);
    }

    public void timestampValidBits(@unsigned int value) {
        segment.set(LAYOUT$timestampValidBits, OFFSET$timestampValidBits, value);
    }

    public @NotNull VkExtent3D minImageTransferGranularity() {
        return new VkExtent3D(segment.asSlice(OFFSET$minImageTransferGranularity, LAYOUT$minImageTransferGranularity));
    }

    public void minImageTransferGranularity(@NotNull VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minImageTransferGranularity, SIZE$minImageTransferGranularity);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("queueFlags"),
        ValueLayout.JAVA_INT.withName("queueCount"),
        ValueLayout.JAVA_INT.withName("timestampValidBits"),
        VkExtent3D.LAYOUT.withName("minImageTransferGranularity")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$queueFlags = PathElement.groupElement("queueFlags");
    public static final PathElement PATH$queueCount = PathElement.groupElement("queueCount");
    public static final PathElement PATH$timestampValidBits = PathElement.groupElement("timestampValidBits");
    public static final PathElement PATH$minImageTransferGranularity = PathElement.groupElement("minImageTransferGranularity");

    public static final OfInt LAYOUT$queueFlags = (OfInt) LAYOUT.select(PATH$queueFlags);
    public static final OfInt LAYOUT$queueCount = (OfInt) LAYOUT.select(PATH$queueCount);
    public static final OfInt LAYOUT$timestampValidBits = (OfInt) LAYOUT.select(PATH$timestampValidBits);
    public static final StructLayout LAYOUT$minImageTransferGranularity = (StructLayout) LAYOUT.select(PATH$minImageTransferGranularity);

    public static final long SIZE$queueFlags = LAYOUT$queueFlags.byteSize();
    public static final long SIZE$queueCount = LAYOUT$queueCount.byteSize();
    public static final long SIZE$timestampValidBits = LAYOUT$timestampValidBits.byteSize();
    public static final long SIZE$minImageTransferGranularity = LAYOUT$minImageTransferGranularity.byteSize();

    public static final long OFFSET$queueFlags = LAYOUT.byteOffset(PATH$queueFlags);
    public static final long OFFSET$queueCount = LAYOUT.byteOffset(PATH$queueCount);
    public static final long OFFSET$timestampValidBits = LAYOUT.byteOffset(PATH$timestampValidBits);
    public static final long OFFSET$minImageTransferGranularity = LAYOUT.byteOffset(PATH$minImageTransferGranularity);
}
