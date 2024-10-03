package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsafe;
import tech.icey.panama.annotation.unsigned;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;

/// {@snippet lang=c :
/// typedef struct VkPresentRegionKHR {
///     uint32_t rectangleCount;
///     const VkRectLayerKHR* pRectangles;
/// } VkPresentRegionKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPresentRegionKHR.html">VkPresentRegionKHR</a>
public record VkPresentRegionKHR(MemorySegment segment) implements IPointer {
    public VkPresentRegionKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int rectangleCount() {
        return segment.get(LAYOUT$rectangleCount, OFFSET$rectangleCount);
    }

    public void rectangleCount(@unsigned int value) {
        segment.set(LAYOUT$rectangleCount, OFFSET$rectangleCount, value);
    }

    public @pointer(comment="VkRectLayerKHR*") MemorySegment pRectanglesRaw() {
        return segment.get(LAYOUT$pRectangles, OFFSET$pRectangles);
    }

    public void pRectanglesRaw(@pointer(comment="VkRectLayerKHR*") MemorySegment value) {
        segment.set(LAYOUT$pRectangles, OFFSET$pRectangles, value);
    }

    public @nullable VkRectLayerKHR pRectangles() {
        MemorySegment s = pRectanglesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRectLayerKHR(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkRectLayerKHR[] pRectangles(int assumedCount) {
        MemorySegment s = pRectanglesRaw().reinterpret(assumedCount * VkRectLayerKHR.SIZE);
        VkRectLayerKHR[] arr = new VkRectLayerKHR[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkRectLayerKHR(s.asSlice(i * VkRectLayerKHR.SIZE, VkRectLayerKHR.SIZE));
        }
        return arr;
    }

    public void pRectangles(@nullable VkRectLayerKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRectanglesRaw(s);
    }

    public static VkPresentRegionKHR allocate(Arena arena) {
        return new VkPresentRegionKHR(arena.allocate(LAYOUT));
    }

    public static VkPresentRegionKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPresentRegionKHR[] ret = new VkPresentRegionKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPresentRegionKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPresentRegionKHR clone(Arena arena, VkPresentRegionKHR src) {
        VkPresentRegionKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPresentRegionKHR[] clone(Arena arena, VkPresentRegionKHR[] src) {
        VkPresentRegionKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("rectangleCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRectLayerKHR.LAYOUT).withName("pRectangles")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$rectangleCount = PathElement.groupElement("rectangleCount");
    public static final PathElement PATH$pRectangles = PathElement.groupElement("pRectangles");

    public static final OfInt LAYOUT$rectangleCount = (OfInt) LAYOUT.select(PATH$rectangleCount);
    public static final AddressLayout LAYOUT$pRectangles = (AddressLayout) LAYOUT.select(PATH$pRectangles);

    public static final long OFFSET$rectangleCount = LAYOUT.byteOffset(PATH$rectangleCount);
    public static final long OFFSET$pRectangles = LAYOUT.byteOffset(PATH$pRectangles);

    public static final long SIZE$rectangleCount = LAYOUT$rectangleCount.byteSize();
    public static final long SIZE$pRectangles = LAYOUT$pRectangles.byteSize();
}
