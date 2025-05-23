package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkShaderStatisticsInfoAMD.html"><code>VkShaderStatisticsInfoAMD</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkShaderStatisticsInfoAMD {
///     VkShaderStageFlags shaderStageMask; // @link substring="VkShaderStageFlags" target="VkShaderStageFlags" @link substring="shaderStageMask" target="#shaderStageMask"
///     VkShaderResourceUsageAMD resourceUsage; // @link substring="VkShaderResourceUsageAMD" target="VkShaderResourceUsageAMD" @link substring="resourceUsage" target="#resourceUsage"
///     uint32_t numPhysicalVgprs; // @link substring="numPhysicalVgprs" target="#numPhysicalVgprs"
///     uint32_t numPhysicalSgprs; // @link substring="numPhysicalSgprs" target="#numPhysicalSgprs"
///     uint32_t numAvailableVgprs; // @link substring="numAvailableVgprs" target="#numAvailableVgprs"
///     uint32_t numAvailableSgprs; // @link substring="numAvailableSgprs" target="#numAvailableSgprs"
///     uint32_t computeWorkGroupSize; // @link substring="computeWorkGroupSize" target="#computeWorkGroupSize"
/// } VkShaderStatisticsInfoAMD;
/// }
///
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkShaderStatisticsInfoAMD.html"><code>VkShaderStatisticsInfoAMD</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkShaderStatisticsInfoAMD(@NotNull MemorySegment segment) implements IVkShaderStatisticsInfoAMD {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkShaderStatisticsInfoAMD.html"><code>VkShaderStatisticsInfoAMD</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkShaderStatisticsInfoAMD}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkShaderStatisticsInfoAMD to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkShaderStatisticsInfoAMD.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkShaderStatisticsInfoAMD {
        public long size() {
            return segment.byteSize() / VkShaderStatisticsInfoAMD.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkShaderStatisticsInfoAMD at(long index) {
            return new VkShaderStatisticsInfoAMD(segment.asSlice(index * VkShaderStatisticsInfoAMD.BYTES, VkShaderStatisticsInfoAMD.BYTES));
        }

        public void write(long index, @NotNull VkShaderStatisticsInfoAMD value) {
            MemorySegment s = segment.asSlice(index * VkShaderStatisticsInfoAMD.BYTES, VkShaderStatisticsInfoAMD.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkShaderStatisticsInfoAMD.BYTES, VkShaderStatisticsInfoAMD.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkShaderStatisticsInfoAMD.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkShaderStatisticsInfoAMD.BYTES,
                (end - start) * VkShaderStatisticsInfoAMD.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkShaderStatisticsInfoAMD.BYTES));
        }

        public VkShaderStatisticsInfoAMD[] toArray() {
            VkShaderStatisticsInfoAMD[] ret = new VkShaderStatisticsInfoAMD[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkShaderStatisticsInfoAMD allocate(Arena arena) {
        return new VkShaderStatisticsInfoAMD(arena.allocate(LAYOUT));
    }

    public static VkShaderStatisticsInfoAMD.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VkShaderStatisticsInfoAMD.Ptr(segment);
    }

    public static VkShaderStatisticsInfoAMD clone(Arena arena, VkShaderStatisticsInfoAMD src) {
        VkShaderStatisticsInfoAMD ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(VkShaderStageFlags.class) int shaderStageMask() {
        return segment.get(LAYOUT$shaderStageMask, OFFSET$shaderStageMask);
    }

    public void shaderStageMask(@EnumType(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$shaderStageMask, OFFSET$shaderStageMask, value);
    }

    public @NotNull VkShaderResourceUsageAMD resourceUsage() {
        return new VkShaderResourceUsageAMD(segment.asSlice(OFFSET$resourceUsage, LAYOUT$resourceUsage));
    }

    public void resourceUsage(@NotNull VkShaderResourceUsageAMD value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$resourceUsage, SIZE$resourceUsage);
    }

    public @Unsigned int numPhysicalVgprs() {
        return segment.get(LAYOUT$numPhysicalVgprs, OFFSET$numPhysicalVgprs);
    }

    public void numPhysicalVgprs(@Unsigned int value) {
        segment.set(LAYOUT$numPhysicalVgprs, OFFSET$numPhysicalVgprs, value);
    }

    public @Unsigned int numPhysicalSgprs() {
        return segment.get(LAYOUT$numPhysicalSgprs, OFFSET$numPhysicalSgprs);
    }

    public void numPhysicalSgprs(@Unsigned int value) {
        segment.set(LAYOUT$numPhysicalSgprs, OFFSET$numPhysicalSgprs, value);
    }

    public @Unsigned int numAvailableVgprs() {
        return segment.get(LAYOUT$numAvailableVgprs, OFFSET$numAvailableVgprs);
    }

    public void numAvailableVgprs(@Unsigned int value) {
        segment.set(LAYOUT$numAvailableVgprs, OFFSET$numAvailableVgprs, value);
    }

    public @Unsigned int numAvailableSgprs() {
        return segment.get(LAYOUT$numAvailableSgprs, OFFSET$numAvailableSgprs);
    }

    public void numAvailableSgprs(@Unsigned int value) {
        segment.set(LAYOUT$numAvailableSgprs, OFFSET$numAvailableSgprs, value);
    }

    public @Unsigned int computeWorkGroupSize() {
        return segment.get(LAYOUT$computeWorkGroupSize, OFFSET$computeWorkGroupSize);
    }

    public void computeWorkGroupSize(@Unsigned int value) {
        segment.set(LAYOUT$computeWorkGroupSize, OFFSET$computeWorkGroupSize, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("shaderStageMask"),
        VkShaderResourceUsageAMD.LAYOUT.withName("resourceUsage"),
        ValueLayout.JAVA_INT.withName("numPhysicalVgprs"),
        ValueLayout.JAVA_INT.withName("numPhysicalSgprs"),
        ValueLayout.JAVA_INT.withName("numAvailableVgprs"),
        ValueLayout.JAVA_INT.withName("numAvailableSgprs"),
        ValueLayout.JAVA_INT.withName("computeWorkGroupSize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$shaderStageMask = PathElement.groupElement("shaderStageMask");
    public static final PathElement PATH$resourceUsage = PathElement.groupElement("resourceUsage");
    public static final PathElement PATH$numPhysicalVgprs = PathElement.groupElement("numPhysicalVgprs");
    public static final PathElement PATH$numPhysicalSgprs = PathElement.groupElement("numPhysicalSgprs");
    public static final PathElement PATH$numAvailableVgprs = PathElement.groupElement("numAvailableVgprs");
    public static final PathElement PATH$numAvailableSgprs = PathElement.groupElement("numAvailableSgprs");
    public static final PathElement PATH$computeWorkGroupSize = PathElement.groupElement("computeWorkGroupSize");

    public static final OfInt LAYOUT$shaderStageMask = (OfInt) LAYOUT.select(PATH$shaderStageMask);
    public static final StructLayout LAYOUT$resourceUsage = (StructLayout) LAYOUT.select(PATH$resourceUsage);
    public static final OfInt LAYOUT$numPhysicalVgprs = (OfInt) LAYOUT.select(PATH$numPhysicalVgprs);
    public static final OfInt LAYOUT$numPhysicalSgprs = (OfInt) LAYOUT.select(PATH$numPhysicalSgprs);
    public static final OfInt LAYOUT$numAvailableVgprs = (OfInt) LAYOUT.select(PATH$numAvailableVgprs);
    public static final OfInt LAYOUT$numAvailableSgprs = (OfInt) LAYOUT.select(PATH$numAvailableSgprs);
    public static final OfInt LAYOUT$computeWorkGroupSize = (OfInt) LAYOUT.select(PATH$computeWorkGroupSize);

    public static final long SIZE$shaderStageMask = LAYOUT$shaderStageMask.byteSize();
    public static final long SIZE$resourceUsage = LAYOUT$resourceUsage.byteSize();
    public static final long SIZE$numPhysicalVgprs = LAYOUT$numPhysicalVgprs.byteSize();
    public static final long SIZE$numPhysicalSgprs = LAYOUT$numPhysicalSgprs.byteSize();
    public static final long SIZE$numAvailableVgprs = LAYOUT$numAvailableVgprs.byteSize();
    public static final long SIZE$numAvailableSgprs = LAYOUT$numAvailableSgprs.byteSize();
    public static final long SIZE$computeWorkGroupSize = LAYOUT$computeWorkGroupSize.byteSize();

    public static final long OFFSET$shaderStageMask = LAYOUT.byteOffset(PATH$shaderStageMask);
    public static final long OFFSET$resourceUsage = LAYOUT.byteOffset(PATH$resourceUsage);
    public static final long OFFSET$numPhysicalVgprs = LAYOUT.byteOffset(PATH$numPhysicalVgprs);
    public static final long OFFSET$numPhysicalSgprs = LAYOUT.byteOffset(PATH$numPhysicalSgprs);
    public static final long OFFSET$numAvailableVgprs = LAYOUT.byteOffset(PATH$numAvailableVgprs);
    public static final long OFFSET$numAvailableSgprs = LAYOUT.byteOffset(PATH$numAvailableSgprs);
    public static final long OFFSET$computeWorkGroupSize = LAYOUT.byteOffset(PATH$computeWorkGroupSize);
}
