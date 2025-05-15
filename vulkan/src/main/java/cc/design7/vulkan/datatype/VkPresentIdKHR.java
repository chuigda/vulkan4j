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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPresentIdKHR.html"><code>VkPresentIdKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPresentIdKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t swapchainCount;
///     uint64_t const* pPresentIds; // optional
/// } VkPresentIdKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PRESENT_ID_KHR`
///
/// The {@link VkPresentIdKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPresentIdKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPresentIdKHR.html"><code>VkPresentIdKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPresentIdKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkPresentIdKHR allocate(Arena arena) {
        VkPresentIdKHR ret = new VkPresentIdKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PRESENT_ID_KHR);
        return ret;
    }

    public static VkPresentIdKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPresentIdKHR[] ret = new VkPresentIdKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPresentIdKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PRESENT_ID_KHR);
        }
        return ret;
    }

    public static VkPresentIdKHR clone(Arena arena, VkPresentIdKHR src) {
        VkPresentIdKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPresentIdKHR[] clone(Arena arena, VkPresentIdKHR[] src) {
        VkPresentIdKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PRESENT_ID_KHR);
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

    public @unsigned int swapchainCount() {
        return segment.get(LAYOUT$swapchainCount, OFFSET$swapchainCount);
    }

    public void swapchainCount(@unsigned int value) {
        segment.set(LAYOUT$swapchainCount, OFFSET$swapchainCount, value);
    }

    public @pointer(comment="long*") MemorySegment pPresentIdsRaw() {
        return segment.get(LAYOUT$pPresentIds, OFFSET$pPresentIds);
    }

    public void pPresentIdsRaw(@pointer(comment="long*") MemorySegment value) {
        segment.set(LAYOUT$pPresentIds, OFFSET$pPresentIds, value);
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned LongPtr pPresentIds() {
        MemorySegment s = pPresentIdsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new LongPtr(s);
    }

    public void pPresentIds(@Nullable @unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPresentIdsRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pPresentIds")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$swapchainCount = PathElement.groupElement("PATH$swapchainCount");
    public static final PathElement PATH$pPresentIds = PathElement.groupElement("PATH$pPresentIds");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$swapchainCount = (OfInt) LAYOUT.select(PATH$swapchainCount);
    public static final AddressLayout LAYOUT$pPresentIds = (AddressLayout) LAYOUT.select(PATH$pPresentIds);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$swapchainCount = LAYOUT$swapchainCount.byteSize();
    public static final long SIZE$pPresentIds = LAYOUT$pPresentIds.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchainCount = LAYOUT.byteOffset(PATH$swapchainCount);
    public static final long OFFSET$pPresentIds = LAYOUT.byteOffset(PATH$pPresentIds);
}
