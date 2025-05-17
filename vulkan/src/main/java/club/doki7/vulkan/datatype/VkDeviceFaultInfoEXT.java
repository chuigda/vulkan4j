package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultInfoEXT.html"><code>VkDeviceFaultInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDeviceFaultInfoEXT {
///     VkStructureType sType;
///     void* pNext; // optional
///     char description;
///     VkDeviceFaultAddressInfoEXT* pAddressInfos; // optional
///     VkDeviceFaultVendorInfoEXT* pVendorInfos; // optional
///     void* pVendorBinaryData; // optional
/// } VkDeviceFaultInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_DEVICE_FAULT_INFO_EXT`
///
/// The {@link VkDeviceFaultInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkDeviceFaultInfoEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceFaultInfoEXT.html"><code>VkDeviceFaultInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDeviceFaultInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkDeviceFaultInfoEXT allocate(Arena arena) {
        VkDeviceFaultInfoEXT ret = new VkDeviceFaultInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.DEVICE_FAULT_INFO_EXT);
        return ret;
    }

    public static VkDeviceFaultInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceFaultInfoEXT[] ret = new VkDeviceFaultInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceFaultInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.DEVICE_FAULT_INFO_EXT);
        }
        return ret;
    }

    public static VkDeviceFaultInfoEXT clone(Arena arena, VkDeviceFaultInfoEXT src) {
        VkDeviceFaultInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceFaultInfoEXT[] clone(Arena arena, VkDeviceFaultInfoEXT[] src) {
        VkDeviceFaultInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.DEVICE_FAULT_INFO_EXT);
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

    public byte description() {
        return segment.get(LAYOUT$description, OFFSET$description);
    }

    public void description(byte value) {
        segment.set(LAYOUT$description, OFFSET$description, value);
    }

    public @pointer(target=VkDeviceFaultAddressInfoEXT.class) MemorySegment pAddressInfosRaw() {
        return segment.get(LAYOUT$pAddressInfos, OFFSET$pAddressInfos);
    }

    public void pAddressInfosRaw(@pointer(target=VkDeviceFaultAddressInfoEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pAddressInfos, OFFSET$pAddressInfos, value);
    }

    public @Nullable VkDeviceFaultAddressInfoEXT pAddressInfos() {
        MemorySegment s = pAddressInfosRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDeviceFaultAddressInfoEXT(s);
    }

    public void pAddressInfos(@Nullable VkDeviceFaultAddressInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAddressInfosRaw(s);
    }

    @unsafe public @Nullable VkDeviceFaultAddressInfoEXT[] pAddressInfos(int assumedCount) {
        MemorySegment s = pAddressInfosRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDeviceFaultAddressInfoEXT.BYTES);
        VkDeviceFaultAddressInfoEXT[] ret = new VkDeviceFaultAddressInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDeviceFaultAddressInfoEXT(s.asSlice(i * VkDeviceFaultAddressInfoEXT.BYTES, VkDeviceFaultAddressInfoEXT.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkDeviceFaultVendorInfoEXT.class) MemorySegment pVendorInfosRaw() {
        return segment.get(LAYOUT$pVendorInfos, OFFSET$pVendorInfos);
    }

    public void pVendorInfosRaw(@pointer(target=VkDeviceFaultVendorInfoEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pVendorInfos, OFFSET$pVendorInfos, value);
    }

    public @Nullable VkDeviceFaultVendorInfoEXT pVendorInfos() {
        MemorySegment s = pVendorInfosRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDeviceFaultVendorInfoEXT(s);
    }

    public void pVendorInfos(@Nullable VkDeviceFaultVendorInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVendorInfosRaw(s);
    }

    @unsafe public @Nullable VkDeviceFaultVendorInfoEXT[] pVendorInfos(int assumedCount) {
        MemorySegment s = pVendorInfosRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDeviceFaultVendorInfoEXT.BYTES);
        VkDeviceFaultVendorInfoEXT[] ret = new VkDeviceFaultVendorInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDeviceFaultVendorInfoEXT(s.asSlice(i * VkDeviceFaultVendorInfoEXT.BYTES, VkDeviceFaultVendorInfoEXT.BYTES));
        }
        return ret;
    }

    public @pointer(comment="void*") MemorySegment pVendorBinaryData() {
        return segment.get(LAYOUT$pVendorBinaryData, OFFSET$pVendorBinaryData);
    }

    public void pVendorBinaryData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pVendorBinaryData, OFFSET$pVendorBinaryData, value);
    }

    public void pVendorBinaryData(@Nullable IPointer pointer) {
        pVendorBinaryData(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_BYTE.withName("description"),
        ValueLayout.ADDRESS.withTargetLayout(VkDeviceFaultAddressInfoEXT.LAYOUT).withName("pAddressInfos"),
        ValueLayout.ADDRESS.withTargetLayout(VkDeviceFaultVendorInfoEXT.LAYOUT).withName("pVendorInfos"),
        ValueLayout.ADDRESS.withName("pVendorBinaryData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$description = PathElement.groupElement("PATH$description");
    public static final PathElement PATH$pAddressInfos = PathElement.groupElement("PATH$pAddressInfos");
    public static final PathElement PATH$pVendorInfos = PathElement.groupElement("PATH$pVendorInfos");
    public static final PathElement PATH$pVendorBinaryData = PathElement.groupElement("PATH$pVendorBinaryData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfByte LAYOUT$description = (OfByte) LAYOUT.select(PATH$description);
    public static final AddressLayout LAYOUT$pAddressInfos = (AddressLayout) LAYOUT.select(PATH$pAddressInfos);
    public static final AddressLayout LAYOUT$pVendorInfos = (AddressLayout) LAYOUT.select(PATH$pVendorInfos);
    public static final AddressLayout LAYOUT$pVendorBinaryData = (AddressLayout) LAYOUT.select(PATH$pVendorBinaryData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$description = LAYOUT$description.byteSize();
    public static final long SIZE$pAddressInfos = LAYOUT$pAddressInfos.byteSize();
    public static final long SIZE$pVendorInfos = LAYOUT$pVendorInfos.byteSize();
    public static final long SIZE$pVendorBinaryData = LAYOUT$pVendorBinaryData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$pAddressInfos = LAYOUT.byteOffset(PATH$pAddressInfos);
    public static final long OFFSET$pVendorInfos = LAYOUT.byteOffset(PATH$pVendorInfos);
    public static final long OFFSET$pVendorBinaryData = LAYOUT.byteOffset(PATH$pVendorBinaryData);
}
