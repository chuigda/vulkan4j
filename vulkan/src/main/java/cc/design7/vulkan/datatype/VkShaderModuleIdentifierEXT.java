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

public record VkShaderModuleIdentifierEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$identifierSize = ValueLayout.JAVA_INT.withName("identifierSize");
    public static final OfByte LAYOUT$identifier = ValueLayout.JAVA_BYTE.withName("identifier");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$identifierSize, LAYOUT$identifier);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkShaderModuleIdentifierEXT allocate(Arena arena) {
        return new VkShaderModuleIdentifierEXT(arena.allocate(LAYOUT));
    }

    public static VkShaderModuleIdentifierEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkShaderModuleIdentifierEXT[] ret = new VkShaderModuleIdentifierEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkShaderModuleIdentifierEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkShaderModuleIdentifierEXT clone(Arena arena, VkShaderModuleIdentifierEXT src) {
        VkShaderModuleIdentifierEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkShaderModuleIdentifierEXT[] clone(Arena arena, VkShaderModuleIdentifierEXT[] src) {
        VkShaderModuleIdentifierEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$identifierSize = PathElement.groupElement("PATH$identifierSize");
    public static final PathElement PATH$identifier = PathElement.groupElement("PATH$identifier");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$identifierSize = LAYOUT$identifierSize.byteSize();
    public static final long SIZE$identifier = LAYOUT$identifier.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$identifierSize = LAYOUT.byteOffset(PATH$identifierSize);
    public static final long OFFSET$identifier = LAYOUT.byteOffset(PATH$identifier);

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

    public @unsigned int identifierSize() {
        return segment.get(LAYOUT$identifierSize, OFFSET$identifierSize);
    }

    public void identifierSize(@unsigned int value) {
        segment.set(LAYOUT$identifierSize, OFFSET$identifierSize, value);
    }

    public @unsigned byte identifier() {
        return segment.get(LAYOUT$identifier, OFFSET$identifier);
    }

    public void identifier(@unsigned byte value) {
        segment.set(LAYOUT$identifier, OFFSET$identifier, value);
    }

}
/// dummy, not implemented yet
