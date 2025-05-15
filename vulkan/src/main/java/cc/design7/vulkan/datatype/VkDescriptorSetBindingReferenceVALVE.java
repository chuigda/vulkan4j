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

/// Represents a pointer to a {@code VkDescriptorSetBindingReferenceVALVE} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorSetBindingReferenceVALVE.html">VkDescriptorSetBindingReferenceVALVE</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDescriptorSetBindingReferenceVALVE(@NotNull MemorySegment segment) implements IPointer {
    public VkDescriptorSetBindingReferenceVALVE {
        sType(VkStructureType.DESCRIPTOR_SET_BINDING_REFERENCE_VALVE);
    }

    public static VkDescriptorSetBindingReferenceVALVE allocate(Arena arena) {
        return new VkDescriptorSetBindingReferenceVALVE(arena.allocate(LAYOUT));
    }

    public static VkDescriptorSetBindingReferenceVALVE[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorSetBindingReferenceVALVE[] ret = new VkDescriptorSetBindingReferenceVALVE[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDescriptorSetBindingReferenceVALVE(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDescriptorSetBindingReferenceVALVE clone(Arena arena, VkDescriptorSetBindingReferenceVALVE src) {
        VkDescriptorSetBindingReferenceVALVE ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorSetBindingReferenceVALVE[] clone(Arena arena, VkDescriptorSetBindingReferenceVALVE[] src) {
        VkDescriptorSetBindingReferenceVALVE[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("descriptorSetLayout"),
        ValueLayout.JAVA_INT.withName("binding")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$descriptorSetLayout = PathElement.groupElement("PATH$descriptorSetLayout");
    public static final PathElement PATH$binding = PathElement.groupElement("PATH$binding");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$descriptorSetLayout = (AddressLayout) LAYOUT.select(PATH$descriptorSetLayout);
    public static final OfInt LAYOUT$binding = (OfInt) LAYOUT.select(PATH$binding);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$descriptorSetLayout = LAYOUT$descriptorSetLayout.byteSize();
    public static final long SIZE$binding = LAYOUT$binding.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorSetLayout = LAYOUT.byteOffset(PATH$descriptorSetLayout);
    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);

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

    public @Nullable VkDescriptorSetLayout descriptorSetLayout() {
        MemorySegment s = segment.asSlice(OFFSET$descriptorSetLayout, SIZE$descriptorSetLayout);
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorSetLayout(s);
    }

    public void descriptorSetLayout(@Nullable VkDescriptorSetLayout value) {
        segment.set(LAYOUT$descriptorSetLayout, OFFSET$descriptorSetLayout, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int binding() {
        return segment.get(LAYOUT$binding, OFFSET$binding);
    }

    public void binding(@unsigned int value) {
        segment.set(LAYOUT$binding, OFFSET$binding, value);
    }

}
