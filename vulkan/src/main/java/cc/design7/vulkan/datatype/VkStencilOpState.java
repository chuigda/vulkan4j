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

/// Represents a pointer to a {@code VkStencilOpState} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkStencilOpState.html">VkStencilOpState</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkStencilOpState(@NotNull MemorySegment segment) implements IPointer {
    public static VkStencilOpState allocate(Arena arena) {
        return new VkStencilOpState(arena.allocate(LAYOUT));
    }

    public static VkStencilOpState[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkStencilOpState[] ret = new VkStencilOpState[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkStencilOpState(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkStencilOpState clone(Arena arena, VkStencilOpState src) {
        VkStencilOpState ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkStencilOpState[] clone(Arena arena, VkStencilOpState[] src) {
        VkStencilOpState[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("failOp"),
        ValueLayout.JAVA_INT.withName("passOp"),
        ValueLayout.JAVA_INT.withName("depthFailOp"),
        ValueLayout.JAVA_INT.withName("compareOp"),
        ValueLayout.JAVA_INT.withName("compareMask"),
        ValueLayout.JAVA_INT.withName("writeMask"),
        ValueLayout.JAVA_INT.withName("reference")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$failOp = PathElement.groupElement("PATH$failOp");
    public static final PathElement PATH$passOp = PathElement.groupElement("PATH$passOp");
    public static final PathElement PATH$depthFailOp = PathElement.groupElement("PATH$depthFailOp");
    public static final PathElement PATH$compareOp = PathElement.groupElement("PATH$compareOp");
    public static final PathElement PATH$compareMask = PathElement.groupElement("PATH$compareMask");
    public static final PathElement PATH$writeMask = PathElement.groupElement("PATH$writeMask");
    public static final PathElement PATH$reference = PathElement.groupElement("PATH$reference");

    public static final OfInt LAYOUT$failOp = (OfInt) LAYOUT.select(PATH$failOp);
    public static final OfInt LAYOUT$passOp = (OfInt) LAYOUT.select(PATH$passOp);
    public static final OfInt LAYOUT$depthFailOp = (OfInt) LAYOUT.select(PATH$depthFailOp);
    public static final OfInt LAYOUT$compareOp = (OfInt) LAYOUT.select(PATH$compareOp);
    public static final OfInt LAYOUT$compareMask = (OfInt) LAYOUT.select(PATH$compareMask);
    public static final OfInt LAYOUT$writeMask = (OfInt) LAYOUT.select(PATH$writeMask);
    public static final OfInt LAYOUT$reference = (OfInt) LAYOUT.select(PATH$reference);

    public static final long SIZE$failOp = LAYOUT$failOp.byteSize();
    public static final long SIZE$passOp = LAYOUT$passOp.byteSize();
    public static final long SIZE$depthFailOp = LAYOUT$depthFailOp.byteSize();
    public static final long SIZE$compareOp = LAYOUT$compareOp.byteSize();
    public static final long SIZE$compareMask = LAYOUT$compareMask.byteSize();
    public static final long SIZE$writeMask = LAYOUT$writeMask.byteSize();
    public static final long SIZE$reference = LAYOUT$reference.byteSize();

    public static final long OFFSET$failOp = LAYOUT.byteOffset(PATH$failOp);
    public static final long OFFSET$passOp = LAYOUT.byteOffset(PATH$passOp);
    public static final long OFFSET$depthFailOp = LAYOUT.byteOffset(PATH$depthFailOp);
    public static final long OFFSET$compareOp = LAYOUT.byteOffset(PATH$compareOp);
    public static final long OFFSET$compareMask = LAYOUT.byteOffset(PATH$compareMask);
    public static final long OFFSET$writeMask = LAYOUT.byteOffset(PATH$writeMask);
    public static final long OFFSET$reference = LAYOUT.byteOffset(PATH$reference);

    public @enumtype(VkStencilOp.class) int failOp() {
        return segment.get(LAYOUT$failOp, OFFSET$failOp);
    }

    public void failOp(@enumtype(VkStencilOp.class) int value) {
        segment.set(LAYOUT$failOp, OFFSET$failOp, value);
    }

    public @enumtype(VkStencilOp.class) int passOp() {
        return segment.get(LAYOUT$passOp, OFFSET$passOp);
    }

    public void passOp(@enumtype(VkStencilOp.class) int value) {
        segment.set(LAYOUT$passOp, OFFSET$passOp, value);
    }

    public @enumtype(VkStencilOp.class) int depthFailOp() {
        return segment.get(LAYOUT$depthFailOp, OFFSET$depthFailOp);
    }

    public void depthFailOp(@enumtype(VkStencilOp.class) int value) {
        segment.set(LAYOUT$depthFailOp, OFFSET$depthFailOp, value);
    }

    public @enumtype(VkCompareOp.class) int compareOp() {
        return segment.get(LAYOUT$compareOp, OFFSET$compareOp);
    }

    public void compareOp(@enumtype(VkCompareOp.class) int value) {
        segment.set(LAYOUT$compareOp, OFFSET$compareOp, value);
    }

    public @unsigned int compareMask() {
        return segment.get(LAYOUT$compareMask, OFFSET$compareMask);
    }

    public void compareMask(@unsigned int value) {
        segment.set(LAYOUT$compareMask, OFFSET$compareMask, value);
    }

    public @unsigned int writeMask() {
        return segment.get(LAYOUT$writeMask, OFFSET$writeMask);
    }

    public void writeMask(@unsigned int value) {
        segment.set(LAYOUT$writeMask, OFFSET$writeMask, value);
    }

    public @unsigned int reference() {
        return segment.get(LAYOUT$reference, OFFSET$reference);
    }

    public void reference(@unsigned int value) {
        segment.set(LAYOUT$reference, OFFSET$reference, value);
    }

}
