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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsIndexBufferTokenEXT.html"><code>VkIndirectCommandsIndexBufferTokenEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkIndirectCommandsIndexBufferTokenEXT {
///     VkIndirectCommandsInputModeFlagsEXT mode; // @link substring="VkIndirectCommandsInputModeFlagsEXT" target="VkIndirectCommandsInputModeFlagsEXT" @link substring="mode" target="#mode"
/// } VkIndirectCommandsIndexBufferTokenEXT;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsIndexBufferTokenEXT.html"><code>VkIndirectCommandsIndexBufferTokenEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkIndirectCommandsIndexBufferTokenEXT(@NotNull MemorySegment segment) implements IVkIndirectCommandsIndexBufferTokenEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkIndirectCommandsIndexBufferTokenEXT.html"><code>VkIndirectCommandsIndexBufferTokenEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkIndirectCommandsIndexBufferTokenEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkIndirectCommandsIndexBufferTokenEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkIndirectCommandsIndexBufferTokenEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkIndirectCommandsIndexBufferTokenEXT {
        public long size() {
            return segment.byteSize() / VkIndirectCommandsIndexBufferTokenEXT.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkIndirectCommandsIndexBufferTokenEXT at(long index) {
            return new VkIndirectCommandsIndexBufferTokenEXT(segment.asSlice(index * VkIndirectCommandsIndexBufferTokenEXT.BYTES, VkIndirectCommandsIndexBufferTokenEXT.BYTES));
        }
        public void write(long index, @NotNull VkIndirectCommandsIndexBufferTokenEXT value) {
            MemorySegment s = segment.asSlice(index * VkIndirectCommandsIndexBufferTokenEXT.BYTES, VkIndirectCommandsIndexBufferTokenEXT.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkIndirectCommandsIndexBufferTokenEXT allocate(Arena arena) {
        return new VkIndirectCommandsIndexBufferTokenEXT(arena.allocate(LAYOUT));
    }

    public static VkIndirectCommandsIndexBufferTokenEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIndirectCommandsIndexBufferTokenEXT.Ptr ret = new VkIndirectCommandsIndexBufferTokenEXT.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkIndirectCommandsIndexBufferTokenEXT clone(Arena arena, VkIndirectCommandsIndexBufferTokenEXT src) {
        VkIndirectCommandsIndexBufferTokenEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @enumtype(VkIndirectCommandsInputModeFlagsEXT.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public void mode(@enumtype(VkIndirectCommandsInputModeFlagsEXT.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("mode")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$mode = PathElement.groupElement("mode");

    public static final OfInt LAYOUT$mode = (OfInt) LAYOUT.select(PATH$mode);

    public static final long SIZE$mode = LAYOUT$mode.byteSize();

    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);
}
