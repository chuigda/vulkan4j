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

public record VkRenderPassStripeBeginInfoARM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stripeInfoCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRenderPassStripeInfoARM.LAYOUT).withName("pStripeInfos")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$stripeInfoCount = PathElement.groupElement("stripeInfoCount");
    public static final PathElement PATH$pStripeInfos = PathElement.groupElement("pStripeInfos");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stripeInfoCount = (OfInt) LAYOUT.select(PATH$stripeInfoCount);
    public static final AddressLayout LAYOUT$pStripeInfos = (AddressLayout) LAYOUT.select(PATH$pStripeInfos);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stripeInfoCount = LAYOUT.byteOffset(PATH$stripeInfoCount);
    public static final long OFFSET$pStripeInfos = LAYOUT.byteOffset(PATH$pStripeInfos);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stripeInfoCount = LAYOUT$stripeInfoCount.byteSize();
    public static final long SIZE$pStripeInfos = LAYOUT$pStripeInfos.byteSize();

    public VkRenderPassStripeBeginInfoARM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_BEGIN_INFO_ARM);
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

    public @unsigned int stripeInfoCount() {
        return segment.get(LAYOUT$stripeInfoCount, OFFSET$stripeInfoCount);
    }

    public void stripeInfoCount(@unsigned int value) {
        segment.set(LAYOUT$stripeInfoCount, OFFSET$stripeInfoCount, value);
    }

    public @pointer(comment="VkRenderPassStripeInfoARM*") MemorySegment pStripeInfosRaw() {
        return segment.get(LAYOUT$pStripeInfos, OFFSET$pStripeInfos);
    }

    public void pStripeInfosRaw(@pointer(comment="VkRenderPassStripeInfoARM*") MemorySegment value) {
        segment.set(LAYOUT$pStripeInfos, OFFSET$pStripeInfos, value);
    }
    
    public @nullable VkRenderPassStripeInfoARM pStripeInfos() {
        MemorySegment s = pStripeInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRenderPassStripeInfoARM(s);
    }

    @unsafe
    public @nullable VkRenderPassStripeInfoARM[] pStripeInfos(int assumedCount) {
        MemorySegment s = pStripeInfosRaw().reinterpret(assumedCount * VkRenderPassStripeInfoARM.SIZE);
        VkRenderPassStripeInfoARM[] arr = new VkRenderPassStripeInfoARM[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkRenderPassStripeInfoARM(s.asSlice(i * VkRenderPassStripeInfoARM.SIZE, VkRenderPassStripeInfoARM.SIZE));
        }
        return arr;
    }

    public void pStripeInfos(@nullable VkRenderPassStripeInfoARM value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStripeInfosRaw(s);
    }

    public static VkRenderPassStripeBeginInfoARM allocate(Arena arena) {
        return new VkRenderPassStripeBeginInfoARM(arena.allocate(LAYOUT));
    }
    
    public static VkRenderPassStripeBeginInfoARM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassStripeBeginInfoARM[] ret = new VkRenderPassStripeBeginInfoARM[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRenderPassStripeBeginInfoARM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
