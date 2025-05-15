package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubmitInfo2.html"><code>VkSubmitInfo2</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSubmitInfo2 {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkSubmitFlags flags; // optional
///     uint32_t waitSemaphoreInfoCount; // optional
///     VkSemaphoreSubmitInfo const* pWaitSemaphoreInfos;
///     uint32_t commandBufferInfoCount; // optional
///     VkCommandBufferSubmitInfo const* pCommandBufferInfos;
///     uint32_t signalSemaphoreInfoCount; // optional
///     VkSemaphoreSubmitInfo const* pSignalSemaphoreInfos;
/// } VkSubmitInfo2;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SUBMIT_INFO_2`
///
/// The {@link VkSubmitInfo2#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkSubmitInfo2#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubmitInfo2.html"><code>VkSubmitInfo2</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSubmitInfo2(@NotNull MemorySegment segment) implements IPointer {
    public static VkSubmitInfo2 allocate(Arena arena) {
        VkSubmitInfo2 ret = new VkSubmitInfo2(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SUBMIT_INFO_2);
        return ret;
    }

    public static VkSubmitInfo2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSubmitInfo2[] ret = new VkSubmitInfo2[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSubmitInfo2(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SUBMIT_INFO_2);
        }
        return ret;
    }

    public static VkSubmitInfo2 clone(Arena arena, VkSubmitInfo2 src) {
        VkSubmitInfo2 ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSubmitInfo2[] clone(Arena arena, VkSubmitInfo2[] src) {
        VkSubmitInfo2[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
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

    public @pointer(comment="VkSemaphoreSubmitInfo*") MemorySegment pWaitSemaphoreInfosRaw() {
        return segment.get(LAYOUT$pWaitSemaphoreInfos, OFFSET$pWaitSemaphoreInfos);
    }

    public void pWaitSemaphoreInfosRaw(@pointer(comment="VkSemaphoreSubmitInfo*") MemorySegment value) {
        segment.set(LAYOUT$pWaitSemaphoreInfos, OFFSET$pWaitSemaphoreInfos, value);
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

        s = s.reinterpret(assumedCount * VkSemaphoreSubmitInfo.SIZE);
        VkSemaphoreSubmitInfo[] ret = new VkSemaphoreSubmitInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSemaphoreSubmitInfo(s.asSlice(i * VkSemaphoreSubmitInfo.SIZE, VkSemaphoreSubmitInfo.SIZE));
        }
        return ret;
    }

    public @unsigned int commandBufferInfoCount() {
        return segment.get(LAYOUT$commandBufferInfoCount, OFFSET$commandBufferInfoCount);
    }

    public void commandBufferInfoCount(@unsigned int value) {
        segment.set(LAYOUT$commandBufferInfoCount, OFFSET$commandBufferInfoCount, value);
    }

    public @pointer(comment="VkCommandBufferSubmitInfo*") MemorySegment pCommandBufferInfosRaw() {
        return segment.get(LAYOUT$pCommandBufferInfos, OFFSET$pCommandBufferInfos);
    }

    public void pCommandBufferInfosRaw(@pointer(comment="VkCommandBufferSubmitInfo*") MemorySegment value) {
        segment.set(LAYOUT$pCommandBufferInfos, OFFSET$pCommandBufferInfos, value);
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

        s = s.reinterpret(assumedCount * VkCommandBufferSubmitInfo.SIZE);
        VkCommandBufferSubmitInfo[] ret = new VkCommandBufferSubmitInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkCommandBufferSubmitInfo(s.asSlice(i * VkCommandBufferSubmitInfo.SIZE, VkCommandBufferSubmitInfo.SIZE));
        }
        return ret;
    }

    public @unsigned int signalSemaphoreInfoCount() {
        return segment.get(LAYOUT$signalSemaphoreInfoCount, OFFSET$signalSemaphoreInfoCount);
    }

    public void signalSemaphoreInfoCount(@unsigned int value) {
        segment.set(LAYOUT$signalSemaphoreInfoCount, OFFSET$signalSemaphoreInfoCount, value);
    }

    public @pointer(comment="VkSemaphoreSubmitInfo*") MemorySegment pSignalSemaphoreInfosRaw() {
        return segment.get(LAYOUT$pSignalSemaphoreInfos, OFFSET$pSignalSemaphoreInfos);
    }

    public void pSignalSemaphoreInfosRaw(@pointer(comment="VkSemaphoreSubmitInfo*") MemorySegment value) {
        segment.set(LAYOUT$pSignalSemaphoreInfos, OFFSET$pSignalSemaphoreInfos, value);
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

        s = s.reinterpret(assumedCount * VkSemaphoreSubmitInfo.SIZE);
        VkSemaphoreSubmitInfo[] ret = new VkSemaphoreSubmitInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSemaphoreSubmitInfo(s.asSlice(i * VkSemaphoreSubmitInfo.SIZE, VkSemaphoreSubmitInfo.SIZE));
        }
        return ret;
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

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$waitSemaphoreInfoCount = PathElement.groupElement("PATH$waitSemaphoreInfoCount");
    public static final PathElement PATH$pWaitSemaphoreInfos = PathElement.groupElement("PATH$pWaitSemaphoreInfos");
    public static final PathElement PATH$commandBufferInfoCount = PathElement.groupElement("PATH$commandBufferInfoCount");
    public static final PathElement PATH$pCommandBufferInfos = PathElement.groupElement("PATH$pCommandBufferInfos");
    public static final PathElement PATH$signalSemaphoreInfoCount = PathElement.groupElement("PATH$signalSemaphoreInfoCount");
    public static final PathElement PATH$pSignalSemaphoreInfos = PathElement.groupElement("PATH$pSignalSemaphoreInfos");

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
