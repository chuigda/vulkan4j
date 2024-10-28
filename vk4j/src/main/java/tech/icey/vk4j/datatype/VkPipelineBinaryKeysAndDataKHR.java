package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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
/// typedef struct VkPipelineBinaryKeysAndDataKHR {
///     uint32_t binaryCount;
///     const VkPipelineBinaryKeyKHR* pPipelineBinaryKeys;
///     const VkPipelineBinaryDataKHR* pPipelineBinaryData;
/// } VkPipelineBinaryKeysAndDataKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineBinaryKeysAndDataKHR.html">VkPipelineBinaryKeysAndDataKHR</a>
public record VkPipelineBinaryKeysAndDataKHR(MemorySegment segment) implements IPointer {
    public VkPipelineBinaryKeysAndDataKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int binaryCount() {
        return segment.get(LAYOUT$binaryCount, OFFSET$binaryCount);
    }

    public void binaryCount(@unsigned int value) {
        segment.set(LAYOUT$binaryCount, OFFSET$binaryCount, value);
    }

    public @pointer(comment="VkPipelineBinaryKeyKHR*") MemorySegment pPipelineBinaryKeysRaw() {
        return segment.get(LAYOUT$pPipelineBinaryKeys, OFFSET$pPipelineBinaryKeys);
    }

    public void pPipelineBinaryKeysRaw(@pointer(comment="VkPipelineBinaryKeyKHR*") MemorySegment value) {
        segment.set(LAYOUT$pPipelineBinaryKeys, OFFSET$pPipelineBinaryKeys, value);
    }

    public @nullable VkPipelineBinaryKeyKHR pPipelineBinaryKeys() {
        MemorySegment s = pPipelineBinaryKeysRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineBinaryKeyKHR(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkPipelineBinaryKeyKHR[] pPipelineBinaryKeys(int assumedCount) {
        MemorySegment s = pPipelineBinaryKeysRaw().reinterpret(assumedCount * VkPipelineBinaryKeyKHR.SIZE);
        VkPipelineBinaryKeyKHR[] arr = new VkPipelineBinaryKeyKHR[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPipelineBinaryKeyKHR(s.asSlice(i * VkPipelineBinaryKeyKHR.SIZE, VkPipelineBinaryKeyKHR.SIZE));
        }
        return arr;
    }

    public void pPipelineBinaryKeys(@nullable VkPipelineBinaryKeyKHR value) {
        pPipelineBinaryKeysRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @pointer(comment="VkPipelineBinaryDataKHR*") MemorySegment pPipelineBinaryDataRaw() {
        return segment.get(LAYOUT$pPipelineBinaryData, OFFSET$pPipelineBinaryData);
    }

    public void pPipelineBinaryDataRaw(@pointer(comment="VkPipelineBinaryDataKHR*") MemorySegment value) {
        segment.set(LAYOUT$pPipelineBinaryData, OFFSET$pPipelineBinaryData, value);
    }

    public @nullable VkPipelineBinaryDataKHR pPipelineBinaryData() {
        MemorySegment s = pPipelineBinaryDataRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineBinaryDataKHR(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkPipelineBinaryDataKHR[] pPipelineBinaryData(int assumedCount) {
        MemorySegment s = pPipelineBinaryDataRaw().reinterpret(assumedCount * VkPipelineBinaryDataKHR.SIZE);
        VkPipelineBinaryDataKHR[] arr = new VkPipelineBinaryDataKHR[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkPipelineBinaryDataKHR(s.asSlice(i * VkPipelineBinaryDataKHR.SIZE, VkPipelineBinaryDataKHR.SIZE));
        }
        return arr;
    }

    public void pPipelineBinaryData(@nullable VkPipelineBinaryDataKHR value) {
        pPipelineBinaryDataRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkPipelineBinaryKeysAndDataKHR allocate(Arena arena) {
        return new VkPipelineBinaryKeysAndDataKHR(arena.allocate(LAYOUT));
    }

    public static VkPipelineBinaryKeysAndDataKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineBinaryKeysAndDataKHR[] ret = new VkPipelineBinaryKeysAndDataKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineBinaryKeysAndDataKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineBinaryKeysAndDataKHR clone(Arena arena, VkPipelineBinaryKeysAndDataKHR src) {
        VkPipelineBinaryKeysAndDataKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineBinaryKeysAndDataKHR[] clone(Arena arena, VkPipelineBinaryKeysAndDataKHR[] src) {
        VkPipelineBinaryKeysAndDataKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("binaryCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineBinaryKeyKHR.LAYOUT).withName("pPipelineBinaryKeys"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineBinaryDataKHR.LAYOUT).withName("pPipelineBinaryData")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$binaryCount = PathElement.groupElement("binaryCount");
    public static final PathElement PATH$pPipelineBinaryKeys = PathElement.groupElement("pPipelineBinaryKeys");
    public static final PathElement PATH$pPipelineBinaryData = PathElement.groupElement("pPipelineBinaryData");

    public static final OfInt LAYOUT$binaryCount = (OfInt) LAYOUT.select(PATH$binaryCount);
    public static final AddressLayout LAYOUT$pPipelineBinaryKeys = (AddressLayout) LAYOUT.select(PATH$pPipelineBinaryKeys);
    public static final AddressLayout LAYOUT$pPipelineBinaryData = (AddressLayout) LAYOUT.select(PATH$pPipelineBinaryData);

    public static final long OFFSET$binaryCount = LAYOUT.byteOffset(PATH$binaryCount);
    public static final long OFFSET$pPipelineBinaryKeys = LAYOUT.byteOffset(PATH$pPipelineBinaryKeys);
    public static final long OFFSET$pPipelineBinaryData = LAYOUT.byteOffset(PATH$pPipelineBinaryData);

    public static final long SIZE$binaryCount = LAYOUT$binaryCount.byteSize();
    public static final long SIZE$pPipelineBinaryKeys = LAYOUT$pPipelineBinaryKeys.byteSize();
    public static final long SIZE$pPipelineBinaryData = LAYOUT$pPipelineBinaryData.byteSize();
}
