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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVertexInputBindingDivisorDescription.html"><code>VkVertexInputBindingDivisorDescription</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVertexInputBindingDivisorDescription {
///     uint32_t binding; // @link substring="binding" target="#binding"
///     uint32_t divisor; // @link substring="divisor" target="#divisor"
/// } VkVertexInputBindingDivisorDescription;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVertexInputBindingDivisorDescription.html"><code>VkVertexInputBindingDivisorDescription</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVertexInputBindingDivisorDescription(@NotNull MemorySegment segment) implements IVkVertexInputBindingDivisorDescription {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVertexInputBindingDivisorDescription.html"><code>VkVertexInputBindingDivisorDescription</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkVertexInputBindingDivisorDescription}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkVertexInputBindingDivisorDescription to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkVertexInputBindingDivisorDescription.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkVertexInputBindingDivisorDescription {
        public long size() {
            return segment.byteSize() / VkVertexInputBindingDivisorDescription.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkVertexInputBindingDivisorDescription at(long index) {
            return new VkVertexInputBindingDivisorDescription(segment.asSlice(index * VkVertexInputBindingDivisorDescription.BYTES, VkVertexInputBindingDivisorDescription.BYTES));
        }
        public void write(long index, @NotNull VkVertexInputBindingDivisorDescription value) {
            MemorySegment s = segment.asSlice(index * VkVertexInputBindingDivisorDescription.BYTES, VkVertexInputBindingDivisorDescription.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkVertexInputBindingDivisorDescription allocate(Arena arena) {
        return new VkVertexInputBindingDivisorDescription(arena.allocate(LAYOUT));
    }

    public static VkVertexInputBindingDivisorDescription.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVertexInputBindingDivisorDescription.Ptr ret = new VkVertexInputBindingDivisorDescription.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkVertexInputBindingDivisorDescription clone(Arena arena, VkVertexInputBindingDivisorDescription src) {
        VkVertexInputBindingDivisorDescription ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned int binding() {
        return segment.get(LAYOUT$binding, OFFSET$binding);
    }

    public void binding(@unsigned int value) {
        segment.set(LAYOUT$binding, OFFSET$binding, value);
    }

    public @unsigned int divisor() {
        return segment.get(LAYOUT$divisor, OFFSET$divisor);
    }

    public void divisor(@unsigned int value) {
        segment.set(LAYOUT$divisor, OFFSET$divisor, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("divisor")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$binding = PathElement.groupElement("binding");
    public static final PathElement PATH$divisor = PathElement.groupElement("divisor");

    public static final OfInt LAYOUT$binding = (OfInt) LAYOUT.select(PATH$binding);
    public static final OfInt LAYOUT$divisor = (OfInt) LAYOUT.select(PATH$divisor);

    public static final long SIZE$binding = LAYOUT$binding.byteSize();
    public static final long SIZE$divisor = LAYOUT$divisor.byteSize();

    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);
    public static final long OFFSET$divisor = LAYOUT.byteOffset(PATH$divisor);
}
