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
/// typedef struct VkApplicationInfo {
///     VkStructureType sType;
///     const void* pNext;
///     const char* pApplicationName;
///     uint32_t applicationVersion;
///     const char* pEngineName;
///     uint32_t engineVersion;
///     uint32_t apiVersion;
/// } VkApplicationInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkApplicationInfo.html">VkApplicationInfo</a>
public record VkApplicationInfo(MemorySegment segment) implements IPointer {
    public VkApplicationInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_APPLICATION_INFO);
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

    public @pointer(comment="int8_t*") MemorySegment pApplicationNameRaw() {
        return segment.get(LAYOUT$pApplicationName, OFFSET$pApplicationName);
    }

    public void pApplicationNameRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pApplicationName, OFFSET$pApplicationName, value);
    }

    /// Note: the returned {@link ByteBuffer} does not have correct
    /// {@link ByteBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ByteBuffer#reinterpret} to set the size before actually
    /// {@link ByteBuffer#read}ing or
    /// {@link ByteBuffer#write}ing the buffer.
    public @Nullable ByteBuffer pApplicationName() {
        MemorySegment s = pApplicationNameRaw();
        return s.address() == 0 ? null : new ByteBuffer(s);
    }

    public void pApplicationName(@Nullable ByteBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pApplicationNameRaw(s);
    }

    public @unsigned int applicationVersion() {
        return segment.get(LAYOUT$applicationVersion, OFFSET$applicationVersion);
    }

    public void applicationVersion(@unsigned int value) {
        segment.set(LAYOUT$applicationVersion, OFFSET$applicationVersion, value);
    }

    public @pointer(comment="int8_t*") MemorySegment pEngineNameRaw() {
        return segment.get(LAYOUT$pEngineName, OFFSET$pEngineName);
    }

    public void pEngineNameRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pEngineName, OFFSET$pEngineName, value);
    }

    /// Note: the returned {@link ByteBuffer} does not have correct
    /// {@link ByteBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ByteBuffer#reinterpret} to set the size before actually
    /// {@link ByteBuffer#read}ing or
    /// {@link ByteBuffer#write}ing the buffer.
    public @Nullable ByteBuffer pEngineName() {
        MemorySegment s = pEngineNameRaw();
        return s.address() == 0 ? null : new ByteBuffer(s);
    }

    public void pEngineName(@Nullable ByteBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pEngineNameRaw(s);
    }

    public @unsigned int engineVersion() {
        return segment.get(LAYOUT$engineVersion, OFFSET$engineVersion);
    }

    public void engineVersion(@unsigned int value) {
        segment.set(LAYOUT$engineVersion, OFFSET$engineVersion, value);
    }

    public @unsigned int apiVersion() {
        return segment.get(LAYOUT$apiVersion, OFFSET$apiVersion);
    }

    public void apiVersion(@unsigned int value) {
        segment.set(LAYOUT$apiVersion, OFFSET$apiVersion, value);
    }

    public static VkApplicationInfo allocate(Arena arena) {
        return new VkApplicationInfo(arena.allocate(LAYOUT));
    }

    public static VkApplicationInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkApplicationInfo[] ret = new VkApplicationInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkApplicationInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkApplicationInfo clone(Arena arena, VkApplicationInfo src) {
        VkApplicationInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkApplicationInfo[] clone(Arena arena, VkApplicationInfo[] src) {
        VkApplicationInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pApplicationName"),
        ValueLayout.JAVA_INT.withName("applicationVersion"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pEngineName"),
        ValueLayout.JAVA_INT.withName("engineVersion"),
        ValueLayout.JAVA_INT.withName("apiVersion")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pApplicationName = PathElement.groupElement("pApplicationName");
    public static final PathElement PATH$applicationVersion = PathElement.groupElement("applicationVersion");
    public static final PathElement PATH$pEngineName = PathElement.groupElement("pEngineName");
    public static final PathElement PATH$engineVersion = PathElement.groupElement("engineVersion");
    public static final PathElement PATH$apiVersion = PathElement.groupElement("apiVersion");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pApplicationName = (AddressLayout) LAYOUT.select(PATH$pApplicationName);
    public static final OfInt LAYOUT$applicationVersion = (OfInt) LAYOUT.select(PATH$applicationVersion);
    public static final AddressLayout LAYOUT$pEngineName = (AddressLayout) LAYOUT.select(PATH$pEngineName);
    public static final OfInt LAYOUT$engineVersion = (OfInt) LAYOUT.select(PATH$engineVersion);
    public static final OfInt LAYOUT$apiVersion = (OfInt) LAYOUT.select(PATH$apiVersion);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pApplicationName = LAYOUT.byteOffset(PATH$pApplicationName);
    public static final long OFFSET$applicationVersion = LAYOUT.byteOffset(PATH$applicationVersion);
    public static final long OFFSET$pEngineName = LAYOUT.byteOffset(PATH$pEngineName);
    public static final long OFFSET$engineVersion = LAYOUT.byteOffset(PATH$engineVersion);
    public static final long OFFSET$apiVersion = LAYOUT.byteOffset(PATH$apiVersion);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pApplicationName = LAYOUT$pApplicationName.byteSize();
    public static final long SIZE$applicationVersion = LAYOUT$applicationVersion.byteSize();
    public static final long SIZE$pEngineName = LAYOUT$pEngineName.byteSize();
    public static final long SIZE$engineVersion = LAYOUT$engineVersion.byteSize();
    public static final long SIZE$apiVersion = LAYOUT$apiVersion.byteSize();
}
