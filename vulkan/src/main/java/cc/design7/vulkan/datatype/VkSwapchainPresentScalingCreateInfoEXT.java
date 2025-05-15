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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSwapchainPresentScalingCreateInfoEXT.html"><code>VkSwapchainPresentScalingCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSwapchainPresentScalingCreateInfoEXT {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkPresentScalingFlagsEXT scalingBehavior; // optional
///     VkPresentGravityFlagsEXT presentGravityX; // optional
///     VkPresentGravityFlagsEXT presentGravityY; // optional
/// } VkSwapchainPresentScalingCreateInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT`
///
/// The {@link VkSwapchainPresentScalingCreateInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkSwapchainPresentScalingCreateInfoEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSwapchainPresentScalingCreateInfoEXT.html"><code>VkSwapchainPresentScalingCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSwapchainPresentScalingCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkSwapchainPresentScalingCreateInfoEXT allocate(Arena arena) {
        VkSwapchainPresentScalingCreateInfoEXT ret = new VkSwapchainPresentScalingCreateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT);
        return ret;
    }

    public static VkSwapchainPresentScalingCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSwapchainPresentScalingCreateInfoEXT[] ret = new VkSwapchainPresentScalingCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSwapchainPresentScalingCreateInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static VkSwapchainPresentScalingCreateInfoEXT clone(Arena arena, VkSwapchainPresentScalingCreateInfoEXT src) {
        VkSwapchainPresentScalingCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSwapchainPresentScalingCreateInfoEXT[] clone(Arena arena, VkSwapchainPresentScalingCreateInfoEXT[] src) {
        VkSwapchainPresentScalingCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SWAPCHAIN_PRESENT_SCALING_CREATE_INFO_EXT);
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

    public @enumtype(VkPresentScalingFlagsEXT.class) int scalingBehavior() {
        return segment.get(LAYOUT$scalingBehavior, OFFSET$scalingBehavior);
    }

    public void scalingBehavior(@enumtype(VkPresentScalingFlagsEXT.class) int value) {
        segment.set(LAYOUT$scalingBehavior, OFFSET$scalingBehavior, value);
    }

    public @enumtype(VkPresentGravityFlagsEXT.class) int presentGravityX() {
        return segment.get(LAYOUT$presentGravityX, OFFSET$presentGravityX);
    }

    public void presentGravityX(@enumtype(VkPresentGravityFlagsEXT.class) int value) {
        segment.set(LAYOUT$presentGravityX, OFFSET$presentGravityX, value);
    }

    public @enumtype(VkPresentGravityFlagsEXT.class) int presentGravityY() {
        return segment.get(LAYOUT$presentGravityY, OFFSET$presentGravityY);
    }

    public void presentGravityY(@enumtype(VkPresentGravityFlagsEXT.class) int value) {
        segment.set(LAYOUT$presentGravityY, OFFSET$presentGravityY, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("scalingBehavior"),
        ValueLayout.JAVA_INT.withName("presentGravityX"),
        ValueLayout.JAVA_INT.withName("presentGravityY")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$scalingBehavior = PathElement.groupElement("PATH$scalingBehavior");
    public static final PathElement PATH$presentGravityX = PathElement.groupElement("PATH$presentGravityX");
    public static final PathElement PATH$presentGravityY = PathElement.groupElement("PATH$presentGravityY");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$scalingBehavior = (OfInt) LAYOUT.select(PATH$scalingBehavior);
    public static final OfInt LAYOUT$presentGravityX = (OfInt) LAYOUT.select(PATH$presentGravityX);
    public static final OfInt LAYOUT$presentGravityY = (OfInt) LAYOUT.select(PATH$presentGravityY);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$scalingBehavior = LAYOUT$scalingBehavior.byteSize();
    public static final long SIZE$presentGravityX = LAYOUT$presentGravityX.byteSize();
    public static final long SIZE$presentGravityY = LAYOUT$presentGravityY.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$scalingBehavior = LAYOUT.byteOffset(PATH$scalingBehavior);
    public static final long OFFSET$presentGravityX = LAYOUT.byteOffset(PATH$presentGravityX);
    public static final long OFFSET$presentGravityY = LAYOUT.byteOffset(PATH$presentGravityY);
}
