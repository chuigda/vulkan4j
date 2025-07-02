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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrNegotiateRuntimeRequest.html"><code>XrNegotiateRuntimeRequest</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrNegotiateRuntimeRequest {
///     XrLoaderInterfaceStructs structType; // @link substring="XrLoaderInterfaceStructs" target="XrLoaderInterfaceStructs" @link substring="structType" target="#structType"
///     uint32_t structVersion; // @link substring="structVersion" target="#structVersion"
///     size_t structSize; // @link substring="structSize" target="#structSize"
///     uint32_t runtimeInterfaceVersion; // @link substring="runtimeInterfaceVersion" target="#runtimeInterfaceVersion"
///     XrVersion runtimeApiVersion; // @link substring="runtimeApiVersion" target="#runtimeApiVersion"
///     PFN_xrGetInstanceProcAddr getInstanceProcAddr; // @link substring="PFN_xrGetInstanceProcAddr" target="PFN_xrGetInstanceProcAddr" @link substring="getInstanceProcAddr" target="#getInstanceProcAddr"
/// } XrNegotiateRuntimeRequest;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrNegotiateRuntimeRequest.html"><code>XrNegotiateRuntimeRequest</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrNegotiateRuntimeRequest(@NotNull MemorySegment segment) implements IXrNegotiateRuntimeRequest {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrNegotiateRuntimeRequest.html"><code>XrNegotiateRuntimeRequest</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrNegotiateRuntimeRequest}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrNegotiateRuntimeRequest to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrNegotiateRuntimeRequest.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrNegotiateRuntimeRequest, Iterable<XrNegotiateRuntimeRequest> {
        public long size() {
            return segment.byteSize() / XrNegotiateRuntimeRequest.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrNegotiateRuntimeRequest at(long index) {
            return new XrNegotiateRuntimeRequest(segment.asSlice(index * XrNegotiateRuntimeRequest.BYTES, XrNegotiateRuntimeRequest.BYTES));
        }

        public XrNegotiateRuntimeRequest.Ptr at(long index, @NotNull Consumer<@NotNull XrNegotiateRuntimeRequest> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrNegotiateRuntimeRequest value) {
            MemorySegment s = segment.asSlice(index * XrNegotiateRuntimeRequest.BYTES, XrNegotiateRuntimeRequest.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrNegotiateRuntimeRequest.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrNegotiateRuntimeRequest.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrNegotiateRuntimeRequest.BYTES,
                (end - start) * XrNegotiateRuntimeRequest.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrNegotiateRuntimeRequest.BYTES));
        }

        public XrNegotiateRuntimeRequest[] toArray() {
            XrNegotiateRuntimeRequest[] ret = new XrNegotiateRuntimeRequest[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrNegotiateRuntimeRequest> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrNegotiateRuntimeRequest> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrNegotiateRuntimeRequest.BYTES;
            }

            @Override
            public XrNegotiateRuntimeRequest next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrNegotiateRuntimeRequest ret = new XrNegotiateRuntimeRequest(segment.asSlice(0, XrNegotiateRuntimeRequest.BYTES));
                segment = segment.asSlice(XrNegotiateRuntimeRequest.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrNegotiateRuntimeRequest allocate(Arena arena) {
        return new XrNegotiateRuntimeRequest(arena.allocate(LAYOUT));
    }

    public static XrNegotiateRuntimeRequest.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrNegotiateRuntimeRequest.Ptr(segment);
    }

    public static XrNegotiateRuntimeRequest clone(Arena arena, XrNegotiateRuntimeRequest src) {
        XrNegotiateRuntimeRequest ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(XrLoaderInterfaceStructs.class) int structType() {
        return segment.get(LAYOUT$structType, OFFSET$structType);
    }

    public XrNegotiateRuntimeRequest structType(@EnumType(XrLoaderInterfaceStructs.class) int value) {
        segment.set(LAYOUT$structType, OFFSET$structType, value);
        return this;
    }

    public @Unsigned int structVersion() {
        return segment.get(LAYOUT$structVersion, OFFSET$structVersion);
    }

    public XrNegotiateRuntimeRequest structVersion(@Unsigned int value) {
        segment.set(LAYOUT$structVersion, OFFSET$structVersion, value);
        return this;
    }

    public @Unsigned long structSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$structSize);
    }

    public XrNegotiateRuntimeRequest structSize(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$structSize, value);
        return this;
    }

    public @Unsigned int runtimeInterfaceVersion() {
        return segment.get(LAYOUT$runtimeInterfaceVersion, OFFSET$runtimeInterfaceVersion);
    }

    public XrNegotiateRuntimeRequest runtimeInterfaceVersion(@Unsigned int value) {
        segment.set(LAYOUT$runtimeInterfaceVersion, OFFSET$runtimeInterfaceVersion, value);
        return this;
    }

    public @NativeType("XrVersion") @Unsigned long runtimeApiVersion() {
        return segment.get(LAYOUT$runtimeApiVersion, OFFSET$runtimeApiVersion);
    }

    public XrNegotiateRuntimeRequest runtimeApiVersion(@NativeType("XrVersion") @Unsigned long value) {
        segment.set(LAYOUT$runtimeApiVersion, OFFSET$runtimeApiVersion, value);
        return this;
    }

    public @Pointer(comment="PFN_xrGetInstanceProcAddr") @NotNull MemorySegment getInstanceProcAddr() {
        return segment.get(LAYOUT$getInstanceProcAddr, OFFSET$getInstanceProcAddr);
    }

    public XrNegotiateRuntimeRequest getInstanceProcAddr(@Pointer(comment="PFN_xrGetInstanceProcAddr") @NotNull MemorySegment value) {
        segment.set(LAYOUT$getInstanceProcAddr, OFFSET$getInstanceProcAddr, value);
        return this;
    }

    public XrNegotiateRuntimeRequest getInstanceProcAddr(@NotNull IPFN_xrGetInstanceProcAddr value) {
        return getInstanceProcAddr(IPFN_xrGetInstanceProcAddr.ofNative(value));
    }

    public XrNegotiateRuntimeRequest getInstanceProcAddr(@NotNull Arena arena, @NotNull IPFN_xrGetInstanceProcAddr value) {
        return getInstanceProcAddr(IPFN_xrGetInstanceProcAddr.ofNative(arena, value));
    }

    public XrNegotiateRuntimeRequest getInstanceProcAddr(@Nullable IPointer pointer) {
        getInstanceProcAddr(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("structType"),
        ValueLayout.JAVA_INT.withName("structVersion"),
        NativeLayout.C_SIZE_T.withName("structSize"),
        ValueLayout.JAVA_INT.withName("runtimeInterfaceVersion"),
        ValueLayout.JAVA_LONG.withName("runtimeApiVersion"),
        ValueLayout.ADDRESS.withName("getInstanceProcAddr")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$structType = PathElement.groupElement("structType");
    public static final PathElement PATH$structVersion = PathElement.groupElement("structVersion");
    public static final PathElement PATH$structSize = PathElement.groupElement("structSize");
    public static final PathElement PATH$runtimeInterfaceVersion = PathElement.groupElement("runtimeInterfaceVersion");
    public static final PathElement PATH$runtimeApiVersion = PathElement.groupElement("runtimeApiVersion");
    public static final PathElement PATH$getInstanceProcAddr = PathElement.groupElement("getInstanceProcAddr");

    public static final OfInt LAYOUT$structType = (OfInt) LAYOUT.select(PATH$structType);
    public static final OfInt LAYOUT$structVersion = (OfInt) LAYOUT.select(PATH$structVersion);
    public static final OfInt LAYOUT$runtimeInterfaceVersion = (OfInt) LAYOUT.select(PATH$runtimeInterfaceVersion);
    public static final OfLong LAYOUT$runtimeApiVersion = (OfLong) LAYOUT.select(PATH$runtimeApiVersion);
    public static final AddressLayout LAYOUT$getInstanceProcAddr = (AddressLayout) LAYOUT.select(PATH$getInstanceProcAddr);

    public static final long SIZE$structType = LAYOUT$structType.byteSize();
    public static final long SIZE$structVersion = LAYOUT$structVersion.byteSize();
    public static final long SIZE$structSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$runtimeInterfaceVersion = LAYOUT$runtimeInterfaceVersion.byteSize();
    public static final long SIZE$runtimeApiVersion = LAYOUT$runtimeApiVersion.byteSize();
    public static final long SIZE$getInstanceProcAddr = LAYOUT$getInstanceProcAddr.byteSize();

    public static final long OFFSET$structType = LAYOUT.byteOffset(PATH$structType);
    public static final long OFFSET$structVersion = LAYOUT.byteOffset(PATH$structVersion);
    public static final long OFFSET$structSize = LAYOUT.byteOffset(PATH$structSize);
    public static final long OFFSET$runtimeInterfaceVersion = LAYOUT.byteOffset(PATH$runtimeInterfaceVersion);
    public static final long OFFSET$runtimeApiVersion = LAYOUT.byteOffset(PATH$runtimeApiVersion);
    public static final long OFFSET$getInstanceProcAddr = LAYOUT.byteOffset(PATH$getInstanceProcAddr);
}
