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
/// typedef struct VkExportSemaphoreWin32HandleInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     const SECURITY_ATTRIBUTES* pAttributes;
///     DWORD dwAccess;
///     LPCWSTR name;
/// } VkExportSemaphoreWin32HandleInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkExportSemaphoreWin32HandleInfoKHR.html">VkExportSemaphoreWin32HandleInfoKHR</a>
public record VkExportSemaphoreWin32HandleInfoKHR(MemorySegment segment) implements IPointer {
    public VkExportSemaphoreWin32HandleInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR);
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

    public @pointer(comment="void*") MemorySegment pAttributes() {
        return segment.get(LAYOUT$pAttributes, OFFSET$pAttributes);
    }

    public void pAttributes(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pAttributes, OFFSET$pAttributes, value);
    }

    public void pAttributes(@Nullable IPointer pointer) {
        pAttributes(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int dwAccess() {
        return segment.get(LAYOUT$dwAccess, OFFSET$dwAccess);
    }

    public void dwAccess(@unsigned int value) {
        segment.set(LAYOUT$dwAccess, OFFSET$dwAccess, value);
    }

    public @pointer(comment="uint16_t*") MemorySegment nameRaw() {
        return segment.get(LAYOUT$name, OFFSET$name);
    }

    public void nameRaw(@pointer(comment="uint16_t*") MemorySegment value) {
        segment.set(LAYOUT$name, OFFSET$name, value);
    }

    /// Note: the returned {@link ShortBuffer} does not have correct
    /// {@link ShortBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ShortBuffer#reinterpret} to set the size before actually
    /// {@link ShortBuffer#read}ing or
    /// {@link ShortBuffer#write}ing the buffer.
    public @Nullable @unsigned ShortBuffer name() {
        MemorySegment s = nameRaw();
        return s.address() == 0 ? null : new ShortBuffer(s);
    }

    public void name(@Nullable @unsigned ShortBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nameRaw(s);
    }

    public static VkExportSemaphoreWin32HandleInfoKHR allocate(Arena arena) {
        return new VkExportSemaphoreWin32HandleInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkExportSemaphoreWin32HandleInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExportSemaphoreWin32HandleInfoKHR[] ret = new VkExportSemaphoreWin32HandleInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkExportSemaphoreWin32HandleInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkExportSemaphoreWin32HandleInfoKHR clone(Arena arena, VkExportSemaphoreWin32HandleInfoKHR src) {
        VkExportSemaphoreWin32HandleInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkExportSemaphoreWin32HandleInfoKHR[] clone(Arena arena, VkExportSemaphoreWin32HandleInfoKHR[] src) {
        VkExportSemaphoreWin32HandleInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pAttributes"),
        ValueLayout.JAVA_INT.withName("dwAccess"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT).withName("name")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pAttributes = PathElement.groupElement("pAttributes");
    public static final PathElement PATH$dwAccess = PathElement.groupElement("dwAccess");
    public static final PathElement PATH$name = PathElement.groupElement("name");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pAttributes = (AddressLayout) LAYOUT.select(PATH$pAttributes);
    public static final OfInt LAYOUT$dwAccess = (OfInt) LAYOUT.select(PATH$dwAccess);
    public static final AddressLayout LAYOUT$name = (AddressLayout) LAYOUT.select(PATH$name);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pAttributes = LAYOUT.byteOffset(PATH$pAttributes);
    public static final long OFFSET$dwAccess = LAYOUT.byteOffset(PATH$dwAccess);
    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pAttributes = LAYOUT$pAttributes.byteSize();
    public static final long SIZE$dwAccess = LAYOUT$dwAccess.byteSize();
    public static final long SIZE$name = LAYOUT$name.byteSize();
}
