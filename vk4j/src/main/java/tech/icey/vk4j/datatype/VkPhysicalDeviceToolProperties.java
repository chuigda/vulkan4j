package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceToolProperties {
///     VkStructureType sType;
///     void* pNext;
///     char name[VK_MAX_EXTENSION_NAME_SIZE];
///     char version[VK_MAX_EXTENSION_NAME_SIZE];
///     VkToolPurposeFlags purposes;
///     char description[VK_MAX_DESCRIPTION_SIZE];
///     char layer[VK_MAX_EXTENSION_NAME_SIZE];
/// } VkPhysicalDeviceToolProperties;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceToolProperties.html">VkPhysicalDeviceToolProperties</a>
public record VkPhysicalDeviceToolProperties(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceToolProperties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES);
    }

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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public MemorySegment nameRaw() {
        return segment.asSlice(OFFSET$name, SIZE$name);
    }

    public ByteBuffer name() {
        return new ByteBuffer(nameRaw());
    }

    public void name(ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$name, SIZE$name);
    }

    public MemorySegment versionRaw() {
        return segment.asSlice(OFFSET$version, SIZE$version);
    }

    public ByteBuffer version() {
        return new ByteBuffer(versionRaw());
    }

    public void version(ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$version, SIZE$version);
    }

    public @enumtype(VkToolPurposeFlags.class) int purposes() {
        return segment.get(LAYOUT$purposes, OFFSET$purposes);
    }

    public void purposes(@enumtype(VkToolPurposeFlags.class) int value) {
        segment.set(LAYOUT$purposes, OFFSET$purposes, value);
    }

    public MemorySegment descriptionRaw() {
        return segment.asSlice(OFFSET$description, SIZE$description);
    }

    public ByteBuffer description() {
        return new ByteBuffer(descriptionRaw());
    }

    public void description(ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$description, SIZE$description);
    }

    public MemorySegment layerRaw() {
        return segment.asSlice(OFFSET$layer, SIZE$layer);
    }

    public ByteBuffer layer() {
        return new ByteBuffer(layerRaw());
    }

    public void layer(ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$layer, SIZE$layer);
    }

    public static VkPhysicalDeviceToolProperties allocate(Arena arena) {
        return new VkPhysicalDeviceToolProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceToolProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceToolProperties[] ret = new VkPhysicalDeviceToolProperties[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("version"),
        ValueLayout.JAVA_INT.withName("purposes"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        MemoryLayout.sequenceLayout(VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("layer")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$name = PathElement.groupElement("name");
    public static final PathElement PATH$version = PathElement.groupElement("version");
    public static final PathElement PATH$purposes = PathElement.groupElement("purposes");
    public static final PathElement PATH$description = PathElement.groupElement("description");
    public static final PathElement PATH$layer = PathElement.groupElement("layer");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$name = (SequenceLayout) LAYOUT.select(PATH$name);
    public static final SequenceLayout LAYOUT$version = (SequenceLayout) LAYOUT.select(PATH$version);
    public static final OfInt LAYOUT$purposes = (OfInt) LAYOUT.select(PATH$purposes);
    public static final SequenceLayout LAYOUT$description = (SequenceLayout) LAYOUT.select(PATH$description);
    public static final SequenceLayout LAYOUT$layer = (SequenceLayout) LAYOUT.select(PATH$layer);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);
    public static final long OFFSET$version = LAYOUT.byteOffset(PATH$version);
    public static final long OFFSET$purposes = LAYOUT.byteOffset(PATH$purposes);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$layer = LAYOUT.byteOffset(PATH$layer);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$name = LAYOUT$name.byteSize();
    public static final long SIZE$version = LAYOUT$version.byteSize();
    public static final long SIZE$purposes = LAYOUT$purposes.byteSize();
    public static final long SIZE$description = LAYOUT$description.byteSize();
    public static final long SIZE$layer = LAYOUT$layer.byteSize();
}
