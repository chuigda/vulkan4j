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
/// typedef struct VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t semaphoreSciSyncPoolRequestCount;
/// } VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV.html">VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV</a>
public record VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV(MemorySegment segment) implements IPointer {
    public VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_SEMAPHORE_SCI_SYNC_POOL_RESERVATION_CREATE_INFO_NV);
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

    public @unsigned int semaphoreSciSyncPoolRequestCount() {
        return segment.get(LAYOUT$semaphoreSciSyncPoolRequestCount, OFFSET$semaphoreSciSyncPoolRequestCount);
    }

    public void semaphoreSciSyncPoolRequestCount(@unsigned int value) {
        segment.set(LAYOUT$semaphoreSciSyncPoolRequestCount, OFFSET$semaphoreSciSyncPoolRequestCount, value);
    }

    public static VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV allocate(Arena arena) {
        return new VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV[] ret = new VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV clone(Arena arena, VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV src) {
        VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV[] clone(Arena arena, VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV[] src) {
        VkDeviceSemaphoreSciSyncPoolReservationCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("semaphoreSciSyncPoolRequestCount")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$semaphoreSciSyncPoolRequestCount = PathElement.groupElement("semaphoreSciSyncPoolRequestCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$semaphoreSciSyncPoolRequestCount = (OfInt) LAYOUT.select(PATH$semaphoreSciSyncPoolRequestCount);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$semaphoreSciSyncPoolRequestCount = LAYOUT.byteOffset(PATH$semaphoreSciSyncPoolRequestCount);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$semaphoreSciSyncPoolRequestCount = LAYOUT$semaphoreSciSyncPoolRequestCount.byteSize();
}
