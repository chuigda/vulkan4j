package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.panama.buffer.ByteBuffer;
import tech.icey.vk4j.enumtype.VkLayerSettingTypeEXT;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;

/// {@snippet lang=c :
/// typedef struct VkLayerSettingEXT {
///     const char* pLayerName;
///     const char* pSettingName;
///     VkLayerSettingTypeEXT type;
///     uint32_t valueCount;
///     const void* pValues;
/// } VkLayerSettingEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkLayerSettingEXT.html">VkLayerSettingEXT</a>
public record VkLayerSettingEXT(MemorySegment segment) implements IPointer {
    public VkLayerSettingEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @pointer(comment="int8_t*") MemorySegment pLayerNameRaw() {
        return segment.get(LAYOUT$pLayerName, OFFSET$pLayerName);
    }

    public void pLayerNameRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pLayerName, OFFSET$pLayerName, value);
    }

    /// Note: the returned {@link ByteBuffer} does not have correct
    /// {@link ByteBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ByteBuffer#reinterpret} to set the size before actually
    /// {@link ByteBuffer#read}ing or
    /// {@link ByteBuffer#write}ing the buffer.
    public @nullable ByteBuffer pLayerName() {
        MemorySegment s = pLayerNameRaw();
        return s.address() == 0 ? null : new ByteBuffer(s);
    }

    public void pLayerName(@nullable ByteBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLayerNameRaw(s);
    }

    public @pointer(comment="int8_t*") MemorySegment pSettingNameRaw() {
        return segment.get(LAYOUT$pSettingName, OFFSET$pSettingName);
    }

    public void pSettingNameRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pSettingName, OFFSET$pSettingName, value);
    }

    /// Note: the returned {@link ByteBuffer} does not have correct
    /// {@link ByteBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ByteBuffer#reinterpret} to set the size before actually
    /// {@link ByteBuffer#read}ing or
    /// {@link ByteBuffer#write}ing the buffer.
    public @nullable ByteBuffer pSettingName() {
        MemorySegment s = pSettingNameRaw();
        return s.address() == 0 ? null : new ByteBuffer(s);
    }

    public void pSettingName(@nullable ByteBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSettingNameRaw(s);
    }

    public @enumtype(VkLayerSettingTypeEXT.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkLayerSettingTypeEXT.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @unsigned int valueCount() {
        return segment.get(LAYOUT$valueCount, OFFSET$valueCount);
    }

    public void valueCount(@unsigned int value) {
        segment.set(LAYOUT$valueCount, OFFSET$valueCount, value);
    }

    public @pointer(comment="void*") MemorySegment pValues() {
        return segment.get(LAYOUT$pValues, OFFSET$pValues);
    }

    public void pValues(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pValues, OFFSET$pValues, value);
    }

    public void pValues(@nullable IPointer pointer) {
        pValues(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public static VkLayerSettingEXT allocate(Arena arena) {
        return new VkLayerSettingEXT(arena.allocate(LAYOUT));
    }

    public static VkLayerSettingEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkLayerSettingEXT[] ret = new VkLayerSettingEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkLayerSettingEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkLayerSettingEXT clone(Arena arena, VkLayerSettingEXT src) {
        VkLayerSettingEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkLayerSettingEXT[] clone(Arena arena, VkLayerSettingEXT[] src) {
        VkLayerSettingEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pLayerName"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pSettingName"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("valueCount"),
        ValueLayout.ADDRESS.withName("pValues")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$pLayerName = PathElement.groupElement("pLayerName");
    public static final PathElement PATH$pSettingName = PathElement.groupElement("pSettingName");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$valueCount = PathElement.groupElement("valueCount");
    public static final PathElement PATH$pValues = PathElement.groupElement("pValues");

    public static final AddressLayout LAYOUT$pLayerName = (AddressLayout) LAYOUT.select(PATH$pLayerName);
    public static final AddressLayout LAYOUT$pSettingName = (AddressLayout) LAYOUT.select(PATH$pSettingName);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$valueCount = (OfInt) LAYOUT.select(PATH$valueCount);
    public static final AddressLayout LAYOUT$pValues = (AddressLayout) LAYOUT.select(PATH$pValues);

    public static final long OFFSET$pLayerName = LAYOUT.byteOffset(PATH$pLayerName);
    public static final long OFFSET$pSettingName = LAYOUT.byteOffset(PATH$pSettingName);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$valueCount = LAYOUT.byteOffset(PATH$valueCount);
    public static final long OFFSET$pValues = LAYOUT.byteOffset(PATH$pValues);

    public static final long SIZE$pLayerName = LAYOUT$pLayerName.byteSize();
    public static final long SIZE$pSettingName = LAYOUT$pSettingName.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$valueCount = LAYOUT$valueCount.byteSize();
    public static final long SIZE$pValues = LAYOUT$pValues.byteSize();
}
