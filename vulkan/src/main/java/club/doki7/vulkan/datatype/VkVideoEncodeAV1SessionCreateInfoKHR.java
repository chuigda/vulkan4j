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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1SessionCreateInfoKHR.html"><code>VkVideoEncodeAV1SessionCreateInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeAV1SessionCreateInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkBool32 useMaxLevel; // @link substring="useMaxLevel" target="#useMaxLevel"
///     StdVideoAV1Level maxLevel; // @link substring="StdVideoAV1Level" target="StdVideoAV1Level" @link substring="maxLevel" target="#maxLevel"
/// } VkVideoEncodeAV1SessionCreateInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_AV1_SESSION_CREATE_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoEncodeAV1SessionCreateInfoKHR#allocate(Arena)}, {@link VkVideoEncodeAV1SessionCreateInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoEncodeAV1SessionCreateInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1SessionCreateInfoKHR.html"><code>VkVideoEncodeAV1SessionCreateInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeAV1SessionCreateInfoKHR(@NotNull MemorySegment segment) implements IVkVideoEncodeAV1SessionCreateInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1SessionCreateInfoKHR.html"><code>VkVideoEncodeAV1SessionCreateInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkVideoEncodeAV1SessionCreateInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkVideoEncodeAV1SessionCreateInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkVideoEncodeAV1SessionCreateInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkVideoEncodeAV1SessionCreateInfoKHR {
        public long size() {
            return segment.byteSize() / VkVideoEncodeAV1SessionCreateInfoKHR.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkVideoEncodeAV1SessionCreateInfoKHR at(long index) {
            return new VkVideoEncodeAV1SessionCreateInfoKHR(segment.asSlice(index * VkVideoEncodeAV1SessionCreateInfoKHR.BYTES, VkVideoEncodeAV1SessionCreateInfoKHR.BYTES));
        }
        public void write(long index, @NotNull VkVideoEncodeAV1SessionCreateInfoKHR value) {
            MemorySegment s = segment.asSlice(index * VkVideoEncodeAV1SessionCreateInfoKHR.BYTES, VkVideoEncodeAV1SessionCreateInfoKHR.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkVideoEncodeAV1SessionCreateInfoKHR allocate(Arena arena) {
        VkVideoEncodeAV1SessionCreateInfoKHR ret = new VkVideoEncodeAV1SessionCreateInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_AV1_SESSION_CREATE_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeAV1SessionCreateInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeAV1SessionCreateInfoKHR.Ptr ret = new VkVideoEncodeAV1SessionCreateInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.VIDEO_ENCODE_AV1_SESSION_CREATE_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeAV1SessionCreateInfoKHR clone(Arena arena, VkVideoEncodeAV1SessionCreateInfoKHR src) {
        VkVideoEncodeAV1SessionCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_AV1_SESSION_CREATE_INFO_KHR);
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

    public @unsigned int useMaxLevel() {
        return segment.get(LAYOUT$useMaxLevel, OFFSET$useMaxLevel);
    }

    public void useMaxLevel(@unsigned int value) {
        segment.set(LAYOUT$useMaxLevel, OFFSET$useMaxLevel, value);
    }

    public @enumtype(StdVideoAV1Level.class) int maxLevel() {
        return segment.get(LAYOUT$maxLevel, OFFSET$maxLevel);
    }

    public void maxLevel(@enumtype(StdVideoAV1Level.class) int value) {
        segment.set(LAYOUT$maxLevel, OFFSET$maxLevel, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("useMaxLevel"),
        ValueLayout.JAVA_INT.withName("maxLevel")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$useMaxLevel = PathElement.groupElement("useMaxLevel");
    public static final PathElement PATH$maxLevel = PathElement.groupElement("maxLevel");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$useMaxLevel = (OfInt) LAYOUT.select(PATH$useMaxLevel);
    public static final OfInt LAYOUT$maxLevel = (OfInt) LAYOUT.select(PATH$maxLevel);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$useMaxLevel = LAYOUT$useMaxLevel.byteSize();
    public static final long SIZE$maxLevel = LAYOUT$maxLevel.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$useMaxLevel = LAYOUT.byteOffset(PATH$useMaxLevel);
    public static final long OFFSET$maxLevel = LAYOUT.byteOffset(PATH$maxLevel);
}
