package club.doki7.vma.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vma.bitmask.*;
import club.doki7.vma.handle.*;
import club.doki7.vma.enumtype.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;
import static club.doki7.vulkan.VkConstants.*;

/// Information about existing {@code VmaAllocator} object.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VmaAllocatorInfo {
///     VkInstance instance; // @link substring="VkInstance" target="VkInstance" @link substring="instance" target="#instance"
///     VkPhysicalDevice physicalDevice; // @link substring="VkPhysicalDevice" target="VkPhysicalDevice" @link substring="physicalDevice" target="#physicalDevice"
///     VkDevice device; // @link substring="VkDevice" target="VkDevice" @link substring="device" target="#device"
/// } VmaAllocatorInfo;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// ## Member documentation
///
/// <ul>
/// <li>{@link #instance} Handle to Vulkan instance object.
///
/// This is the same value as has been passed through VmaAllocatorCreateInfo::instance.
/// </li>
/// <li>{@link #physicalDevice} Handle to Vulkan physical device object.
///
/// This is the same value as has been passed through VmaAllocatorCreateInfo::physicalDevice.
/// </li>
/// <li>{@link #device} Handle to Vulkan device object.
///
/// This is the same value as has been passed through VmaAllocatorCreateInfo::device.
/// </li>
/// </ul>
@ValueBasedCandidate
@UnsafeConstructor
public record VmaAllocatorInfo(@NotNull MemorySegment segment) implements IVmaAllocatorInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VmaAllocatorInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVmaAllocatorInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VmaAllocatorInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVmaAllocatorInfo, Iterable<VmaAllocatorInfo> {
        public long size() {
            return segment.byteSize() / VmaAllocatorInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VmaAllocatorInfo at(long index) {
            return new VmaAllocatorInfo(segment.asSlice(index * VmaAllocatorInfo.BYTES, VmaAllocatorInfo.BYTES));
        }

        public void write(long index, @NotNull VmaAllocatorInfo value) {
            MemorySegment s = segment.asSlice(index * VmaAllocatorInfo.BYTES, VmaAllocatorInfo.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * VmaAllocatorInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VmaAllocatorInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VmaAllocatorInfo.BYTES,
                (end - start) * VmaAllocatorInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VmaAllocatorInfo.BYTES));
        }

        public VmaAllocatorInfo[] toArray() {
            VmaAllocatorInfo[] ret = new VmaAllocatorInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VmaAllocatorInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VmaAllocatorInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VmaAllocatorInfo.BYTES;
            }

            @Override
            public VmaAllocatorInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VmaAllocatorInfo ret = new VmaAllocatorInfo(segment.asSlice(0, VmaAllocatorInfo.BYTES));
                segment = segment.asSlice(VmaAllocatorInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VmaAllocatorInfo allocate(Arena arena) {
        return new VmaAllocatorInfo(arena.allocate(LAYOUT));
    }

    public static VmaAllocatorInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VmaAllocatorInfo.Ptr(segment);
    }

    public static VmaAllocatorInfo clone(Arena arena, VmaAllocatorInfo src) {
        VmaAllocatorInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Nullable VkInstance instance() {
        MemorySegment s = segment.asSlice(OFFSET$instance, SIZE$instance);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkInstance(s);
    }

    public VmaAllocatorInfo instance(@Nullable VkInstance value) {
        segment.set(LAYOUT$instance, OFFSET$instance, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable VkPhysicalDevice physicalDevice() {
        MemorySegment s = segment.asSlice(OFFSET$physicalDevice, SIZE$physicalDevice);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPhysicalDevice(s);
    }

    public VmaAllocatorInfo physicalDevice(@Nullable VkPhysicalDevice value) {
        segment.set(LAYOUT$physicalDevice, OFFSET$physicalDevice, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable VkDevice device() {
        MemorySegment s = segment.asSlice(OFFSET$device, SIZE$device);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDevice(s);
    }

    public VmaAllocatorInfo device(@Nullable VkDevice value) {
        segment.set(LAYOUT$device, OFFSET$device, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("instance"),
        ValueLayout.ADDRESS.withName("physicalDevice"),
        ValueLayout.ADDRESS.withName("device")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$instance = PathElement.groupElement("instance");
    public static final PathElement PATH$physicalDevice = PathElement.groupElement("physicalDevice");
    public static final PathElement PATH$device = PathElement.groupElement("device");

    public static final AddressLayout LAYOUT$instance = (AddressLayout) LAYOUT.select(PATH$instance);
    public static final AddressLayout LAYOUT$physicalDevice = (AddressLayout) LAYOUT.select(PATH$physicalDevice);
    public static final AddressLayout LAYOUT$device = (AddressLayout) LAYOUT.select(PATH$device);

    public static final long SIZE$instance = LAYOUT$instance.byteSize();
    public static final long SIZE$physicalDevice = LAYOUT$physicalDevice.byteSize();
    public static final long SIZE$device = LAYOUT$device.byteSize();

    public static final long OFFSET$instance = LAYOUT.byteOffset(PATH$instance);
    public static final long OFFSET$physicalDevice = LAYOUT.byteOffset(PATH$physicalDevice);
    public static final long OFFSET$device = LAYOUT.byteOffset(PATH$device);
}
