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

/// Represents a pointer to a {@code VkRenderPassStripeSubmitInfoARM} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassStripeSubmitInfoARM.html">VkRenderPassStripeSubmitInfoARM</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkRenderPassStripeSubmitInfoARM(@NotNull MemorySegment segment) implements IPointer {
    public VkRenderPassStripeSubmitInfoARM {
        sType(VkStructureType.RENDER_PASS_STRIPE_SUBMIT_INFO_ARM);
    }

    public static VkRenderPassStripeSubmitInfoARM allocate(Arena arena) {
        return new VkRenderPassStripeSubmitInfoARM(arena.allocate(LAYOUT));
    }

    public static VkRenderPassStripeSubmitInfoARM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassStripeSubmitInfoARM[] ret = new VkRenderPassStripeSubmitInfoARM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderPassStripeSubmitInfoARM(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkRenderPassStripeSubmitInfoARM clone(Arena arena, VkRenderPassStripeSubmitInfoARM src) {
        VkRenderPassStripeSubmitInfoARM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderPassStripeSubmitInfoARM[] clone(Arena arena, VkRenderPassStripeSubmitInfoARM[] src) {
        VkRenderPassStripeSubmitInfoARM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stripeSemaphoreInfoCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreSubmitInfo.LAYOUT).withName("pStripeSemaphoreInfos")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$stripeSemaphoreInfoCount = PathElement.groupElement("PATH$stripeSemaphoreInfoCount");
    public static final PathElement PATH$pStripeSemaphoreInfos = PathElement.groupElement("PATH$pStripeSemaphoreInfos");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stripeSemaphoreInfoCount = (OfInt) LAYOUT.select(PATH$stripeSemaphoreInfoCount);
    public static final AddressLayout LAYOUT$pStripeSemaphoreInfos = (AddressLayout) LAYOUT.select(PATH$pStripeSemaphoreInfos);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stripeSemaphoreInfoCount = LAYOUT$stripeSemaphoreInfoCount.byteSize();
    public static final long SIZE$pStripeSemaphoreInfos = LAYOUT$pStripeSemaphoreInfos.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stripeSemaphoreInfoCount = LAYOUT.byteOffset(PATH$stripeSemaphoreInfoCount);
    public static final long OFFSET$pStripeSemaphoreInfos = LAYOUT.byteOffset(PATH$pStripeSemaphoreInfos);

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

    public @Nullable VkSemaphoreSubmitInfo pStripeSemaphoreInfos() {
        MemorySegment s = pStripeSemaphoreInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphoreSubmitInfo(s);
    }

    public void pStripeSemaphoreInfos(@Nullable VkSemaphoreSubmitInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStripeSemaphoreInfosRaw(s);
    }

    @unsafe public @Nullable VkSemaphoreSubmitInfo[] pStripeSemaphoreInfos(int assumedCount) {
        MemorySegment s = pStripeSemaphoreInfosRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSemaphoreSubmitInfo.SIZE);
        VkSemaphoreSubmitInfo[] ret = new VkSemaphoreSubmitInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSemaphoreSubmitInfo(s.asSlice(i * VkSemaphoreSubmitInfo.SIZE, VkSemaphoreSubmitInfo.SIZE));
        }
        return ret;
    }

}
