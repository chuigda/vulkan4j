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

/// Represents a pointer to a {@code VkColorBlendAdvancedEXT} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkColorBlendAdvancedEXT.html">VkColorBlendAdvancedEXT</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkColorBlendAdvancedEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkColorBlendAdvancedEXT allocate(Arena arena) {
        return new VkColorBlendAdvancedEXT(arena.allocate(LAYOUT));
    }

    public static VkColorBlendAdvancedEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkColorBlendAdvancedEXT[] ret = new VkColorBlendAdvancedEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkColorBlendAdvancedEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkColorBlendAdvancedEXT clone(Arena arena, VkColorBlendAdvancedEXT src) {
        VkColorBlendAdvancedEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkColorBlendAdvancedEXT[] clone(Arena arena, VkColorBlendAdvancedEXT[] src) {
        VkColorBlendAdvancedEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("advancedBlendOp"),
        ValueLayout.JAVA_INT.withName("srcPremultiplied"),
        ValueLayout.JAVA_INT.withName("dstPremultiplied"),
        ValueLayout.JAVA_INT.withName("blendOverlap"),
        ValueLayout.JAVA_INT.withName("clampResults")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$advancedBlendOp = PathElement.groupElement("PATH$advancedBlendOp");
    public static final PathElement PATH$srcPremultiplied = PathElement.groupElement("PATH$srcPremultiplied");
    public static final PathElement PATH$dstPremultiplied = PathElement.groupElement("PATH$dstPremultiplied");
    public static final PathElement PATH$blendOverlap = PathElement.groupElement("PATH$blendOverlap");
    public static final PathElement PATH$clampResults = PathElement.groupElement("PATH$clampResults");

    public static final OfInt LAYOUT$advancedBlendOp = (OfInt) LAYOUT.select(PATH$advancedBlendOp);
    public static final OfInt LAYOUT$srcPremultiplied = (OfInt) LAYOUT.select(PATH$srcPremultiplied);
    public static final OfInt LAYOUT$dstPremultiplied = (OfInt) LAYOUT.select(PATH$dstPremultiplied);
    public static final OfInt LAYOUT$blendOverlap = (OfInt) LAYOUT.select(PATH$blendOverlap);
    public static final OfInt LAYOUT$clampResults = (OfInt) LAYOUT.select(PATH$clampResults);

    public static final long SIZE$advancedBlendOp = LAYOUT$advancedBlendOp.byteSize();
    public static final long SIZE$srcPremultiplied = LAYOUT$srcPremultiplied.byteSize();
    public static final long SIZE$dstPremultiplied = LAYOUT$dstPremultiplied.byteSize();
    public static final long SIZE$blendOverlap = LAYOUT$blendOverlap.byteSize();
    public static final long SIZE$clampResults = LAYOUT$clampResults.byteSize();

    public static final long OFFSET$advancedBlendOp = LAYOUT.byteOffset(PATH$advancedBlendOp);
    public static final long OFFSET$srcPremultiplied = LAYOUT.byteOffset(PATH$srcPremultiplied);
    public static final long OFFSET$dstPremultiplied = LAYOUT.byteOffset(PATH$dstPremultiplied);
    public static final long OFFSET$blendOverlap = LAYOUT.byteOffset(PATH$blendOverlap);
    public static final long OFFSET$clampResults = LAYOUT.byteOffset(PATH$clampResults);

    public @enumtype(VkBlendOp.class) int advancedBlendOp() {
        return segment.get(LAYOUT$advancedBlendOp, OFFSET$advancedBlendOp);
    }

    public void advancedBlendOp(@enumtype(VkBlendOp.class) int value) {
        segment.set(LAYOUT$advancedBlendOp, OFFSET$advancedBlendOp, value);
    }

    public @unsigned int srcPremultiplied() {
        return segment.get(LAYOUT$srcPremultiplied, OFFSET$srcPremultiplied);
    }

    public void srcPremultiplied(@unsigned int value) {
        segment.set(LAYOUT$srcPremultiplied, OFFSET$srcPremultiplied, value);
    }

    public @unsigned int dstPremultiplied() {
        return segment.get(LAYOUT$dstPremultiplied, OFFSET$dstPremultiplied);
    }

    public void dstPremultiplied(@unsigned int value) {
        segment.set(LAYOUT$dstPremultiplied, OFFSET$dstPremultiplied, value);
    }

    public @enumtype(VkBlendOverlapEXT.class) int blendOverlap() {
        return segment.get(LAYOUT$blendOverlap, OFFSET$blendOverlap);
    }

    public void blendOverlap(@enumtype(VkBlendOverlapEXT.class) int value) {
        segment.set(LAYOUT$blendOverlap, OFFSET$blendOverlap, value);
    }

    public @unsigned int clampResults() {
        return segment.get(LAYOUT$clampResults, OFFSET$clampResults);
    }

    public void clampResults(@unsigned int value) {
        segment.set(LAYOUT$clampResults, OFFSET$clampResults, value);
    }

}
