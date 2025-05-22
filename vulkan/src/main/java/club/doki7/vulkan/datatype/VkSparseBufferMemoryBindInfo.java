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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSparseBufferMemoryBindInfo.html"><code>VkSparseBufferMemoryBindInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSparseBufferMemoryBindInfo {
///     VkBuffer buffer; // @link substring="VkBuffer" target="VkBuffer" @link substring="buffer" target="#buffer"
///     uint32_t bindCount; // @link substring="bindCount" target="#bindCount"
///     VkSparseMemoryBind const* pBinds; // @link substring="VkSparseMemoryBind" target="VkSparseMemoryBind" @link substring="pBinds" target="#pBinds"
/// } VkSparseBufferMemoryBindInfo;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSparseBufferMemoryBindInfo.html"><code>VkSparseBufferMemoryBindInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSparseBufferMemoryBindInfo(@NotNull MemorySegment segment) implements IVkSparseBufferMemoryBindInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSparseBufferMemoryBindInfo.html"><code>VkSparseBufferMemoryBindInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkSparseBufferMemoryBindInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkSparseBufferMemoryBindInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkSparseBufferMemoryBindInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkSparseBufferMemoryBindInfo {
        public long size() {
            return segment.byteSize() / VkSparseBufferMemoryBindInfo.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkSparseBufferMemoryBindInfo at(long index) {
            return new VkSparseBufferMemoryBindInfo(segment.asSlice(index * VkSparseBufferMemoryBindInfo.BYTES, VkSparseBufferMemoryBindInfo.BYTES));
        }
        public void write(long index, @NotNull VkSparseBufferMemoryBindInfo value) {
            MemorySegment s = segment.asSlice(index * VkSparseBufferMemoryBindInfo.BYTES, VkSparseBufferMemoryBindInfo.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkSparseBufferMemoryBindInfo allocate(Arena arena) {
        return new VkSparseBufferMemoryBindInfo(arena.allocate(LAYOUT));
    }

    public static VkSparseBufferMemoryBindInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSparseBufferMemoryBindInfo.Ptr ret = new VkSparseBufferMemoryBindInfo.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkSparseBufferMemoryBindInfo clone(Arena arena, VkSparseBufferMemoryBindInfo src) {
        VkSparseBufferMemoryBindInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Nullable VkBuffer buffer() {
        MemorySegment s = segment.asSlice(OFFSET$buffer, SIZE$buffer);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void buffer(@Nullable VkBuffer value) {
        segment.set(LAYOUT$buffer, OFFSET$buffer, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int bindCount() {
        return segment.get(LAYOUT$bindCount, OFFSET$bindCount);
    }

    public void bindCount(@unsigned int value) {
        segment.set(LAYOUT$bindCount, OFFSET$bindCount, value);
    }

    public @Nullable VkSparseMemoryBind pBinds() {
        MemorySegment s = pBindsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkSparseMemoryBind(s);
    }

    public void pBinds(@Nullable VkSparseMemoryBind value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBindsRaw(s);
    }

    @unsafe public @Nullable VkSparseMemoryBind[] pBinds(int assumedCount) {
        MemorySegment s = pBindsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSparseMemoryBind.BYTES);
        VkSparseMemoryBind[] ret = new VkSparseMemoryBind[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSparseMemoryBind(s.asSlice(i * VkSparseMemoryBind.BYTES, VkSparseMemoryBind.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkSparseMemoryBind.class) MemorySegment pBindsRaw() {
        return segment.get(LAYOUT$pBinds, OFFSET$pBinds);
    }

    public void pBindsRaw(@pointer(target=VkSparseMemoryBind.class) MemorySegment value) {
        segment.set(LAYOUT$pBinds, OFFSET$pBinds, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_INT.withName("bindCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSparseMemoryBind.LAYOUT).withName("pBinds")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$buffer = PathElement.groupElement("buffer");
    public static final PathElement PATH$bindCount = PathElement.groupElement("bindCount");
    public static final PathElement PATH$pBinds = PathElement.groupElement("pBinds");

    public static final AddressLayout LAYOUT$buffer = (AddressLayout) LAYOUT.select(PATH$buffer);
    public static final OfInt LAYOUT$bindCount = (OfInt) LAYOUT.select(PATH$bindCount);
    public static final AddressLayout LAYOUT$pBinds = (AddressLayout) LAYOUT.select(PATH$pBinds);

    public static final long SIZE$buffer = LAYOUT$buffer.byteSize();
    public static final long SIZE$bindCount = LAYOUT$bindCount.byteSize();
    public static final long SIZE$pBinds = LAYOUT$pBinds.byteSize();

    public static final long OFFSET$buffer = LAYOUT.byteOffset(PATH$buffer);
    public static final long OFFSET$bindCount = LAYOUT.byteOffset(PATH$bindCount);
    public static final long OFFSET$pBinds = LAYOUT.byteOffset(PATH$pBinds);
}
