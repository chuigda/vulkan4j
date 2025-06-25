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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVulkanDeviceCreateInfoKHR.html"><code>XrVulkanDeviceCreateInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrVulkanDeviceCreateInfoKHR {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrSystemId systemId; // @link substring="systemId" target="#systemId"
///     XrVulkanDeviceCreateFlagsKHR createFlags; // optional // @link substring="XrVulkanDeviceCreateFlagsKHR" target="XrVulkanDeviceCreateFlagsKHR" @link substring="createFlags" target="#createFlags"
///     PFN_vkGetInstanceProcAddr pfnGetInstanceProcAddr; // @link substring="pfnGetInstanceProcAddr" target="#pfnGetInstanceProcAddr"
///     VkPhysicalDevice vulkanPhysicalDevice; // @link substring="VkPhysicalDevice" target="VkPhysicalDevice" @link substring="vulkanPhysicalDevice" target="#vulkanPhysicalDevice"
///     VkDeviceCreateInfo const* vulkanCreateInfo; // @link substring="VkDeviceCreateInfo" target="VkDeviceCreateInfo" @link substring="vulkanCreateInfo" target="#vulkanCreateInfo"
///     VkAllocationCallbacks const* vulkanAllocator; // optional // @link substring="VkAllocationCallbacks" target="VkAllocationCallbacks" @link substring="vulkanAllocator" target="#vulkanAllocator"
/// } XrVulkanDeviceCreateInfoKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_VULKAN_DEVICE_CREATE_INFO_KHR`
///
/// The {@code allocate} ({@link XrVulkanDeviceCreateInfoKHR#allocate(Arena)}, {@link XrVulkanDeviceCreateInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrVulkanDeviceCreateInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVulkanDeviceCreateInfoKHR.html"><code>XrVulkanDeviceCreateInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrVulkanDeviceCreateInfoKHR(@NotNull MemorySegment segment) implements IXrVulkanDeviceCreateInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVulkanDeviceCreateInfoKHR.html"><code>XrVulkanDeviceCreateInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrVulkanDeviceCreateInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrVulkanDeviceCreateInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrVulkanDeviceCreateInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrVulkanDeviceCreateInfoKHR, Iterable<XrVulkanDeviceCreateInfoKHR> {
        public long size() {
            return segment.byteSize() / XrVulkanDeviceCreateInfoKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrVulkanDeviceCreateInfoKHR at(long index) {
            return new XrVulkanDeviceCreateInfoKHR(segment.asSlice(index * XrVulkanDeviceCreateInfoKHR.BYTES, XrVulkanDeviceCreateInfoKHR.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrVulkanDeviceCreateInfoKHR> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrVulkanDeviceCreateInfoKHR value) {
            MemorySegment s = segment.asSlice(index * XrVulkanDeviceCreateInfoKHR.BYTES, XrVulkanDeviceCreateInfoKHR.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrVulkanDeviceCreateInfoKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrVulkanDeviceCreateInfoKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrVulkanDeviceCreateInfoKHR.BYTES,
                (end - start) * XrVulkanDeviceCreateInfoKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrVulkanDeviceCreateInfoKHR.BYTES));
        }

        public XrVulkanDeviceCreateInfoKHR[] toArray() {
            XrVulkanDeviceCreateInfoKHR[] ret = new XrVulkanDeviceCreateInfoKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrVulkanDeviceCreateInfoKHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrVulkanDeviceCreateInfoKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrVulkanDeviceCreateInfoKHR.BYTES;
            }

            @Override
            public XrVulkanDeviceCreateInfoKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrVulkanDeviceCreateInfoKHR ret = new XrVulkanDeviceCreateInfoKHR(segment.asSlice(0, XrVulkanDeviceCreateInfoKHR.BYTES));
                segment = segment.asSlice(XrVulkanDeviceCreateInfoKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrVulkanDeviceCreateInfoKHR allocate(Arena arena) {
        XrVulkanDeviceCreateInfoKHR ret = new XrVulkanDeviceCreateInfoKHR(arena.allocate(LAYOUT));
        ret.type(XrStructureType.VULKAN_DEVICE_CREATE_INFO_KHR);
        return ret;
    }

    public static XrVulkanDeviceCreateInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrVulkanDeviceCreateInfoKHR.Ptr ret = new XrVulkanDeviceCreateInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.VULKAN_DEVICE_CREATE_INFO_KHR);
        }
        return ret;
    }

    public static XrVulkanDeviceCreateInfoKHR clone(Arena arena, XrVulkanDeviceCreateInfoKHR src) {
        XrVulkanDeviceCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.VULKAN_DEVICE_CREATE_INFO_KHR);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrVulkanDeviceCreateInfoKHR type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrVulkanDeviceCreateInfoKHR next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrVulkanDeviceCreateInfoKHR next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrSystemId") @Unsigned long systemId() {
        return segment.get(LAYOUT$systemId, OFFSET$systemId);
    }

    public XrVulkanDeviceCreateInfoKHR systemId(@NativeType("XrSystemId") @Unsigned long value) {
        segment.set(LAYOUT$systemId, OFFSET$systemId, value);
        return this;
    }

    public @Bitmask(XrVulkanDeviceCreateFlagsKHR.class) long createFlags() {
        return segment.get(LAYOUT$createFlags, OFFSET$createFlags);
    }

    public XrVulkanDeviceCreateInfoKHR createFlags(@Bitmask(XrVulkanDeviceCreateFlagsKHR.class) long value) {
        segment.set(LAYOUT$createFlags, OFFSET$createFlags, value);
        return this;
    }

    public @Pointer(comment="PFN_vkGetInstanceProcAddr") @NotNull MemorySegment pfnGetInstanceProcAddr() {
        return segment.get(LAYOUT$pfnGetInstanceProcAddr, OFFSET$pfnGetInstanceProcAddr);
    }

    public XrVulkanDeviceCreateInfoKHR pfnGetInstanceProcAddr(@Pointer(comment="PFN_vkGetInstanceProcAddr") @NotNull MemorySegment value) {
        segment.set(LAYOUT$pfnGetInstanceProcAddr, OFFSET$pfnGetInstanceProcAddr, value);
        return this;
    }

    public XrVulkanDeviceCreateInfoKHR pfnGetInstanceProcAddr(@Nullable IPointer pointer) {
        pfnGetInstanceProcAddr(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable VkPhysicalDevice vulkanPhysicalDevice() {
        MemorySegment s = segment.asSlice(OFFSET$vulkanPhysicalDevice, SIZE$vulkanPhysicalDevice);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPhysicalDevice(s);
    }

    public XrVulkanDeviceCreateInfoKHR vulkanPhysicalDevice(@Nullable VkPhysicalDevice value) {
        segment.set(LAYOUT$vulkanPhysicalDevice, OFFSET$vulkanPhysicalDevice, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public XrVulkanDeviceCreateInfoKHR vulkanCreateInfo(@Nullable IVkDeviceCreateInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        vulkanCreateInfoRaw(s);
        return this;
    }

    @Unsafe public @Nullable VkDeviceCreateInfo.Ptr vulkanCreateInfo(int assumedCount) {
        MemorySegment s = vulkanCreateInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDeviceCreateInfo.BYTES);
        return new VkDeviceCreateInfo.Ptr(s);
    }

    public @Nullable VkDeviceCreateInfo vulkanCreateInfo() {
        MemorySegment s = vulkanCreateInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDeviceCreateInfo(s);
    }

    public @Pointer(target=VkDeviceCreateInfo.class) @NotNull MemorySegment vulkanCreateInfoRaw() {
        return segment.get(LAYOUT$vulkanCreateInfo, OFFSET$vulkanCreateInfo);
    }

    public void vulkanCreateInfoRaw(@Pointer(target=VkDeviceCreateInfo.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$vulkanCreateInfo, OFFSET$vulkanCreateInfo, value);
    }

    public XrVulkanDeviceCreateInfoKHR vulkanAllocator(@Nullable IVkAllocationCallbacks value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        vulkanAllocatorRaw(s);
        return this;
    }

    @Unsafe public @Nullable VkAllocationCallbacks.Ptr vulkanAllocator(int assumedCount) {
        MemorySegment s = vulkanAllocatorRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAllocationCallbacks.BYTES);
        return new VkAllocationCallbacks.Ptr(s);
    }

    public @Nullable VkAllocationCallbacks vulkanAllocator() {
        MemorySegment s = vulkanAllocatorRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkAllocationCallbacks(s);
    }

    public @Pointer(target=VkAllocationCallbacks.class) @NotNull MemorySegment vulkanAllocatorRaw() {
        return segment.get(LAYOUT$vulkanAllocator, OFFSET$vulkanAllocator);
    }

    public void vulkanAllocatorRaw(@Pointer(target=VkAllocationCallbacks.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$vulkanAllocator, OFFSET$vulkanAllocator, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("systemId"),
        ValueLayout.JAVA_LONG.withName("createFlags"),
        ValueLayout.ADDRESS.withName("pfnGetInstanceProcAddr"),
        ValueLayout.ADDRESS.withName("vulkanPhysicalDevice"),
        ValueLayout.ADDRESS.withTargetLayout(VkDeviceCreateInfo.LAYOUT).withName("vulkanCreateInfo"),
        ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT).withName("vulkanAllocator")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$systemId = PathElement.groupElement("systemId");
    public static final PathElement PATH$createFlags = PathElement.groupElement("createFlags");
    public static final PathElement PATH$pfnGetInstanceProcAddr = PathElement.groupElement("pfnGetInstanceProcAddr");
    public static final PathElement PATH$vulkanPhysicalDevice = PathElement.groupElement("vulkanPhysicalDevice");
    public static final PathElement PATH$vulkanCreateInfo = PathElement.groupElement("vulkanCreateInfo");
    public static final PathElement PATH$vulkanAllocator = PathElement.groupElement("vulkanAllocator");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$systemId = (OfLong) LAYOUT.select(PATH$systemId);
    public static final OfLong LAYOUT$createFlags = (OfLong) LAYOUT.select(PATH$createFlags);
    public static final AddressLayout LAYOUT$pfnGetInstanceProcAddr = (AddressLayout) LAYOUT.select(PATH$pfnGetInstanceProcAddr);
    public static final AddressLayout LAYOUT$vulkanPhysicalDevice = (AddressLayout) LAYOUT.select(PATH$vulkanPhysicalDevice);
    public static final AddressLayout LAYOUT$vulkanCreateInfo = (AddressLayout) LAYOUT.select(PATH$vulkanCreateInfo);
    public static final AddressLayout LAYOUT$vulkanAllocator = (AddressLayout) LAYOUT.select(PATH$vulkanAllocator);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$systemId = LAYOUT$systemId.byteSize();
    public static final long SIZE$createFlags = LAYOUT$createFlags.byteSize();
    public static final long SIZE$pfnGetInstanceProcAddr = LAYOUT$pfnGetInstanceProcAddr.byteSize();
    public static final long SIZE$vulkanPhysicalDevice = LAYOUT$vulkanPhysicalDevice.byteSize();
    public static final long SIZE$vulkanCreateInfo = LAYOUT$vulkanCreateInfo.byteSize();
    public static final long SIZE$vulkanAllocator = LAYOUT$vulkanAllocator.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$systemId = LAYOUT.byteOffset(PATH$systemId);
    public static final long OFFSET$createFlags = LAYOUT.byteOffset(PATH$createFlags);
    public static final long OFFSET$pfnGetInstanceProcAddr = LAYOUT.byteOffset(PATH$pfnGetInstanceProcAddr);
    public static final long OFFSET$vulkanPhysicalDevice = LAYOUT.byteOffset(PATH$vulkanPhysicalDevice);
    public static final long OFFSET$vulkanCreateInfo = LAYOUT.byteOffset(PATH$vulkanCreateInfo);
    public static final long OFFSET$vulkanAllocator = LAYOUT.byteOffset(PATH$vulkanAllocator);
}
