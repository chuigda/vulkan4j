package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeRateControlInfoKHR.html"><code>VkVideoEncodeRateControlInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeRateControlInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkVideoEncodeRateControlFlagsKHR flags; // optional
///     VkVideoEncodeRateControlModeFlagsKHR rateControlMode; // optional
///     uint32_t layerCount; // optional
///     VkVideoEncodeRateControlLayerInfoKHR const* pLayers;
///     uint32_t virtualBufferSizeInMs;
///     uint32_t initialVirtualBufferSizeInMs;
/// } VkVideoEncodeRateControlInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_RATE_CONTROL_INFO_KHR`
///
/// The {@link VkVideoEncodeRateControlInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoEncodeRateControlInfoKHR#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeRateControlInfoKHR.html"><code>VkVideoEncodeRateControlInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeRateControlInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeRateControlInfoKHR allocate(Arena arena) {
        VkVideoEncodeRateControlInfoKHR ret = new VkVideoEncodeRateControlInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_RATE_CONTROL_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeRateControlInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeRateControlInfoKHR[] ret = new VkVideoEncodeRateControlInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeRateControlInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_RATE_CONTROL_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeRateControlInfoKHR clone(Arena arena, VkVideoEncodeRateControlInfoKHR src) {
        VkVideoEncodeRateControlInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeRateControlInfoKHR[] clone(Arena arena, VkVideoEncodeRateControlInfoKHR[] src) {
        VkVideoEncodeRateControlInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_RATE_CONTROL_INFO_KHR);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkVideoEncodeRateControlFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkVideoEncodeRateControlFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkVideoEncodeRateControlModeFlagsKHR.class) int rateControlMode() {
        return segment.get(LAYOUT$rateControlMode, OFFSET$rateControlMode);
    }

    public void rateControlMode(@enumtype(VkVideoEncodeRateControlModeFlagsKHR.class) int value) {
        segment.set(LAYOUT$rateControlMode, OFFSET$rateControlMode, value);
    }

    public @unsigned int layerCount() {
        return segment.get(LAYOUT$layerCount, OFFSET$layerCount);
    }

    public void layerCount(@unsigned int value) {
        segment.set(LAYOUT$layerCount, OFFSET$layerCount, value);
    }

    public @pointer(comment="VkVideoEncodeRateControlLayerInfoKHR*") MemorySegment pLayersRaw() {
        return segment.get(LAYOUT$pLayers, OFFSET$pLayers);
    }

    public void pLayersRaw(@pointer(comment="VkVideoEncodeRateControlLayerInfoKHR*") MemorySegment value) {
        segment.set(LAYOUT$pLayers, OFFSET$pLayers, value);
    }

    public @Nullable VkVideoEncodeRateControlLayerInfoKHR pLayers() {
        MemorySegment s = pLayersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkVideoEncodeRateControlLayerInfoKHR(s);
    }

    public void pLayers(@Nullable VkVideoEncodeRateControlLayerInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLayersRaw(s);
    }

    @unsafe public @Nullable VkVideoEncodeRateControlLayerInfoKHR[] pLayers(int assumedCount) {
        MemorySegment s = pLayersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVideoEncodeRateControlLayerInfoKHR.BYTES);
        VkVideoEncodeRateControlLayerInfoKHR[] ret = new VkVideoEncodeRateControlLayerInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkVideoEncodeRateControlLayerInfoKHR(s.asSlice(i * VkVideoEncodeRateControlLayerInfoKHR.BYTES, VkVideoEncodeRateControlLayerInfoKHR.BYTES));
        }
        return ret;
    }

    public @unsigned int virtualBufferSizeInMs() {
        return segment.get(LAYOUT$virtualBufferSizeInMs, OFFSET$virtualBufferSizeInMs);
    }

    public void virtualBufferSizeInMs(@unsigned int value) {
        segment.set(LAYOUT$virtualBufferSizeInMs, OFFSET$virtualBufferSizeInMs, value);
    }

    public @unsigned int initialVirtualBufferSizeInMs() {
        return segment.get(LAYOUT$initialVirtualBufferSizeInMs, OFFSET$initialVirtualBufferSizeInMs);
    }

    public void initialVirtualBufferSizeInMs(@unsigned int value) {
        segment.set(LAYOUT$initialVirtualBufferSizeInMs, OFFSET$initialVirtualBufferSizeInMs, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("rateControlMode"),
        ValueLayout.JAVA_INT.withName("layerCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkVideoEncodeRateControlLayerInfoKHR.LAYOUT).withName("pLayers"),
        ValueLayout.JAVA_INT.withName("virtualBufferSizeInMs"),
        ValueLayout.JAVA_INT.withName("initialVirtualBufferSizeInMs")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$rateControlMode = PathElement.groupElement("PATH$rateControlMode");
    public static final PathElement PATH$layerCount = PathElement.groupElement("PATH$layerCount");
    public static final PathElement PATH$pLayers = PathElement.groupElement("PATH$pLayers");
    public static final PathElement PATH$virtualBufferSizeInMs = PathElement.groupElement("PATH$virtualBufferSizeInMs");
    public static final PathElement PATH$initialVirtualBufferSizeInMs = PathElement.groupElement("PATH$initialVirtualBufferSizeInMs");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$rateControlMode = (OfInt) LAYOUT.select(PATH$rateControlMode);
    public static final OfInt LAYOUT$layerCount = (OfInt) LAYOUT.select(PATH$layerCount);
    public static final AddressLayout LAYOUT$pLayers = (AddressLayout) LAYOUT.select(PATH$pLayers);
    public static final OfInt LAYOUT$virtualBufferSizeInMs = (OfInt) LAYOUT.select(PATH$virtualBufferSizeInMs);
    public static final OfInt LAYOUT$initialVirtualBufferSizeInMs = (OfInt) LAYOUT.select(PATH$initialVirtualBufferSizeInMs);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$rateControlMode = LAYOUT$rateControlMode.byteSize();
    public static final long SIZE$layerCount = LAYOUT$layerCount.byteSize();
    public static final long SIZE$pLayers = LAYOUT$pLayers.byteSize();
    public static final long SIZE$virtualBufferSizeInMs = LAYOUT$virtualBufferSizeInMs.byteSize();
    public static final long SIZE$initialVirtualBufferSizeInMs = LAYOUT$initialVirtualBufferSizeInMs.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$rateControlMode = LAYOUT.byteOffset(PATH$rateControlMode);
    public static final long OFFSET$layerCount = LAYOUT.byteOffset(PATH$layerCount);
    public static final long OFFSET$pLayers = LAYOUT.byteOffset(PATH$pLayers);
    public static final long OFFSET$virtualBufferSizeInMs = LAYOUT.byteOffset(PATH$virtualBufferSizeInMs);
    public static final long OFFSET$initialVirtualBufferSizeInMs = LAYOUT.byteOffset(PATH$initialVirtualBufferSizeInMs);
}
