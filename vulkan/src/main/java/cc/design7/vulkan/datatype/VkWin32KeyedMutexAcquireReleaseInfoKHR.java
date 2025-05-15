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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkWin32KeyedMutexAcquireReleaseInfoKHR.html">VkWin32KeyedMutexAcquireReleaseInfoKHR</a>
@ValueBasedCandidate
public record VkWin32KeyedMutexAcquireReleaseInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$acquireCount = ValueLayout.JAVA_INT.withName("acquireCount");
    public static final AddressLayout LAYOUT$pAcquireSyncs = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pAcquireSyncs");
    public static final AddressLayout LAYOUT$pAcquireKeys = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pAcquireKeys");
    public static final AddressLayout LAYOUT$pAcquireTimeouts = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pAcquireTimeouts");
    public static final OfInt LAYOUT$releaseCount = ValueLayout.JAVA_INT.withName("releaseCount");
    public static final AddressLayout LAYOUT$pReleaseSyncs = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pReleaseSyncs");
    public static final AddressLayout LAYOUT$pReleaseKeys = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pReleaseKeys");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$acquireCount, LAYOUT$pAcquireSyncs, LAYOUT$pAcquireKeys, LAYOUT$pAcquireTimeouts, LAYOUT$releaseCount, LAYOUT$pReleaseSyncs, LAYOUT$pReleaseKeys);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkWin32KeyedMutexAcquireReleaseInfoKHR allocate(Arena arena) {
        return new VkWin32KeyedMutexAcquireReleaseInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkWin32KeyedMutexAcquireReleaseInfoKHR[] ret = new VkWin32KeyedMutexAcquireReleaseInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkWin32KeyedMutexAcquireReleaseInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoKHR clone(Arena arena, VkWin32KeyedMutexAcquireReleaseInfoKHR src) {
        VkWin32KeyedMutexAcquireReleaseInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoKHR[] clone(Arena arena, VkWin32KeyedMutexAcquireReleaseInfoKHR[] src) {
        VkWin32KeyedMutexAcquireReleaseInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$acquireCount = PathElement.groupElement("PATH$acquireCount");
    public static final PathElement PATH$pAcquireSyncs = PathElement.groupElement("PATH$pAcquireSyncs");
    public static final PathElement PATH$pAcquireKeys = PathElement.groupElement("PATH$pAcquireKeys");
    public static final PathElement PATH$pAcquireTimeouts = PathElement.groupElement("PATH$pAcquireTimeouts");
    public static final PathElement PATH$releaseCount = PathElement.groupElement("PATH$releaseCount");
    public static final PathElement PATH$pReleaseSyncs = PathElement.groupElement("PATH$pReleaseSyncs");
    public static final PathElement PATH$pReleaseKeys = PathElement.groupElement("PATH$pReleaseKeys");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$acquireCount = LAYOUT$acquireCount.byteSize();
    public static final long SIZE$pAcquireSyncs = LAYOUT$pAcquireSyncs.byteSize();
    public static final long SIZE$pAcquireKeys = LAYOUT$pAcquireKeys.byteSize();
    public static final long SIZE$pAcquireTimeouts = LAYOUT$pAcquireTimeouts.byteSize();
    public static final long SIZE$releaseCount = LAYOUT$releaseCount.byteSize();
    public static final long SIZE$pReleaseSyncs = LAYOUT$pReleaseSyncs.byteSize();
    public static final long SIZE$pReleaseKeys = LAYOUT$pReleaseKeys.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$acquireCount = LAYOUT.byteOffset(PATH$acquireCount);
    public static final long OFFSET$pAcquireSyncs = LAYOUT.byteOffset(PATH$pAcquireSyncs);
    public static final long OFFSET$pAcquireKeys = LAYOUT.byteOffset(PATH$pAcquireKeys);
    public static final long OFFSET$pAcquireTimeouts = LAYOUT.byteOffset(PATH$pAcquireTimeouts);
    public static final long OFFSET$releaseCount = LAYOUT.byteOffset(PATH$releaseCount);
    public static final long OFFSET$pReleaseSyncs = LAYOUT.byteOffset(PATH$pReleaseSyncs);
    public static final long OFFSET$pReleaseKeys = LAYOUT.byteOffset(PATH$pReleaseKeys);

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

    public @unsigned int acquireCount() {
        return segment.get(LAYOUT$acquireCount, OFFSET$acquireCount);
    }

    public void acquireCount(@unsigned int value) {
        segment.set(LAYOUT$acquireCount, OFFSET$acquireCount, value);
    }

    public @pointer(comment="VkDeviceMemory*") MemorySegment pAcquireSyncsRaw() {
        return segment.get(LAYOUT$pAcquireSyncs, OFFSET$pAcquireSyncs);
    }

    public void pAcquireSyncsRaw(@pointer(comment="VkDeviceMemory*") MemorySegment value) {
        segment.set(LAYOUT$pAcquireSyncs, OFFSET$pAcquireSyncs, value);
    }

    /// Note: the returned {@link VkDeviceMemory.Buffer} does not have correct {@link VkDeviceMemory.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkDeviceMemory.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkDeviceMemory.Buffer pAcquireSyncs() {
        MemorySegment s = pAcquireSyncsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDeviceMemory.Buffer(s);
    }


    public @pointer(comment="long*") MemorySegment pAcquireKeysRaw() {
        return segment.get(LAYOUT$pAcquireKeys, OFFSET$pAcquireKeys);
    }

    public void pAcquireKeysRaw(@pointer(comment="long*") MemorySegment value) {
        segment.set(LAYOUT$pAcquireKeys, OFFSET$pAcquireKeys, value);
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned LongPtr pAcquireKeys() {
        MemorySegment s = pAcquireKeysRaw();
        if (s.address() == 0) {
            return null;
        }
        return new LongPtr(s);
    }

    public void pAcquireKeys(@Nullable @unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAcquireKeysRaw(s);
    }

    public @pointer(comment="int*") MemorySegment pAcquireTimeoutsRaw() {
        return segment.get(LAYOUT$pAcquireTimeouts, OFFSET$pAcquireTimeouts);
    }

    public void pAcquireTimeoutsRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pAcquireTimeouts, OFFSET$pAcquireTimeouts, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pAcquireTimeouts() {
        MemorySegment s = pAcquireTimeoutsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pAcquireTimeouts(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAcquireTimeoutsRaw(s);
    }

    public @unsigned int releaseCount() {
        return segment.get(LAYOUT$releaseCount, OFFSET$releaseCount);
    }

    public void releaseCount(@unsigned int value) {
        segment.set(LAYOUT$releaseCount, OFFSET$releaseCount, value);
    }

    public @pointer(comment="VkDeviceMemory*") MemorySegment pReleaseSyncsRaw() {
        return segment.get(LAYOUT$pReleaseSyncs, OFFSET$pReleaseSyncs);
    }

    public void pReleaseSyncsRaw(@pointer(comment="VkDeviceMemory*") MemorySegment value) {
        segment.set(LAYOUT$pReleaseSyncs, OFFSET$pReleaseSyncs, value);
    }

    /// Note: the returned {@link VkDeviceMemory.Buffer} does not have correct {@link VkDeviceMemory.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkDeviceMemory.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkDeviceMemory.Buffer pReleaseSyncs() {
        MemorySegment s = pReleaseSyncsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDeviceMemory.Buffer(s);
    }


    public @pointer(comment="long*") MemorySegment pReleaseKeysRaw() {
        return segment.get(LAYOUT$pReleaseKeys, OFFSET$pReleaseKeys);
    }

    public void pReleaseKeysRaw(@pointer(comment="long*") MemorySegment value) {
        segment.set(LAYOUT$pReleaseKeys, OFFSET$pReleaseKeys, value);
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned LongPtr pReleaseKeys() {
        MemorySegment s = pReleaseKeysRaw();
        if (s.address() == 0) {
            return null;
        }
        return new LongPtr(s);
    }

    public void pReleaseKeys(@Nullable @unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pReleaseKeysRaw(s);
    }

}
