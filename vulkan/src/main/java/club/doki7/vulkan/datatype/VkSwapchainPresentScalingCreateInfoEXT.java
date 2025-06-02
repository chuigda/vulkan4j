package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSwapchainPresentScalingCreateInfoEXT.html"><code>VkSwapchainPresentScalingCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSwapchainPresentScalingCreateInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkPresentScalingFlagsEXT scalingBehavior; // optional // @link substring="VkPresentScalingFlagsEXT" target="VkPresentScalingFlagsEXT" @link substring="scalingBehavior" target="#scalingBehavior"
///     VkPresentGravityFlagsEXT presentGravityX; // optional // @link substring="VkPresentGravityFlagsEXT" target="VkPresentGravityFlagsEXT" @link substring="presentGravityX" target="#presentGravityX"
///     VkPresentGravityFlagsEXT presentGravityY; // optional // @link substring="VkPresentGravityFlagsEXT" target="VkPresentGravityFlagsEXT" @link substring="presentGravityY" target="#presentGravityY"
/// } VkSwapchainPresentScalingCreateInfoEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT`
///
/// The {@code allocate} ({@link VkSwapchainPresentScalingCreateInfoEXT#allocate(Arena)}, {@link VkSwapchainPresentScalingCreateInfoEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkSwapchainPresentScalingCreateInfoEXT#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSwapchainPresentScalingCreateInfoEXT.html"><code>VkSwapchainPresentScalingCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSwapchainPresentScalingCreateInfoEXT(@NotNull MemorySegment segment) implements IVkSwapchainPresentScalingCreateInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSwapchainPresentScalingCreateInfoEXT.html"><code>VkSwapchainPresentScalingCreateInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkSwapchainPresentScalingCreateInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkSwapchainPresentScalingCreateInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkSwapchainPresentScalingCreateInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkSwapchainPresentScalingCreateInfoEXT, Iterable<VkSwapchainPresentScalingCreateInfoEXT> {
        public long size() {
            return segment.byteSize() / VkSwapchainPresentScalingCreateInfoEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkSwapchainPresentScalingCreateInfoEXT at(long index) {
            return new VkSwapchainPresentScalingCreateInfoEXT(segment.asSlice(index * VkSwapchainPresentScalingCreateInfoEXT.BYTES, VkSwapchainPresentScalingCreateInfoEXT.BYTES));
        }

        public void write(long index, @NotNull VkSwapchainPresentScalingCreateInfoEXT value) {
            MemorySegment s = segment.asSlice(index * VkSwapchainPresentScalingCreateInfoEXT.BYTES, VkSwapchainPresentScalingCreateInfoEXT.BYTES);
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
        public @NotNull Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * VkSwapchainPresentScalingCreateInfoEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkSwapchainPresentScalingCreateInfoEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkSwapchainPresentScalingCreateInfoEXT.BYTES,
                (end - start) * VkSwapchainPresentScalingCreateInfoEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkSwapchainPresentScalingCreateInfoEXT.BYTES));
        }

        public VkSwapchainPresentScalingCreateInfoEXT[] toArray() {
            VkSwapchainPresentScalingCreateInfoEXT[] ret = new VkSwapchainPresentScalingCreateInfoEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iter iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        public static final class Iter implements Iterator<VkSwapchainPresentScalingCreateInfoEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkSwapchainPresentScalingCreateInfoEXT.BYTES;
            }

            @Override
            public VkSwapchainPresentScalingCreateInfoEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkSwapchainPresentScalingCreateInfoEXT ret = new VkSwapchainPresentScalingCreateInfoEXT(segment.asSlice(0, VkSwapchainPresentScalingCreateInfoEXT.BYTES));
                segment = segment.asSlice(VkSwapchainPresentScalingCreateInfoEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkSwapchainPresentScalingCreateInfoEXT allocate(Arena arena) {
        VkSwapchainPresentScalingCreateInfoEXT ret = new VkSwapchainPresentScalingCreateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT);
        return ret;
    }

    public static VkSwapchainPresentScalingCreateInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSwapchainPresentScalingCreateInfoEXT.Ptr ret = new VkSwapchainPresentScalingCreateInfoEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static VkSwapchainPresentScalingCreateInfoEXT clone(Arena arena, VkSwapchainPresentScalingCreateInfoEXT src) {
        VkSwapchainPresentScalingCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT);
    }

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public VkSwapchainPresentScalingCreateInfoEXT sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
        return this;
    }

    public @Pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public VkSwapchainPresentScalingCreateInfoEXT pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(VkPresentScalingFlagsEXT.class) int scalingBehavior() {
        return segment.get(LAYOUT$scalingBehavior, OFFSET$scalingBehavior);
    }

    public VkSwapchainPresentScalingCreateInfoEXT scalingBehavior(@EnumType(VkPresentScalingFlagsEXT.class) int value) {
        segment.set(LAYOUT$scalingBehavior, OFFSET$scalingBehavior, value);
        return this;
    }

    public @EnumType(VkPresentGravityFlagsEXT.class) int presentGravityX() {
        return segment.get(LAYOUT$presentGravityX, OFFSET$presentGravityX);
    }

    public VkSwapchainPresentScalingCreateInfoEXT presentGravityX(@EnumType(VkPresentGravityFlagsEXT.class) int value) {
        segment.set(LAYOUT$presentGravityX, OFFSET$presentGravityX, value);
        return this;
    }

    public @EnumType(VkPresentGravityFlagsEXT.class) int presentGravityY() {
        return segment.get(LAYOUT$presentGravityY, OFFSET$presentGravityY);
    }

    public VkSwapchainPresentScalingCreateInfoEXT presentGravityY(@EnumType(VkPresentGravityFlagsEXT.class) int value) {
        segment.set(LAYOUT$presentGravityY, OFFSET$presentGravityY, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("scalingBehavior"),
        ValueLayout.JAVA_INT.withName("presentGravityX"),
        ValueLayout.JAVA_INT.withName("presentGravityY")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$scalingBehavior = PathElement.groupElement("scalingBehavior");
    public static final PathElement PATH$presentGravityX = PathElement.groupElement("presentGravityX");
    public static final PathElement PATH$presentGravityY = PathElement.groupElement("presentGravityY");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$scalingBehavior = (OfInt) LAYOUT.select(PATH$scalingBehavior);
    public static final OfInt LAYOUT$presentGravityX = (OfInt) LAYOUT.select(PATH$presentGravityX);
    public static final OfInt LAYOUT$presentGravityY = (OfInt) LAYOUT.select(PATH$presentGravityY);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$scalingBehavior = LAYOUT$scalingBehavior.byteSize();
    public static final long SIZE$presentGravityX = LAYOUT$presentGravityX.byteSize();
    public static final long SIZE$presentGravityY = LAYOUT$presentGravityY.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$scalingBehavior = LAYOUT.byteOffset(PATH$scalingBehavior);
    public static final long OFFSET$presentGravityX = LAYOUT.byteOffset(PATH$presentGravityX);
    public static final long OFFSET$presentGravityY = LAYOUT.byteOffset(PATH$presentGravityY);
}
