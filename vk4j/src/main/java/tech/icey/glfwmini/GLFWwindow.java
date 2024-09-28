package tech.icey.glfwmini;

import tech.icey.vk4j.IPointer;

import java.lang.foreign.MemorySegment;

public record GLFWwindow(MemorySegment segment) implements IPointer {}
