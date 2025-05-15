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

/// Represents a pointer to a {@code VkPhysicalDeviceShaderFloatControls2Features} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceShaderFloatControls2Features.html">VkPhysicalDeviceShaderFloatControls2Features</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceShaderFloatControls2Features(@NotNull MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceShaderFloatControls2Features {
        sType(VkStructureType.PHYSICAL_DEVICE_SHADER_FLOAT_CONTROLS_2_FEATURES);
    }

    public static VkPhysicalDeviceShaderFloatControls2Features allocate(Arena arena) {
        return new VkPhysicalDeviceShaderFloatControls2Features(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShaderFloatControls2Features[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderFloatControls2Features[] ret = new VkPhysicalDeviceShaderFloatControls2Features[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceShaderFloatControls2Features(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderFloatControls2Features clone(Arena arena, VkPhysicalDeviceShaderFloatControls2Features src) {
        VkPhysicalDeviceShaderFloatControls2Features ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderFloatControls2Features[] clone(Arena arena, VkPhysicalDeviceShaderFloatControls2Features[] src) {
        VkPhysicalDeviceShaderFloatControls2Features[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderFloatControls2")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shaderFloatControls2 = PathElement.groupElement("PATH$shaderFloatControls2");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderFloatControls2 = (OfInt) LAYOUT.select(PATH$shaderFloatControls2);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderFloatControls2 = LAYOUT$shaderFloatControls2.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderFloatControls2 = LAYOUT.byteOffset(PATH$shaderFloatControls2);

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

    public @unsigned int shaderFloatControls2() {
        return segment.get(LAYOUT$shaderFloatControls2, OFFSET$shaderFloatControls2);
    }

    public void shaderFloatControls2(@unsigned int value) {
        segment.set(LAYOUT$shaderFloatControls2, OFFSET$shaderFloatControls2, value);
    }

}
