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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureCreateInfoKHR.html"><code>VkAccelerationStructureCreateInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureCreateInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkAccelerationStructureCreateFlagsKHR createFlags; // optional
///     VkBuffer buffer;
///     VkDeviceSize offset;
///     VkDeviceSize size;
///     VkAccelerationStructureTypeKHR type;
///     VkDeviceAddress deviceAddress; // optional
/// } VkAccelerationStructureCreateInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_KHR`
///
/// The {@link VkAccelerationStructureCreateInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkAccelerationStructureCreateInfoKHR#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureCreateInfoKHR.html"><code>VkAccelerationStructureCreateInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAccelerationStructureCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkAccelerationStructureCreateInfoKHR allocate(Arena arena) {
        VkAccelerationStructureCreateInfoKHR ret = new VkAccelerationStructureCreateInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.ACCELERATION_STRUCTURE_CREATE_INFO_KHR);
        return ret;
    }

    public static VkAccelerationStructureCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureCreateInfoKHR[] ret = new VkAccelerationStructureCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureCreateInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.ACCELERATION_STRUCTURE_CREATE_INFO_KHR);
        }
        return ret;
    }

    public static VkAccelerationStructureCreateInfoKHR clone(Arena arena, VkAccelerationStructureCreateInfoKHR src) {
        VkAccelerationStructureCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureCreateInfoKHR[] clone(Arena arena, VkAccelerationStructureCreateInfoKHR[] src) {
        VkAccelerationStructureCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.ACCELERATION_STRUCTURE_CREATE_INFO_KHR);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkAccelerationStructureCreateFlagsKHR.class) int createFlags() {
        return segment.get(LAYOUT$createFlags, OFFSET$createFlags);
    }

    public void createFlags(@enumtype(VkAccelerationStructureCreateFlagsKHR.class) int value) {
        segment.set(LAYOUT$createFlags, OFFSET$createFlags, value);
    }

    public @Nullable VkBuffer buffer() {
        MemorySegment s = segment.asSlice(OFFSET$buffer, SIZE$buffer);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void buffer(@Nullable VkBuffer value) {
        segment.set(LAYOUT$buffer, OFFSET$buffer, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned long offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@unsigned long value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @enumtype(VkAccelerationStructureTypeKHR.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkAccelerationStructureTypeKHR.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @unsigned long deviceAddress() {
        return segment.get(LAYOUT$deviceAddress, OFFSET$deviceAddress);
    }

    public void deviceAddress(@unsigned long value) {
        segment.set(LAYOUT$deviceAddress, OFFSET$deviceAddress, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("createFlags"),
        ValueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_LONG.withName("deviceAddress")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$createFlags = PathElement.groupElement("PATH$createFlags");
    public static final PathElement PATH$buffer = PathElement.groupElement("PATH$buffer");
    public static final PathElement PATH$offset = PathElement.groupElement("PATH$offset");
    public static final PathElement PATH$size = PathElement.groupElement("PATH$size");
    public static final PathElement PATH$type = PathElement.groupElement("PATH$type");
    public static final PathElement PATH$deviceAddress = PathElement.groupElement("PATH$deviceAddress");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$createFlags = (OfInt) LAYOUT.select(PATH$createFlags);
    public static final AddressLayout LAYOUT$buffer = (AddressLayout) LAYOUT.select(PATH$buffer);
    public static final OfLong LAYOUT$offset = (OfLong) LAYOUT.select(PATH$offset);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfLong LAYOUT$deviceAddress = (OfLong) LAYOUT.select(PATH$deviceAddress);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$createFlags = LAYOUT$createFlags.byteSize();
    public static final long SIZE$buffer = LAYOUT$buffer.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$deviceAddress = LAYOUT$deviceAddress.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$createFlags = LAYOUT.byteOffset(PATH$createFlags);
    public static final long OFFSET$buffer = LAYOUT.byteOffset(PATH$buffer);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$deviceAddress = LAYOUT.byteOffset(PATH$deviceAddress);
}
