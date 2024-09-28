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

public record VkShaderModuleCreateInfo(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        NativeLayout.C_SIZE_T.withName("codeSize"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pCode")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$codeSize = PathElement.groupElement("codeSize");
    public static final PathElement PATH$pCode = PathElement.groupElement("pCode");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pCode = (AddressLayout) LAYOUT.select(PATH$pCode);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$codeSize = LAYOUT.byteOffset(PATH$codeSize);
    public static final long OFFSET$pCode = LAYOUT.byteOffset(PATH$pCode);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pCode = LAYOUT$pCode.byteSize();

    public VkShaderModuleCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO);
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

    public @enumtype(VkShaderModuleCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkShaderModuleCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned long codeSize() {
            return NativeLayout.readCSizeT(segment, OFFSET$codeSize);
        }
    
        public void codeSize(@unsigned long value) {
            NativeLayout.writeCSizeT(segment, OFFSET$codeSize, value);
        }

    public @pointer(comment="uint32_t*") MemorySegment pCodeRaw() {
        return segment.get(LAYOUT$pCode, OFFSET$pCode);
    }

    public void pCodeRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pCode, OFFSET$pCode, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or
    /// {@link IntBuffer#write}ing the buffer.
    public @nullable @unsigned IntBuffer pCode() {
        MemorySegment s = pCodeRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pCode(@nullable @unsigned IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCodeRaw(s);
    }

    public static VkShaderModuleCreateInfo allocate(Arena arena) {
        return new VkShaderModuleCreateInfo(arena.allocate(LAYOUT));
    }
    
    public static VkShaderModuleCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkShaderModuleCreateInfo[] ret = new VkShaderModuleCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkShaderModuleCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
