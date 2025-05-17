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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindImageMemorySwapchainInfoKHR.html"><code>VkBindImageMemorySwapchainInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkBindImageMemorySwapchainInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkSwapchainKHR swapchain;
///     uint32_t imageIndex;
/// } VkBindImageMemorySwapchainInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR`
///
/// The {@link VkBindImageMemorySwapchainInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkBindImageMemorySwapchainInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindImageMemorySwapchainInfoKHR.html"><code>VkBindImageMemorySwapchainInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkBindImageMemorySwapchainInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkBindImageMemorySwapchainInfoKHR allocate(Arena arena) {
        VkBindImageMemorySwapchainInfoKHR ret = new VkBindImageMemorySwapchainInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR);
        return ret;
    }

    public static VkBindImageMemorySwapchainInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindImageMemorySwapchainInfoKHR[] ret = new VkBindImageMemorySwapchainInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBindImageMemorySwapchainInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR);
        }
        return ret;
    }

    public static VkBindImageMemorySwapchainInfoKHR clone(Arena arena, VkBindImageMemorySwapchainInfoKHR src) {
        VkBindImageMemorySwapchainInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBindImageMemorySwapchainInfoKHR[] clone(Arena arena, VkBindImageMemorySwapchainInfoKHR[] src) {
        VkBindImageMemorySwapchainInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR);
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

    public @Nullable VkSwapchainKHR swapchain() {
        MemorySegment s = segment.asSlice(OFFSET$swapchain, SIZE$swapchain);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkSwapchainKHR(s);
    }

    public void swapchain(@Nullable VkSwapchainKHR value) {
        segment.set(LAYOUT$swapchain, OFFSET$swapchain, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int imageIndex() {
        return segment.get(LAYOUT$imageIndex, OFFSET$imageIndex);
    }

    public void imageIndex(@unsigned int value) {
        segment.set(LAYOUT$imageIndex, OFFSET$imageIndex, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("swapchain"),
        ValueLayout.JAVA_INT.withName("imageIndex")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$swapchain = PathElement.groupElement("PATH$swapchain");
    public static final PathElement PATH$imageIndex = PathElement.groupElement("PATH$imageIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$swapchain = (AddressLayout) LAYOUT.select(PATH$swapchain);
    public static final OfInt LAYOUT$imageIndex = (OfInt) LAYOUT.select(PATH$imageIndex);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$swapchain = LAYOUT$swapchain.byteSize();
    public static final long SIZE$imageIndex = LAYOUT$imageIndex.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchain = LAYOUT.byteOffset(PATH$swapchain);
    public static final long OFFSET$imageIndex = LAYOUT.byteOffset(PATH$imageIndex);
}
