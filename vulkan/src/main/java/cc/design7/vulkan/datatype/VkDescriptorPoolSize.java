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

/// Represents a pointer to a {@code VkDescriptorPoolSize} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorPoolSize.html">VkDescriptorPoolSize</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDescriptorPoolSize(@NotNull MemorySegment segment) implements IPointer {
    public static VkDescriptorPoolSize allocate(Arena arena) {
        return new VkDescriptorPoolSize(arena.allocate(LAYOUT));
    }

    public static VkDescriptorPoolSize[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorPoolSize[] ret = new VkDescriptorPoolSize[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDescriptorPoolSize(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDescriptorPoolSize clone(Arena arena, VkDescriptorPoolSize src) {
        VkDescriptorPoolSize ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorPoolSize[] clone(Arena arena, VkDescriptorPoolSize[] src) {
        VkDescriptorPoolSize[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("descriptorCount")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("PATH$type");
    public static final PathElement PATH$descriptorCount = PathElement.groupElement("PATH$descriptorCount");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$descriptorCount = (OfInt) LAYOUT.select(PATH$descriptorCount);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$descriptorCount = LAYOUT$descriptorCount.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$descriptorCount = LAYOUT.byteOffset(PATH$descriptorCount);

    public @enumtype(VkDescriptorType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkDescriptorType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @unsigned int descriptorCount() {
        return segment.get(LAYOUT$descriptorCount, OFFSET$descriptorCount);
    }

    public void descriptorCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorCount, OFFSET$descriptorCount, value);
    }

}
