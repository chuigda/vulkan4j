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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSurfacePresentScalingCapabilitiesEXT.html">VkSurfacePresentScalingCapabilitiesEXT</a>
@ValueBasedCandidate
public record VkSurfacePresentScalingCapabilitiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$supportedPresentScaling = ValueLayout.JAVA_INT.withName("supportedPresentScaling");
    public static final OfInt LAYOUT$supportedPresentGravityX = ValueLayout.JAVA_INT.withName("supportedPresentGravityX");
    public static final OfInt LAYOUT$supportedPresentGravityY = ValueLayout.JAVA_INT.withName("supportedPresentGravityY");
    public static final StructLayout LAYOUT$minScaledImageExtent = VkExtent2D.LAYOUT.withName("minScaledImageExtent");
    public static final StructLayout LAYOUT$maxScaledImageExtent = VkExtent2D.LAYOUT.withName("maxScaledImageExtent");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$supportedPresentScaling, LAYOUT$supportedPresentGravityX, LAYOUT$supportedPresentGravityY, LAYOUT$minScaledImageExtent, LAYOUT$maxScaledImageExtent);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSurfacePresentScalingCapabilitiesEXT allocate(Arena arena) {
        return new VkSurfacePresentScalingCapabilitiesEXT(arena.allocate(LAYOUT));
    }

    public static VkSurfacePresentScalingCapabilitiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSurfacePresentScalingCapabilitiesEXT[] ret = new VkSurfacePresentScalingCapabilitiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSurfacePresentScalingCapabilitiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSurfacePresentScalingCapabilitiesEXT clone(Arena arena, VkSurfacePresentScalingCapabilitiesEXT src) {
        VkSurfacePresentScalingCapabilitiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSurfacePresentScalingCapabilitiesEXT[] clone(Arena arena, VkSurfacePresentScalingCapabilitiesEXT[] src) {
        VkSurfacePresentScalingCapabilitiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$supportedPresentScaling = PathElement.groupElement("PATH$supportedPresentScaling");
    public static final PathElement PATH$supportedPresentGravityX = PathElement.groupElement("PATH$supportedPresentGravityX");
    public static final PathElement PATH$supportedPresentGravityY = PathElement.groupElement("PATH$supportedPresentGravityY");
    public static final PathElement PATH$minScaledImageExtent = PathElement.groupElement("PATH$minScaledImageExtent");
    public static final PathElement PATH$maxScaledImageExtent = PathElement.groupElement("PATH$maxScaledImageExtent");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$supportedPresentScaling = LAYOUT$supportedPresentScaling.byteSize();
    public static final long SIZE$supportedPresentGravityX = LAYOUT$supportedPresentGravityX.byteSize();
    public static final long SIZE$supportedPresentGravityY = LAYOUT$supportedPresentGravityY.byteSize();
    public static final long SIZE$minScaledImageExtent = LAYOUT$minScaledImageExtent.byteSize();
    public static final long SIZE$maxScaledImageExtent = LAYOUT$maxScaledImageExtent.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$supportedPresentScaling = LAYOUT.byteOffset(PATH$supportedPresentScaling);
    public static final long OFFSET$supportedPresentGravityX = LAYOUT.byteOffset(PATH$supportedPresentGravityX);
    public static final long OFFSET$supportedPresentGravityY = LAYOUT.byteOffset(PATH$supportedPresentGravityY);
    public static final long OFFSET$minScaledImageExtent = LAYOUT.byteOffset(PATH$minScaledImageExtent);
    public static final long OFFSET$maxScaledImageExtent = LAYOUT.byteOffset(PATH$maxScaledImageExtent);

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

    public @enumtype(VkPresentScalingFlagsEXT.class) int supportedPresentScaling() {
        return segment.get(LAYOUT$supportedPresentScaling, OFFSET$supportedPresentScaling);
    }

    public void supportedPresentScaling(@enumtype(VkPresentScalingFlagsEXT.class) int value) {
        segment.set(LAYOUT$supportedPresentScaling, OFFSET$supportedPresentScaling, value);
    }

    public @enumtype(VkPresentGravityFlagsEXT.class) int supportedPresentGravityX() {
        return segment.get(LAYOUT$supportedPresentGravityX, OFFSET$supportedPresentGravityX);
    }

    public void supportedPresentGravityX(@enumtype(VkPresentGravityFlagsEXT.class) int value) {
        segment.set(LAYOUT$supportedPresentGravityX, OFFSET$supportedPresentGravityX, value);
    }

    public @enumtype(VkPresentGravityFlagsEXT.class) int supportedPresentGravityY() {
        return segment.get(LAYOUT$supportedPresentGravityY, OFFSET$supportedPresentGravityY);
    }

    public void supportedPresentGravityY(@enumtype(VkPresentGravityFlagsEXT.class) int value) {
        segment.set(LAYOUT$supportedPresentGravityY, OFFSET$supportedPresentGravityY, value);
    }

    public VkExtent2D minScaledImageExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$minScaledImageExtent, LAYOUT$minScaledImageExtent));
    }

    public void minScaledImageExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minScaledImageExtent, SIZE$minScaledImageExtent);
    }

    public VkExtent2D maxScaledImageExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxScaledImageExtent, LAYOUT$maxScaledImageExtent));
    }

    public void maxScaledImageExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxScaledImageExtent, SIZE$maxScaledImageExtent);
    }

}
