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

/// Represents a pointer to a {@code VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT.html">VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT {
        sType(VkStructureType.PHYSICAL_DEVICE_RASTERIZATION_ORDER_ATTACHMENT_ACCESS_FEATURES_EXT);
    }

    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT[] ret = new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT clone(Arena arena, VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT src) {
        VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT[] src) {
        VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderColorAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderDepthAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("rasterizationOrderStencilAttachmentAccess")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$rasterizationOrderColorAttachmentAccess = PathElement.groupElement("PATH$rasterizationOrderColorAttachmentAccess");
    public static final PathElement PATH$rasterizationOrderDepthAttachmentAccess = PathElement.groupElement("PATH$rasterizationOrderDepthAttachmentAccess");
    public static final PathElement PATH$rasterizationOrderStencilAttachmentAccess = PathElement.groupElement("PATH$rasterizationOrderStencilAttachmentAccess");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$rasterizationOrderColorAttachmentAccess = (OfInt) LAYOUT.select(PATH$rasterizationOrderColorAttachmentAccess);
    public static final OfInt LAYOUT$rasterizationOrderDepthAttachmentAccess = (OfInt) LAYOUT.select(PATH$rasterizationOrderDepthAttachmentAccess);
    public static final OfInt LAYOUT$rasterizationOrderStencilAttachmentAccess = (OfInt) LAYOUT.select(PATH$rasterizationOrderStencilAttachmentAccess);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$rasterizationOrderColorAttachmentAccess = LAYOUT$rasterizationOrderColorAttachmentAccess.byteSize();
    public static final long SIZE$rasterizationOrderDepthAttachmentAccess = LAYOUT$rasterizationOrderDepthAttachmentAccess.byteSize();
    public static final long SIZE$rasterizationOrderStencilAttachmentAccess = LAYOUT$rasterizationOrderStencilAttachmentAccess.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$rasterizationOrderColorAttachmentAccess = LAYOUT.byteOffset(PATH$rasterizationOrderColorAttachmentAccess);
    public static final long OFFSET$rasterizationOrderDepthAttachmentAccess = LAYOUT.byteOffset(PATH$rasterizationOrderDepthAttachmentAccess);
    public static final long OFFSET$rasterizationOrderStencilAttachmentAccess = LAYOUT.byteOffset(PATH$rasterizationOrderStencilAttachmentAccess);

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

    public @unsigned int rasterizationOrderColorAttachmentAccess() {
        return segment.get(LAYOUT$rasterizationOrderColorAttachmentAccess, OFFSET$rasterizationOrderColorAttachmentAccess);
    }

    public void rasterizationOrderColorAttachmentAccess(@unsigned int value) {
        segment.set(LAYOUT$rasterizationOrderColorAttachmentAccess, OFFSET$rasterizationOrderColorAttachmentAccess, value);
    }

    public @unsigned int rasterizationOrderDepthAttachmentAccess() {
        return segment.get(LAYOUT$rasterizationOrderDepthAttachmentAccess, OFFSET$rasterizationOrderDepthAttachmentAccess);
    }

    public void rasterizationOrderDepthAttachmentAccess(@unsigned int value) {
        segment.set(LAYOUT$rasterizationOrderDepthAttachmentAccess, OFFSET$rasterizationOrderDepthAttachmentAccess, value);
    }

    public @unsigned int rasterizationOrderStencilAttachmentAccess() {
        return segment.get(LAYOUT$rasterizationOrderStencilAttachmentAccess, OFFSET$rasterizationOrderStencilAttachmentAccess);
    }

    public void rasterizationOrderStencilAttachmentAccess(@unsigned int value) {
        segment.set(LAYOUT$rasterizationOrderStencilAttachmentAccess, OFFSET$rasterizationOrderStencilAttachmentAccess, value);
    }

}
