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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindShaderGroupIndirectCommandNV.html"><code>VkBindShaderGroupIndirectCommandNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkBindShaderGroupIndirectCommandNV {
///     uint32_t groupIndex; // @link substring="groupIndex" target="#groupIndex"
/// } VkBindShaderGroupIndirectCommandNV;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindShaderGroupIndirectCommandNV.html"><code>VkBindShaderGroupIndirectCommandNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkBindShaderGroupIndirectCommandNV(@NotNull MemorySegment segment) implements IVkBindShaderGroupIndirectCommandNV {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindShaderGroupIndirectCommandNV.html"><code>VkBindShaderGroupIndirectCommandNV</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkBindShaderGroupIndirectCommandNV}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkBindShaderGroupIndirectCommandNV to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkBindShaderGroupIndirectCommandNV.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkBindShaderGroupIndirectCommandNV {
        public long size() {
            return segment.byteSize() / VkBindShaderGroupIndirectCommandNV.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkBindShaderGroupIndirectCommandNV at(long index) {
            return new VkBindShaderGroupIndirectCommandNV(segment.asSlice(index * VkBindShaderGroupIndirectCommandNV.BYTES, VkBindShaderGroupIndirectCommandNV.BYTES));
        }
        public void write(long index, @NotNull VkBindShaderGroupIndirectCommandNV value) {
            MemorySegment s = segment.asSlice(index * VkBindShaderGroupIndirectCommandNV.BYTES, VkBindShaderGroupIndirectCommandNV.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkBindShaderGroupIndirectCommandNV allocate(Arena arena) {
        return new VkBindShaderGroupIndirectCommandNV(arena.allocate(LAYOUT));
    }

    public static VkBindShaderGroupIndirectCommandNV.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindShaderGroupIndirectCommandNV.Ptr ret = new VkBindShaderGroupIndirectCommandNV.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkBindShaderGroupIndirectCommandNV clone(Arena arena, VkBindShaderGroupIndirectCommandNV src) {
        VkBindShaderGroupIndirectCommandNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned int groupIndex() {
        return segment.get(LAYOUT$groupIndex, OFFSET$groupIndex);
    }

    public void groupIndex(@unsigned int value) {
        segment.set(LAYOUT$groupIndex, OFFSET$groupIndex, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("groupIndex")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$groupIndex = PathElement.groupElement("groupIndex");

    public static final OfInt LAYOUT$groupIndex = (OfInt) LAYOUT.select(PATH$groupIndex);

    public static final long SIZE$groupIndex = LAYOUT$groupIndex.byteSize();

    public static final long OFFSET$groupIndex = LAYOUT.byteOffset(PATH$groupIndex);
}
