package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkWin32KeyedMutexAcquireReleaseInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t acquireCount;
///     const VkDeviceMemory* pAcquireSyncs;
///     const uint64_t* pAcquireKeys;
///     const uint32_t* pAcquireTimeouts;
///     uint32_t releaseCount;
///     const VkDeviceMemory* pReleaseSyncs;
///     const uint64_t* pReleaseKeys;
/// } VkWin32KeyedMutexAcquireReleaseInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkWin32KeyedMutexAcquireReleaseInfoKHR.html">VkWin32KeyedMutexAcquireReleaseInfoKHR</a>
public record VkWin32KeyedMutexAcquireReleaseInfoKHR(MemorySegment segment) implements IPointer {
    public VkWin32KeyedMutexAcquireReleaseInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int acquireCount() {
        return segment.get(LAYOUT$acquireCount, OFFSET$acquireCount);
    }

    public void acquireCount(@unsigned int value) {
        segment.set(LAYOUT$acquireCount, OFFSET$acquireCount, value);
    }

    public @pointer(comment="VkDeviceMemory") MemorySegment pAcquireSyncsRaw() {
        return segment.get(LAYOUT$pAcquireSyncs, OFFSET$pAcquireSyncs);
    }

    public void pAcquireSyncsRaw(@pointer(comment="VkDeviceMemory") MemorySegment value) {
        segment.set(LAYOUT$pAcquireSyncs, OFFSET$pAcquireSyncs, value);
    }

    /// Note: the returned {@link VkDeviceMemory.Buffer} does not have correct
    /// {@link VkDeviceMemory.Buffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link VkDeviceMemory.Buffer#reinterpret} to set the size before actually
    /// {@link VkDeviceMemory.Buffer#read}ing or {@link VkDeviceMemory.Buffer#write}ing
    /// the buffer.
    public @Nullable VkDeviceMemory.Buffer pAcquireSyncs() {
        MemorySegment s = pAcquireSyncsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDeviceMemory.Buffer(s);
    }

    public void pAcquireSyncs(@Nullable VkDeviceMemory.Buffer value) {
        pAcquireSyncsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @pointer(comment="uint64_t*") MemorySegment pAcquireKeysRaw() {
        return segment.get(LAYOUT$pAcquireKeys, OFFSET$pAcquireKeys);
    }

    public void pAcquireKeysRaw(@pointer(comment="uint64_t*") MemorySegment value) {
        segment.set(LAYOUT$pAcquireKeys, OFFSET$pAcquireKeys, value);
    }

    /// Note: the returned {@link LongBuffer} does not have correct
    /// {@link LongBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongBuffer#reinterpret} to set the size before actually
    /// {@link LongBuffer#read}ing or
    /// {@link LongBuffer#write}ing the buffer.
    public @Nullable @unsigned LongBuffer pAcquireKeys() {
        MemorySegment s = pAcquireKeysRaw();
        return s.address() == 0 ? null : new LongBuffer(s);
    }

    public void pAcquireKeys(@Nullable @unsigned LongBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAcquireKeysRaw(s);
    }

    public @pointer(comment="uint32_t*") MemorySegment pAcquireTimeoutsRaw() {
        return segment.get(LAYOUT$pAcquireTimeouts, OFFSET$pAcquireTimeouts);
    }

    public void pAcquireTimeoutsRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pAcquireTimeouts, OFFSET$pAcquireTimeouts, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or
    /// {@link IntBuffer#write}ing the buffer.
    public @Nullable @unsigned IntBuffer pAcquireTimeouts() {
        MemorySegment s = pAcquireTimeoutsRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pAcquireTimeouts(@Nullable @unsigned IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAcquireTimeoutsRaw(s);
    }

    public @unsigned int releaseCount() {
        return segment.get(LAYOUT$releaseCount, OFFSET$releaseCount);
    }

    public void releaseCount(@unsigned int value) {
        segment.set(LAYOUT$releaseCount, OFFSET$releaseCount, value);
    }

    public @pointer(comment="VkDeviceMemory") MemorySegment pReleaseSyncsRaw() {
        return segment.get(LAYOUT$pReleaseSyncs, OFFSET$pReleaseSyncs);
    }

    public void pReleaseSyncsRaw(@pointer(comment="VkDeviceMemory") MemorySegment value) {
        segment.set(LAYOUT$pReleaseSyncs, OFFSET$pReleaseSyncs, value);
    }

    /// Note: the returned {@link VkDeviceMemory.Buffer} does not have correct
    /// {@link VkDeviceMemory.Buffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link VkDeviceMemory.Buffer#reinterpret} to set the size before actually
    /// {@link VkDeviceMemory.Buffer#read}ing or {@link VkDeviceMemory.Buffer#write}ing
    /// the buffer.
    public @Nullable VkDeviceMemory.Buffer pReleaseSyncs() {
        MemorySegment s = pReleaseSyncsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDeviceMemory.Buffer(s);
    }

    public void pReleaseSyncs(@Nullable VkDeviceMemory.Buffer value) {
        pReleaseSyncsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @pointer(comment="uint64_t*") MemorySegment pReleaseKeysRaw() {
        return segment.get(LAYOUT$pReleaseKeys, OFFSET$pReleaseKeys);
    }

    public void pReleaseKeysRaw(@pointer(comment="uint64_t*") MemorySegment value) {
        segment.set(LAYOUT$pReleaseKeys, OFFSET$pReleaseKeys, value);
    }

    /// Note: the returned {@link LongBuffer} does not have correct
    /// {@link LongBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongBuffer#reinterpret} to set the size before actually
    /// {@link LongBuffer#read}ing or
    /// {@link LongBuffer#write}ing the buffer.
    public @Nullable @unsigned LongBuffer pReleaseKeys() {
        MemorySegment s = pReleaseKeysRaw();
        return s.address() == 0 ? null : new LongBuffer(s);
    }

    public void pReleaseKeys(@Nullable @unsigned LongBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pReleaseKeysRaw(s);
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoKHR allocate(Arena arena) {
        return new VkWin32KeyedMutexAcquireReleaseInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkWin32KeyedMutexAcquireReleaseInfoKHR[] ret = new VkWin32KeyedMutexAcquireReleaseInfoKHR[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("acquireCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pAcquireSyncs"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pAcquireKeys"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pAcquireTimeouts"),
        ValueLayout.JAVA_INT.withName("releaseCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pReleaseSyncs"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pReleaseKeys")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$acquireCount = PathElement.groupElement("acquireCount");
    public static final PathElement PATH$pAcquireSyncs = PathElement.groupElement("pAcquireSyncs");
    public static final PathElement PATH$pAcquireKeys = PathElement.groupElement("pAcquireKeys");
    public static final PathElement PATH$pAcquireTimeouts = PathElement.groupElement("pAcquireTimeouts");
    public static final PathElement PATH$releaseCount = PathElement.groupElement("releaseCount");
    public static final PathElement PATH$pReleaseSyncs = PathElement.groupElement("pReleaseSyncs");
    public static final PathElement PATH$pReleaseKeys = PathElement.groupElement("pReleaseKeys");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$acquireCount = (OfInt) LAYOUT.select(PATH$acquireCount);
    public static final AddressLayout LAYOUT$pAcquireSyncs = (AddressLayout) LAYOUT.select(PATH$pAcquireSyncs);
    public static final AddressLayout LAYOUT$pAcquireKeys = (AddressLayout) LAYOUT.select(PATH$pAcquireKeys);
    public static final AddressLayout LAYOUT$pAcquireTimeouts = (AddressLayout) LAYOUT.select(PATH$pAcquireTimeouts);
    public static final OfInt LAYOUT$releaseCount = (OfInt) LAYOUT.select(PATH$releaseCount);
    public static final AddressLayout LAYOUT$pReleaseSyncs = (AddressLayout) LAYOUT.select(PATH$pReleaseSyncs);
    public static final AddressLayout LAYOUT$pReleaseKeys = (AddressLayout) LAYOUT.select(PATH$pReleaseKeys);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$acquireCount = LAYOUT.byteOffset(PATH$acquireCount);
    public static final long OFFSET$pAcquireSyncs = LAYOUT.byteOffset(PATH$pAcquireSyncs);
    public static final long OFFSET$pAcquireKeys = LAYOUT.byteOffset(PATH$pAcquireKeys);
    public static final long OFFSET$pAcquireTimeouts = LAYOUT.byteOffset(PATH$pAcquireTimeouts);
    public static final long OFFSET$releaseCount = LAYOUT.byteOffset(PATH$releaseCount);
    public static final long OFFSET$pReleaseSyncs = LAYOUT.byteOffset(PATH$pReleaseSyncs);
    public static final long OFFSET$pReleaseKeys = LAYOUT.byteOffset(PATH$pReleaseKeys);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$acquireCount = LAYOUT$acquireCount.byteSize();
    public static final long SIZE$pAcquireSyncs = LAYOUT$pAcquireSyncs.byteSize();
    public static final long SIZE$pAcquireKeys = LAYOUT$pAcquireKeys.byteSize();
    public static final long SIZE$pAcquireTimeouts = LAYOUT$pAcquireTimeouts.byteSize();
    public static final long SIZE$releaseCount = LAYOUT$releaseCount.byteSize();
    public static final long SIZE$pReleaseSyncs = LAYOUT$pReleaseSyncs.byteSize();
    public static final long SIZE$pReleaseKeys = LAYOUT$pReleaseKeys.byteSize();
}
