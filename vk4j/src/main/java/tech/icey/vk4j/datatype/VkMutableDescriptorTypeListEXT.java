package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.panama.buffer.IntBuffer;
import tech.icey.vk4j.enumtype.VkDescriptorType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;

/// {@snippet lang=c :
/// typedef struct VkMutableDescriptorTypeListEXT {
///     uint32_t descriptorTypeCount;
///     const VkDescriptorType* pDescriptorTypes;
/// } VkMutableDescriptorTypeListEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkMutableDescriptorTypeListEXT.html">VkMutableDescriptorTypeListEXT</a>
public record VkMutableDescriptorTypeListEXT(MemorySegment segment) implements IPointer {
    public VkMutableDescriptorTypeListEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int descriptorTypeCount() {
        return segment.get(LAYOUT$descriptorTypeCount, OFFSET$descriptorTypeCount);
    }

    public void descriptorTypeCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorTypeCount, OFFSET$descriptorTypeCount, value);
    }

    public @pointer(target=VkDescriptorType.class) MemorySegment pDescriptorTypesRaw() {
        return segment.get(LAYOUT$pDescriptorTypes, OFFSET$pDescriptorTypes);
    }

    public void pDescriptorTypesRaw(@pointer(target=VkDescriptorType.class) MemorySegment value) {
        segment.set(LAYOUT$pDescriptorTypes, OFFSET$pDescriptorTypes, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or {@link IntBuffer#write}ing
    /// the buffer.
    public @nullable @enumtype(VkDescriptorType.class) IntBuffer pDescriptorTypes() {
        MemorySegment s = pDescriptorTypesRaw();
        if (s.address() == 0) {
            return null;
        }

        return new IntBuffer(s);
    }

    public void pDescriptorTypes(@nullable @enumtype(VkDescriptorType.class) IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDescriptorTypesRaw(s);
    }

    public static VkMutableDescriptorTypeListEXT allocate(Arena arena) {
        return new VkMutableDescriptorTypeListEXT(arena.allocate(LAYOUT));
    }

    public static VkMutableDescriptorTypeListEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMutableDescriptorTypeListEXT[] ret = new VkMutableDescriptorTypeListEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkMutableDescriptorTypeListEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkMutableDescriptorTypeListEXT clone(Arena arena, VkMutableDescriptorTypeListEXT src) {
        VkMutableDescriptorTypeListEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMutableDescriptorTypeListEXT[] clone(Arena arena, VkMutableDescriptorTypeListEXT[] src) {
        VkMutableDescriptorTypeListEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("descriptorTypeCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDescriptorTypes")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$descriptorTypeCount = PathElement.groupElement("descriptorTypeCount");
    public static final PathElement PATH$pDescriptorTypes = PathElement.groupElement("pDescriptorTypes");

    public static final OfInt LAYOUT$descriptorTypeCount = (OfInt) LAYOUT.select(PATH$descriptorTypeCount);
    public static final AddressLayout LAYOUT$pDescriptorTypes = (AddressLayout) LAYOUT.select(PATH$pDescriptorTypes);

    public static final long OFFSET$descriptorTypeCount = LAYOUT.byteOffset(PATH$descriptorTypeCount);
    public static final long OFFSET$pDescriptorTypes = LAYOUT.byteOffset(PATH$pDescriptorTypes);

    public static final long SIZE$descriptorTypeCount = LAYOUT$descriptorTypeCount.byteSize();
    public static final long SIZE$pDescriptorTypes = LAYOUT$pDescriptorTypes.byteSize();
}
