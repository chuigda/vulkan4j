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
/// typedef struct VkDebugUtilsLabelEXT {
///     VkStructureType sType;
///     const void* pNext;
///     const char* pLabelName;
///     float color[4];
/// } VkDebugUtilsLabelEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDebugUtilsLabelEXT.html">VkDebugUtilsLabelEXT</a>
public record VkDebugUtilsLabelEXT(MemorySegment segment) implements IPointer {
    public VkDebugUtilsLabelEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT);
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

    public @pointer(comment="int8_t*") MemorySegment pLabelNameRaw() {
        return segment.get(LAYOUT$pLabelName, OFFSET$pLabelName);
    }

    public void pLabelNameRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pLabelName, OFFSET$pLabelName, value);
    }

    /// Note: the returned {@link ByteBuffer} does not have correct
    /// {@link ByteBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ByteBuffer#reinterpret} to set the size before actually
    /// {@link ByteBuffer#read}ing or
    /// {@link ByteBuffer#write}ing the buffer.
    public @Nullable ByteBuffer pLabelName() {
        MemorySegment s = pLabelNameRaw();
        return s.address() == 0 ? null : new ByteBuffer(s);
    }

    public void pLabelName(@Nullable ByteBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLabelNameRaw(s);
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

    public static VkDebugUtilsLabelEXT allocate(Arena arena) {
        return new VkDebugUtilsLabelEXT(arena.allocate(LAYOUT));
    }

    public static VkDebugUtilsLabelEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDebugUtilsLabelEXT[] ret = new VkDebugUtilsLabelEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDebugUtilsLabelEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDebugUtilsLabelEXT clone(Arena arena, VkDebugUtilsLabelEXT src) {
        VkDebugUtilsLabelEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDebugUtilsLabelEXT[] clone(Arena arena, VkDebugUtilsLabelEXT[] src) {
        VkDebugUtilsLabelEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pLabelName"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_FLOAT).withName("color")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pLabelName = PathElement.groupElement("pLabelName");
    public static final PathElement PATH$color = PathElement.groupElement("color");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pLabelName = (AddressLayout) LAYOUT.select(PATH$pLabelName);
    public static final SequenceLayout LAYOUT$color = (SequenceLayout) LAYOUT.select(PATH$color);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pLabelName = LAYOUT.byteOffset(PATH$pLabelName);
    public static final long OFFSET$color = LAYOUT.byteOffset(PATH$color);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pLabelName = LAYOUT$pLabelName.byteSize();
    public static final long SIZE$color = LAYOUT$color.byteSize();
}
