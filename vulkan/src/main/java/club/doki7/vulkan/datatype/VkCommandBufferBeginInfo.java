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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCommandBufferBeginInfo.html"><code>VkCommandBufferBeginInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkCommandBufferBeginInfo {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkCommandBufferUsageFlags flags; // optional // @link substring="VkCommandBufferUsageFlags" target="VkCommandBufferUsageFlags" @link substring="flags" target="#flags"
///     VkCommandBufferInheritanceInfo const* pInheritanceInfo; // optional // @link substring="VkCommandBufferInheritanceInfo" target="VkCommandBufferInheritanceInfo" @link substring="pInheritanceInfo" target="#pInheritanceInfo"
/// } VkCommandBufferBeginInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO`
///
/// The {@code allocate} ({@link VkCommandBufferBeginInfo#allocate(Arena)}, {@link VkCommandBufferBeginInfo#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkCommandBufferBeginInfo#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCommandBufferBeginInfo.html"><code>VkCommandBufferBeginInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkCommandBufferBeginInfo(@NotNull MemorySegment segment) implements IVkCommandBufferBeginInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCommandBufferBeginInfo.html"><code>VkCommandBufferBeginInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkCommandBufferBeginInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkCommandBufferBeginInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkCommandBufferBeginInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkCommandBufferBeginInfo {
        public long size() {
            return segment.byteSize() / VkCommandBufferBeginInfo.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkCommandBufferBeginInfo at(long index) {
            return new VkCommandBufferBeginInfo(segment.asSlice(index * VkCommandBufferBeginInfo.BYTES, VkCommandBufferBeginInfo.BYTES));
        }
        public void write(long index, @NotNull VkCommandBufferBeginInfo value) {
            MemorySegment s = segment.asSlice(index * VkCommandBufferBeginInfo.BYTES, VkCommandBufferBeginInfo.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkCommandBufferBeginInfo allocate(Arena arena) {
        VkCommandBufferBeginInfo ret = new VkCommandBufferBeginInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.COMMAND_BUFFER_BEGIN_INFO);
        return ret;
    }

    public static VkCommandBufferBeginInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCommandBufferBeginInfo.Ptr ret = new VkCommandBufferBeginInfo.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.COMMAND_BUFFER_BEGIN_INFO);
        }
        return ret;
    }

    public static VkCommandBufferBeginInfo clone(Arena arena, VkCommandBufferBeginInfo src) {
        VkCommandBufferBeginInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.COMMAND_BUFFER_BEGIN_INFO);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkCommandBufferUsageFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkCommandBufferUsageFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @Nullable VkCommandBufferInheritanceInfo pInheritanceInfo() {
        MemorySegment s = pInheritanceInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkCommandBufferInheritanceInfo(s);
    }

    public void pInheritanceInfo(@Nullable VkCommandBufferInheritanceInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pInheritanceInfoRaw(s);
    }

    @unsafe public @Nullable VkCommandBufferInheritanceInfo[] pInheritanceInfo(int assumedCount) {
        MemorySegment s = pInheritanceInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkCommandBufferInheritanceInfo.BYTES);
        VkCommandBufferInheritanceInfo[] ret = new VkCommandBufferInheritanceInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkCommandBufferInheritanceInfo(s.asSlice(i * VkCommandBufferInheritanceInfo.BYTES, VkCommandBufferInheritanceInfo.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkCommandBufferInheritanceInfo.class) MemorySegment pInheritanceInfoRaw() {
        return segment.get(LAYOUT$pInheritanceInfo, OFFSET$pInheritanceInfo);
    }

    public void pInheritanceInfoRaw(@pointer(target=VkCommandBufferInheritanceInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pInheritanceInfo, OFFSET$pInheritanceInfo, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withTargetLayout(VkCommandBufferInheritanceInfo.LAYOUT).withName("pInheritanceInfo")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$pInheritanceInfo = PathElement.groupElement("pInheritanceInfo");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pInheritanceInfo = (AddressLayout) LAYOUT.select(PATH$pInheritanceInfo);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pInheritanceInfo = LAYOUT$pInheritanceInfo.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pInheritanceInfo = LAYOUT.byteOffset(PATH$pInheritanceInfo);
}
