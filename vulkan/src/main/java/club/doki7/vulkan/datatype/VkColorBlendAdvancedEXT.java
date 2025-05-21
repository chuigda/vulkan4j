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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkColorBlendAdvancedEXT.html"><code>VkColorBlendAdvancedEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkColorBlendAdvancedEXT {
///     VkBlendOp advancedBlendOp; // @link substring="VkBlendOp" target="VkBlendOp" @link substring="advancedBlendOp" target="#advancedBlendOp"
///     VkBool32 srcPremultiplied; // @link substring="srcPremultiplied" target="#srcPremultiplied"
///     VkBool32 dstPremultiplied; // @link substring="dstPremultiplied" target="#dstPremultiplied"
///     VkBlendOverlapEXT blendOverlap; // @link substring="VkBlendOverlapEXT" target="VkBlendOverlapEXT" @link substring="blendOverlap" target="#blendOverlap"
///     VkBool32 clampResults; // @link substring="clampResults" target="#clampResults"
/// } VkColorBlendAdvancedEXT;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkColorBlendAdvancedEXT.html"><code>VkColorBlendAdvancedEXT</code></a>
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("advancedBlendOp"),
        ValueLayout.JAVA_INT.withName("srcPremultiplied"),
        ValueLayout.JAVA_INT.withName("dstPremultiplied"),
        ValueLayout.JAVA_INT.withName("blendOverlap"),
        ValueLayout.JAVA_INT.withName("clampResults")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$advancedBlendOp = PathElement.groupElement("advancedBlendOp");
    public static final PathElement PATH$srcPremultiplied = PathElement.groupElement("srcPremultiplied");
    public static final PathElement PATH$dstPremultiplied = PathElement.groupElement("dstPremultiplied");
    public static final PathElement PATH$blendOverlap = PathElement.groupElement("blendOverlap");
    public static final PathElement PATH$clampResults = PathElement.groupElement("clampResults");

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
}
