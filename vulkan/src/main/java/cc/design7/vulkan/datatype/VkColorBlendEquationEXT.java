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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkColorBlendEquationEXT.html"><code>VkColorBlendEquationEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkColorBlendEquationEXT {
///     VkBlendFactor srcColorBlendFactor;
///     VkBlendFactor dstColorBlendFactor;
///     VkBlendOp colorBlendOp;
///     VkBlendFactor srcAlphaBlendFactor;
///     VkBlendFactor dstAlphaBlendFactor;
///     VkBlendOp alphaBlendOp;
/// } VkColorBlendEquationEXT;
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
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkColorBlendEquationEXT.html"><code>VkColorBlendEquationEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkColorBlendEquationEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkColorBlendEquationEXT allocate(Arena arena) {
        VkColorBlendEquationEXT ret = new VkColorBlendEquationEXT(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkColorBlendEquationEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkColorBlendEquationEXT[] ret = new VkColorBlendEquationEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkColorBlendEquationEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkColorBlendEquationEXT clone(Arena arena, VkColorBlendEquationEXT src) {
        VkColorBlendEquationEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkColorBlendEquationEXT[] clone(Arena arena, VkColorBlendEquationEXT[] src) {
        VkColorBlendEquationEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @enumtype(VkBlendFactor.class) int srcColorBlendFactor() {
        return segment.get(LAYOUT$srcColorBlendFactor, OFFSET$srcColorBlendFactor);
    }

    public void srcColorBlendFactor(@enumtype(VkBlendFactor.class) int value) {
        segment.set(LAYOUT$srcColorBlendFactor, OFFSET$srcColorBlendFactor, value);
    }

    public @enumtype(VkBlendFactor.class) int dstColorBlendFactor() {
        return segment.get(LAYOUT$dstColorBlendFactor, OFFSET$dstColorBlendFactor);
    }

    public void dstColorBlendFactor(@enumtype(VkBlendFactor.class) int value) {
        segment.set(LAYOUT$dstColorBlendFactor, OFFSET$dstColorBlendFactor, value);
    }

    public @enumtype(VkBlendOp.class) int colorBlendOp() {
        return segment.get(LAYOUT$colorBlendOp, OFFSET$colorBlendOp);
    }

    public void colorBlendOp(@enumtype(VkBlendOp.class) int value) {
        segment.set(LAYOUT$colorBlendOp, OFFSET$colorBlendOp, value);
    }

    public @enumtype(VkBlendFactor.class) int srcAlphaBlendFactor() {
        return segment.get(LAYOUT$srcAlphaBlendFactor, OFFSET$srcAlphaBlendFactor);
    }

    public void srcAlphaBlendFactor(@enumtype(VkBlendFactor.class) int value) {
        segment.set(LAYOUT$srcAlphaBlendFactor, OFFSET$srcAlphaBlendFactor, value);
    }

    public @enumtype(VkBlendFactor.class) int dstAlphaBlendFactor() {
        return segment.get(LAYOUT$dstAlphaBlendFactor, OFFSET$dstAlphaBlendFactor);
    }

    public void dstAlphaBlendFactor(@enumtype(VkBlendFactor.class) int value) {
        segment.set(LAYOUT$dstAlphaBlendFactor, OFFSET$dstAlphaBlendFactor, value);
    }

    public @enumtype(VkBlendOp.class) int alphaBlendOp() {
        return segment.get(LAYOUT$alphaBlendOp, OFFSET$alphaBlendOp);
    }

    public void alphaBlendOp(@enumtype(VkBlendOp.class) int value) {
        segment.set(LAYOUT$alphaBlendOp, OFFSET$alphaBlendOp, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("srcColorBlendFactor"),
        ValueLayout.JAVA_INT.withName("dstColorBlendFactor"),
        ValueLayout.JAVA_INT.withName("colorBlendOp"),
        ValueLayout.JAVA_INT.withName("srcAlphaBlendFactor"),
        ValueLayout.JAVA_INT.withName("dstAlphaBlendFactor"),
        ValueLayout.JAVA_INT.withName("alphaBlendOp")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$srcColorBlendFactor = PathElement.groupElement("PATH$srcColorBlendFactor");
    public static final PathElement PATH$dstColorBlendFactor = PathElement.groupElement("PATH$dstColorBlendFactor");
    public static final PathElement PATH$colorBlendOp = PathElement.groupElement("PATH$colorBlendOp");
    public static final PathElement PATH$srcAlphaBlendFactor = PathElement.groupElement("PATH$srcAlphaBlendFactor");
    public static final PathElement PATH$dstAlphaBlendFactor = PathElement.groupElement("PATH$dstAlphaBlendFactor");
    public static final PathElement PATH$alphaBlendOp = PathElement.groupElement("PATH$alphaBlendOp");

    public static final OfInt LAYOUT$srcColorBlendFactor = (OfInt) LAYOUT.select(PATH$srcColorBlendFactor);
    public static final OfInt LAYOUT$dstColorBlendFactor = (OfInt) LAYOUT.select(PATH$dstColorBlendFactor);
    public static final OfInt LAYOUT$colorBlendOp = (OfInt) LAYOUT.select(PATH$colorBlendOp);
    public static final OfInt LAYOUT$srcAlphaBlendFactor = (OfInt) LAYOUT.select(PATH$srcAlphaBlendFactor);
    public static final OfInt LAYOUT$dstAlphaBlendFactor = (OfInt) LAYOUT.select(PATH$dstAlphaBlendFactor);
    public static final OfInt LAYOUT$alphaBlendOp = (OfInt) LAYOUT.select(PATH$alphaBlendOp);

    public static final long SIZE$srcColorBlendFactor = LAYOUT$srcColorBlendFactor.byteSize();
    public static final long SIZE$dstColorBlendFactor = LAYOUT$dstColorBlendFactor.byteSize();
    public static final long SIZE$colorBlendOp = LAYOUT$colorBlendOp.byteSize();
    public static final long SIZE$srcAlphaBlendFactor = LAYOUT$srcAlphaBlendFactor.byteSize();
    public static final long SIZE$dstAlphaBlendFactor = LAYOUT$dstAlphaBlendFactor.byteSize();
    public static final long SIZE$alphaBlendOp = LAYOUT$alphaBlendOp.byteSize();

    public static final long OFFSET$srcColorBlendFactor = LAYOUT.byteOffset(PATH$srcColorBlendFactor);
    public static final long OFFSET$dstColorBlendFactor = LAYOUT.byteOffset(PATH$dstColorBlendFactor);
    public static final long OFFSET$colorBlendOp = LAYOUT.byteOffset(PATH$colorBlendOp);
    public static final long OFFSET$srcAlphaBlendFactor = LAYOUT.byteOffset(PATH$srcAlphaBlendFactor);
    public static final long OFFSET$dstAlphaBlendFactor = LAYOUT.byteOffset(PATH$dstAlphaBlendFactor);
    public static final long OFFSET$alphaBlendOp = LAYOUT.byteOffset(PATH$alphaBlendOp);
}
