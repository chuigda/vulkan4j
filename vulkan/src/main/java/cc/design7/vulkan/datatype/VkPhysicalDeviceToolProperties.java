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

/// Represents a pointer to a {@code VkPhysicalDeviceToolProperties} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceToolProperties.html">VkPhysicalDeviceToolProperties</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceToolProperties(@NotNull MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceToolProperties {
        sType(VkStructureType.PHYSICAL_DEVICE_TOOL_PROPERTIES);
    }

    public static VkPhysicalDeviceToolProperties allocate(Arena arena) {
        return new VkPhysicalDeviceToolProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceToolProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceToolProperties[] ret = new VkPhysicalDeviceToolProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceToolProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceToolProperties clone(Arena arena, VkPhysicalDeviceToolProperties src) {
        VkPhysicalDeviceToolProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceToolProperties[] clone(Arena arena, VkPhysicalDeviceToolProperties[] src) {
        VkPhysicalDeviceToolProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_BYTE.withName("name"),
        ValueLayout.JAVA_BYTE.withName("version"),
        ValueLayout.JAVA_INT.withName("purposes"),
        ValueLayout.JAVA_BYTE.withName("description"),
        ValueLayout.JAVA_BYTE.withName("layer")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$name = PathElement.groupElement("PATH$name");
    public static final PathElement PATH$version = PathElement.groupElement("PATH$version");
    public static final PathElement PATH$purposes = PathElement.groupElement("PATH$purposes");
    public static final PathElement PATH$description = PathElement.groupElement("PATH$description");
    public static final PathElement PATH$layer = PathElement.groupElement("PATH$layer");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfByte LAYOUT$name = (OfByte) LAYOUT.select(PATH$name);
    public static final OfByte LAYOUT$version = (OfByte) LAYOUT.select(PATH$version);
    public static final OfInt LAYOUT$purposes = (OfInt) LAYOUT.select(PATH$purposes);
    public static final OfByte LAYOUT$description = (OfByte) LAYOUT.select(PATH$description);
    public static final OfByte LAYOUT$layer = (OfByte) LAYOUT.select(PATH$layer);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$name = LAYOUT$name.byteSize();
    public static final long SIZE$version = LAYOUT$version.byteSize();
    public static final long SIZE$purposes = LAYOUT$purposes.byteSize();
    public static final long SIZE$description = LAYOUT$description.byteSize();
    public static final long SIZE$layer = LAYOUT$layer.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);
    public static final long OFFSET$version = LAYOUT.byteOffset(PATH$version);
    public static final long OFFSET$purposes = LAYOUT.byteOffset(PATH$purposes);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$layer = LAYOUT.byteOffset(PATH$layer);

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

    public byte name() {
        return segment.get(LAYOUT$name, OFFSET$name);
    }

    public void name(byte value) {
        segment.set(LAYOUT$name, OFFSET$name, value);
    }

    public byte version() {
        return segment.get(LAYOUT$version, OFFSET$version);
    }

    public void version(byte value) {
        segment.set(LAYOUT$version, OFFSET$version, value);
    }

    public @enumtype(VkToolPurposeFlags.class) int purposes() {
        return segment.get(LAYOUT$purposes, OFFSET$purposes);
    }

    public void purposes(@enumtype(VkToolPurposeFlags.class) int value) {
        segment.set(LAYOUT$purposes, OFFSET$purposes, value);
    }

    public byte description() {
        return segment.get(LAYOUT$description, OFFSET$description);
    }

    public void description(byte value) {
        segment.set(LAYOUT$description, OFFSET$description, value);
    }

    public byte layer() {
        return segment.get(LAYOUT$layer, OFFSET$layer);
    }

    public void layer(byte value) {
        segment.set(LAYOUT$layer, OFFSET$layer, value);
    }

}
