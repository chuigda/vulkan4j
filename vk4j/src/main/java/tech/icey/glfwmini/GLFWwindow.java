package tech.icey.glfwmini;

import tech.icey.panama.IPointer;

import java.lang.foreign.MemorySegment;

public record GLFWwindow(MemorySegment segment) implements IPointer {}
