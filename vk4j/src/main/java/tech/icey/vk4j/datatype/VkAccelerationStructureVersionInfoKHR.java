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
/// typedef struct VkAccelerationStructureVersionInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     const uint8_t* pVersionData;
/// } VkAccelerationStructureVersionInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAccelerationStructureVersionInfoKHR.html">VkAccelerationStructureVersionInfoKHR</a>
public record VkAccelerationStructureVersionInfoKHR(MemorySegment segment) implements IPointer {
    public VkAccelerationStructureVersionInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_VERSION_INFO_KHR);
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

    public @pointer(comment="uint8_t*") MemorySegment pVersionDataRaw() {
        return segment.get(LAYOUT$pVersionData, OFFSET$pVersionData);
    }

    public void pVersionDataRaw(@pointer(comment="uint8_t*") MemorySegment value) {
        segment.set(LAYOUT$pVersionData, OFFSET$pVersionData, value);
    }

    /// Note: the returned {@link ByteBuffer} does not have correct
    /// {@link ByteBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ByteBuffer#reinterpret} to set the size before actually
    /// {@link ByteBuffer#read}ing or
    /// {@link ByteBuffer#write}ing the buffer.
    public @Nullable @unsigned ByteBuffer pVersionData() {
        MemorySegment s = pVersionDataRaw();
        return s.address() == 0 ? null : new ByteBuffer(s);
    }

    public void pVersionData(@Nullable @unsigned ByteBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVersionDataRaw(s);
    }

    public static VkAccelerationStructureVersionInfoKHR allocate(Arena arena) {
        return new VkAccelerationStructureVersionInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureVersionInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureVersionInfoKHR[] ret = new VkAccelerationStructureVersionInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAccelerationStructureVersionInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAccelerationStructureVersionInfoKHR clone(Arena arena, VkAccelerationStructureVersionInfoKHR src) {
        VkAccelerationStructureVersionInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureVersionInfoKHR[] clone(Arena arena, VkAccelerationStructureVersionInfoKHR[] src) {
        VkAccelerationStructureVersionInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pVersionData")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pVersionData = PathElement.groupElement("pVersionData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pVersionData = (AddressLayout) LAYOUT.select(PATH$pVersionData);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pVersionData = LAYOUT.byteOffset(PATH$pVersionData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pVersionData = LAYOUT$pVersionData.byteSize();
}
