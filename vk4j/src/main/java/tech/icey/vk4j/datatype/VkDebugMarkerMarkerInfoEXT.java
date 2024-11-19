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
/// typedef struct VkDebugMarkerMarkerInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     const char* pMarkerName;
///     float color[4];
/// } VkDebugMarkerMarkerInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDebugMarkerMarkerInfoEXT.html">VkDebugMarkerMarkerInfoEXT</a>
public record VkDebugMarkerMarkerInfoEXT(MemorySegment segment) implements IPointer {
    public VkDebugMarkerMarkerInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT);
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

    public @pointer(comment="int8_t*") MemorySegment pMarkerNameRaw() {
        return segment.get(LAYOUT$pMarkerName, OFFSET$pMarkerName);
    }

    public void pMarkerNameRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pMarkerName, OFFSET$pMarkerName, value);
    }

    /// Note: the returned {@link ByteBuffer} does not have correct
    /// {@link ByteBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ByteBuffer#reinterpret} to set the size before actually
    /// {@link ByteBuffer#read}ing or
    /// {@link ByteBuffer#write}ing the buffer.
    public @Nullable ByteBuffer pMarkerName() {
        MemorySegment s = pMarkerNameRaw();
        return s.address() == 0 ? null : new ByteBuffer(s);
    }

    public void pMarkerName(@Nullable ByteBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMarkerNameRaw(s);
    }

    public MemorySegment colorRaw() {
        return segment.asSlice(OFFSET$color, SIZE$color);
    }

    public FloatBuffer color() {
        return new FloatBuffer(colorRaw());
    }

    public void color(FloatBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$color, SIZE$color);
    }

    public static VkDebugMarkerMarkerInfoEXT allocate(Arena arena) {
        return new VkDebugMarkerMarkerInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkDebugMarkerMarkerInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDebugMarkerMarkerInfoEXT[] ret = new VkDebugMarkerMarkerInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDebugMarkerMarkerInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDebugMarkerMarkerInfoEXT clone(Arena arena, VkDebugMarkerMarkerInfoEXT src) {
        VkDebugMarkerMarkerInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDebugMarkerMarkerInfoEXT[] clone(Arena arena, VkDebugMarkerMarkerInfoEXT[] src) {
        VkDebugMarkerMarkerInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pMarkerName"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_FLOAT).withName("color")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pMarkerName = PathElement.groupElement("pMarkerName");
    public static final PathElement PATH$color = PathElement.groupElement("color");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pMarkerName = (AddressLayout) LAYOUT.select(PATH$pMarkerName);
    public static final SequenceLayout LAYOUT$color = (SequenceLayout) LAYOUT.select(PATH$color);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pMarkerName = LAYOUT.byteOffset(PATH$pMarkerName);
    public static final long OFFSET$color = LAYOUT.byteOffset(PATH$color);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pMarkerName = LAYOUT$pMarkerName.byteSize();
    public static final long SIZE$color = LAYOUT$color.byteSize();
}
