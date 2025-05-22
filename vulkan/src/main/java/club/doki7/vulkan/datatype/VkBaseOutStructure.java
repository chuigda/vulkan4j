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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBaseOutStructure.html"><code>VkBaseOutStructure</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkBaseOutStructure {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     VkBaseOutStructure* pNext; // optional // @link substring="VkBaseOutStructure" target="VkBaseOutStructure" @link substring="pNext" target="#pNext"
/// } VkBaseOutStructure;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBaseOutStructure.html"><code>VkBaseOutStructure</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkBaseOutStructure(@NotNull MemorySegment segment) implements IVkBaseOutStructure {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBaseOutStructure.html"><code>VkBaseOutStructure</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkBaseOutStructure}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkBaseOutStructure to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkBaseOutStructure.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkBaseOutStructure {
        public long size() {
            return segment.byteSize() / VkBaseOutStructure.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkBaseOutStructure at(long index) {
            return new VkBaseOutStructure(segment.asSlice(index * VkBaseOutStructure.BYTES, VkBaseOutStructure.BYTES));
        }
        public void write(long index, @NotNull VkBaseOutStructure value) {
            MemorySegment s = segment.asSlice(index * VkBaseOutStructure.BYTES, VkBaseOutStructure.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkBaseOutStructure allocate(Arena arena) {
        return new VkBaseOutStructure(arena.allocate(LAYOUT));
    }

    public static VkBaseOutStructure.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBaseOutStructure.Ptr ret = new VkBaseOutStructure.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkBaseOutStructure clone(Arena arena, VkBaseOutStructure src) {
        VkBaseOutStructure ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @Nullable VkBaseOutStructure pNext() {
        MemorySegment s = pNextRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkBaseOutStructure(s);
    }

    public void pNext(@Nullable VkBaseOutStructure value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pNextRaw(s);
    }

    @unsafe public @Nullable VkBaseOutStructure[] pNext(int assumedCount) {
        MemorySegment s = pNextRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkBaseOutStructure.BYTES);
        VkBaseOutStructure[] ret = new VkBaseOutStructure[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkBaseOutStructure(s.asSlice(i * VkBaseOutStructure.BYTES, VkBaseOutStructure.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkBaseOutStructure.class) MemorySegment pNextRaw() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNextRaw(@pointer(target=VkBaseOutStructure.class) MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
}
