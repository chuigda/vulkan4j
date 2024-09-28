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
/// typedef struct VkPhysicalDeviceDepthStencilResolveProperties {
///     VkStructureType sType;
///     void* pNext;
///     VkResolveModeFlags supportedDepthResolveModes;
///     VkResolveModeFlags supportedStencilResolveModes;
///     VkBool32 independentResolveNone;
///     VkBool32 independentResolve;
/// } VkPhysicalDeviceDepthStencilResolveProperties;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceDepthStencilResolveProperties.html">VkPhysicalDeviceDepthStencilResolveProperties</a>
public record VkPhysicalDeviceDepthStencilResolveProperties(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportedDepthResolveModes"),
        ValueLayout.JAVA_INT.withName("supportedStencilResolveModes"),
        ValueLayout.JAVA_INT.withName("independentResolveNone"),
        ValueLayout.JAVA_INT.withName("independentResolve")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$supportedDepthResolveModes = PathElement.groupElement("supportedDepthResolveModes");
    public static final PathElement PATH$supportedStencilResolveModes = PathElement.groupElement("supportedStencilResolveModes");
    public static final PathElement PATH$independentResolveNone = PathElement.groupElement("independentResolveNone");
    public static final PathElement PATH$independentResolve = PathElement.groupElement("independentResolve");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$supportedDepthResolveModes = (OfInt) LAYOUT.select(PATH$supportedDepthResolveModes);
    public static final OfInt LAYOUT$supportedStencilResolveModes = (OfInt) LAYOUT.select(PATH$supportedStencilResolveModes);
    public static final OfInt LAYOUT$independentResolveNone = (OfInt) LAYOUT.select(PATH$independentResolveNone);
    public static final OfInt LAYOUT$independentResolve = (OfInt) LAYOUT.select(PATH$independentResolve);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$supportedDepthResolveModes = LAYOUT.byteOffset(PATH$supportedDepthResolveModes);
    public static final long OFFSET$supportedStencilResolveModes = LAYOUT.byteOffset(PATH$supportedStencilResolveModes);
    public static final long OFFSET$independentResolveNone = LAYOUT.byteOffset(PATH$independentResolveNone);
    public static final long OFFSET$independentResolve = LAYOUT.byteOffset(PATH$independentResolve);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$supportedDepthResolveModes = LAYOUT$supportedDepthResolveModes.byteSize();
    public static final long SIZE$supportedStencilResolveModes = LAYOUT$supportedStencilResolveModes.byteSize();
    public static final long SIZE$independentResolveNone = LAYOUT$independentResolveNone.byteSize();
    public static final long SIZE$independentResolve = LAYOUT$independentResolve.byteSize();

    public VkPhysicalDeviceDepthStencilResolveProperties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES);
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

    public @enumtype(VkResolveModeFlags.class) int supportedDepthResolveModes() {
        return segment.get(LAYOUT$supportedDepthResolveModes, OFFSET$supportedDepthResolveModes);
    }

    public void supportedDepthResolveModes(@enumtype(VkResolveModeFlags.class) int value) {
        segment.set(LAYOUT$supportedDepthResolveModes, OFFSET$supportedDepthResolveModes, value);
    }

    public @enumtype(VkResolveModeFlags.class) int supportedStencilResolveModes() {
        return segment.get(LAYOUT$supportedStencilResolveModes, OFFSET$supportedStencilResolveModes);
    }

    public void supportedStencilResolveModes(@enumtype(VkResolveModeFlags.class) int value) {
        segment.set(LAYOUT$supportedStencilResolveModes, OFFSET$supportedStencilResolveModes, value);
    }

    public @unsigned int independentResolveNone() {
        return segment.get(LAYOUT$independentResolveNone, OFFSET$independentResolveNone);
    }

    public void independentResolveNone(@unsigned int value) {
        segment.set(LAYOUT$independentResolveNone, OFFSET$independentResolveNone, value);
    }

    public @unsigned int independentResolve() {
        return segment.get(LAYOUT$independentResolve, OFFSET$independentResolve);
    }

    public void independentResolve(@unsigned int value) {
        segment.set(LAYOUT$independentResolve, OFFSET$independentResolve, value);
    }

    public static VkPhysicalDeviceDepthStencilResolveProperties allocate(Arena arena) {
        return new VkPhysicalDeviceDepthStencilResolveProperties(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceDepthStencilResolveProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceDepthStencilResolveProperties[] ret = new VkPhysicalDeviceDepthStencilResolveProperties[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceDepthStencilResolveProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
