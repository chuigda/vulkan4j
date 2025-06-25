package club.doki7.shaderc.enumtype;

import club.doki7.ffm.annotation.*;

public final class ShadercCompilationStatus {
    public static final int SUCCESS = 0x0;
    public static final int INVALID_STAGE = 0x1;
    public static final int COMPILATION_ERROR = 0x2;
    public static final int INTERNAL_ERROR = 0x3;
    public static final int NULL_RESULT_OBJECT = 0x4;
    public static final int INVALID_ASSEMBLY = 0x5;
    public static final int VALIDATION_ERROR = 0x6;
    public static final int TRANSFORMATION_ERROR = 0x7;
    public static final int CONFIGURATION_ERROR = 0x8;

    public static String explain(@EnumType(ShadercCompilationStatus.class) int value) {
        return switch (value) {
            case ShadercCompilationStatus.COMPILATION_ERROR -> "shaderc_compilation_status_compilation_error";
            case ShadercCompilationStatus.CONFIGURATION_ERROR -> "shaderc_compilation_status_configuration_error";
            case ShadercCompilationStatus.INTERNAL_ERROR -> "shaderc_compilation_status_internal_error";
            case ShadercCompilationStatus.INVALID_ASSEMBLY -> "shaderc_compilation_status_invalid_assembly";
            case ShadercCompilationStatus.INVALID_STAGE -> "shaderc_compilation_status_invalid_stage";
            case ShadercCompilationStatus.NULL_RESULT_OBJECT -> "shaderc_compilation_status_null_result_object";
            case ShadercCompilationStatus.SUCCESS -> "shaderc_compilation_status_success";
            case ShadercCompilationStatus.TRANSFORMATION_ERROR -> "shaderc_compilation_status_transformation_error";
            case ShadercCompilationStatus.VALIDATION_ERROR -> "shaderc_compilation_status_validation_error";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private ShadercCompilationStatus() {}
}
