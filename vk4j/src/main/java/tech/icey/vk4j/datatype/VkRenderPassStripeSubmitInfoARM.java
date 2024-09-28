package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkRenderPassStripeSubmitInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t stripeSemaphoreInfoCount;
///     const VkSemaphoreSubmitInfo* pStripeSemaphoreInfos;
/// } VkRenderPassStripeSubmitInfoARM;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkRenderPassStripeSubmitInfoARM.html">VkRenderPassStripeSubmitInfoARM</a>
public record VkRenderPassStripeSubmitInfoARM(MemorySegment segment) implements IPointer {
    public VkRenderPassStripeSubmitInfoARM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_SUBMIT_INFO_ARM);
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

    public @unsigned int stripeSemaphoreInfoCount() {
        return segment.get(LAYOUT$stripeSemaphoreInfoCount, OFFSET$stripeSemaphoreInfoCount);
    }

    public void stripeSemaphoreInfoCount(@unsigned int value) {
        segment.set(LAYOUT$stripeSemaphoreInfoCount, OFFSET$stripeSemaphoreInfoCount, value);
    }

    public @pointer(comment="VkSemaphoreSubmitInfo*") MemorySegment pStripeSemaphoreInfosRaw() {
        return segment.get(LAYOUT$pStripeSemaphoreInfos, OFFSET$pStripeSemaphoreInfos);
    }

    public void pStripeSemaphoreInfosRaw(@pointer(comment="VkSemaphoreSubmitInfo*") MemorySegment value) {
        segment.set(LAYOUT$pStripeSemaphoreInfos, OFFSET$pStripeSemaphoreInfos, value);
    }

    public @nullable VkSemaphoreSubmitInfo pStripeSemaphoreInfos() {
        MemorySegment s = pStripeSemaphoreInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphoreSubmitInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkSemaphoreSubmitInfo[] pStripeSemaphoreInfos(int assumedCount) {
        MemorySegment s = pStripeSemaphoreInfosRaw().reinterpret(assumedCount * VkSemaphoreSubmitInfo.SIZE);
        VkSemaphoreSubmitInfo[] arr = new VkSemaphoreSubmitInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkSemaphoreSubmitInfo(s.asSlice(i * VkSemaphoreSubmitInfo.SIZE, VkSemaphoreSubmitInfo.SIZE));
        }
        return arr;
    }

    public void pStripeSemaphoreInfos(@nullable VkSemaphoreSubmitInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStripeSemaphoreInfosRaw(s);
    }

    public static VkRenderPassStripeSubmitInfoARM allocate(Arena arena) {
        return new VkRenderPassStripeSubmitInfoARM(arena.allocate(LAYOUT));
    }
    
    public static VkRenderPassStripeSubmitInfoARM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassStripeSubmitInfoARM[] ret = new VkRenderPassStripeSubmitInfoARM[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRenderPassStripeSubmitInfoARM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stripeSemaphoreInfoCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreSubmitInfo.LAYOUT).withName("pStripeSemaphoreInfos")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$stripeSemaphoreInfoCount = PathElement.groupElement("stripeSemaphoreInfoCount");
    public static final PathElement PATH$pStripeSemaphoreInfos = PathElement.groupElement("pStripeSemaphoreInfos");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stripeSemaphoreInfoCount = (OfInt) LAYOUT.select(PATH$stripeSemaphoreInfoCount);
    public static final AddressLayout LAYOUT$pStripeSemaphoreInfos = (AddressLayout) LAYOUT.select(PATH$pStripeSemaphoreInfos);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stripeSemaphoreInfoCount = LAYOUT.byteOffset(PATH$stripeSemaphoreInfoCount);
    public static final long OFFSET$pStripeSemaphoreInfos = LAYOUT.byteOffset(PATH$pStripeSemaphoreInfos);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stripeSemaphoreInfoCount = LAYOUT$stripeSemaphoreInfoCount.byteSize();
    public static final long SIZE$pStripeSemaphoreInfos = LAYOUT$pStripeSemaphoreInfos.byteSize();

}
