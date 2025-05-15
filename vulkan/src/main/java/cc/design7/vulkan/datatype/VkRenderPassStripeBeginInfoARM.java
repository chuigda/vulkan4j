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

public record VkRenderPassStripeBeginInfoARM(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$stripeInfoCount = ValueLayout.JAVA_INT.withName("stripeInfoCount");
    public static final AddressLayout LAYOUT$pStripeInfos = ValueLayout.ADDRESS.withTargetLayout(VkRenderPassStripeInfoARM.LAYOUT).withName("pStripeInfos");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$stripeInfoCount, LAYOUT$pStripeInfos);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkRenderPassStripeBeginInfoARM allocate(Arena arena) {
        return new VkRenderPassStripeBeginInfoARM(arena.allocate(LAYOUT));
    }

    public static VkRenderPassStripeBeginInfoARM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassStripeBeginInfoARM[] ret = new VkRenderPassStripeBeginInfoARM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderPassStripeBeginInfoARM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRenderPassStripeBeginInfoARM clone(Arena arena, VkRenderPassStripeBeginInfoARM src) {
        VkRenderPassStripeBeginInfoARM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderPassStripeBeginInfoARM[] clone(Arena arena, VkRenderPassStripeBeginInfoARM[] src) {
        VkRenderPassStripeBeginInfoARM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$stripeInfoCount = PathElement.groupElement("PATH$stripeInfoCount");
    public static final PathElement PATH$pStripeInfos = PathElement.groupElement("PATH$pStripeInfos");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stripeInfoCount = LAYOUT$stripeInfoCount.byteSize();
    public static final long SIZE$pStripeInfos = LAYOUT$pStripeInfos.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stripeInfoCount = LAYOUT.byteOffset(PATH$stripeInfoCount);
    public static final long OFFSET$pStripeInfos = LAYOUT.byteOffset(PATH$pStripeInfos);

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

    public @Nullable VkRenderPassStripeInfoARM pStripeInfos() {
        MemorySegment s = pStripeInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRenderPassStripeInfoARM(s);
    }

    public void pStripeInfos(@Nullable VkRenderPassStripeInfoARM value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStripeInfosRaw(s);
    }

    @unsafe public @Nullable VkRenderPassStripeInfoARM[] pStripeInfos(int assumedCount) {
        MemorySegment s = pStripeInfosRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkRenderPassStripeInfoARM.SIZE);
        VkRenderPassStripeInfoARM[] ret = new VkRenderPassStripeInfoARM[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkRenderPassStripeInfoARM(s.asSlice(i * VkRenderPassStripeInfoARM.SIZE, VkRenderPassStripeInfoARM.SIZE));
        }
        return ret;
    }

}
/// dummy, not implemented yet
