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

/// Represents a pointer to a {@code VkExportMemoryWin32HandleInfoKHR} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExportMemoryWin32HandleInfoKHR.html">VkExportMemoryWin32HandleInfoKHR</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkExportMemoryWin32HandleInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public VkExportMemoryWin32HandleInfoKHR {
        sType(VkStructureType.EXPORT_MEMORY_WIN32_HANDLE_INFO_KHR);
    }

    public static VkExportMemoryWin32HandleInfoKHR allocate(Arena arena) {
        return new VkExportMemoryWin32HandleInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkExportMemoryWin32HandleInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExportMemoryWin32HandleInfoKHR[] ret = new VkExportMemoryWin32HandleInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkExportMemoryWin32HandleInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkExportMemoryWin32HandleInfoKHR clone(Arena arena, VkExportMemoryWin32HandleInfoKHR src) {
        VkExportMemoryWin32HandleInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkExportMemoryWin32HandleInfoKHR[] clone(Arena arena, VkExportMemoryWin32HandleInfoKHR[] src) {
        VkExportMemoryWin32HandleInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pAttributes"),
        ValueLayout.JAVA_INT.withName("dwAccess"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT).withName("name")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pAttributes = PathElement.groupElement("PATH$pAttributes");
    public static final PathElement PATH$dwAccess = PathElement.groupElement("PATH$dwAccess");
    public static final PathElement PATH$name = PathElement.groupElement("PATH$name");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pAttributes = (AddressLayout) LAYOUT.select(PATH$pAttributes);
    public static final OfInt LAYOUT$dwAccess = (OfInt) LAYOUT.select(PATH$dwAccess);
    public static final AddressLayout LAYOUT$name = (AddressLayout) LAYOUT.select(PATH$name);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pAttributes = LAYOUT$pAttributes.byteSize();
    public static final long SIZE$dwAccess = LAYOUT$dwAccess.byteSize();
    public static final long SIZE$name = LAYOUT$name.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pAttributes = LAYOUT.byteOffset(PATH$pAttributes);
    public static final long OFFSET$dwAccess = LAYOUT.byteOffset(PATH$dwAccess);
    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);

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

    public @pointer(comment="void*") MemorySegment pAttributes() {
        return segment.get(LAYOUT$pAttributes, OFFSET$pAttributes);
    }

    public void pAttributes(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pAttributes, OFFSET$pAttributes, value);
    }

    public void pAttributes(IPointer pointer) {
        pAttributes(pointer.segment());
    }

    public @unsigned int dwAccess() {
        return segment.get(LAYOUT$dwAccess, OFFSET$dwAccess);
    }

    public void dwAccess(@unsigned int value) {
        segment.set(LAYOUT$dwAccess, OFFSET$dwAccess, value);
    }

    public @pointer(comment="short*") MemorySegment nameRaw() {
        return segment.get(LAYOUT$name, OFFSET$name);
    }

    public void nameRaw(@pointer(comment="short*") MemorySegment value) {
        segment.set(LAYOUT$name, OFFSET$name, value);
    }

    /// Note: the returned {@link ShortPtr} does not have correct
    /// {@link ShortPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ShortPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned ShortPtr name() {
        MemorySegment s = nameRaw();
        if (s.address() == 0) {
            return null;
        }
        return new ShortPtr(s);
    }

    public void name(@Nullable @unsigned ShortPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nameRaw(s);
    }

}
