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

/// Represents a pointer to a {@code VkDirectDriverLoadingInfoLUNARG} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDirectDriverLoadingInfoLUNARG.html">VkDirectDriverLoadingInfoLUNARG</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDirectDriverLoadingInfoLUNARG(@NotNull MemorySegment segment) implements IPointer {
    public VkDirectDriverLoadingInfoLUNARG {
        sType(VkStructureType.DIRECT_DRIVER_LOADING_INFO_LUNARG);
    }

    public static VkDirectDriverLoadingInfoLUNARG allocate(Arena arena) {
        return new VkDirectDriverLoadingInfoLUNARG(arena.allocate(LAYOUT));
    }

    public static VkDirectDriverLoadingInfoLUNARG[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDirectDriverLoadingInfoLUNARG[] ret = new VkDirectDriverLoadingInfoLUNARG[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDirectDriverLoadingInfoLUNARG(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkDirectDriverLoadingInfoLUNARG clone(Arena arena, VkDirectDriverLoadingInfoLUNARG src) {
        VkDirectDriverLoadingInfoLUNARG ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDirectDriverLoadingInfoLUNARG[] clone(Arena arena, VkDirectDriverLoadingInfoLUNARG[] src) {
        VkDirectDriverLoadingInfoLUNARG[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pfnGetInstanceProcAddr")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$pfnGetInstanceProcAddr = PathElement.groupElement("PATH$pfnGetInstanceProcAddr");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pfnGetInstanceProcAddr = (AddressLayout) LAYOUT.select(PATH$pfnGetInstanceProcAddr);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pfnGetInstanceProcAddr = LAYOUT$pfnGetInstanceProcAddr.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pfnGetInstanceProcAddr = LAYOUT.byteOffset(PATH$pfnGetInstanceProcAddr);

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

    public @enumtype(VkDirectDriverLoadingFlagsLUNARG.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDirectDriverLoadingFlagsLUNARG.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="PFN_vkGetInstanceProcAddrLUNARG") MemorySegment pfnGetInstanceProcAddr() {
        return segment.get(LAYOUT$pfnGetInstanceProcAddr, OFFSET$pfnGetInstanceProcAddr);
    }

    public void pfnGetInstanceProcAddr(@pointer(comment="PFN_vkGetInstanceProcAddrLUNARG") MemorySegment value) {
        segment.set(LAYOUT$pfnGetInstanceProcAddr, OFFSET$pfnGetInstanceProcAddr, value);
    }

    public void pfnGetInstanceProcAddr(IPointer pointer) {
        pfnGetInstanceProcAddr(pointer.segment());
    }

}
