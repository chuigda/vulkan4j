package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkApplicationInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pApplicationName"),
        ValueLayout.JAVA_INT.withName("applicationVersion"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pEngineName"),
        ValueLayout.JAVA_INT.withName("engineVersion"),
        ValueLayout.JAVA_INT.withName("apiVersion")
    );

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

    public @pointer(comment="int8_t*") MemorySegment pApplicationNameRaw() {
        return segment.get(LAYOUT$pApplicationName, OFFSET$pApplicationName);
    }

    public void pApplicationNameRaw(@pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pApplicationName, OFFSET$pApplicationName, value);
    }
    
    public ByteBuffer pApplicationName() {
        return new ByteBuffer(pApplicationNameRaw());
    }

    public void pApplicationName(ByteBuffer value) {
        pApplicationNameRaw(value.segment());
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
    
    public ByteBuffer pEngineName() {
        return new ByteBuffer(pEngineNameRaw());
    }

    public void pEngineName(ByteBuffer value) {
        pEngineNameRaw(value.segment());
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
            ret[i] = new VkApplicationInfo(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
