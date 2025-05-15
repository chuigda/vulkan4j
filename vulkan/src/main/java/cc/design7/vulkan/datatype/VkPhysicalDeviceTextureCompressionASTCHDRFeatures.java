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

public record VkPhysicalDeviceTextureCompressionASTCHDRFeatures(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$textureCompressionASTC_HDR = ValueLayout.JAVA_INT.withName("textureCompressionASTC_HDR");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$textureCompressionASTC_HDR);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures allocate(Arena arena) {
        return new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceTextureCompressionASTCHDRFeatures[] ret = new VkPhysicalDeviceTextureCompressionASTCHDRFeatures[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceTextureCompressionASTCHDRFeatures(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures clone(Arena arena, VkPhysicalDeviceTextureCompressionASTCHDRFeatures src) {
        VkPhysicalDeviceTextureCompressionASTCHDRFeatures ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceTextureCompressionASTCHDRFeatures[] clone(Arena arena, VkPhysicalDeviceTextureCompressionASTCHDRFeatures[] src) {
        VkPhysicalDeviceTextureCompressionASTCHDRFeatures[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$textureCompressionASTC_HDR = PathElement.groupElement("PATH$textureCompressionASTC_HDR");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$textureCompressionASTC_HDR = LAYOUT$textureCompressionASTC_HDR.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$textureCompressionASTC_HDR = LAYOUT.byteOffset(PATH$textureCompressionASTC_HDR);

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

    public @unsigned int textureCompressionASTC_HDR() {
        return segment.get(LAYOUT$textureCompressionASTC_HDR, OFFSET$textureCompressionASTC_HDR);
    }

    public void textureCompressionASTC_HDR(@unsigned int value) {
        segment.set(LAYOUT$textureCompressionASTC_HDR, OFFSET$textureCompressionASTC_HDR, value);
    }

}
/// dummy, not implemented yet
