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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFormatProperties.html"><code>VkFormatProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkFormatProperties {
///     VkFormatFeatureFlags linearTilingFeatures; // optional // @link substring="VkFormatFeatureFlags" target="VkFormatFeatureFlags" @link substring="linearTilingFeatures" target="#linearTilingFeatures"
///     VkFormatFeatureFlags optimalTilingFeatures; // optional // @link substring="VkFormatFeatureFlags" target="VkFormatFeatureFlags" @link substring="optimalTilingFeatures" target="#optimalTilingFeatures"
///     VkFormatFeatureFlags bufferFeatures; // optional // @link substring="VkFormatFeatureFlags" target="VkFormatFeatureFlags" @link substring="bufferFeatures" target="#bufferFeatures"
/// } VkFormatProperties;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFormatProperties.html"><code>VkFormatProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkFormatProperties(@NotNull MemorySegment segment) implements IPointer {
    public static VkFormatProperties allocate(Arena arena) {
        return new VkFormatProperties(arena.allocate(LAYOUT));
    }

    public static VkFormatProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkFormatProperties[] ret = new VkFormatProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkFormatProperties(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkFormatProperties clone(Arena arena, VkFormatProperties src) {
        VkFormatProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkFormatProperties[] clone(Arena arena, VkFormatProperties[] src) {
        VkFormatProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @enumtype(VkFormatFeatureFlags.class) int linearTilingFeatures() {
        return segment.get(LAYOUT$linearTilingFeatures, OFFSET$linearTilingFeatures);
    }

    public void linearTilingFeatures(@enumtype(VkFormatFeatureFlags.class) int value) {
        segment.set(LAYOUT$linearTilingFeatures, OFFSET$linearTilingFeatures, value);
    }

    public @enumtype(VkFormatFeatureFlags.class) int optimalTilingFeatures() {
        return segment.get(LAYOUT$optimalTilingFeatures, OFFSET$optimalTilingFeatures);
    }

    public void optimalTilingFeatures(@enumtype(VkFormatFeatureFlags.class) int value) {
        segment.set(LAYOUT$optimalTilingFeatures, OFFSET$optimalTilingFeatures, value);
    }

    public @enumtype(VkFormatFeatureFlags.class) int bufferFeatures() {
        return segment.get(LAYOUT$bufferFeatures, OFFSET$bufferFeatures);
    }

    public void bufferFeatures(@enumtype(VkFormatFeatureFlags.class) int value) {
        segment.set(LAYOUT$bufferFeatures, OFFSET$bufferFeatures, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("linearTilingFeatures"),
        ValueLayout.JAVA_INT.withName("optimalTilingFeatures"),
        ValueLayout.JAVA_INT.withName("bufferFeatures")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$linearTilingFeatures = PathElement.groupElement("linearTilingFeatures");
    public static final PathElement PATH$optimalTilingFeatures = PathElement.groupElement("optimalTilingFeatures");
    public static final PathElement PATH$bufferFeatures = PathElement.groupElement("bufferFeatures");

    public static final OfInt LAYOUT$linearTilingFeatures = (OfInt) LAYOUT.select(PATH$linearTilingFeatures);
    public static final OfInt LAYOUT$optimalTilingFeatures = (OfInt) LAYOUT.select(PATH$optimalTilingFeatures);
    public static final OfInt LAYOUT$bufferFeatures = (OfInt) LAYOUT.select(PATH$bufferFeatures);

    public static final long SIZE$linearTilingFeatures = LAYOUT$linearTilingFeatures.byteSize();
    public static final long SIZE$optimalTilingFeatures = LAYOUT$optimalTilingFeatures.byteSize();
    public static final long SIZE$bufferFeatures = LAYOUT$bufferFeatures.byteSize();

    public static final long OFFSET$linearTilingFeatures = LAYOUT.byteOffset(PATH$linearTilingFeatures);
    public static final long OFFSET$optimalTilingFeatures = LAYOUT.byteOffset(PATH$optimalTilingFeatures);
    public static final long OFFSET$bufferFeatures = LAYOUT.byteOffset(PATH$bufferFeatures);
}
