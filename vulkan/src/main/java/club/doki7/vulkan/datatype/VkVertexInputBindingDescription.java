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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVertexInputBindingDescription.html"><code>VkVertexInputBindingDescription</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVertexInputBindingDescription {
///     uint32_t binding; // @link substring="binding" target="#binding"
///     uint32_t stride; // @link substring="stride" target="#stride"
///     VkVertexInputRate inputRate; // @link substring="VkVertexInputRate" target="VkVertexInputRate" @link substring="inputRate" target="#inputRate"
/// } VkVertexInputBindingDescription;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVertexInputBindingDescription.html"><code>VkVertexInputBindingDescription</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVertexInputBindingDescription(@NotNull MemorySegment segment) implements IVkVertexInputBindingDescription {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVertexInputBindingDescription.html"><code>VkVertexInputBindingDescription</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkVertexInputBindingDescription}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkVertexInputBindingDescription to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkVertexInputBindingDescription.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkVertexInputBindingDescription {
        public long size() {
            return segment.byteSize() / VkVertexInputBindingDescription.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkVertexInputBindingDescription at(long index) {
            return new VkVertexInputBindingDescription(segment.asSlice(index * VkVertexInputBindingDescription.BYTES, VkVertexInputBindingDescription.BYTES));
        }

        public void write(long index, @NotNull VkVertexInputBindingDescription value) {
            MemorySegment s = segment.asSlice(index * VkVertexInputBindingDescription.BYTES, VkVertexInputBindingDescription.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkVertexInputBindingDescription.BYTES, VkVertexInputBindingDescription.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkVertexInputBindingDescription.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkVertexInputBindingDescription.BYTES,
                (end - start) * VkVertexInputBindingDescription.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkVertexInputBindingDescription.BYTES));
        }

        public VkVertexInputBindingDescription[] toArray() {
            VkVertexInputBindingDescription[] ret = new VkVertexInputBindingDescription[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkVertexInputBindingDescription allocate(Arena arena) {
        return new VkVertexInputBindingDescription(arena.allocate(LAYOUT));
    }

    public static VkVertexInputBindingDescription.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VkVertexInputBindingDescription.Ptr(segment);
    }

    public static VkVertexInputBindingDescription clone(Arena arena, VkVertexInputBindingDescription src) {
        VkVertexInputBindingDescription ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned int binding() {
        return segment.get(LAYOUT$binding, OFFSET$binding);
    }

    public void binding(@unsigned int value) {
        segment.set(LAYOUT$binding, OFFSET$binding, value);
    }

    public @unsigned int stride() {
        return segment.get(LAYOUT$stride, OFFSET$stride);
    }

    public void stride(@unsigned int value) {
        segment.set(LAYOUT$stride, OFFSET$stride, value);
    }

    public @EnumType(VkVertexInputRate.class) int inputRate() {
        return segment.get(LAYOUT$inputRate, OFFSET$inputRate);
    }

    public void inputRate(@EnumType(VkVertexInputRate.class) int value) {
        segment.set(LAYOUT$inputRate, OFFSET$inputRate, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_INT.withName("inputRate")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$binding = PathElement.groupElement("binding");
    public static final PathElement PATH$stride = PathElement.groupElement("stride");
    public static final PathElement PATH$inputRate = PathElement.groupElement("inputRate");

    public static final OfInt LAYOUT$binding = (OfInt) LAYOUT.select(PATH$binding);
    public static final OfInt LAYOUT$stride = (OfInt) LAYOUT.select(PATH$stride);
    public static final OfInt LAYOUT$inputRate = (OfInt) LAYOUT.select(PATH$inputRate);

    public static final long SIZE$binding = LAYOUT$binding.byteSize();
    public static final long SIZE$stride = LAYOUT$stride.byteSize();
    public static final long SIZE$inputRate = LAYOUT$inputRate.byteSize();

    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);
    public static final long OFFSET$inputRate = LAYOUT.byteOffset(PATH$inputRate);
}
