package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoH265ProfileTierLevel} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH265ProfileTierLevel {
///     StdVideoH265ProfileTierLevelFlags flags;
///     StdVideoH265ProfileIdc general_profile_idc;
///     StdVideoH265LevelIdc general_level_idc;
/// } StdVideoH265ProfileTierLevel;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoH265ProfileTierLevel(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH265ProfileTierLevel allocate(Arena arena) {
        StdVideoH265ProfileTierLevel ret = new StdVideoH265ProfileTierLevel(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoH265ProfileTierLevel[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265ProfileTierLevel[] ret = new StdVideoH265ProfileTierLevel[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265ProfileTierLevel(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoH265ProfileTierLevel clone(Arena arena, StdVideoH265ProfileTierLevel src) {
        StdVideoH265ProfileTierLevel ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265ProfileTierLevel[] clone(Arena arena, StdVideoH265ProfileTierLevel[] src) {
        StdVideoH265ProfileTierLevel[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public StdVideoH265ProfileTierLevelFlags flags() {
        return new StdVideoH265ProfileTierLevelFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoH265ProfileTierLevelFlags value) {
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

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$general_profile_idc = PathElement.groupElement("PATH$general_profile_idc");
    public static final PathElement PATH$general_level_idc = PathElement.groupElement("PATH$general_level_idc");

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
