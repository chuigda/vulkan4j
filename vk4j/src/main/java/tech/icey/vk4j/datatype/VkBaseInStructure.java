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
/// typedef struct VkBaseInStructure {
///     VkStructureType sType;
///     const struct VkBaseInStructure* pNext;
/// } VkBaseInStructure;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkBaseInStructure.html">VkBaseInStructure</a>
public record VkBaseInStructure(MemorySegment segment) implements IPointer {
    public VkBaseInStructure(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="VkBaseInStructure*") MemorySegment pNextRaw() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNextRaw(@pointer(comment="VkBaseInStructure*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public @Nullable VkBaseInStructure pNext() {
        MemorySegment s = pNextRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkBaseInStructure(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkBaseInStructure[] pNext(int assumedCount) {
        MemorySegment s = pNextRaw().reinterpret(assumedCount * VkBaseInStructure.SIZE);
        VkBaseInStructure[] arr = new VkBaseInStructure[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkBaseInStructure(s.asSlice(i * VkBaseInStructure.SIZE, VkBaseInStructure.SIZE));
        }
        return arr;
    }

    public void pNext(@Nullable VkBaseInStructure value) {
        pNextRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkBaseInStructure allocate(Arena arena) {
        return new VkBaseInStructure(arena.allocate(LAYOUT));
    }

    public static VkBaseInStructure[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBaseInStructure[] ret = new VkBaseInStructure[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkBaseInStructure(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkBaseInStructure clone(Arena arena, VkBaseInStructure src) {
        VkBaseInStructure ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBaseInStructure[] clone(Arena arena, VkBaseInStructure[] src) {
        VkBaseInStructure[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withTargetLayout(VkBaseInStructure.LAYOUT).withName("pNext")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
}
