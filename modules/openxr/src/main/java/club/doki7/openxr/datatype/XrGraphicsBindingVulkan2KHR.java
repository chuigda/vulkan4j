package club.doki7.openxr.datatype;

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
import club.doki7.openxr.bitmask.*;
import club.doki7.openxr.handle.*;
import club.doki7.openxr.enumtype.*;
import static club.doki7.openxr.XRConstants.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsBindingVulkan2KHR.html"><code>XrGraphicsBindingVulkan2KHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrGraphicsBindingVulkan2KHR {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     VkInstance instance; // @link substring="VkInstance" target="VkInstance" @link substring="instance" target="#instance"
///     VkPhysicalDevice physicalDevice; // @link substring="VkPhysicalDevice" target="VkPhysicalDevice" @link substring="physicalDevice" target="#physicalDevice"
///     VkDevice device; // @link substring="VkDevice" target="VkDevice" @link substring="device" target="#device"
///     uint32_t queueFamilyIndex; // @link substring="queueFamilyIndex" target="#queueFamilyIndex"
///     uint32_t queueIndex; // @link substring="queueIndex" target="#queueIndex"
/// } XrGraphicsBindingVulkan2KHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_GRAPHICS_BINDING_VULKAN_KHR`
///
/// The {@code allocate} ({@link XrGraphicsBindingVulkan2KHR#allocate(Arena)}, {@link XrGraphicsBindingVulkan2KHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrGraphicsBindingVulkan2KHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsBindingVulkan2KHR.html"><code>XrGraphicsBindingVulkan2KHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrGraphicsBindingVulkan2KHR(@NotNull MemorySegment segment) implements IXrGraphicsBindingVulkan2KHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGraphicsBindingVulkan2KHR.html"><code>XrGraphicsBindingVulkan2KHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrGraphicsBindingVulkan2KHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrGraphicsBindingVulkan2KHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrGraphicsBindingVulkan2KHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrGraphicsBindingVulkan2KHR, Iterable<XrGraphicsBindingVulkan2KHR> {
        public long size() {
            return segment.byteSize() / XrGraphicsBindingVulkan2KHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrGraphicsBindingVulkan2KHR at(long index) {
            return new XrGraphicsBindingVulkan2KHR(segment.asSlice(index * XrGraphicsBindingVulkan2KHR.BYTES, XrGraphicsBindingVulkan2KHR.BYTES));
        }

        public XrGraphicsBindingVulkan2KHR.Ptr at(long index, @NotNull Consumer<@NotNull XrGraphicsBindingVulkan2KHR> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrGraphicsBindingVulkan2KHR value) {
            MemorySegment s = segment.asSlice(index * XrGraphicsBindingVulkan2KHR.BYTES, XrGraphicsBindingVulkan2KHR.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrGraphicsBindingVulkan2KHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrGraphicsBindingVulkan2KHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrGraphicsBindingVulkan2KHR.BYTES,
                (end - start) * XrGraphicsBindingVulkan2KHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrGraphicsBindingVulkan2KHR.BYTES));
        }

        public XrGraphicsBindingVulkan2KHR[] toArray() {
            XrGraphicsBindingVulkan2KHR[] ret = new XrGraphicsBindingVulkan2KHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrGraphicsBindingVulkan2KHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrGraphicsBindingVulkan2KHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrGraphicsBindingVulkan2KHR.BYTES;
            }

            @Override
            public XrGraphicsBindingVulkan2KHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrGraphicsBindingVulkan2KHR ret = new XrGraphicsBindingVulkan2KHR(segment.asSlice(0, XrGraphicsBindingVulkan2KHR.BYTES));
                segment = segment.asSlice(XrGraphicsBindingVulkan2KHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrGraphicsBindingVulkan2KHR allocate(Arena arena) {
        XrGraphicsBindingVulkan2KHR ret = new XrGraphicsBindingVulkan2KHR(arena.allocate(LAYOUT));
        ret.type(XrStructureType.GRAPHICS_BINDING_VULKAN_KHR);
        return ret;
    }

    public static XrGraphicsBindingVulkan2KHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrGraphicsBindingVulkan2KHR.Ptr ret = new XrGraphicsBindingVulkan2KHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.GRAPHICS_BINDING_VULKAN_KHR);
        }
        return ret;
    }

    public static XrGraphicsBindingVulkan2KHR clone(Arena arena, XrGraphicsBindingVulkan2KHR src) {
        XrGraphicsBindingVulkan2KHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.GRAPHICS_BINDING_VULKAN_KHR);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrGraphicsBindingVulkan2KHR type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrGraphicsBindingVulkan2KHR next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrGraphicsBindingVulkan2KHR next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable VkInstance instance() {
        MemorySegment s = segment.asSlice(OFFSET$instance, SIZE$instance);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkInstance(s);
    }

    public XrGraphicsBindingVulkan2KHR instance(@Nullable VkInstance value) {
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

    public XrGraphicsBindingVulkan2KHR physicalDevice(@Nullable VkPhysicalDevice value) {
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

    public XrGraphicsBindingVulkan2KHR device(@Nullable VkDevice value) {
        segment.set(LAYOUT$device, OFFSET$device, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int queueFamilyIndex() {
        return segment.get(LAYOUT$queueFamilyIndex, OFFSET$queueFamilyIndex);
    }

    public XrGraphicsBindingVulkan2KHR queueFamilyIndex(@Unsigned int value) {
        segment.set(LAYOUT$queueFamilyIndex, OFFSET$queueFamilyIndex, value);
        return this;
    }

    public @Unsigned int queueIndex() {
        return segment.get(LAYOUT$queueIndex, OFFSET$queueIndex);
    }

    public XrGraphicsBindingVulkan2KHR queueIndex(@Unsigned int value) {
        segment.set(LAYOUT$queueIndex, OFFSET$queueIndex, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withName("instance"),
        ValueLayout.ADDRESS.withName("physicalDevice"),
        ValueLayout.ADDRESS.withName("device"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("queueIndex")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$instance = PathElement.groupElement("instance");
    public static final PathElement PATH$physicalDevice = PathElement.groupElement("physicalDevice");
    public static final PathElement PATH$device = PathElement.groupElement("device");
    public static final PathElement PATH$queueFamilyIndex = PathElement.groupElement("queueFamilyIndex");
    public static final PathElement PATH$queueIndex = PathElement.groupElement("queueIndex");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$instance = (AddressLayout) LAYOUT.select(PATH$instance);
    public static final AddressLayout LAYOUT$physicalDevice = (AddressLayout) LAYOUT.select(PATH$physicalDevice);
    public static final AddressLayout LAYOUT$device = (AddressLayout) LAYOUT.select(PATH$device);
    public static final OfInt LAYOUT$queueFamilyIndex = (OfInt) LAYOUT.select(PATH$queueFamilyIndex);
    public static final OfInt LAYOUT$queueIndex = (OfInt) LAYOUT.select(PATH$queueIndex);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$instance = LAYOUT$instance.byteSize();
    public static final long SIZE$physicalDevice = LAYOUT$physicalDevice.byteSize();
    public static final long SIZE$device = LAYOUT$device.byteSize();
    public static final long SIZE$queueFamilyIndex = LAYOUT$queueFamilyIndex.byteSize();
    public static final long SIZE$queueIndex = LAYOUT$queueIndex.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$instance = LAYOUT.byteOffset(PATH$instance);
    public static final long OFFSET$physicalDevice = LAYOUT.byteOffset(PATH$physicalDevice);
    public static final long OFFSET$device = LAYOUT.byteOffset(PATH$device);
    public static final long OFFSET$queueFamilyIndex = LAYOUT.byteOffset(PATH$queueFamilyIndex);
    public static final long OFFSET$queueIndex = LAYOUT.byteOffset(PATH$queueIndex);
}
