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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSwapchainPresentFenceInfoEXT.html"><code>VkSwapchainPresentFenceInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSwapchainPresentFenceInfoEXT {
///     VkStructureType sType;
///     void const* pNext;
///     uint32_t swapchainCount;
///     VkFence const* pFences;
/// } VkSwapchainPresentFenceInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT`
///
/// The {@link VkSwapchainPresentFenceInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkSwapchainPresentFenceInfoEXT#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSwapchainPresentFenceInfoEXT.html"><code>VkSwapchainPresentFenceInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSwapchainPresentFenceInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkSwapchainPresentFenceInfoEXT allocate(Arena arena) {
        VkSwapchainPresentFenceInfoEXT ret = new VkSwapchainPresentFenceInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SWAPCHAIN_PRESENT_FENCE_INFO_EXT);
        return ret;
    }

    public static VkSwapchainPresentFenceInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSwapchainPresentFenceInfoEXT[] ret = new VkSwapchainPresentFenceInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSwapchainPresentFenceInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SWAPCHAIN_PRESENT_FENCE_INFO_EXT);
        }
        return ret;
    }

    public static VkSwapchainPresentFenceInfoEXT clone(Arena arena, VkSwapchainPresentFenceInfoEXT src) {
        VkSwapchainPresentFenceInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSwapchainPresentFenceInfoEXT[] clone(Arena arena, VkSwapchainPresentFenceInfoEXT[] src) {
        VkSwapchainPresentFenceInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SWAPCHAIN_PRESENT_FENCE_INFO_EXT);
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

    public @unsigned int swapchainCount() {
        return segment.get(LAYOUT$swapchainCount, OFFSET$swapchainCount);
    }

    public void swapchainCount(@unsigned int value) {
        segment.set(LAYOUT$swapchainCount, OFFSET$swapchainCount, value);
    }

    public @pointer(comment="VkFence*") MemorySegment pFencesRaw() {
        return segment.get(LAYOUT$pFences, OFFSET$pFences);
    }

    public void pFencesRaw(@pointer(comment="VkFence*") MemorySegment value) {
        segment.set(LAYOUT$pFences, OFFSET$pFences, value);
    }

    /// Note: the returned {@link VkFence.Buffer} does not have correct {@link VkFence.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkFence.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkFence.Buffer pFences() {
        MemorySegment s = pFencesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkFence.Buffer(s);
    }


    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pFences")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$swapchainCount = PathElement.groupElement("PATH$swapchainCount");
    public static final PathElement PATH$pFences = PathElement.groupElement("PATH$pFences");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$swapchainCount = (OfInt) LAYOUT.select(PATH$swapchainCount);
    public static final AddressLayout LAYOUT$pFences = (AddressLayout) LAYOUT.select(PATH$pFences);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$swapchainCount = LAYOUT$swapchainCount.byteSize();
    public static final long SIZE$pFences = LAYOUT$pFences.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchainCount = LAYOUT.byteOffset(PATH$swapchainCount);
    public static final long OFFSET$pFences = LAYOUT.byteOffset(PATH$pFences);
}
