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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImportAndroidHardwareBufferInfoANDROID.html"><code>VkImportAndroidHardwareBufferInfoANDROID</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImportAndroidHardwareBufferInfoANDROID {
///     VkStructureType sType;
///     void const* pNext; // optional
///     AHardwareBuffer* buffer;
/// } VkImportAndroidHardwareBufferInfoANDROID;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID`
///
/// The {@link VkImportAndroidHardwareBufferInfoANDROID#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkImportAndroidHardwareBufferInfoANDROID#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImportAndroidHardwareBufferInfoANDROID.html"><code>VkImportAndroidHardwareBufferInfoANDROID</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImportAndroidHardwareBufferInfoANDROID(@NotNull MemorySegment segment) implements IPointer {
    public static VkImportAndroidHardwareBufferInfoANDROID allocate(Arena arena) {
        VkImportAndroidHardwareBufferInfoANDROID ret = new VkImportAndroidHardwareBufferInfoANDROID(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID);
        return ret;
    }

    public static VkImportAndroidHardwareBufferInfoANDROID[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImportAndroidHardwareBufferInfoANDROID[] ret = new VkImportAndroidHardwareBufferInfoANDROID[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImportAndroidHardwareBufferInfoANDROID(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID);
        }
        return ret;
    }

    public static VkImportAndroidHardwareBufferInfoANDROID clone(Arena arena, VkImportAndroidHardwareBufferInfoANDROID src) {
        VkImportAndroidHardwareBufferInfoANDROID ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImportAndroidHardwareBufferInfoANDROID[] clone(Arena arena, VkImportAndroidHardwareBufferInfoANDROID[] src) {
        VkImportAndroidHardwareBufferInfoANDROID[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID);
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

    public @pointer(comment="void**") MemorySegment bufferRaw() {
        return segment.get(LAYOUT$buffer, OFFSET$buffer);
    }

    public void bufferRaw(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$buffer, OFFSET$buffer, value);
    }

    /// Note: the returned {@link PointerBuffer} does not have correct {@link PointerBuffer#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerBuffer#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerBuffer buffer() {
        MemorySegment s = bufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerBuffer(s);
    }

    public void buffer(@Nullable PointerBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        bufferRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("buffer")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$buffer = PathElement.groupElement("PATH$buffer");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$buffer = (AddressLayout) LAYOUT.select(PATH$buffer);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$buffer = LAYOUT$buffer.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$buffer = LAYOUT.byteOffset(PATH$buffer);
}
