package club.doki7.shaderc.enumtype;

import club.doki7.ffm.annotation.*;

public final class ShadercShaderKind {
    public static final int VERTEX_SHADER = 0x0;
    public static final int FRAGMENT_SHADER = 0x1;
    public static final int COMPUTE_SHADER = 0x2;
    public static final int GEOMETRY_SHADER = 0x3;
    public static final int TESS_CONTROL_SHADER = 0x4;
    public static final int TESS_EVALUATION_SHADER = 0x5;
    public static final int GLSL_VERTEX_SHADER = VERTEX_SHADER;
    public static final int GLSL_FRAGMENT_SHADER = FRAGMENT_SHADER;
    public static final int GLSL_COMPUTE_SHADER = COMPUTE_SHADER;
    public static final int GLSL_GEOMETRY_SHADER = GEOMETRY_SHADER;
    public static final int GLSL_TESS_CONTROL_SHADER = TESS_CONTROL_SHADER;
    public static final int GLSL_TESS_EVALUATION_SHADER = TESS_EVALUATION_SHADER;
    public static final int GLSL_INFER_FROM_SOURCE = 0x7;
    public static final int GLSL_DEFAULT_VERTEX_SHADER = 0x8;
    public static final int GLSL_DEFAULT_FRAGMENT_SHADER = 0x9;
    public static final int GLSL_DEFAULT_COMPUTE_SHADER = 0xa;
    public static final int GLSL_DEFAULT_GEOMETRY_SHADER = 0xb;
    public static final int GLSL_DEFAULT_TESS_CONTROL_SHADER = 0xc;
    public static final int GLSL_DEFAULT_TESS_EVALUATION_SHADER = 0xd;
    public static final int SPIRV_ASSEMBLY = 0xe;
    public static final int RAYGEN_SHADER = 0xf;
    public static final int ANYHIT_SHADER = 0x10;
    public static final int CLOSESTHIT_SHADER = 0x11;
    public static final int MISS_SHADER = 0x12;
    public static final int INTERSECTION_SHADER = 0x13;
    public static final int CALLABLE_SHADER = 0x14;
    public static final int GLSL_RAYGEN_SHADER = RAYGEN_SHADER;
    public static final int GLSL_ANYHIT_SHADER = ANYHIT_SHADER;
    public static final int GLSL_CLOSESTHIT_SHADER = CLOSESTHIT_SHADER;
    public static final int GLSL_MISS_SHADER = MISS_SHADER;
    public static final int GLSL_INTERSECTION_SHADER = INTERSECTION_SHADER;
    public static final int GLSL_CALLABLE_SHADER = CALLABLE_SHADER;
    public static final int GLSL_DEFAULT_RAYGEN_SHADER = 0x16;
    public static final int GLSL_DEFAULT_ANYHIT_SHADER = 0x17;
    public static final int GLSL_DEFAULT_CLOSESTHIT_SHADER = 0x18;
    public static final int GLSL_DEFAULT_MISS_SHADER = 0x19;
    public static final int GLSL_DEFAULT_INTERSECTION_SHADER = 0x1a;
    public static final int GLSL_DEFAULT_CALLABLE_SHADER = 0x1b;
    public static final int TASK_SHADER = 0x1c;
    public static final int MESH_SHADER = 0x1d;
    public static final int GLSL_TASK_SHADER = TASK_SHADER;
    public static final int GLSL_MESH_SHADER = MESH_SHADER;
    public static final int GLSL_DEFAULT_TASK_SHADER = 0x1f;
    public static final int GLSL_DEFAULT_MESH_SHADER = 0x20;

    public static String explain(@EnumType(ShadercShaderKind.class) int value) {
        return switch (value) {
            case ShadercShaderKind.ANYHIT_SHADER -> "shaderc_anyhit_shader";
            case ShadercShaderKind.CALLABLE_SHADER -> "shaderc_callable_shader";
            case ShadercShaderKind.CLOSESTHIT_SHADER -> "shaderc_closesthit_shader";
            case ShadercShaderKind.COMPUTE_SHADER -> "shaderc_compute_shader";
            case ShadercShaderKind.FRAGMENT_SHADER -> "shaderc_fragment_shader";
            case ShadercShaderKind.GEOMETRY_SHADER -> "shaderc_geometry_shader";
            case ShadercShaderKind.GLSL_DEFAULT_ANYHIT_SHADER -> "shaderc_glsl_default_anyhit_shader";
            case ShadercShaderKind.GLSL_DEFAULT_CALLABLE_SHADER -> "shaderc_glsl_default_callable_shader";
            case ShadercShaderKind.GLSL_DEFAULT_CLOSESTHIT_SHADER -> "shaderc_glsl_default_closesthit_shader";
            case ShadercShaderKind.GLSL_DEFAULT_COMPUTE_SHADER -> "shaderc_glsl_default_compute_shader";
            case ShadercShaderKind.GLSL_DEFAULT_FRAGMENT_SHADER -> "shaderc_glsl_default_fragment_shader";
            case ShadercShaderKind.GLSL_DEFAULT_GEOMETRY_SHADER -> "shaderc_glsl_default_geometry_shader";
            case ShadercShaderKind.GLSL_DEFAULT_INTERSECTION_SHADER -> "shaderc_glsl_default_intersection_shader";
            case ShadercShaderKind.GLSL_DEFAULT_MESH_SHADER -> "shaderc_glsl_default_mesh_shader";
            case ShadercShaderKind.GLSL_DEFAULT_MISS_SHADER -> "shaderc_glsl_default_miss_shader";
            case ShadercShaderKind.GLSL_DEFAULT_RAYGEN_SHADER -> "shaderc_glsl_default_raygen_shader";
            case ShadercShaderKind.GLSL_DEFAULT_TASK_SHADER -> "shaderc_glsl_default_task_shader";
            case ShadercShaderKind.GLSL_DEFAULT_TESS_CONTROL_SHADER -> "shaderc_glsl_default_tess_control_shader";
            case ShadercShaderKind.GLSL_DEFAULT_TESS_EVALUATION_SHADER -> "shaderc_glsl_default_tess_evaluation_shader";
            case ShadercShaderKind.GLSL_DEFAULT_VERTEX_SHADER -> "shaderc_glsl_default_vertex_shader";
            case ShadercShaderKind.GLSL_INFER_FROM_SOURCE -> "shaderc_glsl_infer_from_source";
            case ShadercShaderKind.INTERSECTION_SHADER -> "shaderc_intersection_shader";
            case ShadercShaderKind.MESH_SHADER -> "shaderc_mesh_shader";
            case ShadercShaderKind.MISS_SHADER -> "shaderc_miss_shader";
            case ShadercShaderKind.RAYGEN_SHADER -> "shaderc_raygen_shader";
            case ShadercShaderKind.SPIRV_ASSEMBLY -> "shaderc_spirv_assembly";
            case ShadercShaderKind.TASK_SHADER -> "shaderc_task_shader";
            case ShadercShaderKind.TESS_CONTROL_SHADER -> "shaderc_tess_control_shader";
            case ShadercShaderKind.TESS_EVALUATION_SHADER -> "shaderc_tess_evaluation_shader";
            case ShadercShaderKind.VERTEX_SHADER -> "shaderc_vertex_shader";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private ShadercShaderKind() {}
}
