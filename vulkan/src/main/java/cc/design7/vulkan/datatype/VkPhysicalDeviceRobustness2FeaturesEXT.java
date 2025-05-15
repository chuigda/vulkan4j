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

/// Represents a pointer to a {@code VkPhysicalDeviceRobustness2FeaturesEXT} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceRobustness2FeaturesEXT.html">VkPhysicalDeviceRobustness2FeaturesEXT</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceRobustness2FeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceRobustness2FeaturesEXT {
        sType(VkStructureType.PHYSICAL_DEVICE_ROBUSTNESS_2_FEATURES_EXT);
    }

    public static VkPhysicalDeviceRobustness2FeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceRobustness2FeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceRobustness2FeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRobustness2FeaturesEXT[] ret = new VkPhysicalDeviceRobustness2FeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceRobustness2FeaturesEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkPhysicalDeviceRobustness2FeaturesEXT clone(Arena arena, VkPhysicalDeviceRobustness2FeaturesEXT src) {
        VkPhysicalDeviceRobustness2FeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceRobustness2FeaturesEXT[] clone(Arena arena, VkPhysicalDeviceRobustness2FeaturesEXT[] src) {
        VkPhysicalDeviceRobustness2FeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("robustBufferAccess2"),
        ValueLayout.JAVA_INT.withName("robustImageAccess2"),
        ValueLayout.JAVA_INT.withName("nullDescriptor")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$robustBufferAccess2 = PathElement.groupElement("PATH$robustBufferAccess2");
    public static final PathElement PATH$robustImageAccess2 = PathElement.groupElement("PATH$robustImageAccess2");
    public static final PathElement PATH$nullDescriptor = PathElement.groupElement("PATH$nullDescriptor");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$robustBufferAccess2 = (OfInt) LAYOUT.select(PATH$robustBufferAccess2);
    public static final OfInt LAYOUT$robustImageAccess2 = (OfInt) LAYOUT.select(PATH$robustImageAccess2);
    public static final OfInt LAYOUT$nullDescriptor = (OfInt) LAYOUT.select(PATH$nullDescriptor);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$robustBufferAccess2 = LAYOUT$robustBufferAccess2.byteSize();
    public static final long SIZE$robustImageAccess2 = LAYOUT$robustImageAccess2.byteSize();
    public static final long SIZE$nullDescriptor = LAYOUT$nullDescriptor.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$robustBufferAccess2 = LAYOUT.byteOffset(PATH$robustBufferAccess2);
    public static final long OFFSET$robustImageAccess2 = LAYOUT.byteOffset(PATH$robustImageAccess2);
    public static final long OFFSET$nullDescriptor = LAYOUT.byteOffset(PATH$nullDescriptor);

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

    public @unsigned int robustBufferAccess2() {
        return segment.get(LAYOUT$robustBufferAccess2, OFFSET$robustBufferAccess2);
    }

    public void robustBufferAccess2(@unsigned int value) {
        segment.set(LAYOUT$robustBufferAccess2, OFFSET$robustBufferAccess2, value);
    }

    public @unsigned int robustImageAccess2() {
        return segment.get(LAYOUT$robustImageAccess2, OFFSET$robustImageAccess2);
    }

    public void robustImageAccess2(@unsigned int value) {
        segment.set(LAYOUT$robustImageAccess2, OFFSET$robustImageAccess2, value);
    }

    public @unsigned int nullDescriptor() {
        return segment.get(LAYOUT$nullDescriptor, OFFSET$nullDescriptor);
    }

    public void nullDescriptor(@unsigned int value) {
        segment.set(LAYOUT$nullDescriptor, OFFSET$nullDescriptor, value);
    }

}
