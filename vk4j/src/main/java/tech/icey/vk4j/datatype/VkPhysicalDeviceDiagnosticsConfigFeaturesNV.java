package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceDiagnosticsConfigFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 diagnosticsConfig;
/// } VkPhysicalDeviceDiagnosticsConfigFeaturesNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceDiagnosticsConfigFeaturesNV.html">VkPhysicalDeviceDiagnosticsConfigFeaturesNV</a>
public record VkPhysicalDeviceDiagnosticsConfigFeaturesNV(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int diagnosticsConfig() {
        return segment.get(LAYOUT$diagnosticsConfig, OFFSET$diagnosticsConfig);
    }

    public void diagnosticsConfig(@unsigned int value) {
        segment.set(LAYOUT$diagnosticsConfig, OFFSET$diagnosticsConfig, value);
    }

    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceDiagnosticsConfigFeaturesNV[] ret = new VkPhysicalDeviceDiagnosticsConfigFeaturesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("diagnosticsConfig")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$diagnosticsConfig = PathElement.groupElement("diagnosticsConfig");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$diagnosticsConfig = (OfInt) LAYOUT.select(PATH$diagnosticsConfig);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$diagnosticsConfig = LAYOUT.byteOffset(PATH$diagnosticsConfig);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$diagnosticsConfig = LAYOUT$diagnosticsConfig.byteSize();
}
