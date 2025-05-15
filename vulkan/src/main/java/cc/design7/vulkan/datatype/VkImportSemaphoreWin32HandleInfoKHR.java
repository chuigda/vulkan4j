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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImportSemaphoreWin32HandleInfoKHR.html">VkImportSemaphoreWin32HandleInfoKHR</a>
@ValueBasedCandidate
public record VkImportSemaphoreWin32HandleInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$semaphore = ValueLayout.ADDRESS.withName("semaphore");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$handleType = ValueLayout.JAVA_INT.withName("handleType");
    public static final AddressLayout LAYOUT$handle = ValueLayout.ADDRESS.withName("handle");
    public static final AddressLayout LAYOUT$name = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT).withName("name");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$semaphore, LAYOUT$flags, LAYOUT$handleType, LAYOUT$handle, LAYOUT$name);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkImportSemaphoreWin32HandleInfoKHR allocate(Arena arena) {
        return new VkImportSemaphoreWin32HandleInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkImportSemaphoreWin32HandleInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImportSemaphoreWin32HandleInfoKHR[] ret = new VkImportSemaphoreWin32HandleInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImportSemaphoreWin32HandleInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImportSemaphoreWin32HandleInfoKHR clone(Arena arena, VkImportSemaphoreWin32HandleInfoKHR src) {
        VkImportSemaphoreWin32HandleInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImportSemaphoreWin32HandleInfoKHR[] clone(Arena arena, VkImportSemaphoreWin32HandleInfoKHR[] src) {
        VkImportSemaphoreWin32HandleInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$semaphore = PathElement.groupElement("PATH$semaphore");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$handleType = PathElement.groupElement("PATH$handleType");
    public static final PathElement PATH$handle = PathElement.groupElement("PATH$handle");
    public static final PathElement PATH$name = PathElement.groupElement("PATH$name");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$semaphore = LAYOUT$semaphore.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$handleType = LAYOUT$handleType.byteSize();
    public static final long SIZE$handle = LAYOUT$handle.byteSize();
    public static final long SIZE$name = LAYOUT$name.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$semaphore = LAYOUT.byteOffset(PATH$semaphore);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$handleType = LAYOUT.byteOffset(PATH$handleType);
    public static final long OFFSET$handle = LAYOUT.byteOffset(PATH$handle);
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

    public @Nullable VkSemaphore semaphore() {
        MemorySegment s = segment.asSlice(OFFSET$semaphore, SIZE$semaphore);
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphore(s);
    }

    public void semaphore(@Nullable VkSemaphore value) {
        segment.set(LAYOUT$semaphore, OFFSET$semaphore, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkSemaphoreImportFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkSemaphoreImportFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkExternalSemaphoreHandleTypeFlags.class) int handleType() {
        return segment.get(LAYOUT$handleType, OFFSET$handleType);
    }

    public void handleType(@enumtype(VkExternalSemaphoreHandleTypeFlags.class) int value) {
        segment.set(LAYOUT$handleType, OFFSET$handleType, value);
    }

    public @pointer(comment="void*") MemorySegment handle() {
        return segment.get(LAYOUT$handle, OFFSET$handle);
    }

    public void handle(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$handle, OFFSET$handle, value);
    }

    public void handle(IPointer pointer) {
        handle(pointer.segment());
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
