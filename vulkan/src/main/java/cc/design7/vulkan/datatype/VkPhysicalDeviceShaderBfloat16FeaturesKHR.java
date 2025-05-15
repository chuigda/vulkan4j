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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderBfloat16FeaturesKHR.html">VkPhysicalDeviceShaderBfloat16FeaturesKHR</a>
@ValueBasedCandidate
public record VkPhysicalDeviceShaderBfloat16FeaturesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$shaderBFloat16Type = ValueLayout.JAVA_INT.withName("shaderBFloat16Type");
    public static final OfInt LAYOUT$shaderBFloat16DotProduct = ValueLayout.JAVA_INT.withName("shaderBFloat16DotProduct");
    public static final OfInt LAYOUT$shaderBFloat16CooperativeMatrix = ValueLayout.JAVA_INT.withName("shaderBFloat16CooperativeMatrix");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$shaderBFloat16Type, LAYOUT$shaderBFloat16DotProduct, LAYOUT$shaderBFloat16CooperativeMatrix);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceShaderBfloat16FeaturesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderBfloat16FeaturesKHR[] ret = new VkPhysicalDeviceShaderBfloat16FeaturesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceShaderBfloat16FeaturesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR clone(Arena arena, VkPhysicalDeviceShaderBfloat16FeaturesKHR src) {
        VkPhysicalDeviceShaderBfloat16FeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderBfloat16FeaturesKHR[] clone(Arena arena, VkPhysicalDeviceShaderBfloat16FeaturesKHR[] src) {
        VkPhysicalDeviceShaderBfloat16FeaturesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shaderBFloat16Type = PathElement.groupElement("PATH$shaderBFloat16Type");
    public static final PathElement PATH$shaderBFloat16DotProduct = PathElement.groupElement("PATH$shaderBFloat16DotProduct");
    public static final PathElement PATH$shaderBFloat16CooperativeMatrix = PathElement.groupElement("PATH$shaderBFloat16CooperativeMatrix");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderBFloat16Type = LAYOUT$shaderBFloat16Type.byteSize();
    public static final long SIZE$shaderBFloat16DotProduct = LAYOUT$shaderBFloat16DotProduct.byteSize();
    public static final long SIZE$shaderBFloat16CooperativeMatrix = LAYOUT$shaderBFloat16CooperativeMatrix.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderBFloat16Type = LAYOUT.byteOffset(PATH$shaderBFloat16Type);
    public static final long OFFSET$shaderBFloat16DotProduct = LAYOUT.byteOffset(PATH$shaderBFloat16DotProduct);
    public static final long OFFSET$shaderBFloat16CooperativeMatrix = LAYOUT.byteOffset(PATH$shaderBFloat16CooperativeMatrix);

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

    public @unsigned int shaderBFloat16Type() {
        return segment.get(LAYOUT$shaderBFloat16Type, OFFSET$shaderBFloat16Type);
    }

    public void shaderBFloat16Type(@unsigned int value) {
        segment.set(LAYOUT$shaderBFloat16Type, OFFSET$shaderBFloat16Type, value);
    }

    public @unsigned int shaderBFloat16DotProduct() {
        return segment.get(LAYOUT$shaderBFloat16DotProduct, OFFSET$shaderBFloat16DotProduct);
    }

    public void shaderBFloat16DotProduct(@unsigned int value) {
        segment.set(LAYOUT$shaderBFloat16DotProduct, OFFSET$shaderBFloat16DotProduct, value);
    }

    public @unsigned int shaderBFloat16CooperativeMatrix() {
        return segment.get(LAYOUT$shaderBFloat16CooperativeMatrix, OFFSET$shaderBFloat16CooperativeMatrix);
    }

    public void shaderBFloat16CooperativeMatrix(@unsigned int value) {
        segment.set(LAYOUT$shaderBFloat16CooperativeMatrix, OFFSET$shaderBFloat16CooperativeMatrix, value);
    }

}
