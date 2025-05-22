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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubmitInfo2.html"><code>VkSubmitInfo2</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSubmitInfo2 {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkSubmitFlags flags; // optional // @link substring="VkSubmitFlags" target="VkSubmitFlags" @link substring="flags" target="#flags"
///     uint32_t waitSemaphoreInfoCount; // optional // @link substring="waitSemaphoreInfoCount" target="#waitSemaphoreInfoCount"
///     VkSemaphoreSubmitInfo const* pWaitSemaphoreInfos; // @link substring="VkSemaphoreSubmitInfo" target="VkSemaphoreSubmitInfo" @link substring="pWaitSemaphoreInfos" target="#pWaitSemaphoreInfos"
///     uint32_t commandBufferInfoCount; // optional // @link substring="commandBufferInfoCount" target="#commandBufferInfoCount"
///     VkCommandBufferSubmitInfo const* pCommandBufferInfos; // @link substring="VkCommandBufferSubmitInfo" target="VkCommandBufferSubmitInfo" @link substring="pCommandBufferInfos" target="#pCommandBufferInfos"
///     uint32_t signalSemaphoreInfoCount; // optional // @link substring="signalSemaphoreInfoCount" target="#signalSemaphoreInfoCount"
///     VkSemaphoreSubmitInfo const* pSignalSemaphoreInfos; // @link substring="VkSemaphoreSubmitInfo" target="VkSemaphoreSubmitInfo" @link substring="pSignalSemaphoreInfos" target="#pSignalSemaphoreInfos"
/// } VkSubmitInfo2;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SUBMIT_INFO_2`
///
/// The {@code allocate} ({@link VkSubmitInfo2#allocate(Arena)}, {@link VkSubmitInfo2#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkSubmitInfo2#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubmitInfo2.html"><code>VkSubmitInfo2</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSubmitInfo2(@NotNull MemorySegment segment) implements IVkSubmitInfo2 {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubmitInfo2.html"><code>VkSubmitInfo2</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkSubmitInfo2}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkSubmitInfo2 to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkSubmitInfo2.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkSubmitInfo2 {
        public long size() {
            return segment.byteSize() / VkSubmitInfo2.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkSubmitInfo2 at(long index) {
            return new VkSubmitInfo2(segment.asSlice(index * VkSubmitInfo2.BYTES, VkSubmitInfo2.BYTES));
        }
        public void write(long index, @NotNull VkSubmitInfo2 value) {
            MemorySegment s = segment.asSlice(index * VkSubmitInfo2.BYTES, VkSubmitInfo2.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkSubmitInfo2 allocate(Arena arena) {
        VkSubmitInfo2 ret = new VkSubmitInfo2(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SUBMIT_INFO_2);
        return ret;
    }

    public static VkSubmitInfo2.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSubmitInfo2.Ptr ret = new VkSubmitInfo2.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.SUBMIT_INFO_2);
        }
        return ret;
    }

    public static VkSubmitInfo2 clone(Arena arena, VkSubmitInfo2 src) {
        VkSubmitInfo2 ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SUBMIT_INFO_2);
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

    public @enumtype(VkSubmitFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkSubmitFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int waitSemaphoreInfoCount() {
        return segment.get(LAYOUT$waitSemaphoreInfoCount, OFFSET$waitSemaphoreInfoCount);
    }

    public void waitSemaphoreInfoCount(@unsigned int value) {
        segment.set(LAYOUT$waitSemaphoreInfoCount, OFFSET$waitSemaphoreInfoCount, value);
    }

    public @Nullable VkSemaphoreSubmitInfo pWaitSemaphoreInfos() {
        MemorySegment s = pWaitSemaphoreInfosRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkSemaphoreSubmitInfo(s);
    }

    public void pWaitSemaphoreInfos(@Nullable VkSemaphoreSubmitInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pWaitSemaphoreInfosRaw(s);
    }

    @unsafe public @Nullable VkSemaphoreSubmitInfo[] pWaitSemaphoreInfos(int assumedCount) {
        MemorySegment s = pWaitSemaphoreInfosRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSemaphoreSubmitInfo.BYTES);
        VkSemaphoreSubmitInfo[] ret = new VkSemaphoreSubmitInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSemaphoreSubmitInfo(s.asSlice(i * VkSemaphoreSubmitInfo.BYTES, VkSemaphoreSubmitInfo.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkSemaphoreSubmitInfo.class) MemorySegment pWaitSemaphoreInfosRaw() {
        return segment.get(LAYOUT$pWaitSemaphoreInfos, OFFSET$pWaitSemaphoreInfos);
    }

    public void pWaitSemaphoreInfosRaw(@pointer(target=VkSemaphoreSubmitInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pWaitSemaphoreInfos, OFFSET$pWaitSemaphoreInfos, value);
    }

    public @unsigned int commandBufferInfoCount() {
        return segment.get(LAYOUT$commandBufferInfoCount, OFFSET$commandBufferInfoCount);
    }

    public void commandBufferInfoCount(@unsigned int value) {
        segment.set(LAYOUT$commandBufferInfoCount, OFFSET$commandBufferInfoCount, value);
    }

    public @Nullable VkCommandBufferSubmitInfo pCommandBufferInfos() {
        MemorySegment s = pCommandBufferInfosRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkCommandBufferSubmitInfo(s);
    }

    public void pCommandBufferInfos(@Nullable VkCommandBufferSubmitInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCommandBufferInfosRaw(s);
    }

    @unsafe public @Nullable VkCommandBufferSubmitInfo[] pCommandBufferInfos(int assumedCount) {
        MemorySegment s = pCommandBufferInfosRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkCommandBufferSubmitInfo.BYTES);
        VkCommandBufferSubmitInfo[] ret = new VkCommandBufferSubmitInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkCommandBufferSubmitInfo(s.asSlice(i * VkCommandBufferSubmitInfo.BYTES, VkCommandBufferSubmitInfo.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkCommandBufferSubmitInfo.class) MemorySegment pCommandBufferInfosRaw() {
        return segment.get(LAYOUT$pCommandBufferInfos, OFFSET$pCommandBufferInfos);
    }

    public void pCommandBufferInfosRaw(@pointer(target=VkCommandBufferSubmitInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pCommandBufferInfos, OFFSET$pCommandBufferInfos, value);
    }

    public @unsigned int signalSemaphoreInfoCount() {
        return segment.get(LAYOUT$signalSemaphoreInfoCount, OFFSET$signalSemaphoreInfoCount);
    }

    public void signalSemaphoreInfoCount(@unsigned int value) {
        segment.set(LAYOUT$signalSemaphoreInfoCount, OFFSET$signalSemaphoreInfoCount, value);
    }

    public @Nullable VkSemaphoreSubmitInfo pSignalSemaphoreInfos() {
        MemorySegment s = pSignalSemaphoreInfosRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkSemaphoreSubmitInfo(s);
    }

    public void pSignalSemaphoreInfos(@Nullable VkSemaphoreSubmitInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSignalSemaphoreInfosRaw(s);
    }

    @unsafe public @Nullable VkSemaphoreSubmitInfo[] pSignalSemaphoreInfos(int assumedCount) {
        MemorySegment s = pSignalSemaphoreInfosRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSemaphoreSubmitInfo.BYTES);
        VkSemaphoreSubmitInfo[] ret = new VkSemaphoreSubmitInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSemaphoreSubmitInfo(s.asSlice(i * VkSemaphoreSubmitInfo.BYTES, VkSemaphoreSubmitInfo.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkSemaphoreSubmitInfo.class) MemorySegment pSignalSemaphoreInfosRaw() {
        return segment.get(LAYOUT$pSignalSemaphoreInfos, OFFSET$pSignalSemaphoreInfos);
    }

    public void pSignalSemaphoreInfosRaw(@pointer(target=VkSemaphoreSubmitInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pSignalSemaphoreInfos, OFFSET$pSignalSemaphoreInfos, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreInfoCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreSubmitInfo.LAYOUT).withName("pWaitSemaphoreInfos"),
        ValueLayout.JAVA_INT.withName("commandBufferInfoCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkCommandBufferSubmitInfo.LAYOUT).withName("pCommandBufferInfos"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreInfoCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreSubmitInfo.LAYOUT).withName("pSignalSemaphoreInfos")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$waitSemaphoreInfoCount = PathElement.groupElement("waitSemaphoreInfoCount");
    public static final PathElement PATH$pWaitSemaphoreInfos = PathElement.groupElement("pWaitSemaphoreInfos");
    public static final PathElement PATH$commandBufferInfoCount = PathElement.groupElement("commandBufferInfoCount");
    public static final PathElement PATH$pCommandBufferInfos = PathElement.groupElement("pCommandBufferInfos");
    public static final PathElement PATH$signalSemaphoreInfoCount = PathElement.groupElement("signalSemaphoreInfoCount");
    public static final PathElement PATH$pSignalSemaphoreInfos = PathElement.groupElement("pSignalSemaphoreInfos");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$waitSemaphoreInfoCount = (OfInt) LAYOUT.select(PATH$waitSemaphoreInfoCount);
    public static final AddressLayout LAYOUT$pWaitSemaphoreInfos = (AddressLayout) LAYOUT.select(PATH$pWaitSemaphoreInfos);
    public static final OfInt LAYOUT$commandBufferInfoCount = (OfInt) LAYOUT.select(PATH$commandBufferInfoCount);
    public static final AddressLayout LAYOUT$pCommandBufferInfos = (AddressLayout) LAYOUT.select(PATH$pCommandBufferInfos);
    public static final OfInt LAYOUT$signalSemaphoreInfoCount = (OfInt) LAYOUT.select(PATH$signalSemaphoreInfoCount);
    public static final AddressLayout LAYOUT$pSignalSemaphoreInfos = (AddressLayout) LAYOUT.select(PATH$pSignalSemaphoreInfos);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$waitSemaphoreInfoCount = LAYOUT$waitSemaphoreInfoCount.byteSize();
    public static final long SIZE$pWaitSemaphoreInfos = LAYOUT$pWaitSemaphoreInfos.byteSize();
    public static final long SIZE$commandBufferInfoCount = LAYOUT$commandBufferInfoCount.byteSize();
    public static final long SIZE$pCommandBufferInfos = LAYOUT$pCommandBufferInfos.byteSize();
    public static final long SIZE$signalSemaphoreInfoCount = LAYOUT$signalSemaphoreInfoCount.byteSize();
    public static final long SIZE$pSignalSemaphoreInfos = LAYOUT$pSignalSemaphoreInfos.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$waitSemaphoreInfoCount = LAYOUT.byteOffset(PATH$waitSemaphoreInfoCount);
    public static final long OFFSET$pWaitSemaphoreInfos = LAYOUT.byteOffset(PATH$pWaitSemaphoreInfos);
    public static final long OFFSET$commandBufferInfoCount = LAYOUT.byteOffset(PATH$commandBufferInfoCount);
    public static final long OFFSET$pCommandBufferInfos = LAYOUT.byteOffset(PATH$pCommandBufferInfos);
    public static final long OFFSET$signalSemaphoreInfoCount = LAYOUT.byteOffset(PATH$signalSemaphoreInfoCount);
    public static final long OFFSET$pSignalSemaphoreInfos = LAYOUT.byteOffset(PATH$pSignalSemaphoreInfos);
}
