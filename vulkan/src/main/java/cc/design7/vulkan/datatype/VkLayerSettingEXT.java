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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkLayerSettingEXT.html">VkLayerSettingEXT</a>
@ValueBasedCandidate
public record VkLayerSettingEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final AddressLayout LAYOUT$pLayerName = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pLayerName");
    public static final AddressLayout LAYOUT$pSettingName = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pSettingName");
    public static final OfInt LAYOUT$type = ValueLayout.JAVA_INT.withName("type");
    public static final OfInt LAYOUT$valueCount = ValueLayout.JAVA_INT.withName("valueCount");
    public static final AddressLayout LAYOUT$pValues = ValueLayout.ADDRESS.withName("pValues");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$pLayerName, LAYOUT$pSettingName, LAYOUT$type, LAYOUT$valueCount, LAYOUT$pValues);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkLayerSettingEXT allocate(Arena arena) {
        return new VkLayerSettingEXT(arena.allocate(LAYOUT));
    }

    public static VkLayerSettingEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkLayerSettingEXT[] ret = new VkLayerSettingEXT[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$pLayerName = PathElement.groupElement("PATH$pLayerName");
    public static final PathElement PATH$pSettingName = PathElement.groupElement("PATH$pSettingName");
    public static final PathElement PATH$type = PathElement.groupElement("PATH$type");
    public static final PathElement PATH$valueCount = PathElement.groupElement("PATH$valueCount");
    public static final PathElement PATH$pValues = PathElement.groupElement("PATH$pValues");

    public static final long SIZE$pLayerName = LAYOUT$pLayerName.byteSize();
    public static final long SIZE$pSettingName = LAYOUT$pSettingName.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$valueCount = LAYOUT$valueCount.byteSize();
    public static final long SIZE$pValues = LAYOUT$pValues.byteSize();

    public static final long OFFSET$pLayerName = LAYOUT.byteOffset(PATH$pLayerName);
    public static final long OFFSET$pSettingName = LAYOUT.byteOffset(PATH$pSettingName);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$valueCount = LAYOUT.byteOffset(PATH$valueCount);
    public static final long OFFSET$pValues = LAYOUT.byteOffset(PATH$pValues);

    public @pointer(comment="byte*") MemorySegment pLayerNameRaw() {
        return segment.get(LAYOUT$pLayerName, OFFSET$pLayerName);
    }

    public void pLayerNameRaw(@pointer(comment="byte*") MemorySegment value) {
        segment.set(LAYOUT$pLayerName, OFFSET$pLayerName, value);
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr pLayerName() {
        MemorySegment s = pLayerNameRaw();
        if (s.address() == 0) {
            return null;
        }
        return new BytePtr(s);
    }

    public void pLayerName(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLayerNameRaw(s);
    }

    public @pointer(comment="byte*") MemorySegment pSettingNameRaw() {
        return segment.get(LAYOUT$pSettingName, OFFSET$pSettingName);
    }

    public void pSettingNameRaw(@pointer(comment="byte*") MemorySegment value) {
        segment.set(LAYOUT$pSettingName, OFFSET$pSettingName, value);
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr pSettingName() {
        MemorySegment s = pSettingNameRaw();
        if (s.address() == 0) {
            return null;
        }
        return new BytePtr(s);
    }

    public void pSettingName(@Nullable BytePtr value) {
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

    public void pValues(IPointer pointer) {
        pValues(pointer.segment());
    }

}
