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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceBufferMemoryRequirements.html"><code>VkDeviceBufferMemoryRequirements</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDeviceBufferMemoryRequirements {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkBufferCreateInfo const* pCreateInfo;
/// } VkDeviceBufferMemoryRequirements;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DEVICE_BUFFER_MEMORY_REQUIREMENTS`
///
/// The {@link VkDeviceBufferMemoryRequirements#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkDeviceBufferMemoryRequirements#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceBufferMemoryRequirements.html"><code>VkDeviceBufferMemoryRequirements</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDeviceBufferMemoryRequirements(@NotNull MemorySegment segment) implements IPointer {
    public static VkDeviceBufferMemoryRequirements allocate(Arena arena) {
        VkDeviceBufferMemoryRequirements ret = new VkDeviceBufferMemoryRequirements(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DEVICE_BUFFER_MEMORY_REQUIREMENTS);
        return ret;
    }

    public static VkDeviceBufferMemoryRequirements[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceBufferMemoryRequirements[] ret = new VkDeviceBufferMemoryRequirements[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceBufferMemoryRequirements(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DEVICE_BUFFER_MEMORY_REQUIREMENTS);
        }
        return ret;
    }

    public static VkDeviceBufferMemoryRequirements clone(Arena arena, VkDeviceBufferMemoryRequirements src) {
        VkDeviceBufferMemoryRequirements ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceBufferMemoryRequirements[] clone(Arena arena, VkDeviceBufferMemoryRequirements[] src) {
        VkDeviceBufferMemoryRequirements[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DEVICE_BUFFER_MEMORY_REQUIREMENTS);
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

    public @pointer(comment="VkBufferCreateInfo*") MemorySegment pCreateInfoRaw() {
        return segment.get(LAYOUT$pCreateInfo, OFFSET$pCreateInfo);
    }

    public void pCreateInfoRaw(@pointer(comment="VkBufferCreateInfo*") MemorySegment value) {
        segment.set(LAYOUT$pCreateInfo, OFFSET$pCreateInfo, value);
    }

    public @Nullable VkBufferCreateInfo pCreateInfo() {
        MemorySegment s = pCreateInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkBufferCreateInfo(s);
    }

    public void pCreateInfo(@Nullable VkBufferCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCreateInfoRaw(s);
    }

    @unsafe public @Nullable VkBufferCreateInfo[] pCreateInfo(int assumedCount) {
        MemorySegment s = pCreateInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkBufferCreateInfo.SIZE);
        VkBufferCreateInfo[] ret = new VkBufferCreateInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkBufferCreateInfo(s.asSlice(i * VkBufferCreateInfo.SIZE, VkBufferCreateInfo.SIZE));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(VkBufferCreateInfo.LAYOUT).withName("pCreateInfo")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pCreateInfo = PathElement.groupElement("PATH$pCreateInfo");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pCreateInfo = (AddressLayout) LAYOUT.select(PATH$pCreateInfo);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pCreateInfo = LAYOUT$pCreateInfo.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pCreateInfo = LAYOUT.byteOffset(PATH$pCreateInfo);
}
