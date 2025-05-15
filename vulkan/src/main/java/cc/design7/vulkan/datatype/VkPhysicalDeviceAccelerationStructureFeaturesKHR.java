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

/// Represents a pointer to a {@code VkPhysicalDeviceAccelerationStructureFeaturesKHR} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceAccelerationStructureFeaturesKHR.html">VkPhysicalDeviceAccelerationStructureFeaturesKHR</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceAccelerationStructureFeaturesKHR(@NotNull MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR {
        sType(VkStructureType.PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR);
    }

    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceAccelerationStructureFeaturesKHR[] ret = new VkPhysicalDeviceAccelerationStructureFeaturesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceAccelerationStructureFeaturesKHR(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR clone(Arena arena, VkPhysicalDeviceAccelerationStructureFeaturesKHR src) {
        VkPhysicalDeviceAccelerationStructureFeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR[] clone(Arena arena, VkPhysicalDeviceAccelerationStructureFeaturesKHR[] src) {
        VkPhysicalDeviceAccelerationStructureFeaturesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("accelerationStructure"),
        ValueLayout.JAVA_INT.withName("accelerationStructureCaptureReplay"),
        ValueLayout.JAVA_INT.withName("accelerationStructureIndirectBuild"),
        ValueLayout.JAVA_INT.withName("accelerationStructureHostCommands"),
        ValueLayout.JAVA_INT.withName("descriptorBindingAccelerationStructureUpdateAfterBind")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$accelerationStructure = PathElement.groupElement("PATH$accelerationStructure");
    public static final PathElement PATH$accelerationStructureCaptureReplay = PathElement.groupElement("PATH$accelerationStructureCaptureReplay");
    public static final PathElement PATH$accelerationStructureIndirectBuild = PathElement.groupElement("PATH$accelerationStructureIndirectBuild");
    public static final PathElement PATH$accelerationStructureHostCommands = PathElement.groupElement("PATH$accelerationStructureHostCommands");
    public static final PathElement PATH$descriptorBindingAccelerationStructureUpdateAfterBind = PathElement.groupElement("PATH$descriptorBindingAccelerationStructureUpdateAfterBind");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$accelerationStructure = (OfInt) LAYOUT.select(PATH$accelerationStructure);
    public static final OfInt LAYOUT$accelerationStructureCaptureReplay = (OfInt) LAYOUT.select(PATH$accelerationStructureCaptureReplay);
    public static final OfInt LAYOUT$accelerationStructureIndirectBuild = (OfInt) LAYOUT.select(PATH$accelerationStructureIndirectBuild);
    public static final OfInt LAYOUT$accelerationStructureHostCommands = (OfInt) LAYOUT.select(PATH$accelerationStructureHostCommands);
    public static final OfInt LAYOUT$descriptorBindingAccelerationStructureUpdateAfterBind = (OfInt) LAYOUT.select(PATH$descriptorBindingAccelerationStructureUpdateAfterBind);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$accelerationStructure = LAYOUT$accelerationStructure.byteSize();
    public static final long SIZE$accelerationStructureCaptureReplay = LAYOUT$accelerationStructureCaptureReplay.byteSize();
    public static final long SIZE$accelerationStructureIndirectBuild = LAYOUT$accelerationStructureIndirectBuild.byteSize();
    public static final long SIZE$accelerationStructureHostCommands = LAYOUT$accelerationStructureHostCommands.byteSize();
    public static final long SIZE$descriptorBindingAccelerationStructureUpdateAfterBind = LAYOUT$descriptorBindingAccelerationStructureUpdateAfterBind.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$accelerationStructure = LAYOUT.byteOffset(PATH$accelerationStructure);
    public static final long OFFSET$accelerationStructureCaptureReplay = LAYOUT.byteOffset(PATH$accelerationStructureCaptureReplay);
    public static final long OFFSET$accelerationStructureIndirectBuild = LAYOUT.byteOffset(PATH$accelerationStructureIndirectBuild);
    public static final long OFFSET$accelerationStructureHostCommands = LAYOUT.byteOffset(PATH$accelerationStructureHostCommands);
    public static final long OFFSET$descriptorBindingAccelerationStructureUpdateAfterBind = LAYOUT.byteOffset(PATH$descriptorBindingAccelerationStructureUpdateAfterBind);

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

    public @unsigned int accelerationStructure() {
        return segment.get(LAYOUT$accelerationStructure, OFFSET$accelerationStructure);
    }

    public void accelerationStructure(@unsigned int value) {
        segment.set(LAYOUT$accelerationStructure, OFFSET$accelerationStructure, value);
    }

    public @unsigned int accelerationStructureCaptureReplay() {
        return segment.get(LAYOUT$accelerationStructureCaptureReplay, OFFSET$accelerationStructureCaptureReplay);
    }

    public void accelerationStructureCaptureReplay(@unsigned int value) {
        segment.set(LAYOUT$accelerationStructureCaptureReplay, OFFSET$accelerationStructureCaptureReplay, value);
    }

    public @unsigned int accelerationStructureIndirectBuild() {
        return segment.get(LAYOUT$accelerationStructureIndirectBuild, OFFSET$accelerationStructureIndirectBuild);
    }

    public void accelerationStructureIndirectBuild(@unsigned int value) {
        segment.set(LAYOUT$accelerationStructureIndirectBuild, OFFSET$accelerationStructureIndirectBuild, value);
    }

    public @unsigned int accelerationStructureHostCommands() {
        return segment.get(LAYOUT$accelerationStructureHostCommands, OFFSET$accelerationStructureHostCommands);
    }

    public void accelerationStructureHostCommands(@unsigned int value) {
        segment.set(LAYOUT$accelerationStructureHostCommands, OFFSET$accelerationStructureHostCommands, value);
    }

    public @unsigned int descriptorBindingAccelerationStructureUpdateAfterBind() {
        return segment.get(LAYOUT$descriptorBindingAccelerationStructureUpdateAfterBind, OFFSET$descriptorBindingAccelerationStructureUpdateAfterBind);
    }

    public void descriptorBindingAccelerationStructureUpdateAfterBind(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingAccelerationStructureUpdateAfterBind, OFFSET$descriptorBindingAccelerationStructureUpdateAfterBind, value);
    }

}
