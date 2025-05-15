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

/// Represents a pointer to a {@code StdVideoAV1CDEF} structure in native memory.
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
public record StdVideoAV1CDEF(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoAV1CDEF allocate(Arena arena) {
        return new StdVideoAV1CDEF(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1CDEF[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1CDEF[] ret = new StdVideoAV1CDEF[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1CDEF(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoAV1CDEF clone(Arena arena, StdVideoAV1CDEF src) {
        StdVideoAV1CDEF ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1CDEF[] clone(Arena arena, StdVideoAV1CDEF[] src) {
        StdVideoAV1CDEF[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_BYTE.withName("cdef_damping_minus_3"),
        ValueLayout.JAVA_BYTE.withName("cdef_bits"),
        ValueLayout.JAVA_BYTE.withName("cdef_y_pri_strength"),
        ValueLayout.JAVA_BYTE.withName("cdef_y_sec_strength"),
        ValueLayout.JAVA_BYTE.withName("cdef_uv_pri_strength"),
        ValueLayout.JAVA_BYTE.withName("cdef_uv_sec_strength")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$cdef_damping_minus_3 = PathElement.groupElement("PATH$cdef_damping_minus_3");
    public static final PathElement PATH$cdef_bits = PathElement.groupElement("PATH$cdef_bits");
    public static final PathElement PATH$cdef_y_pri_strength = PathElement.groupElement("PATH$cdef_y_pri_strength");
    public static final PathElement PATH$cdef_y_sec_strength = PathElement.groupElement("PATH$cdef_y_sec_strength");
    public static final PathElement PATH$cdef_uv_pri_strength = PathElement.groupElement("PATH$cdef_uv_pri_strength");
    public static final PathElement PATH$cdef_uv_sec_strength = PathElement.groupElement("PATH$cdef_uv_sec_strength");

    public static final OfByte LAYOUT$cdef_damping_minus_3 = (OfByte) LAYOUT.select(PATH$cdef_damping_minus_3);
    public static final OfByte LAYOUT$cdef_bits = (OfByte) LAYOUT.select(PATH$cdef_bits);
    public static final OfByte LAYOUT$cdef_y_pri_strength = (OfByte) LAYOUT.select(PATH$cdef_y_pri_strength);
    public static final OfByte LAYOUT$cdef_y_sec_strength = (OfByte) LAYOUT.select(PATH$cdef_y_sec_strength);
    public static final OfByte LAYOUT$cdef_uv_pri_strength = (OfByte) LAYOUT.select(PATH$cdef_uv_pri_strength);
    public static final OfByte LAYOUT$cdef_uv_sec_strength = (OfByte) LAYOUT.select(PATH$cdef_uv_sec_strength);

    public static final long SIZE$cdef_damping_minus_3 = LAYOUT$cdef_damping_minus_3.byteSize();
    public static final long SIZE$cdef_bits = LAYOUT$cdef_bits.byteSize();
    public static final long SIZE$cdef_y_pri_strength = LAYOUT$cdef_y_pri_strength.byteSize();
    public static final long SIZE$cdef_y_sec_strength = LAYOUT$cdef_y_sec_strength.byteSize();
    public static final long SIZE$cdef_uv_pri_strength = LAYOUT$cdef_uv_pri_strength.byteSize();
    public static final long SIZE$cdef_uv_sec_strength = LAYOUT$cdef_uv_sec_strength.byteSize();

    public static final long OFFSET$cdef_damping_minus_3 = LAYOUT.byteOffset(PATH$cdef_damping_minus_3);
    public static final long OFFSET$cdef_bits = LAYOUT.byteOffset(PATH$cdef_bits);
    public static final long OFFSET$cdef_y_pri_strength = LAYOUT.byteOffset(PATH$cdef_y_pri_strength);
    public static final long OFFSET$cdef_y_sec_strength = LAYOUT.byteOffset(PATH$cdef_y_sec_strength);
    public static final long OFFSET$cdef_uv_pri_strength = LAYOUT.byteOffset(PATH$cdef_uv_pri_strength);
    public static final long OFFSET$cdef_uv_sec_strength = LAYOUT.byteOffset(PATH$cdef_uv_sec_strength);

    public @unsigned byte cdef_damping_minus_3() {
        return segment.get(LAYOUT$cdef_damping_minus_3, OFFSET$cdef_damping_minus_3);
    }

    public void cdef_damping_minus_3(@unsigned byte value) {
        segment.set(LAYOUT$cdef_damping_minus_3, OFFSET$cdef_damping_minus_3, value);
    }

    public @unsigned byte cdef_bits() {
        return segment.get(LAYOUT$cdef_bits, OFFSET$cdef_bits);
    }

    public void cdef_bits(@unsigned byte value) {
        segment.set(LAYOUT$cdef_bits, OFFSET$cdef_bits, value);
    }

    public @unsigned byte cdef_y_pri_strength() {
        return segment.get(LAYOUT$cdef_y_pri_strength, OFFSET$cdef_y_pri_strength);
    }

    public void cdef_y_pri_strength(@unsigned byte value) {
        segment.set(LAYOUT$cdef_y_pri_strength, OFFSET$cdef_y_pri_strength, value);
    }

    public @unsigned byte cdef_y_sec_strength() {
        return segment.get(LAYOUT$cdef_y_sec_strength, OFFSET$cdef_y_sec_strength);
    }

    public void cdef_y_sec_strength(@unsigned byte value) {
        segment.set(LAYOUT$cdef_y_sec_strength, OFFSET$cdef_y_sec_strength, value);
    }

    public @unsigned byte cdef_uv_pri_strength() {
        return segment.get(LAYOUT$cdef_uv_pri_strength, OFFSET$cdef_uv_pri_strength);
    }

    public void cdef_uv_pri_strength(@unsigned byte value) {
        segment.set(LAYOUT$cdef_uv_pri_strength, OFFSET$cdef_uv_pri_strength, value);
    }

    public @unsigned byte cdef_uv_sec_strength() {
        return segment.get(LAYOUT$cdef_uv_sec_strength, OFFSET$cdef_uv_sec_strength);
    }

    public void cdef_uv_sec_strength(@unsigned byte value) {
        segment.set(LAYOUT$cdef_uv_sec_strength, OFFSET$cdef_uv_sec_strength, value);
    }

}
