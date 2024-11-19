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
/// typedef struct VkSemaphoreSciSyncCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkSemaphoreSciSyncPoolNV semaphorePool;
///     const NvSciSyncFence* pFence;
/// } VkSemaphoreSciSyncCreateInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSemaphoreSciSyncCreateInfoNV.html">VkSemaphoreSciSyncCreateInfoNV</a>
public record VkSemaphoreSciSyncCreateInfoNV(MemorySegment segment) implements IPointer {
    public VkSemaphoreSciSyncCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SEMAPHORE_SCI_SYNC_CREATE_INFO_NV);
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

    public @Nullable VkSemaphoreSciSyncPoolNV semaphorePool() {
        MemorySegment s = segment.get(LAYOUT$semaphorePool, OFFSET$semaphorePool);
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphoreSciSyncPoolNV(s);
    }

    public void semaphorePool(@Nullable VkSemaphoreSciSyncPoolNV value) {
        segment.set(
            LAYOUT$semaphorePool,
            OFFSET$semaphorePool,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @pointer(comment="uint64_t[6] const*") MemorySegment pFenceRaw() {
        return segment.get(LAYOUT$pFence, OFFSET$pFence);
    }

    public void pFenceRaw(@pointer(comment="uint64_t[6] const*") MemorySegment value) {
        segment.set(LAYOUT$pFence, OFFSET$pFence, value);
    }

    public static VkSemaphoreSciSyncCreateInfoNV allocate(Arena arena) {
        return new VkSemaphoreSciSyncCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkSemaphoreSciSyncCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSemaphoreSciSyncCreateInfoNV[] ret = new VkSemaphoreSciSyncCreateInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSemaphoreSciSyncCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSemaphoreSciSyncCreateInfoNV clone(Arena arena, VkSemaphoreSciSyncCreateInfoNV src) {
        VkSemaphoreSciSyncCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSemaphoreSciSyncCreateInfoNV[] clone(Arena arena, VkSemaphoreSciSyncCreateInfoNV[] src) {
        VkSemaphoreSciSyncCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("semaphorePool"),
        ValueLayout.ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(6, ValueLayout.JAVA_LONG)).withName("pFence")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$semaphorePool = PathElement.groupElement("semaphorePool");
    public static final PathElement PATH$pFence = PathElement.groupElement("pFence");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$semaphorePool = (AddressLayout) LAYOUT.select(PATH$semaphorePool);
    public static final AddressLayout LAYOUT$pFence = (AddressLayout) LAYOUT.select(PATH$pFence);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$semaphorePool = LAYOUT.byteOffset(PATH$semaphorePool);
    public static final long OFFSET$pFence = LAYOUT.byteOffset(PATH$pFence);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$semaphorePool = LAYOUT$semaphorePool.byteSize();
    public static final long SIZE$pFence = LAYOUT$pFence.byteSize();
}
