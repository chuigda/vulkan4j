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

/// Represents a pointer to a {@code VkPhysicalDeviceNestedCommandBufferFeaturesEXT} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceNestedCommandBufferFeaturesEXT.html">VkPhysicalDeviceNestedCommandBufferFeaturesEXT</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceNestedCommandBufferFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT {
        sType(VkStructureType.PHYSICAL_DEVICE_NESTED_COMMAND_BUFFER_FEATURES_EXT);
    }

    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceNestedCommandBufferFeaturesEXT[] ret = new VkPhysicalDeviceNestedCommandBufferFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT clone(Arena arena, VkPhysicalDeviceNestedCommandBufferFeaturesEXT src) {
        VkPhysicalDeviceNestedCommandBufferFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceNestedCommandBufferFeaturesEXT[] src) {
        VkPhysicalDeviceNestedCommandBufferFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("nestedCommandBuffer"),
        ValueLayout.JAVA_INT.withName("nestedCommandBufferRendering"),
        ValueLayout.JAVA_INT.withName("nestedCommandBufferSimultaneousUse")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$nestedCommandBuffer = PathElement.groupElement("PATH$nestedCommandBuffer");
    public static final PathElement PATH$nestedCommandBufferRendering = PathElement.groupElement("PATH$nestedCommandBufferRendering");
    public static final PathElement PATH$nestedCommandBufferSimultaneousUse = PathElement.groupElement("PATH$nestedCommandBufferSimultaneousUse");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$nestedCommandBuffer = (OfInt) LAYOUT.select(PATH$nestedCommandBuffer);
    public static final OfInt LAYOUT$nestedCommandBufferRendering = (OfInt) LAYOUT.select(PATH$nestedCommandBufferRendering);
    public static final OfInt LAYOUT$nestedCommandBufferSimultaneousUse = (OfInt) LAYOUT.select(PATH$nestedCommandBufferSimultaneousUse);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$nestedCommandBuffer = LAYOUT$nestedCommandBuffer.byteSize();
    public static final long SIZE$nestedCommandBufferRendering = LAYOUT$nestedCommandBufferRendering.byteSize();
    public static final long SIZE$nestedCommandBufferSimultaneousUse = LAYOUT$nestedCommandBufferSimultaneousUse.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$nestedCommandBuffer = LAYOUT.byteOffset(PATH$nestedCommandBuffer);
    public static final long OFFSET$nestedCommandBufferRendering = LAYOUT.byteOffset(PATH$nestedCommandBufferRendering);
    public static final long OFFSET$nestedCommandBufferSimultaneousUse = LAYOUT.byteOffset(PATH$nestedCommandBufferSimultaneousUse);

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

    public @unsigned int nestedCommandBuffer() {
        return segment.get(LAYOUT$nestedCommandBuffer, OFFSET$nestedCommandBuffer);
    }

    public void nestedCommandBuffer(@unsigned int value) {
        segment.set(LAYOUT$nestedCommandBuffer, OFFSET$nestedCommandBuffer, value);
    }

    public @unsigned int nestedCommandBufferRendering() {
        return segment.get(LAYOUT$nestedCommandBufferRendering, OFFSET$nestedCommandBufferRendering);
    }

    public void nestedCommandBufferRendering(@unsigned int value) {
        segment.set(LAYOUT$nestedCommandBufferRendering, OFFSET$nestedCommandBufferRendering, value);
    }

    public @unsigned int nestedCommandBufferSimultaneousUse() {
        return segment.get(LAYOUT$nestedCommandBufferSimultaneousUse, OFFSET$nestedCommandBufferSimultaneousUse);
    }

    public void nestedCommandBufferSimultaneousUse(@unsigned int value) {
        segment.set(LAYOUT$nestedCommandBufferSimultaneousUse, OFFSET$nestedCommandBufferSimultaneousUse, value);
    }

}
