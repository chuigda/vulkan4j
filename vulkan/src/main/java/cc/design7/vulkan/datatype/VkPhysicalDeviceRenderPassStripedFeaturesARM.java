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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceRenderPassStripedFeaturesARM.html"><code>VkPhysicalDeviceRenderPassStripedFeaturesARM</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceRenderPassStripedFeaturesARM {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkBool32 renderPassStriped;
/// } VkPhysicalDeviceRenderPassStripedFeaturesARM;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_FEATURES_ARM`
///
/// The {@link VkPhysicalDeviceRenderPassStripedFeaturesARM#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceRenderPassStripedFeaturesARM#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceRenderPassStripedFeaturesARM.html"><code>VkPhysicalDeviceRenderPassStripedFeaturesARM</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceRenderPassStripedFeaturesARM(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceRenderPassStripedFeaturesARM allocate(Arena arena) {
        VkPhysicalDeviceRenderPassStripedFeaturesARM ret = new VkPhysicalDeviceRenderPassStripedFeaturesARM(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_RENDER_PASS_STRIPED_FEATURES_ARM);
        return ret;
    }

    public static VkPhysicalDeviceRenderPassStripedFeaturesARM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRenderPassStripedFeaturesARM[] ret = new VkPhysicalDeviceRenderPassStripedFeaturesARM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceRenderPassStripedFeaturesARM(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_RENDER_PASS_STRIPED_FEATURES_ARM);
        }
        return ret;
    }

    public static VkPhysicalDeviceRenderPassStripedFeaturesARM clone(Arena arena, VkPhysicalDeviceRenderPassStripedFeaturesARM src) {
        VkPhysicalDeviceRenderPassStripedFeaturesARM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceRenderPassStripedFeaturesARM[] clone(Arena arena, VkPhysicalDeviceRenderPassStripedFeaturesARM[] src) {
        VkPhysicalDeviceRenderPassStripedFeaturesARM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_RENDER_PASS_STRIPED_FEATURES_ARM);
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

    public @unsigned int renderPassStriped() {
        return segment.get(LAYOUT$renderPassStriped, OFFSET$renderPassStriped);
    }

    public void renderPassStriped(@unsigned int value) {
        segment.set(LAYOUT$renderPassStriped, OFFSET$renderPassStriped, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("renderPassStriped")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$renderPassStriped = PathElement.groupElement("PATH$renderPassStriped");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$renderPassStriped = (OfInt) LAYOUT.select(PATH$renderPassStriped);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$renderPassStriped = LAYOUT$renderPassStriped.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$renderPassStriped = LAYOUT.byteOffset(PATH$renderPassStriped);
}
