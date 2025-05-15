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

/// Represents a pointer to a {@code VkPhysicalDeviceShaderFloat16Int8Features} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderFloat16Int8Features.html">VkPhysicalDeviceShaderFloat16Int8Features</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceShaderFloat16Int8Features(@NotNull MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceShaderFloat16Int8Features {
        sType(VkStructureType.PHYSICAL_DEVICE_SHADER_FLOAT16_INT8_FEATURES);
    }

    public static VkPhysicalDeviceShaderFloat16Int8Features allocate(Arena arena) {
        return new VkPhysicalDeviceShaderFloat16Int8Features(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShaderFloat16Int8Features[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderFloat16Int8Features[] ret = new VkPhysicalDeviceShaderFloat16Int8Features[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceShaderFloat16Int8Features(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderFloat16Int8Features clone(Arena arena, VkPhysicalDeviceShaderFloat16Int8Features src) {
        VkPhysicalDeviceShaderFloat16Int8Features ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderFloat16Int8Features[] clone(Arena arena, VkPhysicalDeviceShaderFloat16Int8Features[] src) {
        VkPhysicalDeviceShaderFloat16Int8Features[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderFloat16"),
        ValueLayout.JAVA_INT.withName("shaderInt8")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shaderFloat16 = PathElement.groupElement("PATH$shaderFloat16");
    public static final PathElement PATH$shaderInt8 = PathElement.groupElement("PATH$shaderInt8");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderFloat16 = (OfInt) LAYOUT.select(PATH$shaderFloat16);
    public static final OfInt LAYOUT$shaderInt8 = (OfInt) LAYOUT.select(PATH$shaderInt8);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderFloat16 = LAYOUT$shaderFloat16.byteSize();
    public static final long SIZE$shaderInt8 = LAYOUT$shaderInt8.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderFloat16 = LAYOUT.byteOffset(PATH$shaderFloat16);
    public static final long OFFSET$shaderInt8 = LAYOUT.byteOffset(PATH$shaderInt8);

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

    public @unsigned int shaderFloat16() {
        return segment.get(LAYOUT$shaderFloat16, OFFSET$shaderFloat16);
    }

    public void shaderFloat16(@unsigned int value) {
        segment.set(LAYOUT$shaderFloat16, OFFSET$shaderFloat16, value);
    }

    public @unsigned int shaderInt8() {
        return segment.get(LAYOUT$shaderInt8, OFFSET$shaderInt8);
    }

    public void shaderInt8(@unsigned int value) {
        segment.set(LAYOUT$shaderInt8, OFFSET$shaderInt8, value);
    }

}
