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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSparseImageOpaqueMemoryBindInfo.html"><code>VkSparseImageOpaqueMemoryBindInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSparseImageOpaqueMemoryBindInfo {
///     VkImage image; // @link substring="VkImage" target="VkImage" @link substring="image" target="#image"
///     uint32_t bindCount; // @link substring="bindCount" target="#bindCount"
///     VkSparseMemoryBind const* pBinds; // @link substring="VkSparseMemoryBind" target="VkSparseMemoryBind" @link substring="pBinds" target="#pBinds"
/// } VkSparseImageOpaqueMemoryBindInfo;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSparseImageOpaqueMemoryBindInfo.html"><code>VkSparseImageOpaqueMemoryBindInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSparseImageOpaqueMemoryBindInfo(@NotNull MemorySegment segment) implements IVkSparseImageOpaqueMemoryBindInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSparseImageOpaqueMemoryBindInfo.html"><code>VkSparseImageOpaqueMemoryBindInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkSparseImageOpaqueMemoryBindInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkSparseImageOpaqueMemoryBindInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkSparseImageOpaqueMemoryBindInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkSparseImageOpaqueMemoryBindInfo {
        public long size() {
            return segment.byteSize() / VkSparseImageOpaqueMemoryBindInfo.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkSparseImageOpaqueMemoryBindInfo at(long index) {
            return new VkSparseImageOpaqueMemoryBindInfo(segment.asSlice(index * VkSparseImageOpaqueMemoryBindInfo.BYTES, VkSparseImageOpaqueMemoryBindInfo.BYTES));
        }
        public void write(long index, @NotNull VkSparseImageOpaqueMemoryBindInfo value) {
            MemorySegment s = segment.asSlice(index * VkSparseImageOpaqueMemoryBindInfo.BYTES, VkSparseImageOpaqueMemoryBindInfo.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkSparseImageOpaqueMemoryBindInfo allocate(Arena arena) {
        return new VkSparseImageOpaqueMemoryBindInfo(arena.allocate(LAYOUT));
    }

    public static VkSparseImageOpaqueMemoryBindInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSparseImageOpaqueMemoryBindInfo.Ptr ret = new VkSparseImageOpaqueMemoryBindInfo.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkSparseImageOpaqueMemoryBindInfo clone(Arena arena, VkSparseImageOpaqueMemoryBindInfo src) {
        VkSparseImageOpaqueMemoryBindInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Nullable VkImage image() {
        MemorySegment s = segment.asSlice(OFFSET$image, SIZE$image);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkImage(s);
    }

    public void image(@Nullable VkImage value) {
        segment.set(LAYOUT$image, OFFSET$image, value != null ? value.segment() : MemorySegment.NULL);
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
        ValueLayout.ADDRESS.withName("image"),
        ValueLayout.JAVA_INT.withName("bindCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSparseMemoryBind.LAYOUT).withName("pBinds")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$image = PathElement.groupElement("image");
    public static final PathElement PATH$bindCount = PathElement.groupElement("bindCount");
    public static final PathElement PATH$pBinds = PathElement.groupElement("pBinds");

    public static final AddressLayout LAYOUT$image = (AddressLayout) LAYOUT.select(PATH$image);
    public static final OfInt LAYOUT$bindCount = (OfInt) LAYOUT.select(PATH$bindCount);
    public static final AddressLayout LAYOUT$pBinds = (AddressLayout) LAYOUT.select(PATH$pBinds);

    public static final long SIZE$image = LAYOUT$image.byteSize();
    public static final long SIZE$bindCount = LAYOUT$bindCount.byteSize();
    public static final long SIZE$pBinds = LAYOUT$pBinds.byteSize();

    public static final long OFFSET$image = LAYOUT.byteOffset(PATH$image);
    public static final long OFFSET$bindCount = LAYOUT.byteOffset(PATH$bindCount);
    public static final long OFFSET$pBinds = LAYOUT.byteOffset(PATH$pBinds);
}
