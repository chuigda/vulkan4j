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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayPlaneCapabilitiesKHR.html"><code>VkDisplayPlaneCapabilitiesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDisplayPlaneCapabilitiesKHR {
///     VkDisplayPlaneAlphaFlagsKHR supportedAlpha; // optional // @link substring="VkDisplayPlaneAlphaFlagsKHR" target="VkDisplayPlaneAlphaFlagsKHR" @link substring="supportedAlpha" target="#supportedAlpha"
///     VkOffset2D minSrcPosition; // @link substring="VkOffset2D" target="VkOffset2D" @link substring="minSrcPosition" target="#minSrcPosition"
///     VkOffset2D maxSrcPosition; // @link substring="VkOffset2D" target="VkOffset2D" @link substring="maxSrcPosition" target="#maxSrcPosition"
///     VkExtent2D minSrcExtent; // @link substring="VkExtent2D" target="VkExtent2D" @link substring="minSrcExtent" target="#minSrcExtent"
///     VkExtent2D maxSrcExtent; // @link substring="VkExtent2D" target="VkExtent2D" @link substring="maxSrcExtent" target="#maxSrcExtent"
///     VkOffset2D minDstPosition; // @link substring="VkOffset2D" target="VkOffset2D" @link substring="minDstPosition" target="#minDstPosition"
///     VkOffset2D maxDstPosition; // @link substring="VkOffset2D" target="VkOffset2D" @link substring="maxDstPosition" target="#maxDstPosition"
///     VkExtent2D minDstExtent; // @link substring="VkExtent2D" target="VkExtent2D" @link substring="minDstExtent" target="#minDstExtent"
///     VkExtent2D maxDstExtent; // @link substring="VkExtent2D" target="VkExtent2D" @link substring="maxDstExtent" target="#maxDstExtent"
/// } VkDisplayPlaneCapabilitiesKHR;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayPlaneCapabilitiesKHR.html"><code>VkDisplayPlaneCapabilitiesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDisplayPlaneCapabilitiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkDisplayPlaneCapabilitiesKHR allocate(Arena arena) {
        return new VkDisplayPlaneCapabilitiesKHR(arena.allocate(LAYOUT));
    }

    public static VkDisplayPlaneCapabilitiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayPlaneCapabilitiesKHR[] ret = new VkDisplayPlaneCapabilitiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDisplayPlaneCapabilitiesKHR(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkDisplayPlaneCapabilitiesKHR clone(Arena arena, VkDisplayPlaneCapabilitiesKHR src) {
        VkDisplayPlaneCapabilitiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDisplayPlaneCapabilitiesKHR[] clone(Arena arena, VkDisplayPlaneCapabilitiesKHR[] src) {
        VkDisplayPlaneCapabilitiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @enumtype(VkDisplayPlaneAlphaFlagsKHR.class) int supportedAlpha() {
        return segment.get(LAYOUT$supportedAlpha, OFFSET$supportedAlpha);
    }

    public void supportedAlpha(@enumtype(VkDisplayPlaneAlphaFlagsKHR.class) int value) {
        segment.set(LAYOUT$supportedAlpha, OFFSET$supportedAlpha, value);
    }

    public @NotNull VkOffset2D minSrcPosition() {
        return new VkOffset2D(segment.asSlice(OFFSET$minSrcPosition, LAYOUT$minSrcPosition));
    }

    public void minSrcPosition(@NotNull VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minSrcPosition, SIZE$minSrcPosition);
    }

    public @NotNull VkOffset2D maxSrcPosition() {
        return new VkOffset2D(segment.asSlice(OFFSET$maxSrcPosition, LAYOUT$maxSrcPosition));
    }

    public void maxSrcPosition(@NotNull VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxSrcPosition, SIZE$maxSrcPosition);
    }

    public @NotNull VkExtent2D minSrcExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$minSrcExtent, LAYOUT$minSrcExtent));
    }

    public void minSrcExtent(@NotNull VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minSrcExtent, SIZE$minSrcExtent);
    }

    public @NotNull VkExtent2D maxSrcExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxSrcExtent, LAYOUT$maxSrcExtent));
    }

    public void maxSrcExtent(@NotNull VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxSrcExtent, SIZE$maxSrcExtent);
    }

    public @NotNull VkOffset2D minDstPosition() {
        return new VkOffset2D(segment.asSlice(OFFSET$minDstPosition, LAYOUT$minDstPosition));
    }

    public void minDstPosition(@NotNull VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minDstPosition, SIZE$minDstPosition);
    }

    public @NotNull VkOffset2D maxDstPosition() {
        return new VkOffset2D(segment.asSlice(OFFSET$maxDstPosition, LAYOUT$maxDstPosition));
    }

    public void maxDstPosition(@NotNull VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxDstPosition, SIZE$maxDstPosition);
    }

    public @NotNull VkExtent2D minDstExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$minDstExtent, LAYOUT$minDstExtent));
    }

    public void minDstExtent(@NotNull VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minDstExtent, SIZE$minDstExtent);
    }

    public @NotNull VkExtent2D maxDstExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxDstExtent, LAYOUT$maxDstExtent));
    }

    public void maxDstExtent(@NotNull VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxDstExtent, SIZE$maxDstExtent);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("supportedAlpha"),
        VkOffset2D.LAYOUT.withName("minSrcPosition"),
        VkOffset2D.LAYOUT.withName("maxSrcPosition"),
        VkExtent2D.LAYOUT.withName("minSrcExtent"),
        VkExtent2D.LAYOUT.withName("maxSrcExtent"),
        VkOffset2D.LAYOUT.withName("minDstPosition"),
        VkOffset2D.LAYOUT.withName("maxDstPosition"),
        VkExtent2D.LAYOUT.withName("minDstExtent"),
        VkExtent2D.LAYOUT.withName("maxDstExtent")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$supportedAlpha = PathElement.groupElement("PATH$supportedAlpha");
    public static final PathElement PATH$minSrcPosition = PathElement.groupElement("PATH$minSrcPosition");
    public static final PathElement PATH$maxSrcPosition = PathElement.groupElement("PATH$maxSrcPosition");
    public static final PathElement PATH$minSrcExtent = PathElement.groupElement("PATH$minSrcExtent");
    public static final PathElement PATH$maxSrcExtent = PathElement.groupElement("PATH$maxSrcExtent");
    public static final PathElement PATH$minDstPosition = PathElement.groupElement("PATH$minDstPosition");
    public static final PathElement PATH$maxDstPosition = PathElement.groupElement("PATH$maxDstPosition");
    public static final PathElement PATH$minDstExtent = PathElement.groupElement("PATH$minDstExtent");
    public static final PathElement PATH$maxDstExtent = PathElement.groupElement("PATH$maxDstExtent");

    public static final OfInt LAYOUT$supportedAlpha = (OfInt) LAYOUT.select(PATH$supportedAlpha);
    public static final StructLayout LAYOUT$minSrcPosition = (StructLayout) LAYOUT.select(PATH$minSrcPosition);
    public static final StructLayout LAYOUT$maxSrcPosition = (StructLayout) LAYOUT.select(PATH$maxSrcPosition);
    public static final StructLayout LAYOUT$minSrcExtent = (StructLayout) LAYOUT.select(PATH$minSrcExtent);
    public static final StructLayout LAYOUT$maxSrcExtent = (StructLayout) LAYOUT.select(PATH$maxSrcExtent);
    public static final StructLayout LAYOUT$minDstPosition = (StructLayout) LAYOUT.select(PATH$minDstPosition);
    public static final StructLayout LAYOUT$maxDstPosition = (StructLayout) LAYOUT.select(PATH$maxDstPosition);
    public static final StructLayout LAYOUT$minDstExtent = (StructLayout) LAYOUT.select(PATH$minDstExtent);
    public static final StructLayout LAYOUT$maxDstExtent = (StructLayout) LAYOUT.select(PATH$maxDstExtent);

    public static final long SIZE$supportedAlpha = LAYOUT$supportedAlpha.byteSize();
    public static final long SIZE$minSrcPosition = LAYOUT$minSrcPosition.byteSize();
    public static final long SIZE$maxSrcPosition = LAYOUT$maxSrcPosition.byteSize();
    public static final long SIZE$minSrcExtent = LAYOUT$minSrcExtent.byteSize();
    public static final long SIZE$maxSrcExtent = LAYOUT$maxSrcExtent.byteSize();
    public static final long SIZE$minDstPosition = LAYOUT$minDstPosition.byteSize();
    public static final long SIZE$maxDstPosition = LAYOUT$maxDstPosition.byteSize();
    public static final long SIZE$minDstExtent = LAYOUT$minDstExtent.byteSize();
    public static final long SIZE$maxDstExtent = LAYOUT$maxDstExtent.byteSize();

    public static final long OFFSET$supportedAlpha = LAYOUT.byteOffset(PATH$supportedAlpha);
    public static final long OFFSET$minSrcPosition = LAYOUT.byteOffset(PATH$minSrcPosition);
    public static final long OFFSET$maxSrcPosition = LAYOUT.byteOffset(PATH$maxSrcPosition);
    public static final long OFFSET$minSrcExtent = LAYOUT.byteOffset(PATH$minSrcExtent);
    public static final long OFFSET$maxSrcExtent = LAYOUT.byteOffset(PATH$maxSrcExtent);
    public static final long OFFSET$minDstPosition = LAYOUT.byteOffset(PATH$minDstPosition);
    public static final long OFFSET$maxDstPosition = LAYOUT.byteOffset(PATH$maxDstPosition);
    public static final long OFFSET$minDstExtent = LAYOUT.byteOffset(PATH$minDstExtent);
    public static final long OFFSET$maxDstExtent = LAYOUT.byteOffset(PATH$maxDstExtent);
}
