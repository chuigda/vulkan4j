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

/// Represents a pointer to a {@code StdVideoH265ProfileTierLevel} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH265ProfileTierLevel {
///     StdVideoH265ProfileTierLevelFlags flags; // @link substring="StdVideoH265ProfileTierLevelFlags" target="StdVideoH265ProfileTierLevelFlags" @link substring="flags" target="#flags"
///     StdVideoH265ProfileIdc general_profile_idc; // @link substring="StdVideoH265ProfileIdc" target="StdVideoH265ProfileIdc" @link substring="general_profile_idc" target="#general_profile_idc"
///     StdVideoH265LevelIdc general_level_idc; // @link substring="StdVideoH265LevelIdc" target="StdVideoH265LevelIdc" @link substring="general_level_idc" target="#general_level_idc"
/// } StdVideoH265ProfileTierLevel;
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
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoH265ProfileTierLevel(@NotNull MemorySegment segment) implements IStdVideoH265ProfileTierLevel {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoH265ProfileTierLevel}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoH265ProfileTierLevel to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoH265ProfileTierLevel.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoH265ProfileTierLevel {
        public long size() {
            return segment.byteSize() / StdVideoH265ProfileTierLevel.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoH265ProfileTierLevel at(long index) {
            return new StdVideoH265ProfileTierLevel(segment.asSlice(index * StdVideoH265ProfileTierLevel.BYTES, StdVideoH265ProfileTierLevel.BYTES));
        }
        public void write(long index, @NotNull StdVideoH265ProfileTierLevel value) {
            MemorySegment s = segment.asSlice(index * StdVideoH265ProfileTierLevel.BYTES, StdVideoH265ProfileTierLevel.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static StdVideoH265ProfileTierLevel allocate(Arena arena) {
        return new StdVideoH265ProfileTierLevel(arena.allocate(LAYOUT));
    }

    public static StdVideoH265ProfileTierLevel.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265ProfileTierLevel.Ptr ret = new StdVideoH265ProfileTierLevel.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static StdVideoH265ProfileTierLevel clone(Arena arena, StdVideoH265ProfileTierLevel src) {
        StdVideoH265ProfileTierLevel ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull StdVideoH265ProfileTierLevelFlags flags() {
        return new StdVideoH265ProfileTierLevelFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(@NotNull StdVideoH265ProfileTierLevelFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @enumtype(StdVideoH265ProfileIdc.class) int general_profile_idc() {
        return segment.get(LAYOUT$general_profile_idc, OFFSET$general_profile_idc);
    }

    public void general_profile_idc(@enumtype(StdVideoH265ProfileIdc.class) int value) {
        segment.set(LAYOUT$general_profile_idc, OFFSET$general_profile_idc, value);
    }

    public @enumtype(StdVideoH265LevelIdc.class) int general_level_idc() {
        return segment.get(LAYOUT$general_level_idc, OFFSET$general_level_idc);
    }

    public void general_level_idc(@enumtype(StdVideoH265LevelIdc.class) int value) {
        segment.set(LAYOUT$general_level_idc, OFFSET$general_level_idc, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoH265ProfileTierLevelFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("general_profile_idc"),
        ValueLayout.JAVA_INT.withName("general_level_idc")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$general_profile_idc = PathElement.groupElement("general_profile_idc");
    public static final PathElement PATH$general_level_idc = PathElement.groupElement("general_level_idc");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$general_profile_idc = (OfInt) LAYOUT.select(PATH$general_profile_idc);
    public static final OfInt LAYOUT$general_level_idc = (OfInt) LAYOUT.select(PATH$general_level_idc);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$general_profile_idc = LAYOUT$general_profile_idc.byteSize();
    public static final long SIZE$general_level_idc = LAYOUT$general_level_idc.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$general_profile_idc = LAYOUT.byteOffset(PATH$general_profile_idc);
    public static final long OFFSET$general_level_idc = LAYOUT.byteOffset(PATH$general_level_idc);
}
