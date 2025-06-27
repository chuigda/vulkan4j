package club.doki7.webgpu;

import club.doki7.ffm.NativeLayout;
import club.doki7.webgpu.datatype.WGPUStringView;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public final class WGPUUtil {
    public static @Nullable String readStringView(@Nullable WGPUStringView stringView) {
        if (stringView == null) {
            return null;
        }

        MemorySegment rawData = stringView.dataRaw();
        if (rawData.equals(MemorySegment.NULL)) {
            return null;
        }

        long length = stringView.length();
        if (length == NativeLayout.UINT64_MAX) {
            return rawData.reinterpret(Long.MAX_VALUE).getString(0);
        } else {
            byte[] bytes = rawData.reinterpret(length).toArray(ValueLayout.JAVA_BYTE);
            return new String(bytes);
        }
    }

    public static @Nullable String readStringView(MemorySegment stringViewSegment) {
        if (stringViewSegment == MemorySegment.NULL) {
            return null;
        }

        MemorySegment rawData = stringViewSegment.get(ValueLayout.ADDRESS, WGPUStringView.OFFSET$data);
        if (rawData.equals(MemorySegment.NULL)) {
            return null;
        }

        long length = stringViewSegment.get(ValueLayout.JAVA_LONG, WGPUStringView.OFFSET$length);
        if (length == NativeLayout.UINT64_MAX) {
            return rawData.reinterpret(Long.MAX_VALUE).getString(0);
        } else {
            byte[] bytes = rawData.reinterpret(length).toArray(ValueLayout.JAVA_BYTE);
            return new String(bytes);
        }
    }

    public static WGPUStringView createStringView(Arena arena, @Nullable String s) {
        WGPUStringView stringView = WGPUStringView.allocate(arena);
        if (s == null) {
            return stringView;
        }

        MemorySegment data = arena.allocateFrom(s);
        stringView.dataRaw(data);
        stringView.length(data.byteSize() - 1);
        return stringView;
    }
}
