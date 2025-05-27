package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubpassDependency.html"><code>VkSubpassDependency</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSubpassDependency {
///     uint32_t srcSubpass; // @link substring="srcSubpass" target="#srcSubpass"
///     uint32_t dstSubpass; // @link substring="dstSubpass" target="#dstSubpass"
///     VkPipelineStageFlags srcStageMask; // optional // @link substring="VkPipelineStageFlags" target="VkPipelineStageFlags" @link substring="srcStageMask" target="#srcStageMask"
///     VkPipelineStageFlags dstStageMask; // optional // @link substring="VkPipelineStageFlags" target="VkPipelineStageFlags" @link substring="dstStageMask" target="#dstStageMask"
///     VkAccessFlags srcAccessMask; // optional // @link substring="VkAccessFlags" target="VkAccessFlags" @link substring="srcAccessMask" target="#srcAccessMask"
///     VkAccessFlags dstAccessMask; // optional // @link substring="VkAccessFlags" target="VkAccessFlags" @link substring="dstAccessMask" target="#dstAccessMask"
///     VkDependencyFlags dependencyFlags; // optional // @link substring="VkDependencyFlags" target="VkDependencyFlags" @link substring="dependencyFlags" target="#dependencyFlags"
/// } VkSubpassDependency;
/// }
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubpassDependency.html"><code>VkSubpassDependency</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSubpassDependency(@NotNull MemorySegment segment) implements IVkSubpassDependency {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubpassDependency.html"><code>VkSubpassDependency</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkSubpassDependency}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkSubpassDependency to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkSubpassDependency.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkSubpassDependency, Iterable<VkSubpassDependency> {
        public long size() {
            return segment.byteSize() / VkSubpassDependency.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkSubpassDependency at(long index) {
            return new VkSubpassDependency(segment.asSlice(index * VkSubpassDependency.BYTES, VkSubpassDependency.BYTES));
        }

        public void write(long index, @NotNull VkSubpassDependency value) {
            MemorySegment s = segment.asSlice(index * VkSubpassDependency.BYTES, VkSubpassDependency.BYTES);
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
            return new Ptr(segment.asSlice(index * VkSubpassDependency.BYTES, VkSubpassDependency.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkSubpassDependency.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkSubpassDependency.BYTES,
                (end - start) * VkSubpassDependency.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkSubpassDependency.BYTES));
        }

        public VkSubpassDependency[] toArray() {
            VkSubpassDependency[] ret = new VkSubpassDependency[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iter iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures in this pointer.
        public static final class Iter implements Iterator<VkSubpassDependency> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return (segment.byteSize() / VkSubpassDependency.BYTES) > 0;
            }

            @Override
            public VkSubpassDependency next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkSubpassDependency ret = new VkSubpassDependency(segment.asSlice(0, VkSubpassDependency.BYTES));
                segment = segment.asSlice(VkSubpassDependency.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkSubpassDependency allocate(Arena arena) {
        return new VkSubpassDependency(arena.allocate(LAYOUT));
    }

    public static VkSubpassDependency.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VkSubpassDependency.Ptr(segment);
    }

    public static VkSubpassDependency clone(Arena arena, VkSubpassDependency src) {
        VkSubpassDependency ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Unsigned int srcSubpass() {
        return segment.get(LAYOUT$srcSubpass, OFFSET$srcSubpass);
    }

    public void srcSubpass(@Unsigned int value) {
        segment.set(LAYOUT$srcSubpass, OFFSET$srcSubpass, value);
    }

    public @Unsigned int dstSubpass() {
        return segment.get(LAYOUT$dstSubpass, OFFSET$dstSubpass);
    }

    public void dstSubpass(@Unsigned int value) {
        segment.set(LAYOUT$dstSubpass, OFFSET$dstSubpass, value);
    }

    public @EnumType(VkPipelineStageFlags.class) int srcStageMask() {
        return segment.get(LAYOUT$srcStageMask, OFFSET$srcStageMask);
    }

    public void srcStageMask(@EnumType(VkPipelineStageFlags.class) int value) {
        segment.set(LAYOUT$srcStageMask, OFFSET$srcStageMask, value);
    }

    public @EnumType(VkPipelineStageFlags.class) int dstStageMask() {
        return segment.get(LAYOUT$dstStageMask, OFFSET$dstStageMask);
    }

    public void dstStageMask(@EnumType(VkPipelineStageFlags.class) int value) {
        segment.set(LAYOUT$dstStageMask, OFFSET$dstStageMask, value);
    }

    public @EnumType(VkAccessFlags.class) int srcAccessMask() {
        return segment.get(LAYOUT$srcAccessMask, OFFSET$srcAccessMask);
    }

    public void srcAccessMask(@EnumType(VkAccessFlags.class) int value) {
        segment.set(LAYOUT$srcAccessMask, OFFSET$srcAccessMask, value);
    }

    public @EnumType(VkAccessFlags.class) int dstAccessMask() {
        return segment.get(LAYOUT$dstAccessMask, OFFSET$dstAccessMask);
    }

    public void dstAccessMask(@EnumType(VkAccessFlags.class) int value) {
        segment.set(LAYOUT$dstAccessMask, OFFSET$dstAccessMask, value);
    }

    public @EnumType(VkDependencyFlags.class) int dependencyFlags() {
        return segment.get(LAYOUT$dependencyFlags, OFFSET$dependencyFlags);
    }

    public void dependencyFlags(@EnumType(VkDependencyFlags.class) int value) {
        segment.set(LAYOUT$dependencyFlags, OFFSET$dependencyFlags, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("srcSubpass"),
        ValueLayout.JAVA_INT.withName("dstSubpass"),
        ValueLayout.JAVA_INT.withName("srcStageMask"),
        ValueLayout.JAVA_INT.withName("dstStageMask"),
        ValueLayout.JAVA_INT.withName("srcAccessMask"),
        ValueLayout.JAVA_INT.withName("dstAccessMask"),
        ValueLayout.JAVA_INT.withName("dependencyFlags")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$srcSubpass = PathElement.groupElement("srcSubpass");
    public static final PathElement PATH$dstSubpass = PathElement.groupElement("dstSubpass");
    public static final PathElement PATH$srcStageMask = PathElement.groupElement("srcStageMask");
    public static final PathElement PATH$dstStageMask = PathElement.groupElement("dstStageMask");
    public static final PathElement PATH$srcAccessMask = PathElement.groupElement("srcAccessMask");
    public static final PathElement PATH$dstAccessMask = PathElement.groupElement("dstAccessMask");
    public static final PathElement PATH$dependencyFlags = PathElement.groupElement("dependencyFlags");

    public static final OfInt LAYOUT$srcSubpass = (OfInt) LAYOUT.select(PATH$srcSubpass);
    public static final OfInt LAYOUT$dstSubpass = (OfInt) LAYOUT.select(PATH$dstSubpass);
    public static final OfInt LAYOUT$srcStageMask = (OfInt) LAYOUT.select(PATH$srcStageMask);
    public static final OfInt LAYOUT$dstStageMask = (OfInt) LAYOUT.select(PATH$dstStageMask);
    public static final OfInt LAYOUT$srcAccessMask = (OfInt) LAYOUT.select(PATH$srcAccessMask);
    public static final OfInt LAYOUT$dstAccessMask = (OfInt) LAYOUT.select(PATH$dstAccessMask);
    public static final OfInt LAYOUT$dependencyFlags = (OfInt) LAYOUT.select(PATH$dependencyFlags);

    public static final long SIZE$srcSubpass = LAYOUT$srcSubpass.byteSize();
    public static final long SIZE$dstSubpass = LAYOUT$dstSubpass.byteSize();
    public static final long SIZE$srcStageMask = LAYOUT$srcStageMask.byteSize();
    public static final long SIZE$dstStageMask = LAYOUT$dstStageMask.byteSize();
    public static final long SIZE$srcAccessMask = LAYOUT$srcAccessMask.byteSize();
    public static final long SIZE$dstAccessMask = LAYOUT$dstAccessMask.byteSize();
    public static final long SIZE$dependencyFlags = LAYOUT$dependencyFlags.byteSize();

    public static final long OFFSET$srcSubpass = LAYOUT.byteOffset(PATH$srcSubpass);
    public static final long OFFSET$dstSubpass = LAYOUT.byteOffset(PATH$dstSubpass);
    public static final long OFFSET$srcStageMask = LAYOUT.byteOffset(PATH$srcStageMask);
    public static final long OFFSET$dstStageMask = LAYOUT.byteOffset(PATH$dstStageMask);
    public static final long OFFSET$srcAccessMask = LAYOUT.byteOffset(PATH$srcAccessMask);
    public static final long OFFSET$dstAccessMask = LAYOUT.byteOffset(PATH$dstAccessMask);
    public static final long OFFSET$dependencyFlags = LAYOUT.byteOffset(PATH$dependencyFlags);
}
