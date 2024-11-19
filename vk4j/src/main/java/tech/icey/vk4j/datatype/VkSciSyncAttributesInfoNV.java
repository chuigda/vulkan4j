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
/// typedef struct VkSciSyncAttributesInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkSciSyncClientTypeNV clientType;
///     VkSciSyncPrimitiveTypeNV primitiveType;
/// } VkSciSyncAttributesInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSciSyncAttributesInfoNV.html">VkSciSyncAttributesInfoNV</a>
public record VkSciSyncAttributesInfoNV(MemorySegment segment) implements IPointer {
    public VkSciSyncAttributesInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SCI_SYNC_ATTRIBUTES_INFO_NV);
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

    public @enumtype(VkSciSyncClientTypeNV.class) int clientType() {
        return segment.get(LAYOUT$clientType, OFFSET$clientType);
    }

    public void clientType(@enumtype(VkSciSyncClientTypeNV.class) int value) {
        segment.set(LAYOUT$clientType, OFFSET$clientType, value);
    }

    public @enumtype(VkSciSyncPrimitiveTypeNV.class) int primitiveType() {
        return segment.get(LAYOUT$primitiveType, OFFSET$primitiveType);
    }

    public void primitiveType(@enumtype(VkSciSyncPrimitiveTypeNV.class) int value) {
        segment.set(LAYOUT$primitiveType, OFFSET$primitiveType, value);
    }

    public static VkSciSyncAttributesInfoNV allocate(Arena arena) {
        return new VkSciSyncAttributesInfoNV(arena.allocate(LAYOUT));
    }

    public static VkSciSyncAttributesInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSciSyncAttributesInfoNV[] ret = new VkSciSyncAttributesInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSciSyncAttributesInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSciSyncAttributesInfoNV clone(Arena arena, VkSciSyncAttributesInfoNV src) {
        VkSciSyncAttributesInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSciSyncAttributesInfoNV[] clone(Arena arena, VkSciSyncAttributesInfoNV[] src) {
        VkSciSyncAttributesInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("clientType"),
        ValueLayout.JAVA_INT.withName("primitiveType")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$clientType = PathElement.groupElement("clientType");
    public static final PathElement PATH$primitiveType = PathElement.groupElement("primitiveType");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$clientType = (OfInt) LAYOUT.select(PATH$clientType);
    public static final OfInt LAYOUT$primitiveType = (OfInt) LAYOUT.select(PATH$primitiveType);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$clientType = LAYOUT.byteOffset(PATH$clientType);
    public static final long OFFSET$primitiveType = LAYOUT.byteOffset(PATH$primitiveType);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$clientType = LAYOUT$clientType.byteSize();
    public static final long SIZE$primitiveType = LAYOUT$primitiveType.byteSize();
}
