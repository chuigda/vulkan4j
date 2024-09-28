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
/// typedef struct VkTilePropertiesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkExtent3D tileSize;
///     VkExtent2D apronSize;
///     VkOffset2D origin;
/// } VkTilePropertiesQCOM;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkTilePropertiesQCOM.html">VkTilePropertiesQCOM</a>
public record VkTilePropertiesQCOM(MemorySegment segment) implements IPointer {
    public VkTilePropertiesQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_TILE_PROPERTIES_QCOM);
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

    public VkExtent3D tileSize() {
        return new VkExtent3D(segment.asSlice(OFFSET$tileSize, LAYOUT$tileSize));
    }

    public void tileSize(VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$tileSize, SIZE$tileSize);
    }

    public VkExtent2D apronSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$apronSize, LAYOUT$apronSize));
    }

    public void apronSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$apronSize, SIZE$apronSize);
    }

    public VkOffset2D origin() {
        return new VkOffset2D(segment.asSlice(OFFSET$origin, LAYOUT$origin));
    }

    public void origin(VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$origin, SIZE$origin);
    }

    public static VkTilePropertiesQCOM allocate(Arena arena) {
        return new VkTilePropertiesQCOM(arena.allocate(LAYOUT));
    }
    
    public static VkTilePropertiesQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkTilePropertiesQCOM[] ret = new VkTilePropertiesQCOM[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkTilePropertiesQCOM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent3D.LAYOUT.withName("tileSize"),
        VkExtent2D.LAYOUT.withName("apronSize"),
        VkOffset2D.LAYOUT.withName("origin")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$tileSize = PathElement.groupElement("tileSize");
    public static final PathElement PATH$apronSize = PathElement.groupElement("apronSize");
    public static final PathElement PATH$origin = PathElement.groupElement("origin");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$tileSize = (StructLayout) LAYOUT.select(PATH$tileSize);
    public static final StructLayout LAYOUT$apronSize = (StructLayout) LAYOUT.select(PATH$apronSize);
    public static final StructLayout LAYOUT$origin = (StructLayout) LAYOUT.select(PATH$origin);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$tileSize = LAYOUT.byteOffset(PATH$tileSize);
    public static final long OFFSET$apronSize = LAYOUT.byteOffset(PATH$apronSize);
    public static final long OFFSET$origin = LAYOUT.byteOffset(PATH$origin);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$tileSize = LAYOUT$tileSize.byteSize();
    public static final long SIZE$apronSize = LAYOUT$apronSize.byteSize();
    public static final long SIZE$origin = LAYOUT$origin.byteSize();

}
