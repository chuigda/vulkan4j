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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPresentRegionKHR.html"><code>VkPresentRegionKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPresentRegionKHR {
///     uint32_t rectangleCount; // optional // @link substring="rectangleCount" target="#rectangleCount"
///     VkRectLayerKHR const* pRectangles; // optional // @link substring="VkRectLayerKHR" target="VkRectLayerKHR" @link substring="pRectangles" target="#pRectangles"
/// } VkPresentRegionKHR;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPresentRegionKHR.html"><code>VkPresentRegionKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPresentRegionKHR(@NotNull MemorySegment segment) implements IVkPresentRegionKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPresentRegionKHR.html"><code>VkPresentRegionKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPresentRegionKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPresentRegionKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPresentRegionKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPresentRegionKHR {
        public long size() {
            return segment.byteSize() / VkPresentRegionKHR.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPresentRegionKHR at(long index) {
            return new VkPresentRegionKHR(segment.asSlice(index * VkPresentRegionKHR.BYTES, VkPresentRegionKHR.BYTES));
        }
        public void write(long index, @NotNull VkPresentRegionKHR value) {
            MemorySegment s = segment.asSlice(index * VkPresentRegionKHR.BYTES, VkPresentRegionKHR.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkPresentRegionKHR allocate(Arena arena) {
        return new VkPresentRegionKHR(arena.allocate(LAYOUT));
    }

    public static VkPresentRegionKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPresentRegionKHR.Ptr ret = new VkPresentRegionKHR.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkPresentRegionKHR clone(Arena arena, VkPresentRegionKHR src) {
        VkPresentRegionKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned int rectangleCount() {
        return segment.get(LAYOUT$rectangleCount, OFFSET$rectangleCount);
    }

    public void rectangleCount(@unsigned int value) {
        segment.set(LAYOUT$rectangleCount, OFFSET$rectangleCount, value);
    }

    public @Nullable VkRectLayerKHR pRectangles() {
        MemorySegment s = pRectanglesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkRectLayerKHR(s);
    }

    public void pRectangles(@Nullable VkRectLayerKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRectanglesRaw(s);
    }

    @unsafe public @Nullable VkRectLayerKHR[] pRectangles(int assumedCount) {
        MemorySegment s = pRectanglesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkRectLayerKHR.BYTES);
        VkRectLayerKHR[] ret = new VkRectLayerKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkRectLayerKHR(s.asSlice(i * VkRectLayerKHR.BYTES, VkRectLayerKHR.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkRectLayerKHR.class) MemorySegment pRectanglesRaw() {
        return segment.get(LAYOUT$pRectangles, OFFSET$pRectangles);
    }

    public void pRectanglesRaw(@pointer(target=VkRectLayerKHR.class) MemorySegment value) {
        segment.set(LAYOUT$pRectangles, OFFSET$pRectangles, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("rectangleCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRectLayerKHR.LAYOUT).withName("pRectangles")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$rectangleCount = PathElement.groupElement("rectangleCount");
    public static final PathElement PATH$pRectangles = PathElement.groupElement("pRectangles");

    public static final OfInt LAYOUT$rectangleCount = (OfInt) LAYOUT.select(PATH$rectangleCount);
    public static final AddressLayout LAYOUT$pRectangles = (AddressLayout) LAYOUT.select(PATH$pRectangles);

    public static final long SIZE$rectangleCount = LAYOUT$rectangleCount.byteSize();
    public static final long SIZE$pRectangles = LAYOUT$pRectangles.byteSize();

    public static final long OFFSET$rectangleCount = LAYOUT.byteOffset(PATH$rectangleCount);
    public static final long OFFSET$pRectangles = LAYOUT.byteOffset(PATH$pRectangles);
}
