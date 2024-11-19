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
/// typedef struct VkRenderPassStripeBeginInfoARM {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t stripeInfoCount;
///     const VkRenderPassStripeInfoARM* pStripeInfos;
/// } VkRenderPassStripeBeginInfoARM;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkRenderPassStripeBeginInfoARM.html">VkRenderPassStripeBeginInfoARM</a>
public record VkRenderPassStripeBeginInfoARM(MemorySegment segment) implements IPointer {
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkRenderPassStripeInfoARM[] pStripeInfos(int assumedCount) {
        MemorySegment s = pStripeInfosRaw().reinterpret(assumedCount * VkRenderPassStripeInfoARM.SIZE);
        VkRenderPassStripeInfoARM[] arr = new VkRenderPassStripeInfoARM[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkRenderPassStripeInfoARM(s.asSlice(i * VkRenderPassStripeInfoARM.SIZE, VkRenderPassStripeInfoARM.SIZE));
        }
        return arr;
    }

    public void pStripeInfos(@Nullable VkRenderPassStripeInfoARM value) {
        pStripeInfosRaw(value == null ? MemorySegment.NULL : value.segment());
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

    public static VkRenderPassStripeBeginInfoARM clone(Arena arena, VkRenderPassStripeBeginInfoARM src) {
        VkRenderPassStripeBeginInfoARM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderPassStripeBeginInfoARM[] clone(Arena arena, VkRenderPassStripeBeginInfoARM[] src) {
        VkRenderPassStripeBeginInfoARM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

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
}
