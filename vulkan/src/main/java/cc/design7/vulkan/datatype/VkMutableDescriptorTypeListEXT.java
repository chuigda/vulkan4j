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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMutableDescriptorTypeListEXT.html">VkMutableDescriptorTypeListEXT</a>
@ValueBasedCandidate
public record VkMutableDescriptorTypeListEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$descriptorTypeCount = ValueLayout.JAVA_INT.withName("descriptorTypeCount");
    public static final AddressLayout LAYOUT$pDescriptorTypes = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDescriptorTypes");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$descriptorTypeCount, LAYOUT$pDescriptorTypes);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkMutableDescriptorTypeListEXT allocate(Arena arena) {
        return new VkMutableDescriptorTypeListEXT(arena.allocate(LAYOUT));
    }

    public static VkMutableDescriptorTypeListEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMutableDescriptorTypeListEXT[] ret = new VkMutableDescriptorTypeListEXT[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$descriptorTypeCount = PathElement.groupElement("PATH$descriptorTypeCount");
    public static final PathElement PATH$pDescriptorTypes = PathElement.groupElement("PATH$pDescriptorTypes");

    public static final long SIZE$descriptorTypeCount = LAYOUT$descriptorTypeCount.byteSize();
    public static final long SIZE$pDescriptorTypes = LAYOUT$pDescriptorTypes.byteSize();

    public static final long OFFSET$descriptorTypeCount = LAYOUT.byteOffset(PATH$descriptorTypeCount);
    public static final long OFFSET$pDescriptorTypes = LAYOUT.byteOffset(PATH$pDescriptorTypes);

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

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkDescriptorType.class) IntPtr pDescriptorTypes() {
        MemorySegment s = pDescriptorTypesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pDescriptorTypes(@Nullable @enumtype(VkDescriptorType.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDescriptorTypesRaw(s);
    }

}
