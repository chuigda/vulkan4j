package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkWin32KeyedMutexAcquireReleaseInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("acquireCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pAcquireSyncs"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pAcquireKeys"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pAcquireTimeoutMilliseconds"),
        ValueLayout.JAVA_INT.withName("releaseCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pReleaseSyncs"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pReleaseKeys")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$acquireCount = PathElement.groupElement("acquireCount");
    public static final PathElement PATH$pAcquireSyncs = PathElement.groupElement("pAcquireSyncs");
    public static final PathElement PATH$pAcquireKeys = PathElement.groupElement("pAcquireKeys");
    public static final PathElement PATH$pAcquireTimeoutMilliseconds = PathElement.groupElement("pAcquireTimeoutMilliseconds");
    public static final PathElement PATH$releaseCount = PathElement.groupElement("releaseCount");
    public static final PathElement PATH$pReleaseSyncs = PathElement.groupElement("pReleaseSyncs");
    public static final PathElement PATH$pReleaseKeys = PathElement.groupElement("pReleaseKeys");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$acquireCount = (OfInt) LAYOUT.select(PATH$acquireCount);
    public static final AddressLayout LAYOUT$pAcquireSyncs = (AddressLayout) LAYOUT.select(PATH$pAcquireSyncs);
    public static final AddressLayout LAYOUT$pAcquireKeys = (AddressLayout) LAYOUT.select(PATH$pAcquireKeys);
    public static final AddressLayout LAYOUT$pAcquireTimeoutMilliseconds = (AddressLayout) LAYOUT.select(PATH$pAcquireTimeoutMilliseconds);
    public static final OfInt LAYOUT$releaseCount = (OfInt) LAYOUT.select(PATH$releaseCount);
    public static final AddressLayout LAYOUT$pReleaseSyncs = (AddressLayout) LAYOUT.select(PATH$pReleaseSyncs);
    public static final AddressLayout LAYOUT$pReleaseKeys = (AddressLayout) LAYOUT.select(PATH$pReleaseKeys);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$acquireCount = LAYOUT.byteOffset(PATH$acquireCount);
    public static final long OFFSET$pAcquireSyncs = LAYOUT.byteOffset(PATH$pAcquireSyncs);
    public static final long OFFSET$pAcquireKeys = LAYOUT.byteOffset(PATH$pAcquireKeys);
    public static final long OFFSET$pAcquireTimeoutMilliseconds = LAYOUT.byteOffset(PATH$pAcquireTimeoutMilliseconds);
    public static final long OFFSET$releaseCount = LAYOUT.byteOffset(PATH$releaseCount);
    public static final long OFFSET$pReleaseSyncs = LAYOUT.byteOffset(PATH$pReleaseSyncs);
    public static final long OFFSET$pReleaseKeys = LAYOUT.byteOffset(PATH$pReleaseKeys);

    public VkWin32KeyedMutexAcquireReleaseInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV);
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
    
    public @nullable VkDeviceMemory pAcquireSyncs() {
        MemorySegment s = pAcquireSyncsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDeviceMemory(s);
    }

    public void pAcquireSyncs(@nullable VkDeviceMemory value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAcquireSyncsRaw(s);
    }

    public @pointer(comment="uint64_t*") MemorySegment pAcquireKeysRaw() {
        return segment.get(LAYOUT$pAcquireKeys, OFFSET$pAcquireKeys);
    }

    public void pAcquireKeysRaw(@pointer(comment="uint64_t*") MemorySegment value) {
        segment.set(LAYOUT$pAcquireKeys, OFFSET$pAcquireKeys, value);
    }
    
    public @unsigned LongBuffer pAcquireKeys() {
        return new LongBuffer(pAcquireKeysRaw());
    }

    public void pAcquireKeys(@unsigned LongBuffer value) {
        pAcquireKeysRaw(value.segment());
    }

    public @pointer(comment="uint32_t*") MemorySegment pAcquireTimeoutMillisecondsRaw() {
        return segment.get(LAYOUT$pAcquireTimeoutMilliseconds, OFFSET$pAcquireTimeoutMilliseconds);
    }

    public void pAcquireTimeoutMillisecondsRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pAcquireTimeoutMilliseconds, OFFSET$pAcquireTimeoutMilliseconds, value);
    }
    
    public @unsigned IntBuffer pAcquireTimeoutMilliseconds() {
        return new IntBuffer(pAcquireTimeoutMillisecondsRaw());
    }

    public void pAcquireTimeoutMilliseconds(@unsigned IntBuffer value) {
        pAcquireTimeoutMillisecondsRaw(value.segment());
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
    
    public @nullable VkDeviceMemory pReleaseSyncs() {
        MemorySegment s = pReleaseSyncsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDeviceMemory(s);
    }

    public void pReleaseSyncs(@nullable VkDeviceMemory value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pReleaseSyncsRaw(s);
    }

    public @pointer(comment="uint64_t*") MemorySegment pReleaseKeysRaw() {
        return segment.get(LAYOUT$pReleaseKeys, OFFSET$pReleaseKeys);
    }

    public void pReleaseKeysRaw(@pointer(comment="uint64_t*") MemorySegment value) {
        segment.set(LAYOUT$pReleaseKeys, OFFSET$pReleaseKeys, value);
    }
    
    public @unsigned LongBuffer pReleaseKeys() {
        return new LongBuffer(pReleaseKeysRaw());
    }

    public void pReleaseKeys(@unsigned LongBuffer value) {
        pReleaseKeysRaw(value.segment());
    }

    public static VkWin32KeyedMutexAcquireReleaseInfoNV allocate(Arena arena) {
        return new VkWin32KeyedMutexAcquireReleaseInfoNV(arena.allocate(LAYOUT));
    }
    
    public static VkWin32KeyedMutexAcquireReleaseInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkWin32KeyedMutexAcquireReleaseInfoNV[] ret = new VkWin32KeyedMutexAcquireReleaseInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkWin32KeyedMutexAcquireReleaseInfoNV(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
