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
/// typedef struct VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 primitivesGeneratedQuery;
///     VkBool32 primitivesGeneratedQueryWithRasterizerDiscard;
///     VkBool32 primitivesGeneratedQueryWithNonZeroStreams;
/// } VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.html">VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT</a>
public record VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVES_GENERATED_QUERY_FEATURES_EXT);
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

    public @unsigned int primitivesGeneratedQuery() {
        return segment.get(LAYOUT$primitivesGeneratedQuery, OFFSET$primitivesGeneratedQuery);
    }

    public void primitivesGeneratedQuery(@unsigned int value) {
        segment.set(LAYOUT$primitivesGeneratedQuery, OFFSET$primitivesGeneratedQuery, value);
    }

    public @unsigned int primitivesGeneratedQueryWithRasterizerDiscard() {
        return segment.get(LAYOUT$primitivesGeneratedQueryWithRasterizerDiscard, OFFSET$primitivesGeneratedQueryWithRasterizerDiscard);
    }

    public void primitivesGeneratedQueryWithRasterizerDiscard(@unsigned int value) {
        segment.set(LAYOUT$primitivesGeneratedQueryWithRasterizerDiscard, OFFSET$primitivesGeneratedQueryWithRasterizerDiscard, value);
    }

    public @unsigned int primitivesGeneratedQueryWithNonZeroStreams() {
        return segment.get(LAYOUT$primitivesGeneratedQueryWithNonZeroStreams, OFFSET$primitivesGeneratedQueryWithNonZeroStreams);
    }

    public void primitivesGeneratedQueryWithNonZeroStreams(@unsigned int value) {
        segment.set(LAYOUT$primitivesGeneratedQueryWithNonZeroStreams, OFFSET$primitivesGeneratedQueryWithNonZeroStreams, value);
    }

    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT[] ret = new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("primitivesGeneratedQuery"),
        ValueLayout.JAVA_INT.withName("primitivesGeneratedQueryWithRasterizerDiscard"),
        ValueLayout.JAVA_INT.withName("primitivesGeneratedQueryWithNonZeroStreams")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$primitivesGeneratedQuery = PathElement.groupElement("primitivesGeneratedQuery");
    public static final PathElement PATH$primitivesGeneratedQueryWithRasterizerDiscard = PathElement.groupElement("primitivesGeneratedQueryWithRasterizerDiscard");
    public static final PathElement PATH$primitivesGeneratedQueryWithNonZeroStreams = PathElement.groupElement("primitivesGeneratedQueryWithNonZeroStreams");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$primitivesGeneratedQuery = (OfInt) LAYOUT.select(PATH$primitivesGeneratedQuery);
    public static final OfInt LAYOUT$primitivesGeneratedQueryWithRasterizerDiscard = (OfInt) LAYOUT.select(PATH$primitivesGeneratedQueryWithRasterizerDiscard);
    public static final OfInt LAYOUT$primitivesGeneratedQueryWithNonZeroStreams = (OfInt) LAYOUT.select(PATH$primitivesGeneratedQueryWithNonZeroStreams);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$primitivesGeneratedQuery = LAYOUT.byteOffset(PATH$primitivesGeneratedQuery);
    public static final long OFFSET$primitivesGeneratedQueryWithRasterizerDiscard = LAYOUT.byteOffset(PATH$primitivesGeneratedQueryWithRasterizerDiscard);
    public static final long OFFSET$primitivesGeneratedQueryWithNonZeroStreams = LAYOUT.byteOffset(PATH$primitivesGeneratedQueryWithNonZeroStreams);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$primitivesGeneratedQuery = LAYOUT$primitivesGeneratedQuery.byteSize();
    public static final long SIZE$primitivesGeneratedQueryWithRasterizerDiscard = LAYOUT$primitivesGeneratedQueryWithRasterizerDiscard.byteSize();
    public static final long SIZE$primitivesGeneratedQueryWithNonZeroStreams = LAYOUT$primitivesGeneratedQueryWithNonZeroStreams.byteSize();
}
