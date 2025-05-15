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

/// Represents a pointer to a {@code VkPhysicalDeviceDriverProperties} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceDriverProperties.html">VkPhysicalDeviceDriverProperties</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceDriverProperties(@NotNull MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceDriverProperties {
        sType(VkStructureType.PHYSICAL_DEVICE_DRIVER_PROPERTIES);
    }

    public static VkPhysicalDeviceDriverProperties allocate(Arena arena) {
        return new VkPhysicalDeviceDriverProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceDriverProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceDriverProperties[] ret = new VkPhysicalDeviceDriverProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceDriverProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceDriverProperties clone(Arena arena, VkPhysicalDeviceDriverProperties src) {
        VkPhysicalDeviceDriverProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceDriverProperties[] clone(Arena arena, VkPhysicalDeviceDriverProperties[] src) {
        VkPhysicalDeviceDriverProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("driverID"),
        ValueLayout.JAVA_BYTE.withName("driverName"),
        ValueLayout.JAVA_BYTE.withName("driverInfo"),
        VkConformanceVersion.LAYOUT.withName("conformanceVersion")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$driverID = PathElement.groupElement("PATH$driverID");
    public static final PathElement PATH$driverName = PathElement.groupElement("PATH$driverName");
    public static final PathElement PATH$driverInfo = PathElement.groupElement("PATH$driverInfo");
    public static final PathElement PATH$conformanceVersion = PathElement.groupElement("PATH$conformanceVersion");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$driverID = (OfInt) LAYOUT.select(PATH$driverID);
    public static final OfByte LAYOUT$driverName = (OfByte) LAYOUT.select(PATH$driverName);
    public static final OfByte LAYOUT$driverInfo = (OfByte) LAYOUT.select(PATH$driverInfo);
    public static final StructLayout LAYOUT$conformanceVersion = (StructLayout) LAYOUT.select(PATH$conformanceVersion);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$driverID = LAYOUT$driverID.byteSize();
    public static final long SIZE$driverName = LAYOUT$driverName.byteSize();
    public static final long SIZE$driverInfo = LAYOUT$driverInfo.byteSize();
    public static final long SIZE$conformanceVersion = LAYOUT$conformanceVersion.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$driverID = LAYOUT.byteOffset(PATH$driverID);
    public static final long OFFSET$driverName = LAYOUT.byteOffset(PATH$driverName);
    public static final long OFFSET$driverInfo = LAYOUT.byteOffset(PATH$driverInfo);
    public static final long OFFSET$conformanceVersion = LAYOUT.byteOffset(PATH$conformanceVersion);

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

    public @enumtype(VkDriverId.class) int driverID() {
        return segment.get(LAYOUT$driverID, OFFSET$driverID);
    }

    public void driverID(@enumtype(VkDriverId.class) int value) {
        segment.set(LAYOUT$driverID, OFFSET$driverID, value);
    }

    public byte driverName() {
        return segment.get(LAYOUT$driverName, OFFSET$driverName);
    }

    public void driverName(byte value) {
        segment.set(LAYOUT$driverName, OFFSET$driverName, value);
    }

    public byte driverInfo() {
        return segment.get(LAYOUT$driverInfo, OFFSET$driverInfo);
    }

    public void driverInfo(byte value) {
        segment.set(LAYOUT$driverInfo, OFFSET$driverInfo, value);
    }

    public VkConformanceVersion conformanceVersion() {
        return new VkConformanceVersion(segment.asSlice(OFFSET$conformanceVersion, LAYOUT$conformanceVersion));
    }

    public void conformanceVersion(VkConformanceVersion value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$conformanceVersion, SIZE$conformanceVersion);
    }

}
