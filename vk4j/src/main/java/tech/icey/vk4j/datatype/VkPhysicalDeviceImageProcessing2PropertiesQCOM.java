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
/// typedef struct VkPhysicalDeviceImageProcessing2PropertiesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkExtent2D maxBlockMatchWindow;
/// } VkPhysicalDeviceImageProcessing2PropertiesQCOM;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceImageProcessing2PropertiesQCOM.html">VkPhysicalDeviceImageProcessing2PropertiesQCOM</a>
public record VkPhysicalDeviceImageProcessing2PropertiesQCOM(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceImageProcessing2PropertiesQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_PROPERTIES_QCOM);
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

    public VkExtent2D maxBlockMatchWindow() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxBlockMatchWindow, LAYOUT$maxBlockMatchWindow));
    }

    public void maxBlockMatchWindow(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxBlockMatchWindow, SIZE$maxBlockMatchWindow);
    }

    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM allocate(Arena arena) {
        return new VkPhysicalDeviceImageProcessing2PropertiesQCOM(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceImageProcessing2PropertiesQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceImageProcessing2PropertiesQCOM[] ret = new VkPhysicalDeviceImageProcessing2PropertiesQCOM[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceImageProcessing2PropertiesQCOM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent2D.LAYOUT.withName("maxBlockMatchWindow")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxBlockMatchWindow = PathElement.groupElement("maxBlockMatchWindow");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$maxBlockMatchWindow = (StructLayout) LAYOUT.select(PATH$maxBlockMatchWindow);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxBlockMatchWindow = LAYOUT.byteOffset(PATH$maxBlockMatchWindow);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxBlockMatchWindow = LAYOUT$maxBlockMatchWindow.byteSize();

}
