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

public record VkApplicationInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$pApplicationName = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pApplicationName");
    public static final OfInt LAYOUT$applicationVersion = ValueLayout.JAVA_INT.withName("applicationVersion");
    public static final AddressLayout LAYOUT$pEngineName = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pEngineName");
    public static final OfInt LAYOUT$engineVersion = ValueLayout.JAVA_INT.withName("engineVersion");
    public static final OfInt LAYOUT$apiVersion = ValueLayout.JAVA_INT.withName("apiVersion");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$pApplicationName, LAYOUT$applicationVersion, LAYOUT$pEngineName, LAYOUT$engineVersion, LAYOUT$apiVersion);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkApplicationInfo allocate(Arena arena) {
        return new VkApplicationInfo(arena.allocate(LAYOUT));
    }

    public static VkApplicationInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkApplicationInfo[] ret = new VkApplicationInfo[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pApplicationName = PathElement.groupElement("PATH$pApplicationName");
    public static final PathElement PATH$applicationVersion = PathElement.groupElement("PATH$applicationVersion");
    public static final PathElement PATH$pEngineName = PathElement.groupElement("PATH$pEngineName");
    public static final PathElement PATH$engineVersion = PathElement.groupElement("PATH$engineVersion");
    public static final PathElement PATH$apiVersion = PathElement.groupElement("PATH$apiVersion");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pApplicationName = LAYOUT$pApplicationName.byteSize();
    public static final long SIZE$applicationVersion = LAYOUT$applicationVersion.byteSize();
    public static final long SIZE$pEngineName = LAYOUT$pEngineName.byteSize();
    public static final long SIZE$engineVersion = LAYOUT$engineVersion.byteSize();
    public static final long SIZE$apiVersion = LAYOUT$apiVersion.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pApplicationName = LAYOUT.byteOffset(PATH$pApplicationName);
    public static final long OFFSET$applicationVersion = LAYOUT.byteOffset(PATH$applicationVersion);
    public static final long OFFSET$pEngineName = LAYOUT.byteOffset(PATH$pEngineName);
    public static final long OFFSET$engineVersion = LAYOUT.byteOffset(PATH$engineVersion);
    public static final long OFFSET$apiVersion = LAYOUT.byteOffset(PATH$apiVersion);

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

    public @pointer(comment="byte*") MemorySegment pApplicationNameRaw() {
        return segment.get(LAYOUT$pApplicationName, OFFSET$pApplicationName);
    }

    public void pApplicationNameRaw(@pointer(comment="byte*") MemorySegment value) {
        segment.set(LAYOUT$pApplicationName, OFFSET$pApplicationName, value);
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr pApplicationName() {
        MemorySegment s = pApplicationNameRaw();
        if (s.address() == 0) {
            return null;
        }
        return new BytePtr(s);
    }

    public void pApplicationName(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pApplicationNameRaw(s);
    }

    public @unsigned int applicationVersion() {
        return segment.get(LAYOUT$applicationVersion, OFFSET$applicationVersion);
    }

    public void applicationVersion(@unsigned int value) {
        segment.set(LAYOUT$applicationVersion, OFFSET$applicationVersion, value);
    }

    public @pointer(comment="byte*") MemorySegment pEngineNameRaw() {
        return segment.get(LAYOUT$pEngineName, OFFSET$pEngineName);
    }

    public void pEngineNameRaw(@pointer(comment="byte*") MemorySegment value) {
        segment.set(LAYOUT$pEngineName, OFFSET$pEngineName, value);
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr pEngineName() {
        MemorySegment s = pEngineNameRaw();
        if (s.address() == 0) {
            return null;
        }
        return new BytePtr(s);
    }

    public void pEngineName(@Nullable BytePtr value) {
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

}
/// dummy, not implemented yet
