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
import club.doki7.openxr.XRFunctionTypes.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrNegotiateApiLayerRequest.html"><code>XrNegotiateApiLayerRequest</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrNegotiateApiLayerRequest {
///     XrLoaderInterfaceStructs structType; // @link substring="XrLoaderInterfaceStructs" target="XrLoaderInterfaceStructs" @link substring="structType" target="#structType"
///     uint32_t structVersion; // @link substring="structVersion" target="#structVersion"
///     size_t structSize; // @link substring="structSize" target="#structSize"
///     uint32_t layerInterfaceVersion; // @link substring="layerInterfaceVersion" target="#layerInterfaceVersion"
///     XrVersion layerApiVersion; // @link substring="layerApiVersion" target="#layerApiVersion"
///     PFN_xrGetInstanceProcAddr getInstanceProcAddr; // @link substring="PFN_xrGetInstanceProcAddr" target="PFN_xrGetInstanceProcAddr" @link substring="getInstanceProcAddr" target="#getInstanceProcAddr"
///     PFN_xrCreateApiLayerInstance createApiLayerInstance; // @link substring="PFN_xrCreateApiLayerInstance" target="PFN_xrCreateApiLayerInstance" @link substring="createApiLayerInstance" target="#createApiLayerInstance"
/// } XrNegotiateApiLayerRequest;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrNegotiateApiLayerRequest.html"><code>XrNegotiateApiLayerRequest</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrNegotiateApiLayerRequest(@NotNull MemorySegment segment) implements IXrNegotiateApiLayerRequest {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrNegotiateApiLayerRequest.html"><code>XrNegotiateApiLayerRequest</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrNegotiateApiLayerRequest}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrNegotiateApiLayerRequest to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrNegotiateApiLayerRequest.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrNegotiateApiLayerRequest, Iterable<XrNegotiateApiLayerRequest> {
        public long size() {
            return segment.byteSize() / XrNegotiateApiLayerRequest.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrNegotiateApiLayerRequest at(long index) {
            return new XrNegotiateApiLayerRequest(segment.asSlice(index * XrNegotiateApiLayerRequest.BYTES, XrNegotiateApiLayerRequest.BYTES));
        }

        public XrNegotiateApiLayerRequest.Ptr at(long index, @NotNull Consumer<@NotNull XrNegotiateApiLayerRequest> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrNegotiateApiLayerRequest value) {
            MemorySegment s = segment.asSlice(index * XrNegotiateApiLayerRequest.BYTES, XrNegotiateApiLayerRequest.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrNegotiateApiLayerRequest.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrNegotiateApiLayerRequest.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrNegotiateApiLayerRequest.BYTES,
                (end - start) * XrNegotiateApiLayerRequest.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrNegotiateApiLayerRequest.BYTES));
        }

        public XrNegotiateApiLayerRequest[] toArray() {
            XrNegotiateApiLayerRequest[] ret = new XrNegotiateApiLayerRequest[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrNegotiateApiLayerRequest> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrNegotiateApiLayerRequest> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrNegotiateApiLayerRequest.BYTES;
            }

            @Override
            public XrNegotiateApiLayerRequest next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrNegotiateApiLayerRequest ret = new XrNegotiateApiLayerRequest(segment.asSlice(0, XrNegotiateApiLayerRequest.BYTES));
                segment = segment.asSlice(XrNegotiateApiLayerRequest.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrNegotiateApiLayerRequest allocate(Arena arena) {
        return new XrNegotiateApiLayerRequest(arena.allocate(LAYOUT));
    }

    public static XrNegotiateApiLayerRequest.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrNegotiateApiLayerRequest.Ptr(segment);
    }

    public static XrNegotiateApiLayerRequest clone(Arena arena, XrNegotiateApiLayerRequest src) {
        XrNegotiateApiLayerRequest ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(XrLoaderInterfaceStructs.class) int structType() {
        return segment.get(LAYOUT$structType, OFFSET$structType);
    }

    public XrNegotiateApiLayerRequest structType(@EnumType(XrLoaderInterfaceStructs.class) int value) {
        segment.set(LAYOUT$structType, OFFSET$structType, value);
        return this;
    }

    public @Unsigned int structVersion() {
        return segment.get(LAYOUT$structVersion, OFFSET$structVersion);
    }

    public XrNegotiateApiLayerRequest structVersion(@Unsigned int value) {
        segment.set(LAYOUT$structVersion, OFFSET$structVersion, value);
        return this;
    }

    public @Unsigned long structSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$structSize);
    }

    public XrNegotiateApiLayerRequest structSize(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$structSize, value);
        return this;
    }

    public @Unsigned int layerInterfaceVersion() {
        return segment.get(LAYOUT$layerInterfaceVersion, OFFSET$layerInterfaceVersion);
    }

    public XrNegotiateApiLayerRequest layerInterfaceVersion(@Unsigned int value) {
        segment.set(LAYOUT$layerInterfaceVersion, OFFSET$layerInterfaceVersion, value);
        return this;
    }

    public @NativeType("XrVersion") @Unsigned long layerApiVersion() {
        return segment.get(LAYOUT$layerApiVersion, OFFSET$layerApiVersion);
    }

    public XrNegotiateApiLayerRequest layerApiVersion(@NativeType("XrVersion") @Unsigned long value) {
        segment.set(LAYOUT$layerApiVersion, OFFSET$layerApiVersion, value);
        return this;
    }

    public @Pointer(comment="PFN_xrGetInstanceProcAddr") @NotNull MemorySegment getInstanceProcAddr() {
        return segment.get(LAYOUT$getInstanceProcAddr, OFFSET$getInstanceProcAddr);
    }

    public XrNegotiateApiLayerRequest getInstanceProcAddr(@Pointer(comment="PFN_xrGetInstanceProcAddr") @NotNull MemorySegment value) {
        segment.set(LAYOUT$getInstanceProcAddr, OFFSET$getInstanceProcAddr, value);
        return this;
    }

    public XrNegotiateApiLayerRequest getInstanceProcAddr(@NotNull IPFN_xrGetInstanceProcAddr value) {
        return getInstanceProcAddr(IPFN_xrGetInstanceProcAddr.ofNative(value));
    }

    public XrNegotiateApiLayerRequest getInstanceProcAddr(@NotNull Arena arena, @NotNull IPFN_xrGetInstanceProcAddr value) {
        return getInstanceProcAddr(IPFN_xrGetInstanceProcAddr.ofNative(arena, value));
    }

    public XrNegotiateApiLayerRequest getInstanceProcAddr(@Nullable IPointer pointer) {
        getInstanceProcAddr(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_xrCreateApiLayerInstance") @NotNull MemorySegment createApiLayerInstance() {
        return segment.get(LAYOUT$createApiLayerInstance, OFFSET$createApiLayerInstance);
    }

    public XrNegotiateApiLayerRequest createApiLayerInstance(@Pointer(comment="PFN_xrCreateApiLayerInstance") @NotNull MemorySegment value) {
        segment.set(LAYOUT$createApiLayerInstance, OFFSET$createApiLayerInstance, value);
        return this;
    }

    public XrNegotiateApiLayerRequest createApiLayerInstance(@NotNull IPFN_xrCreateApiLayerInstance value) {
        return createApiLayerInstance(IPFN_xrCreateApiLayerInstance.ofNative(value));
    }

    public XrNegotiateApiLayerRequest createApiLayerInstance(@NotNull Arena arena, @NotNull IPFN_xrCreateApiLayerInstance value) {
        return createApiLayerInstance(IPFN_xrCreateApiLayerInstance.ofNative(arena, value));
    }

    public XrNegotiateApiLayerRequest createApiLayerInstance(@Nullable IPointer pointer) {
        createApiLayerInstance(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("structType"),
        ValueLayout.JAVA_INT.withName("structVersion"),
        NativeLayout.C_SIZE_T.withName("structSize"),
        ValueLayout.JAVA_INT.withName("layerInterfaceVersion"),
        ValueLayout.JAVA_LONG.withName("layerApiVersion"),
        ValueLayout.ADDRESS.withName("getInstanceProcAddr"),
        ValueLayout.ADDRESS.withName("createApiLayerInstance")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$structType = PathElement.groupElement("structType");
    public static final PathElement PATH$structVersion = PathElement.groupElement("structVersion");
    public static final PathElement PATH$structSize = PathElement.groupElement("structSize");
    public static final PathElement PATH$layerInterfaceVersion = PathElement.groupElement("layerInterfaceVersion");
    public static final PathElement PATH$layerApiVersion = PathElement.groupElement("layerApiVersion");
    public static final PathElement PATH$getInstanceProcAddr = PathElement.groupElement("getInstanceProcAddr");
    public static final PathElement PATH$createApiLayerInstance = PathElement.groupElement("createApiLayerInstance");

    public static final OfInt LAYOUT$structType = (OfInt) LAYOUT.select(PATH$structType);
    public static final OfInt LAYOUT$structVersion = (OfInt) LAYOUT.select(PATH$structVersion);
    public static final OfInt LAYOUT$layerInterfaceVersion = (OfInt) LAYOUT.select(PATH$layerInterfaceVersion);
    public static final OfLong LAYOUT$layerApiVersion = (OfLong) LAYOUT.select(PATH$layerApiVersion);
    public static final AddressLayout LAYOUT$getInstanceProcAddr = (AddressLayout) LAYOUT.select(PATH$getInstanceProcAddr);
    public static final AddressLayout LAYOUT$createApiLayerInstance = (AddressLayout) LAYOUT.select(PATH$createApiLayerInstance);

    public static final long SIZE$structType = LAYOUT$structType.byteSize();
    public static final long SIZE$structVersion = LAYOUT$structVersion.byteSize();
    public static final long SIZE$structSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$layerInterfaceVersion = LAYOUT$layerInterfaceVersion.byteSize();
    public static final long SIZE$layerApiVersion = LAYOUT$layerApiVersion.byteSize();
    public static final long SIZE$getInstanceProcAddr = LAYOUT$getInstanceProcAddr.byteSize();
    public static final long SIZE$createApiLayerInstance = LAYOUT$createApiLayerInstance.byteSize();

    public static final long OFFSET$structType = LAYOUT.byteOffset(PATH$structType);
    public static final long OFFSET$structVersion = LAYOUT.byteOffset(PATH$structVersion);
    public static final long OFFSET$structSize = LAYOUT.byteOffset(PATH$structSize);
    public static final long OFFSET$layerInterfaceVersion = LAYOUT.byteOffset(PATH$layerInterfaceVersion);
    public static final long OFFSET$layerApiVersion = LAYOUT.byteOffset(PATH$layerApiVersion);
    public static final long OFFSET$getInstanceProcAddr = LAYOUT.byteOffset(PATH$getInstanceProcAddr);
    public static final long OFFSET$createApiLayerInstance = LAYOUT.byteOffset(PATH$createApiLayerInstance);
}
