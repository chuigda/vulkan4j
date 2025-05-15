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

/// Represents a pointer to a {@code VkMutableDescriptorTypeCreateInfoEXT} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMutableDescriptorTypeCreateInfoEXT.html">VkMutableDescriptorTypeCreateInfoEXT</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkMutableDescriptorTypeCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public VkMutableDescriptorTypeCreateInfoEXT {
        sType(VkStructureType.MUTABLE_DESCRIPTOR_TYPE_CREATE_INFO_EXT);
    }

    public static VkMutableDescriptorTypeCreateInfoEXT allocate(Arena arena) {
        return new VkMutableDescriptorTypeCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkMutableDescriptorTypeCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMutableDescriptorTypeCreateInfoEXT[] ret = new VkMutableDescriptorTypeCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMutableDescriptorTypeCreateInfoEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkMutableDescriptorTypeCreateInfoEXT clone(Arena arena, VkMutableDescriptorTypeCreateInfoEXT src) {
        VkMutableDescriptorTypeCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMutableDescriptorTypeCreateInfoEXT[] clone(Arena arena, VkMutableDescriptorTypeCreateInfoEXT[] src) {
        VkMutableDescriptorTypeCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("mutableDescriptorTypeListCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkMutableDescriptorTypeListEXT.LAYOUT).withName("pMutableDescriptorTypeLists")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$mutableDescriptorTypeListCount = PathElement.groupElement("PATH$mutableDescriptorTypeListCount");
    public static final PathElement PATH$pMutableDescriptorTypeLists = PathElement.groupElement("PATH$pMutableDescriptorTypeLists");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$mutableDescriptorTypeListCount = (OfInt) LAYOUT.select(PATH$mutableDescriptorTypeListCount);
    public static final AddressLayout LAYOUT$pMutableDescriptorTypeLists = (AddressLayout) LAYOUT.select(PATH$pMutableDescriptorTypeLists);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$mutableDescriptorTypeListCount = LAYOUT$mutableDescriptorTypeListCount.byteSize();
    public static final long SIZE$pMutableDescriptorTypeLists = LAYOUT$pMutableDescriptorTypeLists.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$mutableDescriptorTypeListCount = LAYOUT.byteOffset(PATH$mutableDescriptorTypeListCount);
    public static final long OFFSET$pMutableDescriptorTypeLists = LAYOUT.byteOffset(PATH$pMutableDescriptorTypeLists);

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

    public @unsigned int mutableDescriptorTypeListCount() {
        return segment.get(LAYOUT$mutableDescriptorTypeListCount, OFFSET$mutableDescriptorTypeListCount);
    }

    public void mutableDescriptorTypeListCount(@unsigned int value) {
        segment.set(LAYOUT$mutableDescriptorTypeListCount, OFFSET$mutableDescriptorTypeListCount, value);
    }

    public @pointer(comment="VkMutableDescriptorTypeListEXT*") MemorySegment pMutableDescriptorTypeListsRaw() {
        return segment.get(LAYOUT$pMutableDescriptorTypeLists, OFFSET$pMutableDescriptorTypeLists);
    }

    public void pMutableDescriptorTypeListsRaw(@pointer(comment="VkMutableDescriptorTypeListEXT*") MemorySegment value) {
        segment.set(LAYOUT$pMutableDescriptorTypeLists, OFFSET$pMutableDescriptorTypeLists, value);
    }

    public @Nullable VkMutableDescriptorTypeListEXT pMutableDescriptorTypeLists() {
        MemorySegment s = pMutableDescriptorTypeListsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkMutableDescriptorTypeListEXT(s);
    }

    public void pMutableDescriptorTypeLists(@Nullable VkMutableDescriptorTypeListEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMutableDescriptorTypeListsRaw(s);
    }

    @unsafe public @Nullable VkMutableDescriptorTypeListEXT[] pMutableDescriptorTypeLists(int assumedCount) {
        MemorySegment s = pMutableDescriptorTypeListsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkMutableDescriptorTypeListEXT.SIZE);
        VkMutableDescriptorTypeListEXT[] ret = new VkMutableDescriptorTypeListEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkMutableDescriptorTypeListEXT(s.asSlice(i * VkMutableDescriptorTypeListEXT.SIZE, VkMutableDescriptorTypeListEXT.SIZE));
        }
        return ret;
    }

}
