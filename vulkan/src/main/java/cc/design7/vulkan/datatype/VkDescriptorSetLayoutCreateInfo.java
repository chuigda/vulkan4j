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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorSetLayoutCreateInfo.html"><code>VkDescriptorSetLayoutCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDescriptorSetLayoutCreateInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkDescriptorSetLayoutCreateFlags flags; // optional
///     uint32_t bindingCount; // optional
///     VkDescriptorSetLayoutBinding const* pBindings;
/// } VkDescriptorSetLayoutCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO`
///
/// The {@link VkDescriptorSetLayoutCreateInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkDescriptorSetLayoutCreateInfo#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorSetLayoutCreateInfo.html"><code>VkDescriptorSetLayoutCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDescriptorSetLayoutCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkDescriptorSetLayoutCreateInfo allocate(Arena arena) {
        VkDescriptorSetLayoutCreateInfo ret = new VkDescriptorSetLayoutCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DESCRIPTOR_SET_LAYOUT_CREATE_INFO);
        return ret;
    }

    public static VkDescriptorSetLayoutCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDescriptorSetLayoutCreateInfo[] ret = new VkDescriptorSetLayoutCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDescriptorSetLayoutCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DESCRIPTOR_SET_LAYOUT_CREATE_INFO);
        }
        return ret;
    }

    public static VkDescriptorSetLayoutCreateInfo clone(Arena arena, VkDescriptorSetLayoutCreateInfo src) {
        VkDescriptorSetLayoutCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDescriptorSetLayoutCreateInfo[] clone(Arena arena, VkDescriptorSetLayoutCreateInfo[] src) {
        VkDescriptorSetLayoutCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DESCRIPTOR_SET_LAYOUT_CREATE_INFO);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkDescriptorSetLayoutCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDescriptorSetLayoutCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int bindingCount() {
        return segment.get(LAYOUT$bindingCount, OFFSET$bindingCount);
    }

    public void bindingCount(@unsigned int value) {
        segment.set(LAYOUT$bindingCount, OFFSET$bindingCount, value);
    }

    public @pointer(comment="VkDescriptorSetLayoutBinding*") MemorySegment pBindingsRaw() {
        return segment.get(LAYOUT$pBindings, OFFSET$pBindings);
    }

    public void pBindingsRaw(@pointer(comment="VkDescriptorSetLayoutBinding*") MemorySegment value) {
        segment.set(LAYOUT$pBindings, OFFSET$pBindings, value);
    }

    public @Nullable VkDescriptorSetLayoutBinding pBindings() {
        MemorySegment s = pBindingsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDescriptorSetLayoutBinding(s);
    }

    public void pBindings(@Nullable VkDescriptorSetLayoutBinding value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBindingsRaw(s);
    }

    @unsafe public @Nullable VkDescriptorSetLayoutBinding[] pBindings(int assumedCount) {
        MemorySegment s = pBindingsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDescriptorSetLayoutBinding.BYTES);
        VkDescriptorSetLayoutBinding[] ret = new VkDescriptorSetLayoutBinding[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDescriptorSetLayoutBinding(s.asSlice(i * VkDescriptorSetLayoutBinding.BYTES, VkDescriptorSetLayoutBinding.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("bindingCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorSetLayoutBinding.LAYOUT).withName("pBindings")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$bindingCount = PathElement.groupElement("PATH$bindingCount");
    public static final PathElement PATH$pBindings = PathElement.groupElement("PATH$pBindings");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$bindingCount = (OfInt) LAYOUT.select(PATH$bindingCount);
    public static final AddressLayout LAYOUT$pBindings = (AddressLayout) LAYOUT.select(PATH$pBindings);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$bindingCount = LAYOUT$bindingCount.byteSize();
    public static final long SIZE$pBindings = LAYOUT$pBindings.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$bindingCount = LAYOUT.byteOffset(PATH$bindingCount);
    public static final long OFFSET$pBindings = LAYOUT.byteOffset(PATH$pBindings);
}
