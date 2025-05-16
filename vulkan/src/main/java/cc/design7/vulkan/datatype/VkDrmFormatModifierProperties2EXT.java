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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDrmFormatModifierProperties2EXT.html"><code>VkDrmFormatModifierProperties2EXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDrmFormatModifierProperties2EXT {
///     uint64_t drmFormatModifier;
///     uint32_t drmFormatModifierPlaneCount;
///     VkFormatFeatureFlags2 drmFormatModifierTilingFeatures;
/// } VkDrmFormatModifierProperties2EXT;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDrmFormatModifierProperties2EXT.html"><code>VkDrmFormatModifierProperties2EXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDrmFormatModifierProperties2EXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkDrmFormatModifierProperties2EXT allocate(Arena arena) {
        VkDrmFormatModifierProperties2EXT ret = new VkDrmFormatModifierProperties2EXT(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkDrmFormatModifierProperties2EXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDrmFormatModifierProperties2EXT[] ret = new VkDrmFormatModifierProperties2EXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDrmFormatModifierProperties2EXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkDrmFormatModifierProperties2EXT clone(Arena arena, VkDrmFormatModifierProperties2EXT src) {
        VkDrmFormatModifierProperties2EXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDrmFormatModifierProperties2EXT[] clone(Arena arena, VkDrmFormatModifierProperties2EXT[] src) {
        VkDrmFormatModifierProperties2EXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned long drmFormatModifier() {
        return segment.get(LAYOUT$drmFormatModifier, OFFSET$drmFormatModifier);
    }

    public void drmFormatModifier(@unsigned long value) {
        segment.set(LAYOUT$drmFormatModifier, OFFSET$drmFormatModifier, value);
    }

    public @unsigned int drmFormatModifierPlaneCount() {
        return segment.get(LAYOUT$drmFormatModifierPlaneCount, OFFSET$drmFormatModifierPlaneCount);
    }

    public void drmFormatModifierPlaneCount(@unsigned int value) {
        segment.set(LAYOUT$drmFormatModifierPlaneCount, OFFSET$drmFormatModifierPlaneCount, value);
    }

    public @enumtype(VkFormatFeatureFlags2.class) long drmFormatModifierTilingFeatures() {
        return segment.get(LAYOUT$drmFormatModifierTilingFeatures, OFFSET$drmFormatModifierTilingFeatures);
    }

    public void drmFormatModifierTilingFeatures(@enumtype(VkFormatFeatureFlags2.class) long value) {
        segment.set(LAYOUT$drmFormatModifierTilingFeatures, OFFSET$drmFormatModifierTilingFeatures, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("drmFormatModifier"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierPlaneCount"),
        ValueLayout.JAVA_LONG.withName("drmFormatModifierTilingFeatures")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$drmFormatModifier = PathElement.groupElement("PATH$drmFormatModifier");
    public static final PathElement PATH$drmFormatModifierPlaneCount = PathElement.groupElement("PATH$drmFormatModifierPlaneCount");
    public static final PathElement PATH$drmFormatModifierTilingFeatures = PathElement.groupElement("PATH$drmFormatModifierTilingFeatures");

    public static final OfLong LAYOUT$drmFormatModifier = (OfLong) LAYOUT.select(PATH$drmFormatModifier);
    public static final OfInt LAYOUT$drmFormatModifierPlaneCount = (OfInt) LAYOUT.select(PATH$drmFormatModifierPlaneCount);
    public static final OfLong LAYOUT$drmFormatModifierTilingFeatures = (OfLong) LAYOUT.select(PATH$drmFormatModifierTilingFeatures);

    public static final long SIZE$drmFormatModifier = LAYOUT$drmFormatModifier.byteSize();
    public static final long SIZE$drmFormatModifierPlaneCount = LAYOUT$drmFormatModifierPlaneCount.byteSize();
    public static final long SIZE$drmFormatModifierTilingFeatures = LAYOUT$drmFormatModifierTilingFeatures.byteSize();

    public static final long OFFSET$drmFormatModifier = LAYOUT.byteOffset(PATH$drmFormatModifier);
    public static final long OFFSET$drmFormatModifierPlaneCount = LAYOUT.byteOffset(PATH$drmFormatModifierPlaneCount);
    public static final long OFFSET$drmFormatModifierTilingFeatures = LAYOUT.byteOffset(PATH$drmFormatModifierTilingFeatures);
}
