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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDispatchGraphCountInfoAMDX.html"><code>VkDispatchGraphCountInfoAMDX</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDispatchGraphCountInfoAMDX {
///     uint32_t count; // optional // @link substring="count" target="#count"
///     VkDeviceOrHostAddressConstAMDX infos; // @link substring="VkDeviceOrHostAddressConstAMDX" target="VkDeviceOrHostAddressConstAMDX" @link substring="infos" target="#infos"
///     uint64_t stride; // @link substring="stride" target="#stride"
/// } VkDispatchGraphCountInfoAMDX;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDispatchGraphCountInfoAMDX.html"><code>VkDispatchGraphCountInfoAMDX</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDispatchGraphCountInfoAMDX(@NotNull MemorySegment segment) implements IVkDispatchGraphCountInfoAMDX {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDispatchGraphCountInfoAMDX.html"><code>VkDispatchGraphCountInfoAMDX</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkDispatchGraphCountInfoAMDX}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkDispatchGraphCountInfoAMDX to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkDispatchGraphCountInfoAMDX.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkDispatchGraphCountInfoAMDX {
        public long size() {
            return segment.byteSize() / VkDispatchGraphCountInfoAMDX.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkDispatchGraphCountInfoAMDX at(long index) {
            return new VkDispatchGraphCountInfoAMDX(segment.asSlice(index * VkDispatchGraphCountInfoAMDX.BYTES, VkDispatchGraphCountInfoAMDX.BYTES));
        }
        public void write(long index, @NotNull VkDispatchGraphCountInfoAMDX value) {
            MemorySegment s = segment.asSlice(index * VkDispatchGraphCountInfoAMDX.BYTES, VkDispatchGraphCountInfoAMDX.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkDispatchGraphCountInfoAMDX allocate(Arena arena) {
        return new VkDispatchGraphCountInfoAMDX(arena.allocate(LAYOUT));
    }

    public static VkDispatchGraphCountInfoAMDX.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDispatchGraphCountInfoAMDX.Ptr ret = new VkDispatchGraphCountInfoAMDX.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkDispatchGraphCountInfoAMDX clone(Arena arena, VkDispatchGraphCountInfoAMDX src) {
        VkDispatchGraphCountInfoAMDX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned int count() {
        return segment.get(LAYOUT$count, OFFSET$count);
    }

    public void count(@unsigned int value) {
        segment.set(LAYOUT$count, OFFSET$count, value);
    }

    public @NotNull VkDeviceOrHostAddressConstAMDX infos() {
        return new VkDeviceOrHostAddressConstAMDX(segment.asSlice(OFFSET$infos, LAYOUT$infos));
    }

    public void infos(@NotNull VkDeviceOrHostAddressConstAMDX value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$infos, SIZE$infos);
    }

    public @unsigned long stride() {
        return segment.get(LAYOUT$stride, OFFSET$stride);
    }

    public void stride(@unsigned long value) {
        segment.set(LAYOUT$stride, OFFSET$stride, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("count"),
        VkDeviceOrHostAddressConstAMDX.LAYOUT.withName("infos"),
        ValueLayout.JAVA_LONG.withName("stride")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$count = PathElement.groupElement("count");
    public static final PathElement PATH$infos = PathElement.groupElement("infos");
    public static final PathElement PATH$stride = PathElement.groupElement("stride");

    public static final OfInt LAYOUT$count = (OfInt) LAYOUT.select(PATH$count);
    public static final StructLayout LAYOUT$infos = (StructLayout) LAYOUT.select(PATH$infos);
    public static final OfLong LAYOUT$stride = (OfLong) LAYOUT.select(PATH$stride);

    public static final long SIZE$count = LAYOUT$count.byteSize();
    public static final long SIZE$infos = LAYOUT$infos.byteSize();
    public static final long SIZE$stride = LAYOUT$stride.byteSize();

    public static final long OFFSET$count = LAYOUT.byteOffset(PATH$count);
    public static final long OFFSET$infos = LAYOUT.byteOffset(PATH$infos);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);
}
