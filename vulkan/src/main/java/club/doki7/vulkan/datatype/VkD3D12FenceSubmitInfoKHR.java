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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkD3D12FenceSubmitInfoKHR.html"><code>VkD3D12FenceSubmitInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkD3D12FenceSubmitInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t waitSemaphoreValuesCount; // optional // @link substring="waitSemaphoreValuesCount" target="#waitSemaphoreValuesCount"
///     uint64_t const* pWaitSemaphoreValues; // optional // @link substring="pWaitSemaphoreValues" target="#pWaitSemaphoreValues"
///     uint32_t signalSemaphoreValuesCount; // optional // @link substring="signalSemaphoreValuesCount" target="#signalSemaphoreValuesCount"
///     uint64_t const* pSignalSemaphoreValues; // optional // @link substring="pSignalSemaphoreValues" target="#pSignalSemaphoreValues"
/// } VkD3D12FenceSubmitInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR`
///
/// The {@code allocate} ({@link VkD3D12FenceSubmitInfoKHR#allocate(Arena)}, {@link VkD3D12FenceSubmitInfoKHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkD3D12FenceSubmitInfoKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkD3D12FenceSubmitInfoKHR.html"><code>VkD3D12FenceSubmitInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkD3D12FenceSubmitInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkD3D12FenceSubmitInfoKHR allocate(Arena arena) {
        VkD3D12FenceSubmitInfoKHR ret = new VkD3D12FenceSubmitInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.D3D12_FENCE_SUBMIT_INFO_KHR);
        return ret;
    }

    public static VkD3D12FenceSubmitInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkD3D12FenceSubmitInfoKHR[] ret = new VkD3D12FenceSubmitInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkD3D12FenceSubmitInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.D3D12_FENCE_SUBMIT_INFO_KHR);
        }
        return ret;
    }

    public static VkD3D12FenceSubmitInfoKHR clone(Arena arena, VkD3D12FenceSubmitInfoKHR src) {
        VkD3D12FenceSubmitInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkD3D12FenceSubmitInfoKHR[] clone(Arena arena, VkD3D12FenceSubmitInfoKHR[] src) {
        VkD3D12FenceSubmitInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.D3D12_FENCE_SUBMIT_INFO_KHR);
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

    public @unsigned int waitSemaphoreValuesCount() {
        return segment.get(LAYOUT$waitSemaphoreValuesCount, OFFSET$waitSemaphoreValuesCount);
    }

    public void waitSemaphoreValuesCount(@unsigned int value) {
        segment.set(LAYOUT$waitSemaphoreValuesCount, OFFSET$waitSemaphoreValuesCount, value);
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned LongPtr pWaitSemaphoreValues() {
        MemorySegment s = pWaitSemaphoreValuesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new LongPtr(s);
    }

    public void pWaitSemaphoreValues(@Nullable @unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pWaitSemaphoreValuesRaw(s);
    }

    public @pointer(comment="long*") MemorySegment pWaitSemaphoreValuesRaw() {
        return segment.get(LAYOUT$pWaitSemaphoreValues, OFFSET$pWaitSemaphoreValues);
    }

    public void pWaitSemaphoreValuesRaw(@pointer(comment="long*") MemorySegment value) {
        segment.set(LAYOUT$pWaitSemaphoreValues, OFFSET$pWaitSemaphoreValues, value);
    }

    public @unsigned int signalSemaphoreValuesCount() {
        return segment.get(LAYOUT$signalSemaphoreValuesCount, OFFSET$signalSemaphoreValuesCount);
    }

    public void signalSemaphoreValuesCount(@unsigned int value) {
        segment.set(LAYOUT$signalSemaphoreValuesCount, OFFSET$signalSemaphoreValuesCount, value);
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned LongPtr pSignalSemaphoreValues() {
        MemorySegment s = pSignalSemaphoreValuesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new LongPtr(s);
    }

    public void pSignalSemaphoreValues(@Nullable @unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSignalSemaphoreValuesRaw(s);
    }

    public @pointer(comment="long*") MemorySegment pSignalSemaphoreValuesRaw() {
        return segment.get(LAYOUT$pSignalSemaphoreValues, OFFSET$pSignalSemaphoreValues);
    }

    public void pSignalSemaphoreValuesRaw(@pointer(comment="long*") MemorySegment value) {
        segment.set(LAYOUT$pSignalSemaphoreValues, OFFSET$pSignalSemaphoreValues, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreValuesCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pWaitSemaphoreValues"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreValuesCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pSignalSemaphoreValues")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$waitSemaphoreValuesCount = PathElement.groupElement("waitSemaphoreValuesCount");
    public static final PathElement PATH$pWaitSemaphoreValues = PathElement.groupElement("pWaitSemaphoreValues");
    public static final PathElement PATH$signalSemaphoreValuesCount = PathElement.groupElement("signalSemaphoreValuesCount");
    public static final PathElement PATH$pSignalSemaphoreValues = PathElement.groupElement("pSignalSemaphoreValues");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$waitSemaphoreValuesCount = (OfInt) LAYOUT.select(PATH$waitSemaphoreValuesCount);
    public static final AddressLayout LAYOUT$pWaitSemaphoreValues = (AddressLayout) LAYOUT.select(PATH$pWaitSemaphoreValues);
    public static final OfInt LAYOUT$signalSemaphoreValuesCount = (OfInt) LAYOUT.select(PATH$signalSemaphoreValuesCount);
    public static final AddressLayout LAYOUT$pSignalSemaphoreValues = (AddressLayout) LAYOUT.select(PATH$pSignalSemaphoreValues);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$waitSemaphoreValuesCount = LAYOUT$waitSemaphoreValuesCount.byteSize();
    public static final long SIZE$pWaitSemaphoreValues = LAYOUT$pWaitSemaphoreValues.byteSize();
    public static final long SIZE$signalSemaphoreValuesCount = LAYOUT$signalSemaphoreValuesCount.byteSize();
    public static final long SIZE$pSignalSemaphoreValues = LAYOUT$pSignalSemaphoreValues.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$waitSemaphoreValuesCount = LAYOUT.byteOffset(PATH$waitSemaphoreValuesCount);
    public static final long OFFSET$pWaitSemaphoreValues = LAYOUT.byteOffset(PATH$pWaitSemaphoreValues);
    public static final long OFFSET$signalSemaphoreValuesCount = LAYOUT.byteOffset(PATH$signalSemaphoreValuesCount);
    public static final long OFFSET$pSignalSemaphoreValues = LAYOUT.byteOffset(PATH$pSignalSemaphoreValues);
}
