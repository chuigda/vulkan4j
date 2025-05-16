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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkReleaseSwapchainImagesInfoEXT.html"><code>VkReleaseSwapchainImagesInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkReleaseSwapchainImagesInfoEXT {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkSwapchainKHR swapchain;
///     uint32_t imageIndexCount;
///     uint32_t const* pImageIndices;
/// } VkReleaseSwapchainImagesInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_EXT`
///
/// The {@link VkReleaseSwapchainImagesInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkReleaseSwapchainImagesInfoEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkReleaseSwapchainImagesInfoEXT.html"><code>VkReleaseSwapchainImagesInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkReleaseSwapchainImagesInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkReleaseSwapchainImagesInfoEXT allocate(Arena arena) {
        VkReleaseSwapchainImagesInfoEXT ret = new VkReleaseSwapchainImagesInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.RELEASE_SWAPCHAIN_IMAGES_INFO_EXT);
        return ret;
    }

    public static VkReleaseSwapchainImagesInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkReleaseSwapchainImagesInfoEXT[] ret = new VkReleaseSwapchainImagesInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkReleaseSwapchainImagesInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.RELEASE_SWAPCHAIN_IMAGES_INFO_EXT);
        }
        return ret;
    }

    public static VkReleaseSwapchainImagesInfoEXT clone(Arena arena, VkReleaseSwapchainImagesInfoEXT src) {
        VkReleaseSwapchainImagesInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkReleaseSwapchainImagesInfoEXT[] clone(Arena arena, VkReleaseSwapchainImagesInfoEXT[] src) {
        VkReleaseSwapchainImagesInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.RELEASE_SWAPCHAIN_IMAGES_INFO_EXT);
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

    public @unsigned int imageIndexCount() {
        return segment.get(LAYOUT$imageIndexCount, OFFSET$imageIndexCount);
    }

    public void imageIndexCount(@unsigned int value) {
        segment.set(LAYOUT$imageIndexCount, OFFSET$imageIndexCount, value);
    }

    public @pointer(comment="int*") MemorySegment pImageIndicesRaw() {
        return segment.get(LAYOUT$pImageIndices, OFFSET$pImageIndices);
    }

    public void pImageIndicesRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pImageIndices, OFFSET$pImageIndices, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pImageIndices() {
        MemorySegment s = pImageIndicesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pImageIndices(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pImageIndicesRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("swapchain"),
        ValueLayout.JAVA_INT.withName("imageIndexCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pImageIndices")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$swapchain = PathElement.groupElement("PATH$swapchain");
    public static final PathElement PATH$imageIndexCount = PathElement.groupElement("PATH$imageIndexCount");
    public static final PathElement PATH$pImageIndices = PathElement.groupElement("PATH$pImageIndices");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$swapchain = (AddressLayout) LAYOUT.select(PATH$swapchain);
    public static final OfInt LAYOUT$imageIndexCount = (OfInt) LAYOUT.select(PATH$imageIndexCount);
    public static final AddressLayout LAYOUT$pImageIndices = (AddressLayout) LAYOUT.select(PATH$pImageIndices);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$swapchain = LAYOUT$swapchain.byteSize();
    public static final long SIZE$imageIndexCount = LAYOUT$imageIndexCount.byteSize();
    public static final long SIZE$pImageIndices = LAYOUT$pImageIndices.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchain = LAYOUT.byteOffset(PATH$swapchain);
    public static final long OFFSET$imageIndexCount = LAYOUT.byteOffset(PATH$imageIndexCount);
    public static final long OFFSET$pImageIndices = LAYOUT.byteOffset(PATH$pImageIndices);
}
