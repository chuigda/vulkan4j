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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSpecializationMapEntry.html"><code>VkSpecializationMapEntry</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSpecializationMapEntry {
///     uint32_t constantID; // @link substring="constantID" target="#constantID"
///     uint32_t offset; // @link substring="offset" target="#offset"
///     size_t size; // @link substring="size" target="#size"
/// } VkSpecializationMapEntry;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSpecializationMapEntry.html"><code>VkSpecializationMapEntry</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSpecializationMapEntry(@NotNull MemorySegment segment) implements IVkSpecializationMapEntry {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSpecializationMapEntry.html"><code>VkSpecializationMapEntry</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkSpecializationMapEntry}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkSpecializationMapEntry to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkSpecializationMapEntry.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkSpecializationMapEntry {
        public long size() {
            return segment.byteSize() / VkSpecializationMapEntry.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkSpecializationMapEntry at(long index) {
            return new VkSpecializationMapEntry(segment.asSlice(index * VkSpecializationMapEntry.BYTES, VkSpecializationMapEntry.BYTES));
        }
        public void write(long index, @NotNull VkSpecializationMapEntry value) {
            MemorySegment s = segment.asSlice(index * VkSpecializationMapEntry.BYTES, VkSpecializationMapEntry.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkSpecializationMapEntry allocate(Arena arena) {
        return new VkSpecializationMapEntry(arena.allocate(LAYOUT));
    }

    public static VkSpecializationMapEntry.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSpecializationMapEntry.Ptr ret = new VkSpecializationMapEntry.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkSpecializationMapEntry clone(Arena arena, VkSpecializationMapEntry src) {
        VkSpecializationMapEntry ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned int constantID() {
        return segment.get(LAYOUT$constantID, OFFSET$constantID);
    }

    public void constantID(@unsigned int value) {
        segment.set(LAYOUT$constantID, OFFSET$constantID, value);
    }

    public @unsigned int offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@unsigned int value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }

    public @unsigned long size() {
        return NativeLayout.readCSizeT(segment, OFFSET$size);
    }

    public void size(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$size, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("constantID"),
        ValueLayout.JAVA_INT.withName("offset"),
        NativeLayout.C_SIZE_T.withName("size")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$constantID = PathElement.groupElement("constantID");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$size = PathElement.groupElement("size");

    public static final OfInt LAYOUT$constantID = (OfInt) LAYOUT.select(PATH$constantID);
    public static final OfInt LAYOUT$offset = (OfInt) LAYOUT.select(PATH$offset);

    public static final long SIZE$constantID = LAYOUT$constantID.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$size = NativeLayout.C_SIZE_T.byteSize();

    public static final long OFFSET$constantID = LAYOUT.byteOffset(PATH$constantID);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
}
