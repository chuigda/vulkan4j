package example.shaderc;

import club.doki7.ffm.Loader;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.shaderc.Shaderc;
import club.doki7.shaderc.ShadercIncludeHelper;
import club.doki7.shaderc.enumtype.ShadercShaderKind;
import club.doki7.shaderc.handle.ShadercCompilationResult;
import club.doki7.shaderc.handle.ShadercCompileOptions;
import club.doki7.shaderc.handle.ShadercCompiler;

import java.io.IOException;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public final class ShadercExample {
    public static void main(String[] args) throws IOException {
        System.loadLibrary("shaderc_shared");
        Shaderc shaderc = new Shaderc(Loader::loadFunctionOrNull);

        String shaderCode = Files.readString(Path.of("example/resc/nop1.comp"));

        ShadercCompiler compiler = shaderc.compilerInitialize();
        ShadercCompileOptions options = shaderc.compileOptionsInitialize();

        try (Arena arena = Arena.ofConfined()) {
            ShadercIncludeHelper.IncludeCallbacks callbacks = ShadercIncludeHelper.makeCallbacks(
                    arena,
                    (requestedSource, _, _, _) -> {
                        System.err.println("including source: " + requestedSource);
                        // For this example, we will just return the requested source as is.
                        // In a real application, you would read the file and return its content.
                        String content = Files.readString(Path.of("example/resc/" + requestedSource));
                        return new ShadercIncludeHelper.IncludeResult(requestedSource, content);
                    }
            );
            shaderc.compileOptionsSetIncludeCallbacks(
                    options,
                    callbacks.pfnIncludeResolve,
                    callbacks.pfnIncludeResultRelease,
                    MemorySegment.NULL
            );

            BytePtr pShaderCode = BytePtr.allocateString(arena, shaderCode);
            ShadercCompilationResult result = shaderc.compileIntoSPVAssembly(
                    compiler,
                    pShaderCode,
                    pShaderCode.size() - 1,
                    ShadercShaderKind.COMPUTE_SHADER,
                    BytePtr.allocateString(arena, "nop.comp"),
                    BytePtr.allocateString(arena, "main"),
                    options
            );
            long numErrors = shaderc.resultGetNumErrors(result);
            if (numErrors > 0) {
                System.err.println("Compilation failed with " + numErrors + " errors:");
                for (int i = 0; i < numErrors; i++) {
                    BytePtr errorMessage = Objects.requireNonNull(shaderc.resultGetErrorMessage(result));
                    System.err.println("Error " + (i + 1) + ": " + errorMessage.readString());
                }
                shaderc.resultRelease(result);
                return;
            }

            BytePtr spvAssembly = Objects.requireNonNull(shaderc.resultGetBytes(result));
            System.out.println(spvAssembly.readString());
        } finally {
            shaderc.compileOptionsRelease(options);
            shaderc.compilerRelease(compiler);
        }
    }
}
